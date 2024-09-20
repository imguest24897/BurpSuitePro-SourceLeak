package net.portswigger.devtools.protocol.types.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.webaudio.BaseAudioContext")
public class BaseAudioContext {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "contextType")
  public final ContextType contextType;
  
  @Zvd(Zp = "contextState")
  public final ContextState contextState;
  
  @Zvd(Zp = "realtimeData")
  @Zj
  public final ContextRealtimeData realtimeData;
  
  @Zvd(Zp = "callbackBufferSize")
  public final Double callbackBufferSize;
  
  @Zvd(Zp = "maxOutputChannelCount")
  public final Double maxOutputChannelCount;
  
  @Zvd(Zp = "sampleRate")
  public final Double sampleRate;
  
  @Zox
  public BaseAudioContext(@Zc5(Ze = "contextId") String paramString, @Zc5(Ze = "contextType") ContextType paramContextType, @Zc5(Ze = "contextState") ContextState paramContextState, @Zc5(Ze = "realtimeData", ZS = "null") ContextRealtimeData paramContextRealtimeData, @Zc5(Ze = "callbackBufferSize") Double paramDouble1, @Zc5(Ze = "maxOutputChannelCount") Double paramDouble2, @Zc5(Ze = "sampleRate") Double paramDouble3) {
    this.contextId = paramString;
    this.contextType = paramContextType;
    this.contextState = paramContextState;
    this.realtimeData = paramContextRealtimeData;
    this.callbackBufferSize = paramDouble1;
    this.maxOutputChannelCount = paramDouble2;
    this.sampleRate = paramDouble3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webaudio\BaseAudioContext.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */