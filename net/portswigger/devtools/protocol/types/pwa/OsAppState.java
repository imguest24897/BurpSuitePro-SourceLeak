package net.portswigger.devtools.protocol.types.pwa;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.pwa.OsAppState")
public class OsAppState {
  @Zvd(Zp = "badgeCount")
  public final Integer badgeCount;
  
  @Zvd(Zp = "fileHandlers")
  public final List<FileHandler> fileHandlers;
  
  private static String[] Zr;
  
  @Zox
  public OsAppState(@Zc5(Ze = "badgeCount") Integer paramInteger, @Zc5(Ze = "fileHandlers") List<FileHandler> paramList) {
    this.badgeCount = paramInteger;
    this.fileHandlers = paramList;
  }
  
  public static void Zr(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] Zo() {
    return Zr;
  }
  
  static {
    if (Zo() != null)
      Zr(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\pwa\OsAppState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */