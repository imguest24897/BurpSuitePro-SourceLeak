package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.performance.Metrics;
import net.portswigger.devtools.protocol.types.performance.EnableTimeDomain;
import net.portswigger.devtools.protocol.types.performance.Metric;
import net.portswigger.devtools.protocol.types.performance.SetTimeDomainTimeDomain;

public interface Performance {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zj @Zu("timeDomain") EnableTimeDomain paramEnableTimeDomain);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setTimeDomain(@Zu("timeDomain") SetTimeDomainTimeDomain paramSetTimeDomainTimeDomain);
  
  @Zr("metrics")
  CompletableFuture<Zf<List<Metric>>> getMetrics();
  
  @Zb("metrics")
  Zs onMetrics(Zp<Metrics> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Performance.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */