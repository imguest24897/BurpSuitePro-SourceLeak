package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.AdScriptId")
public class AdScriptId {
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "debuggerId")
  public final String debuggerId;
  
  @Zox
  public AdScriptId(@Zc5(Ze = "scriptId") String paramString1, @Zc5(Ze = "debuggerId") String paramString2) {
    this.scriptId = paramString1;
    this.debuggerId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AdScriptId.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */