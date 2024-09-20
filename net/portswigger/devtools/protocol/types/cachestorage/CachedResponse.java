package net.portswigger.devtools.protocol.types.cachestorage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.cachestorage.CachedResponse")
public class CachedResponse {
  @Zvd(Zp = "body")
  public final String body;
  
  @Zox
  public CachedResponse(@Zc5(Ze = "body") String paramString) {
    this.body = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cachestorage\CachedResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */