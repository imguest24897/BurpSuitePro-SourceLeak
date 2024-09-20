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
import net.portswigger.devtools.protocol.events.target.AttachedToTarget;
import net.portswigger.devtools.protocol.events.target.DetachedFromTarget;
import net.portswigger.devtools.protocol.events.target.ReceivedMessageFromTarget;
import net.portswigger.devtools.protocol.events.target.TargetCrashed;
import net.portswigger.devtools.protocol.events.target.TargetCreated;
import net.portswigger.devtools.protocol.events.target.TargetDestroyed;
import net.portswigger.devtools.protocol.events.target.TargetInfoChanged;
import net.portswigger.devtools.protocol.types.target.FilterEntry;
import net.portswigger.devtools.protocol.types.target.RemoteLocation;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

public interface Target {
  CompletableFuture<Zf<Void>> activateTarget(@Zu("targetId") String paramString);
  
  @Zr("sessionId")
  CompletableFuture<Zf<String>> attachToTarget(@Zu("targetId") String paramString);
  
  @Zr("sessionId")
  CompletableFuture<Zf<String>> attachToTarget(@Zu("targetId") String paramString, @Zj @Zu("flatten") Boolean paramBoolean);
  
  @Zy
  @Zr("sessionId")
  CompletableFuture<Zf<String>> attachToBrowserTarget();
  
  @Zr("success")
  CompletableFuture<Zf<Boolean>> closeTarget(@Zu("targetId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> exposeDevToolsProtocol(@Zu("targetId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> exposeDevToolsProtocol(@Zu("targetId") String paramString1, @Zj @Zu("bindingName") String paramString2);
  
  @Zr("browserContextId")
  CompletableFuture<Zf<String>> createBrowserContext();
  
  @Zr("browserContextId")
  CompletableFuture<Zf<String>> createBrowserContext(@Zy @Zj @Zu("disposeOnDetach") Boolean paramBoolean, @Zy @Zj @Zu("proxyServer") String paramString1, @Zy @Zj @Zu("proxyBypassList") String paramString2, @Zy @Zj @Zu("originsWithUniversalNetworkAccess") List<String> paramList);
  
  @Zr("browserContextIds")
  CompletableFuture<Zf<List<String>>> getBrowserContexts();
  
  @Zr("targetId")
  CompletableFuture<Zf<String>> createTarget(@Zu("url") String paramString);
  
  @Zr("targetId")
  CompletableFuture<Zf<String>> createTarget(@Zu("url") String paramString1, @Zj @Zu("width") Integer paramInteger1, @Zj @Zu("height") Integer paramInteger2, @Zy @Zj @Zu("browserContextId") String paramString2, @Zy @Zj @Zu("enableBeginFrameControl") Boolean paramBoolean1, @Zj @Zu("newWindow") Boolean paramBoolean2, @Zj @Zu("background") Boolean paramBoolean3, @Zy @Zj @Zu("forTab") Boolean paramBoolean4);
  
  CompletableFuture<Zf<Void>> detachFromTarget();
  
  CompletableFuture<Zf<Void>> detachFromTarget(@Zj @Zu("sessionId") String paramString1, @Deprecated @Zj @Zu("targetId") String paramString2);
  
  CompletableFuture<Zf<Void>> disposeBrowserContext(@Zu("browserContextId") String paramString);
  
  @Zy
  @Zr("targetInfo")
  CompletableFuture<Zf<TargetInfo>> getTargetInfo();
  
  @Zy
  @Zr("targetInfo")
  CompletableFuture<Zf<TargetInfo>> getTargetInfo(@Zj @Zu("targetId") String paramString);
  
  @Zr("targetInfos")
  CompletableFuture<Zf<List<TargetInfo>>> getTargets();
  
  @Zr("targetInfos")
  CompletableFuture<Zf<List<TargetInfo>>> getTargets(@Zy @Zj @Zu("filter") List<FilterEntry> paramList);
  
  @Deprecated
  CompletableFuture<Zf<Void>> sendMessageToTarget(@Zu("message") String paramString);
  
  @Deprecated
  CompletableFuture<Zf<Void>> sendMessageToTarget(@Zu("message") String paramString1, @Zj @Zu("sessionId") String paramString2, @Deprecated @Zj @Zu("targetId") String paramString3);
  
  CompletableFuture<Zf<Void>> setAutoAttach(@Zu("autoAttach") Boolean paramBoolean1, @Zu("waitForDebuggerOnStart") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> setAutoAttach(@Zu("autoAttach") Boolean paramBoolean1, @Zu("waitForDebuggerOnStart") Boolean paramBoolean2, @Zy @Zj @Zu("flatten") Boolean paramBoolean3, @Zy @Zj @Zu("filter") List<FilterEntry> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> autoAttachRelated(@Zu("targetId") String paramString, @Zu("waitForDebuggerOnStart") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> autoAttachRelated(@Zu("targetId") String paramString, @Zu("waitForDebuggerOnStart") Boolean paramBoolean, @Zy @Zj @Zu("filter") List<FilterEntry> paramList);
  
  CompletableFuture<Zf<Void>> setDiscoverTargets(@Zu("discover") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setDiscoverTargets(@Zu("discover") Boolean paramBoolean, @Zy @Zj @Zu("filter") List<FilterEntry> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> setRemoteLocations(@Zu("locations") List<RemoteLocation> paramList);
  
  @Zb("attachedToTarget")
  @Zy
  Zs onAttachedToTarget(Zp<AttachedToTarget> paramZp) throws Zp;
  
  @Zb("detachedFromTarget")
  @Zy
  Zs onDetachedFromTarget(Zp<DetachedFromTarget> paramZp) throws Zp;
  
  @Zb("receivedMessageFromTarget")
  Zs onReceivedMessageFromTarget(Zp<ReceivedMessageFromTarget> paramZp) throws Zp;
  
  @Zb("targetCreated")
  Zs onTargetCreated(Zp<TargetCreated> paramZp) throws Zp;
  
  @Zb("targetDestroyed")
  Zs onTargetDestroyed(Zp<TargetDestroyed> paramZp) throws Zp;
  
  @Zb("targetCrashed")
  Zs onTargetCrashed(Zp<TargetCrashed> paramZp) throws Zp;
  
  @Zb("targetInfoChanged")
  Zs onTargetInfoChanged(Zp<TargetInfoChanged> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Target.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */