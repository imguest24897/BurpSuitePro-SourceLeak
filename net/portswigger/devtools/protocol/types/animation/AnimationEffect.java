package net.portswigger.devtools.protocol.types.animation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.animation.AnimationEffect")
public class AnimationEffect {
  @Zvd(Zp = "delay")
  public final Double delay;
  
  @Zvd(Zp = "endDelay")
  public final Double endDelay;
  
  @Zvd(Zp = "iterationStart")
  public final Double iterationStart;
  
  @Zvd(Zp = "iterations")
  public final Double iterations;
  
  @Zvd(Zp = "duration")
  public final Double duration;
  
  @Zvd(Zp = "direction")
  public final String direction;
  
  @Zvd(Zp = "fill")
  public final String fill;
  
  @Zvd(Zp = "backendNodeId")
  @Zj
  public final Integer backendNodeId;
  
  @Zvd(Zp = "keyframesRule")
  @Zj
  public final KeyframesRule keyframesRule;
  
  @Zvd(Zp = "easing")
  public final String easing;
  
  @Zox
  public AnimationEffect(@Zc5(Ze = "delay") Double paramDouble1, @Zc5(Ze = "endDelay") Double paramDouble2, @Zc5(Ze = "iterationStart") Double paramDouble3, @Zc5(Ze = "iterations") Double paramDouble4, @Zc5(Ze = "duration") Double paramDouble5, @Zc5(Ze = "direction") String paramString1, @Zc5(Ze = "fill") String paramString2, @Zc5(Ze = "backendNodeId", ZS = "null") Integer paramInteger, @Zc5(Ze = "keyframesRule", ZS = "null") KeyframesRule paramKeyframesRule, @Zc5(Ze = "easing") String paramString3) {
    this.delay = paramDouble1;
    this.endDelay = paramDouble2;
    String[] arrayOfString = ViewOrScrollTimeline.ZP();
    this.iterationStart = paramDouble3;
    this.iterations = paramDouble4;
    this.duration = paramDouble5;
    this.direction = paramString1;
    this.fill = paramString2;
    this.backendNodeId = paramInteger;
    this.keyframesRule = paramKeyframesRule;
    this.easing = paramString3;
    if (Zbqc.Zwu() == null)
      ViewOrScrollTimeline.Zk(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\animation\AnimationEffect.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */