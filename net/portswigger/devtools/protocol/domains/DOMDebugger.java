package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.domdebugger.CSPViolationType;
import net.portswigger.devtools.protocol.types.domdebugger.DOMBreakpointType;
import net.portswigger.devtools.protocol.types.domdebugger.EventListener;

public interface DOMDebugger {
  @Zr("listeners")
  CompletableFuture<Zf<List<EventListener>>> getEventListeners(@Zu("objectId") String paramString);
  
  @Zr("listeners")
  CompletableFuture<Zf<List<EventListener>>> getEventListeners(@Zu("objectId") String paramString, @Zj @Zu("depth") Integer paramInteger, @Zj @Zu("pierce") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> removeDOMBreakpoint(@Zu("nodeId") Integer paramInteger, @Zu("type") DOMBreakpointType paramDOMBreakpointType);
  
  CompletableFuture<Zf<Void>> removeEventListenerBreakpoint(@Zu("eventName") String paramString);
  
  CompletableFuture<Zf<Void>> removeEventListenerBreakpoint(@Zu("eventName") String paramString1, @Zy @Zj @Zu("targetName") String paramString2);
  
  CompletableFuture<Zf<Void>> removeXHRBreakpoint(@Zu("url") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setBreakOnCSPViolation(@Zu("violationTypes") List<CSPViolationType> paramList);
  
  CompletableFuture<Zf<Void>> setDOMBreakpoint(@Zu("nodeId") Integer paramInteger, @Zu("type") DOMBreakpointType paramDOMBreakpointType);
  
  CompletableFuture<Zf<Void>> setEventListenerBreakpoint(@Zu("eventName") String paramString);
  
  CompletableFuture<Zf<Void>> setEventListenerBreakpoint(@Zu("eventName") String paramString1, @Zy @Zj @Zu("targetName") String paramString2);
  
  CompletableFuture<Zf<Void>> setXHRBreakpoint(@Zu("url") String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DOMDebugger.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */