package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.debugger.ScriptSource")
public class ScriptSource {
  @Zvd(Zp = "scriptSource")
  public final String scriptSource;
  
  @Zvd(Zp = "bytecode")
  @Zj
  public final String bytecode;
  
  @Zox
  public ScriptSource(@Zc5(Ze = "scriptSource") String paramString1, @Zc5(Ze = "bytecode", ZS = "null") String paramString2) {
    this.scriptSource = paramString1;
    this.bytecode = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\ScriptSource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */