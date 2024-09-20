package net.portswigger.devtools.protocol.types.schema;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.schema.Domain")
public class Domain {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "version")
  public final String version;
  
  private static boolean Zl;
  
  @Zox
  public Domain(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "version") String paramString2) {
    this.name = paramString1;
    this.version = paramString2;
    boolean bool = ZD();
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void ZW(boolean paramBoolean) {
    Zl = paramBoolean;
  }
  
  public static boolean ZD() {
    return Zl;
  }
  
  public static boolean Zv() {
    boolean bool = ZD();
    return !bool;
  }
  
  static {
    if (!Zv())
      ZW(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\schema\Domain.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */