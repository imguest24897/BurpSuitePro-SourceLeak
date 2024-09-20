package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.CallFunctionOn")
public class CallFunctionOn {
  @Zvd(Zp = "result")
  public final RemoteObject result;
  
  @Zvd(Zp = "exceptionDetails")
  @Zj
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public CallFunctionOn(@Zc5(Ze = "result") RemoteObject paramRemoteObject, @Zc5(Ze = "exceptionDetails", ZS = "null") ExceptionDetails paramExceptionDetails) {
    this.result = paramRemoteObject;
    this.exceptionDetails = paramExceptionDetails;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\CallFunctionOn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */