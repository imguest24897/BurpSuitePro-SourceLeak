package net.portswigger.devtools.protocol.types.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.TrustTokens")
public class TrustTokens {
  @Zvd(Zp = "issuerOrigin")
  public final String issuerOrigin;
  
  @Zvd(Zp = "count")
  public final Double count;
  
  @Zox
  public TrustTokens(@Zc5(Ze = "issuerOrigin") String paramString, @Zc5(Ze = "count") Double paramDouble) {
    this.issuerOrigin = paramString;
    this.count = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\TrustTokens.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */