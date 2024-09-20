package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.CompilationCacheProduced")
public class CompilationCacheProduced implements Zl {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "data")
  public final String data;
  
  @Zox
  public CompilationCacheProduced(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "data") String paramString2) {
    this.url = paramString1;
    this.data = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\CompilationCacheProduced.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */