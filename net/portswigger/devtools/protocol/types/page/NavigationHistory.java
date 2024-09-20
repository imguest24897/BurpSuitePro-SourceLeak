package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.page.NavigationHistory")
public class NavigationHistory {
  @Zvd(Zp = "currentIndex")
  public final Integer currentIndex;
  
  @Zvd(Zp = "entries")
  public final List<NavigationEntry> entries;
  
  private static boolean Zn;
  
  @Zox
  public NavigationHistory(@Zc5(Ze = "currentIndex") Integer paramInteger, @Zc5(Ze = "entries") List<NavigationEntry> paramList) {
    this.currentIndex = paramInteger;
    this.entries = paramList;
  }
  
  public static void ZP(boolean paramBoolean) {
    Zn = paramBoolean;
  }
  
  public static boolean ZU() {
    return Zn;
  }
  
  public static boolean ZL() {
    boolean bool = ZU();
    return !bool;
  }
  
  static {
    if (!ZU())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\NavigationHistory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */