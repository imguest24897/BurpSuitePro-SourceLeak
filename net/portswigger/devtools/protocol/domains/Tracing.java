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
import net.portswigger.devtools.protocol.events.tracing.BufferUsage;
import net.portswigger.devtools.protocol.events.tracing.DataCollected;
import net.portswigger.devtools.protocol.events.tracing.TracingComplete;
import net.portswigger.devtools.protocol.types.tracing.MemoryDumpLevelOfDetail;
import net.portswigger.devtools.protocol.types.tracing.RequestMemoryDump;
import net.portswigger.devtools.protocol.types.tracing.StartTransferMode;
import net.portswigger.devtools.protocol.types.tracing.StreamCompression;
import net.portswigger.devtools.protocol.types.tracing.StreamFormat;
import net.portswigger.devtools.protocol.types.tracing.TraceConfig;
import net.portswigger.devtools.protocol.types.tracing.TracingBackend;

public interface Tracing {
  CompletableFuture<Zf<Void>> end();
  
  @Zy
  @Zr("categories")
  CompletableFuture<Zf<List<String>>> getCategories();
  
  @Zy
  CompletableFuture<Zf<Void>> recordClockSyncMarker(@Zu("syncId") String paramString);
  
  @Zy
  CompletableFuture<Zf<RequestMemoryDump>> requestMemoryDump();
  
  @Zy
  CompletableFuture<Zf<RequestMemoryDump>> requestMemoryDump(@Zj @Zu("deterministic") Boolean paramBoolean, @Zj @Zu("levelOfDetail") MemoryDumpLevelOfDetail paramMemoryDumpLevelOfDetail);
  
  CompletableFuture<Zf<Void>> start();
  
  CompletableFuture<Zf<Void>> start(@Deprecated @Zy @Zj @Zu("categories") String paramString1, @Deprecated @Zy @Zj @Zu("options") String paramString2, @Zy @Zj @Zu("bufferUsageReportingInterval") Double paramDouble, @Zj @Zu("transferMode") StartTransferMode paramStartTransferMode, @Zj @Zu("streamFormat") StreamFormat paramStreamFormat, @Zy @Zj @Zu("streamCompression") StreamCompression paramStreamCompression, @Zj @Zu("traceConfig") TraceConfig paramTraceConfig, @Zy @Zj @Zu("perfettoConfig") String paramString3, @Zy @Zj @Zu("tracingBackend") TracingBackend paramTracingBackend);
  
  @Zb("bufferUsage")
  @Zy
  Zs onBufferUsage(Zp<BufferUsage> paramZp) throws Zp;
  
  @Zb("dataCollected")
  @Zy
  Zs onDataCollected(Zp<DataCollected> paramZp) throws Zp;
  
  @Zb("tracingComplete")
  Zs onTracingComplete(Zp<TracingComplete> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Tracing.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */