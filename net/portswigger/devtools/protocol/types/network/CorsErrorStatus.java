package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.network.CorsErrorStatus")
public class CorsErrorStatus {
  @Zvd(Zp = "corsError")
  public final CorsError corsError;
  
  @Zvd(Zp = "failedParameter")
  public final String failedParameter;
  
  @Zox
  public CorsErrorStatus(@Zc5(Ze = "corsError") CorsError paramCorsError, @Zc5(Ze = "failedParameter") String paramString) {
    this.corsError = paramCorsError;
    this.failedParameter = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\CorsErrorStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */