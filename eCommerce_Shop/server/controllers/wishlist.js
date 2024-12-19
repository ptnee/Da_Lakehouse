const { PrismaClient } = require("@prisma/client");
const prisma = new PrismaClient();
const bcrypt = require("bcryptjs");

const {
  buildSelfDescribingEvent,
  buildPageView
} = require ('@snowplow/node-tracker');
const { myTracker} = require('../tracker/tracker')

async function getAllWishlist(request, response) {
  try {
    const wishlist = await prisma.wishlist.findMany({
      include: {
        product: true, // Include product details
      },
    });
    return response.json(wishlist);
  } catch (error) {
    return response.status(500).json({ error: "Error fetching wishlist" });
  }
}

async function getAllWishlistByUserId(request, response) {
  const { userId } = request.params;
  try {
    // getting all products by userId
    const wishlist = await prisma.wishlist.findMany({
      where: {
        userId: userId,
      },
      include: {
        product: true, // Include product details
      },
    });
    return response.json(wishlist);
  } catch (error) {
    return response.status(500).json({ error: "Error fetching wishlist" });
  }
}

async function createWishItem(request, response) {
  try {

    // console.log("neeeeee", myTracker)

    const context = [
      {
        schema: 'iglu:com.snowplowanalytics.snowplow/payload_data/jsonschema/1-0-4',
        data: {
          type: 'tester',
        },
      },
    ];
    
    myTracker.track(
      buildPageView({ pageUrl: 'localhost:3000/product', pageTitle: 'product detail', referrer: 'localhost:3000' }),
      context
    );

    // myTracker.track(
    //   buildPageView({ 
    //     pageUrl: 'http://www.example.com', 
    //     referrer: 'http://www.referer.com'
    //   }),
    // );

    // const eventJson = {
    //   schema: 'iglu:com.acme/viewed_product/jsonschema/1-0-0',
    //   data: {
    //     price: 20,
    //   },
    // };
    
    // myTracker.track(buildSelfDescribingEvent({ event: eventJson }), context);
    

    const { userId, productId } = request.body;
    const wishItem = await prisma.wishlist.create({
      data: {
        userId,
        productId,
      },
    });
    return response.status(201).json(wishItem);
  } catch (error) {
    console.error("Error creating wish item:", error);
    return response.status(500).json({ error: "Error creating wish item" });
  }
}

async function deleteWishItem(request, response) {
  try {
    const { userId, productId } = request.params;
    await prisma.wishlist.deleteMany({
      where: {
        userId: userId,
        productId: productId,
      },
    });

    myTracker.track(buildPageView({ 
      pageUrl: 'http://www.example.com', 
      referrer: 'http://www.referer.com'
    }), 
    [{
      "schema": "iglu:com.acme_company/movie_poster/jsonschema/2-1-1",
      "data": {
        "movie_name": "Solaris",
        "poster_country": "JP"
      }
    }]);
    
    return response.status(204).send();

  } catch (error) {
    console.log(error);
    return response.status(500).json({ error: "Error deleting wish item" });
  }
}

async function getSingleProductFromWishlist(request, response){
  try {
    const { userId, productId } = request.params;
    
    const wishItem = await prisma.wishlist.findMany({
      where: {
        userId: userId,
        productId: productId,
      },
    });
    
    return response.status(200).json(wishItem);

  } catch (error) {
    console.log(error);
    return response.status(500).json({ error: "Error getting wish item" });
  }
}

async function deleteAllWishItemByUserId(request, response) {
  try {
    const { userId } = request.params;
    
    await prisma.wishlist.deleteMany({
      where: {
        userId: userId,
      },
    });
    
    return response.status(204).send();

  } catch (error) {
    console.log(error);
    return response.status(500).json({ error: "Error deleting wish item" });
  }
}


module.exports = {
  getAllWishlistByUserId,
  getAllWishlist,
  createWishItem,
  deleteWishItem,
  getSingleProductFromWishlist
};
