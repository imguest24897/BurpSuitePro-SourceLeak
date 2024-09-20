package net.portswigger.devtools.protocol.types.performancetimeline;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.performancetimeline.LargestContentfulPaint")
public class LargestContentfulPaint {
  @Zvd(Zp = "renderTime")
  public final Double renderTime;
  
  @Zvd(Zp = "loadTime")
  public final Double loadTime;
  
  @Zvd(Zp = "size")
  public final Double size;
  
  @Zvd(Zp = "elementId")
  @Zj
  public final String elementId;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "nodeId")
  @Zj
  public final Integer nodeId;
  
  @Zox
  public LargestContentfulPaint(@Zc5(Ze = "renderTime") Double paramDouble1, @Zc5(Ze = "loadTime") Double paramDouble2, @Zc5(Ze = "size") Double paramDouble3, @Zc5(Ze = "elementId", ZS = "null") String paramString1, @Zc5(Ze = "url", ZS = "null") String paramString2, @Zc5(Ze = "nodeId", ZS = "null") Integer paramInteger) {
    this.renderTime = paramDouble1;
    this.loadTime = paramDouble2;
    this.size = paramDouble3;
    this.elementId = paramString1;
    this.url = paramString2;
    this.nodeId = paramInteger;
    boolean bool = TimelineEvent.ZS();
    if (Zbqc.Zwu() == null)
      TimelineEvent.ZU(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\performancetimeline\LargestContentfulPaint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */