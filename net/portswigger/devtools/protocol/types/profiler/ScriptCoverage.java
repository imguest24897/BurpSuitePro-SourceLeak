package net.portswigger.devtools.protocol.types.profiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.profiler.ScriptCoverage")
public class ScriptCoverage {
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "functions")
  public final List<FunctionCoverage> functions;
  
  @Zox
  public ScriptCoverage(@Zc5(Ze = "scriptId") String paramString1, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "functions") List<FunctionCoverage> paramList) {
    this.scriptId = paramString1;
    this.url = paramString2;
    this.functions = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\ScriptCoverage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */