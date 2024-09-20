package net.portswigger.devtools.protocol.events.preload;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.preload.PreloadEnabledStateUpdated")
public class PreloadEnabledStateUpdated implements Zl {
  @Zvd(Zp = "disabledByPreference")
  public final Boolean disabledByPreference;
  
  @Zvd(Zp = "disabledByDataSaver")
  public final Boolean disabledByDataSaver;
  
  @Zvd(Zp = "disabledByBatterySaver")
  public final Boolean disabledByBatterySaver;
  
  @Zvd(Zp = "disabledByHoldbackPrefetchSpeculationRules")
  public final Boolean disabledByHoldbackPrefetchSpeculationRules;
  
  @Zvd(Zp = "disabledByHoldbackPrerenderSpeculationRules")
  public final Boolean disabledByHoldbackPrerenderSpeculationRules;
  
  @Zox
  public PreloadEnabledStateUpdated(@Zc5(Ze = "disabledByPreference") Boolean paramBoolean1, @Zc5(Ze = "disabledByDataSaver") Boolean paramBoolean2, @Zc5(Ze = "disabledByBatterySaver") Boolean paramBoolean3, @Zc5(Ze = "disabledByHoldbackPrefetchSpeculationRules") Boolean paramBoolean4, @Zc5(Ze = "disabledByHoldbackPrerenderSpeculationRules") Boolean paramBoolean5) {
    this.disabledByPreference = paramBoolean1;
    this.disabledByDataSaver = paramBoolean2;
    this.disabledByBatterySaver = paramBoolean3;
    this.disabledByHoldbackPrefetchSpeculationRules = paramBoolean4;
    this.disabledByHoldbackPrerenderSpeculationRules = paramBoolean5;
    int[] arrayOfInt = RuleSetUpdated.Zl();
    if (Zbqc.Zwu() == null)
      RuleSetUpdated.Zb(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\PreloadEnabledStateUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */