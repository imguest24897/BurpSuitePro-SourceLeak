package net.portswigger.devtools.protocol.types.cachestorage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.cachestorage.Header")
public class Header {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zox
  public Header(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.name = paramString1;
    this.value = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cachestorage\Header.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */