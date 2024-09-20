package net.portswigger.devtools.protocol.types.webaudio;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.webaudio.ContextRealtimeData")
public class ContextRealtimeData {
  @Zvd(Zp = "currentTime")
  public final Double currentTime;
  
  @Zvd(Zp = "renderCapacity")
  public final Double renderCapacity;
  
  @Zvd(Zp = "callbackIntervalMean")
  public final Double callbackIntervalMean;
  
  @Zvd(Zp = "callbackIntervalVariance")
  public final Double callbackIntervalVariance;
  
  @Zox
  public ContextRealtimeData(@Zc5(Ze = "currentTime") Double paramDouble1, @Zc5(Ze = "renderCapacity") Double paramDouble2, @Zc5(Ze = "callbackIntervalMean") Double paramDouble3, @Zc5(Ze = "callbackIntervalVariance") Double paramDouble4) {
    this.currentTime = paramDouble1;
    this.renderCapacity = paramDouble2;
    this.callbackIntervalMean = paramDouble3;
    this.callbackIntervalVariance = paramDouble4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webaudio\ContextRealtimeData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */