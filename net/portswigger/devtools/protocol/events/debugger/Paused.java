package net.portswigger.devtools.protocol.events.debugger;

import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.debugger.CallFrame;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;
import net.portswigger.devtools.protocol.types.runtime.StackTraceId;

@Zsi("net.portswigger.devtools.protocol.events.debugger.Paused")
public class Paused implements Zl {
  @Zvd(Zp = "callFrames")
  public final List<CallFrame> callFrames;
  
  @Zvd(Zp = "reason")
  public final PausedReason reason;
  
  @Zvd(Zp = "data")
  @Zj
  public final Map<String, Zi7> data;
  
  @Zvd(Zp = "hitBreakpoints")
  @Zj
  public final List<String> hitBreakpoints;
  
  @Zvd(Zp = "asyncStackTrace")
  @Zj
  public final StackTrace asyncStackTrace;
  
  @Zvd(Zp = "asyncStackTraceId")
  @Zy
  @Zj
  public final StackTraceId asyncStackTraceId;
  
  @Zvd(Zp = "asyncCallStackTraceId")
  @Deprecated
  @Zy
  @Zj
  public final StackTraceId asyncCallStackTraceId;
  
  @Zox
  public Paused(@Zc5(Ze = "callFrames") List<CallFrame> paramList, @Zc5(Ze = "reason") PausedReason paramPausedReason, @Zc5(Ze = "data", ZS = "null") Map<String, Zi7> paramMap, @Zc5(Ze = "hitBreakpoints", ZS = "null") List<String> paramList1, @Zc5(Ze = "asyncStackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "asyncStackTraceId", ZS = "null") StackTraceId paramStackTraceId1, @Zc5(Ze = "asyncCallStackTraceId", ZS = "null") StackTraceId paramStackTraceId2) {
    this.callFrames = paramList;
    this.reason = paramPausedReason;
    this.data = paramMap;
    this.hitBreakpoints = paramList1;
    this.asyncStackTrace = paramStackTrace;
    this.asyncStackTraceId = paramStackTraceId1;
    this.asyncCallStackTraceId = paramStackTraceId2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\debugger\Paused.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */