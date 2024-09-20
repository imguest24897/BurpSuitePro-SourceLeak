package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ProtocolHandler")
public class ProtocolHandler {
  @Zvd(Zp = "protocol")
  public final String protocol;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zox
  public ProtocolHandler(@Zc5(Ze = "protocol") String paramString1, @Zc5(Ze = "url") String paramString2) {
    this.protocol = paramString1;
    this.url = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ProtocolHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */