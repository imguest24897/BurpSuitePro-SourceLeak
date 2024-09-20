package net.portswigger.devtools.protocol.types.preload;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.preload.PrerenderMismatchedHeaders")
public class PrerenderMismatchedHeaders {
  @Zvd(Zp = "headerName")
  public final String headerName;
  
  @Zvd(Zp = "initialValue")
  @Zj
  public final String initialValue;
  
  @Zvd(Zp = "activationValue")
  @Zj
  public final String activationValue;
  
  @Zox
  public PrerenderMismatchedHeaders(@Zc5(Ze = "headerName") String paramString1, @Zc5(Ze = "initialValue", ZS = "null") String paramString2, @Zc5(Ze = "activationValue", ZS = "null") String paramString3) {
    this.headerName = paramString1;
    this.initialValue = paramString2;
    this.activationValue = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\preload\PrerenderMismatchedHeaders.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */