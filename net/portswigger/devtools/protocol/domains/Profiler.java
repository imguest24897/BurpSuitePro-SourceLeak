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
import net.portswigger.devtools.protocol.events.profiler.ConsoleProfileFinished;
import net.portswigger.devtools.protocol.events.profiler.ConsoleProfileStarted;
import net.portswigger.devtools.protocol.events.profiler.PreciseCoverageDeltaUpdate;
import net.portswigger.devtools.protocol.types.profiler.Profile;
import net.portswigger.devtools.protocol.types.profiler.ScriptCoverage;
import net.portswigger.devtools.protocol.types.profiler.TakePreciseCoverage;

public interface Profiler {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("result")
  CompletableFuture<Zf<List<ScriptCoverage>>> getBestEffortCoverage();
  
  CompletableFuture<Zf<Void>> setSamplingInterval(@Zu("interval") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> start();
  
  @Zr("timestamp")
  CompletableFuture<Zf<Double>> startPreciseCoverage();
  
  @Zr("timestamp")
  CompletableFuture<Zf<Double>> startPreciseCoverage(@Zj @Zu("callCount") Boolean paramBoolean1, @Zj @Zu("detailed") Boolean paramBoolean2, @Zj @Zu("allowTriggeredUpdates") Boolean paramBoolean3);
  
  @Zr("profile")
  CompletableFuture<Zf<Profile>> stop();
  
  CompletableFuture<Zf<Void>> stopPreciseCoverage();
  
  CompletableFuture<Zf<TakePreciseCoverage>> takePreciseCoverage();
  
  @Zb("consoleProfileFinished")
  Zs onConsoleProfileFinished(Zp<ConsoleProfileFinished> paramZp) throws Zp;
  
  @Zb("consoleProfileStarted")
  Zs onConsoleProfileStarted(Zp<ConsoleProfileStarted> paramZp) throws Zp;
  
  @Zb("preciseCoverageDeltaUpdate")
  @Zy
  Zs onPreciseCoverageDeltaUpdate(Zp<PreciseCoverageDeltaUpdate> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Profiler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */