package net.portswigger.devtools.protocol.events.runtime;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

@Zsi("net.portswigger.devtools.protocol.events.runtime.ConsoleAPICalled")
public class ConsoleAPICalled implements Zl {
  @Zvd(Zp = "type")
  public final ConsoleAPICalledType type;
  
  @Zvd(Zp = "args")
  public final List<RemoteObject> args;
  
  @Zvd(Zp = "executionContextId")
  public final Integer executionContextId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "stackTrace")
  @Zj
  public final StackTrace stackTrace;
  
  @Zvd(Zp = "context")
  @Zy
  @Zj
  public final String context;
  
  @Zox
  public ConsoleAPICalled(@Zc5(Ze = "type") ConsoleAPICalledType paramConsoleAPICalledType, @Zc5(Ze = "args") List<RemoteObject> paramList, @Zc5(Ze = "executionContextId") Integer paramInteger, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "stackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "context", ZS = "null") String paramString) {
    int i = InspectRequested.ZG();
    this.type = paramConsoleAPICalledType;
    this.args = paramList;
    this.executionContextId = paramInteger;
    this.timestamp = paramDouble;
    this.stackTrace = paramStackTrace;
    this.context = paramString;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\ConsoleAPICalled.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */