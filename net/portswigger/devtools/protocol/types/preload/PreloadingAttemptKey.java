package net.portswigger.devtools.protocol.types.preload;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.preload.PreloadingAttemptKey")
public class PreloadingAttemptKey {
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "action")
  public final SpeculationAction action;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "targetHint")
  @Zj
  public final SpeculationTargetHint targetHint;
  
  @Zox
  public PreloadingAttemptKey(@Zc5(Ze = "loaderId") String paramString1, @Zc5(Ze = "action") SpeculationAction paramSpeculationAction, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "targetHint", ZS = "null") SpeculationTargetHint paramSpeculationTargetHint) {
    this.loaderId = paramString1;
    Zbqc[] arrayOfZbqc = SpeculationTargetHint.ZM();
    this.action = paramSpeculationAction;
    this.url = paramString2;
    this.targetHint = paramSpeculationTargetHint;
    if (Zbqc.Zwu() == null)
      SpeculationTargetHint.ZQ(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\preload\PreloadingAttemptKey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */