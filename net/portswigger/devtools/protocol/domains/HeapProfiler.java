package net.portswigger.devtools.protocol.domains;

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
import net.portswigger.devtools.protocol.events.heapprofiler.AddHeapSnapshotChunk;
import net.portswigger.devtools.protocol.events.heapprofiler.HeapStatsUpdate;
import net.portswigger.devtools.protocol.events.heapprofiler.LastSeenObjectId;
import net.portswigger.devtools.protocol.events.heapprofiler.ReportHeapSnapshotProgress;
import net.portswigger.devtools.protocol.events.heapprofiler.ResetProfiles;
import net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfile;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zy
public interface HeapProfiler {
  CompletableFuture<Zf<Void>> addInspectedHeapObject(@Zu("heapObjectId") String paramString);
  
  CompletableFuture<Zf<Void>> collectGarbage();
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("heapSnapshotObjectId")
  CompletableFuture<Zf<String>> getHeapObjectId(@Zu("objectId") String paramString);
  
  @Zr("result")
  CompletableFuture<Zf<RemoteObject>> getObjectByHeapObjectId(@Zu("objectId") String paramString);
  
  @Zr("result")
  CompletableFuture<Zf<RemoteObject>> getObjectByHeapObjectId(@Zu("objectId") String paramString1, @Zj @Zu("objectGroup") String paramString2);
  
  @Zr("profile")
  CompletableFuture<Zf<SamplingHeapProfile>> getSamplingProfile();
  
  CompletableFuture<Zf<Void>> startSampling();
  
  CompletableFuture<Zf<Void>> startSampling(@Zj @Zu("samplingInterval") Double paramDouble, @Zj @Zu("includeObjectsCollectedByMajorGC") Boolean paramBoolean1, @Zj @Zu("includeObjectsCollectedByMinorGC") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> startTrackingHeapObjects();
  
  CompletableFuture<Zf<Void>> startTrackingHeapObjects(@Zj @Zu("trackAllocations") Boolean paramBoolean);
  
  @Zr("profile")
  CompletableFuture<Zf<SamplingHeapProfile>> stopSampling();
  
  CompletableFuture<Zf<Void>> stopTrackingHeapObjects();
  
  CompletableFuture<Zf<Void>> stopTrackingHeapObjects(@Zj @Zu("reportProgress") Boolean paramBoolean1, @Deprecated @Zj @Zu("treatGlobalObjectsAsRoots") Boolean paramBoolean2, @Zj @Zu("captureNumericValue") Boolean paramBoolean3, @Zy @Zj @Zu("exposeInternals") Boolean paramBoolean4);
  
  CompletableFuture<Zf<Void>> takeHeapSnapshot();
  
  CompletableFuture<Zf<Void>> takeHeapSnapshot(@Zj @Zu("reportProgress") Boolean paramBoolean1, @Deprecated @Zj @Zu("treatGlobalObjectsAsRoots") Boolean paramBoolean2, @Zj @Zu("captureNumericValue") Boolean paramBoolean3, @Zy @Zj @Zu("exposeInternals") Boolean paramBoolean4);
  
  @Zb("addHeapSnapshotChunk")
  Zs onAddHeapSnapshotChunk(Zp<AddHeapSnapshotChunk> paramZp) throws Zp;
  
  @Zb("heapStatsUpdate")
  Zs onHeapStatsUpdate(Zp<HeapStatsUpdate> paramZp) throws Zp;
  
  @Zb("lastSeenObjectId")
  Zs onLastSeenObjectId(Zp<LastSeenObjectId> paramZp) throws Zp;
  
  @Zb("reportHeapSnapshotProgress")
  Zs onReportHeapSnapshotProgress(Zp<ReportHeapSnapshotProgress> paramZp) throws Zp;
  
  @Zb("resetProfiles")
  Zs onResetProfiles(Zp<ResetProfiles> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\HeapProfiler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */