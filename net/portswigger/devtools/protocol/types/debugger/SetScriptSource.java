package net.portswigger.devtools.protocol.types.debugger;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.runtime.ExceptionDetails;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;
import net.portswigger.devtools.protocol.types.runtime.StackTraceId;

@Zsi("net.portswigger.devtools.protocol.types.debugger.SetScriptSource")
public class SetScriptSource {
  @Zvd(Zp = "callFrames")
  @Deprecated
  @Zj
  public final List<CallFrame> callFrames;
  
  @Zvd(Zp = "stackChanged")
  @Deprecated
  @Zj
  public final Boolean stackChanged;
  
  @Zvd(Zp = "asyncStackTrace")
  @Deprecated
  @Zj
  public final StackTrace asyncStackTrace;
  
  @Zvd(Zp = "asyncStackTraceId")
  @Deprecated
  @Zj
  public final StackTraceId asyncStackTraceId;
  
  @Zvd(Zp = "status")
  @Zy
  public final SetScriptSourceStatus status;
  
  @Zvd(Zp = "exceptionDetails")
  @Zj
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public SetScriptSource(@Zc5(Ze = "callFrames", ZS = "null") List<CallFrame> paramList, @Zc5(Ze = "stackChanged", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "asyncStackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "asyncStackTraceId", ZS = "null") StackTraceId paramStackTraceId, @Zc5(Ze = "status") SetScriptSourceStatus paramSetScriptSourceStatus, @Zc5(Ze = "exceptionDetails", ZS = "null") ExceptionDetails paramExceptionDetails) {
    this.callFrames = paramList;
    this.stackChanged = paramBoolean;
    this.asyncStackTrace = paramStackTrace;
    this.asyncStackTraceId = paramStackTraceId;
    this.status = paramSetScriptSourceStatus;
    this.exceptionDetails = paramExceptionDetails;
    String str = WasmDisassemblyChunk.ZA();
    if (Zbqc.Zwu() == null)
      WasmDisassemblyChunk.Ze("ncZDwb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\SetScriptSource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */