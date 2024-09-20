package net.portswigger.devtools.protocol.types.target;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.target.RemoteLocation")
public class RemoteLocation {
  @Zvd(Zp = "host")
  public final String host;
  
  @Zvd(Zp = "port")
  public final Integer port;
  
  @Zox
  public RemoteLocation(@Zc5(Ze = "host") String paramString, @Zc5(Ze = "port") Integer paramInteger) {
    this.host = paramString;
    this.port = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\target\RemoteLocation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */