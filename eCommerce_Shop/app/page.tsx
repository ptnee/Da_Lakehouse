import { CategoryMenu, Hero, Incentives, IntroducingSection, Newsletter, ProductsSection } from "@/components";
import { newTracker, enableActivityTracking, trackPageView } from '@snowplow/browser-tracker';

const Home = () => {
  // console.log("neeeee")
  // newTracker('cf', 'localhost:8082',{
  //   appId: 'testApp',
  //   platform: 'web',
  // })
  // enableActivityTracking({
  //     minimumVisitLength: 10,
  //     heartbeatDelay: 10
  //   })
  
  // trackPageView()

  console.log("neeeee1")
  return (
    <>
    <Hero />
    <IntroducingSection />
    <CategoryMenu />
    <ProductsSection />
    </>
  );
}

export default Home;