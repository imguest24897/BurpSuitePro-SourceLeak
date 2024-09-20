package net.portswigger.devtools.protocol.types.webaudio;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.webaudio.AudioParam")
public class AudioParam {
  @Zvd(Zp = "paramId")
  public final String paramId;
  
  @Zvd(Zp = "nodeId")
  public final String nodeId;
  
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "paramType")
  public final String paramType;
  
  @Zvd(Zp = "rate")
  public final AutomationRate rate;
  
  @Zvd(Zp = "defaultValue")
  public final Double defaultValue;
  
  @Zvd(Zp = "minValue")
  public final Double minValue;
  
  @Zvd(Zp = "maxValue")
  public final Double maxValue;
  
  @Zox
  public AudioParam(@Zc5(Ze = "paramId") String paramString1, @Zc5(Ze = "nodeId") String paramString2, @Zc5(Ze = "contextId") String paramString3, @Zc5(Ze = "paramType") String paramString4, @Zc5(Ze = "rate") AutomationRate paramAutomationRate, @Zc5(Ze = "defaultValue") Double paramDouble1, @Zc5(Ze = "minValue") Double paramDouble2, @Zc5(Ze = "maxValue") Double paramDouble3) {
    this.paramId = paramString1;
    this.nodeId = paramString2;
    Zbqc[] arrayOfZbqc = ContextType.Zj();
    this.contextId = paramString3;
    this.paramType = paramString4;
    this.rate = paramAutomationRate;
    this.defaultValue = paramDouble1;
    this.minValue = paramDouble2;
    this.maxValue = paramDouble3;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webaudio\AudioParam.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */