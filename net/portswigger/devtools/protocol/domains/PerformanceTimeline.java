package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.performancetimeline.TimelineEventAdded;

@Zy
public interface PerformanceTimeline {
  CompletableFuture<Zf<Void>> enable(@Zu("eventTypes") List<String> paramList);
  
  @Zb("timelineEventAdded")
  Zs onTimelineEventAdded(Zp<TimelineEventAdded> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\PerformanceTimeline.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */