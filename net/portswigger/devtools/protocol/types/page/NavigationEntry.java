package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.page.NavigationEntry")
public class NavigationEntry {
  @Zvd(Zp = "id")
  public final Integer id;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "userTypedURL")
  public final String userTypedURL;
  
  @Zvd(Zp = "title")
  public final String title;
  
  @Zvd(Zp = "transitionType")
  public final TransitionType transitionType;
  
  @Zox
  public NavigationEntry(@Zc5(Ze = "id") Integer paramInteger, @Zc5(Ze = "url") String paramString1, @Zc5(Ze = "userTypedURL") String paramString2, @Zc5(Ze = "title") String paramString3, @Zc5(Ze = "transitionType") TransitionType paramTransitionType) {
    this.id = paramInteger;
    this.url = paramString1;
    this.userTypedURL = paramString2;
    this.title = paramString3;
    this.transitionType = paramTransitionType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\NavigationEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */