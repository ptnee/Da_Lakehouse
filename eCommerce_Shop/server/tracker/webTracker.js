import { newTracker } from '@snowplow/browser-tracker';

newTracker('cf', 'localhost:8080',{
    appId: 'testApp',
    platform: 'web',
})
enableActivityTracking({
    minimumVisitLength: 10,
    heartbeatDelay: 10
  })

enableLinkClickTracking()
trackPageView()