package net.portswigger.devtools.protocol.types.cast;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.cast.Sink")
public class Sink {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "session")
  @Zj
  public final String session;
  
  private static boolean Zd;
  
  @Zox
  public Sink(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "id") String paramString2, @Zc5(Ze = "session", ZS = "null") String paramString3) {
    this.name = paramString1;
    this.id = paramString2;
    this.session = paramString3;
    boolean bool = Zd();
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void ZW(boolean paramBoolean) {
    Zd = paramBoolean;
  }
  
  public static boolean Zd() {
    return Zd;
  }
  
  public static boolean ZZ() {
    boolean bool = Zd();
    return !bool;
  }
  
  static {
    if (!ZZ())
      ZW(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cast\Sink.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */