package net.portswigger.devtools.protocol.events.tethering;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.tethering.Accepted")
public class Accepted implements Zl {
  @Zvd(Zp = "port")
  public final Integer port;
  
  @Zvd(Zp = "connectionId")
  public final String connectionId;
  
  private static boolean ZW;
  
  @Zox
  public Accepted(@Zc5(Ze = "port") Integer paramInteger, @Zc5(Ze = "connectionId") String paramString) {
    this.port = paramInteger;
    boolean bool = ZR();
    this.connectionId = paramString;
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zz(boolean paramBoolean) {
    ZW = paramBoolean;
  }
  
  public static boolean ZR() {
    return ZW;
  }
  
  public static boolean ZG() {
    boolean bool = ZR();
    return !bool;
  }
  
  static {
    if (!ZG())
      Zz(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\tethering\Accepted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */