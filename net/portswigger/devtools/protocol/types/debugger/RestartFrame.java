package net.portswigger.devtools.protocol.types.debugger;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;
import net.portswigger.devtools.protocol.types.runtime.StackTraceId;

@Zsi("net.portswigger.devtools.protocol.types.debugger.RestartFrame")
public class RestartFrame {
  @Zvd(Zp = "callFrames")
  @Deprecated
  public final List<CallFrame> callFrames;
  
  @Zvd(Zp = "asyncStackTrace")
  @Deprecated
  @Zj
  public final StackTrace asyncStackTrace;
  
  @Zvd(Zp = "asyncStackTraceId")
  @Deprecated
  @Zj
  public final StackTraceId asyncStackTraceId;
  
  @Zox
  public RestartFrame(@Zc5(Ze = "callFrames") List<CallFrame> paramList, @Zc5(Ze = "asyncStackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "asyncStackTraceId", ZS = "null") StackTraceId paramStackTraceId) {
    this.callFrames = paramList;
    this.asyncStackTrace = paramStackTrace;
    this.asyncStackTraceId = paramStackTraceId;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\RestartFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */