package net.portswigger.devtools.protocol.types.filesystem;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.filesystem.File")
public class File {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "lastModified")
  public final Double lastModified;
  
  @Zvd(Zp = "size")
  public final Double size;
  
  @Zvd(Zp = "type")
  public final String type;
  
  private static boolean Zw;
  
  @Zox
  public File(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "lastModified") Double paramDouble1, @Zc5(Ze = "size") Double paramDouble2, @Zc5(Ze = "type") String paramString2) {
    this.name = paramString1;
    this.lastModified = paramDouble1;
    this.size = paramDouble2;
    this.type = paramString2;
    boolean bool = Zy();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZI(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zy() {
    return Zw;
  }
  
  public static boolean ZU() {
    boolean bool = Zy();
    return !bool;
  }
  
  static {
    if (!ZU())
      ZI(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\filesystem\File.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */