package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.CompilationCacheParams")
public class CompilationCacheParams {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "eager")
  @Zj
  public final Boolean eager;
  
  @Zox
  public CompilationCacheParams(@Zc5(Ze = "url") String paramString, @Zc5(Ze = "eager", ZS = "null") Boolean paramBoolean) {
    this.url = paramString;
    this.eager = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\CompilationCacheParams.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */