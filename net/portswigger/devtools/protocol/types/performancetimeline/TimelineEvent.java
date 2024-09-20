package net.portswigger.devtools.protocol.types.performancetimeline;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.performancetimeline.TimelineEvent")
public class TimelineEvent {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "type")
  public final String type;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "time")
  public final Double time;
  
  @Zvd(Zp = "duration")
  @Zj
  public final Double duration;
  
  @Zvd(Zp = "lcpDetails")
  @Zj
  public final LargestContentfulPaint lcpDetails;
  
  @Zvd(Zp = "layoutShiftDetails")
  @Zj
  public final LayoutShift layoutShiftDetails;
  
  private static boolean Zs;
  
  @Zox
  public TimelineEvent(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "type") String paramString2, @Zc5(Ze = "name") String paramString3, @Zc5(Ze = "time") Double paramDouble1, @Zc5(Ze = "duration", ZS = "null") Double paramDouble2, @Zc5(Ze = "lcpDetails", ZS = "null") LargestContentfulPaint paramLargestContentfulPaint, @Zc5(Ze = "layoutShiftDetails", ZS = "null") LayoutShift paramLayoutShift) {
    this.frameId = paramString1;
    this.type = paramString2;
    this.name = paramString3;
    this.time = paramDouble1;
    this.duration = paramDouble2;
    boolean bool = ZS();
    this.lcpDetails = paramLargestContentfulPaint;
    this.layoutShiftDetails = paramLayoutShift;
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void ZU(boolean paramBoolean) {
    Zs = paramBoolean;
  }
  
  public static boolean ZS() {
    return Zs;
  }
  
  public static boolean Zy() {
    boolean bool = ZS();
    return !bool;
  }
  
  static {
    if (ZS())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\performancetimeline\TimelineEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */