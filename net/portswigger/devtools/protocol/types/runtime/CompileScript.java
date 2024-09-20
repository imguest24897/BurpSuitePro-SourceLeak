package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.CompileScript")
public class CompileScript {
  @Zvd(Zp = "scriptId")
  @Zj
  public final String scriptId;
  
  @Zvd(Zp = "exceptionDetails")
  @Zj
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public CompileScript(@Zc5(Ze = "scriptId", ZS = "null") String paramString, @Zc5(Ze = "exceptionDetails", ZS = "null") ExceptionDetails paramExceptionDetails) {
    this.scriptId = paramString;
    this.exceptionDetails = paramExceptionDetails;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\CompileScript.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */