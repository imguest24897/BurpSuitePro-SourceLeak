package net.portswigger.devtools.protocol.types.webaudio;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.webaudio.AudioNode")
public class AudioNode {
  @Zvd(Zp = "nodeId")
  public final String nodeId;
  
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "nodeType")
  public final String nodeType;
  
  @Zvd(Zp = "numberOfInputs")
  public final Double numberOfInputs;
  
  @Zvd(Zp = "numberOfOutputs")
  public final Double numberOfOutputs;
  
  @Zvd(Zp = "channelCount")
  public final Double channelCount;
  
  @Zvd(Zp = "channelCountMode")
  public final ChannelCountMode channelCountMode;
  
  @Zvd(Zp = "channelInterpretation")
  public final ChannelInterpretation channelInterpretation;
  
  @Zox
  public AudioNode(@Zc5(Ze = "nodeId") String paramString1, @Zc5(Ze = "contextId") String paramString2, @Zc5(Ze = "nodeType") String paramString3, @Zc5(Ze = "numberOfInputs") Double paramDouble1, @Zc5(Ze = "numberOfOutputs") Double paramDouble2, @Zc5(Ze = "channelCount") Double paramDouble3, @Zc5(Ze = "channelCountMode") ChannelCountMode paramChannelCountMode, @Zc5(Ze = "channelInterpretation") ChannelInterpretation paramChannelInterpretation) {
    this.nodeId = paramString1;
    this.contextId = paramString2;
    this.nodeType = paramString3;
    this.numberOfInputs = paramDouble1;
    Zbqc[] arrayOfZbqc = ContextType.Zj();
    this.numberOfOutputs = paramDouble2;
    this.channelCount = paramDouble3;
    this.channelCountMode = paramChannelCountMode;
    this.channelInterpretation = paramChannelInterpretation;
    if (Zbqc.Zwu() == null)
      ContextType.Zd(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webaudio\AudioNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */