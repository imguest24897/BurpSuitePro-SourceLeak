package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.ExceptionDetails;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.types.debugger.EvaluateOnCallFrame")
public class EvaluateOnCallFrame {
  @Zvd(Zp = "result")
  public final RemoteObject result;
  
  @Zvd(Zp = "exceptionDetails")
  @Zj
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public EvaluateOnCallFrame(@Zc5(Ze = "result") RemoteObject paramRemoteObject, @Zc5(Ze = "exceptionDetails", ZS = "null") ExceptionDetails paramExceptionDetails) {
    this.result = paramRemoteObject;
    this.exceptionDetails = paramExceptionDetails;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\EvaluateOnCallFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */