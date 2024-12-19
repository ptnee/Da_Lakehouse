// https://github.com/snowplow
// https://www.npmjs.com/package/@snowplow/node-tracker#usage
// https://www.npmjs.com/package/@snowplow/javascript-tracker
// https://www.npmjs.com/package/@snowplow/react-native-tracker
// https://docs.snowplow.io/docs/collecting-data/collecting-from-own-applications/react-native-tracker/quick-start-guide/
// https://docs.snowplow.io/docs/collecting-data/collecting-from-own-applications/javascript-trackers/node-js-tracker/node-js-tracker-v3/tracking-events/


const { tracker, gotEmitter,HttpProtocol, HttpMethod  } = require('@snowplow/node-tracker');
// const {
//   buildSelfDescribingEvent,
//   buildPageView
// } = require ('@snowplow/node-tracker');

const myEmitter = gotEmitter(
  'localhost', 
  HttpProtocol.HTTP, 
  8080, 
  HttpMethod.POST, 
  1 
);

const myTracker = tracker(myEmitter, 'myTracker', 'myApp', false);

// const context = [
//   {
//     schema: 'iglu:com.acme/user/jsonschema/1-0-0',
//     data: {
//       type: 'tester',
//     },
//   },
// ];

// myTracker.track(
//   buildPageView({ pageUrl: 'http://www.example.com', pageTitle: 'example page', referrer: 'http://google.com' }),
//   context
// );

// const eventJson = {
//   schema: 'iglu:com.acme/viewed_product/jsonschema/1-0-0',
//   data: {
//     price: 20,
//   },
// };

// myTracker.track(buildSelfDescribingEvent({ event: eventJson }), context);

// console.log("neeeee",myTracker )


module.exports = {
  myTracker
};