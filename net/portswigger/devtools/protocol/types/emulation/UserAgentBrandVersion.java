package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.UserAgentBrandVersion")
public class UserAgentBrandVersion {
  @Zvd(Zp = "brand")
  public final String brand;
  
  @Zvd(Zp = "version")
  public final String version;
  
  @Zox
  public UserAgentBrandVersion(@Zc5(Ze = "brand") String paramString1, @Zc5(Ze = "version") String paramString2) {
    this.brand = paramString1;
    this.version = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\UserAgentBrandVersion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */