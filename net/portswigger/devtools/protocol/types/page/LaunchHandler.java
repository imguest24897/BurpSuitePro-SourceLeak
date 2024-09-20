package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.LaunchHandler")
public class LaunchHandler {
  @Zvd(Zp = "clientMode")
  public final String clientMode;
  
  @Zox
  public LaunchHandler(@Zc5(Ze = "clientMode") String paramString) {
    this.clientMode = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\LaunchHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */