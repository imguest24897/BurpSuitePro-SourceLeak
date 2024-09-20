package net.portswigger.devtools.protocol.events.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.page.WindowOpen")
public class WindowOpen implements Zl {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "windowName")
  public final String windowName;
  
  @Zvd(Zp = "windowFeatures")
  public final List<String> windowFeatures;
  
  @Zvd(Zp = "userGesture")
  public final Boolean userGesture;
  
  @Zox
  public WindowOpen(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "windowName") String paramString2, @Zc5(Ze = "windowFeatures") List<String> paramList, @Zc5(Ze = "userGesture") Boolean paramBoolean) {
    this.url = paramString1;
    this.windowName = paramString2;
    this.windowFeatures = paramList;
    this.userGesture = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\WindowOpen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */