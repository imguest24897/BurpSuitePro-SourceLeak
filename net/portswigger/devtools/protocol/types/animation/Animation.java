package net.portswigger.devtools.protocol.types.animation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.animation.Animation")
public class Animation {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "pausedState")
  public final Boolean pausedState;
  
  @Zvd(Zp = "playState")
  public final String playState;
  
  @Zvd(Zp = "playbackRate")
  public final Double playbackRate;
  
  @Zvd(Zp = "startTime")
  public final Double startTime;
  
  @Zvd(Zp = "currentTime")
  public final Double currentTime;
  
  @Zvd(Zp = "type")
  public final AnimationType type;
  
  @Zvd(Zp = "source")
  @Zj
  public final AnimationEffect source;
  
  @Zvd(Zp = "cssId")
  @Zj
  public final String cssId;
  
  @Zvd(Zp = "viewOrScrollTimeline")
  @Zj
  public final ViewOrScrollTimeline viewOrScrollTimeline;
  
  @Zox
  public Animation(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "pausedState") Boolean paramBoolean, @Zc5(Ze = "playState") String paramString3, @Zc5(Ze = "playbackRate") Double paramDouble1, @Zc5(Ze = "startTime") Double paramDouble2, @Zc5(Ze = "currentTime") Double paramDouble3, @Zc5(Ze = "type") AnimationType paramAnimationType, @Zc5(Ze = "source", ZS = "null") AnimationEffect paramAnimationEffect, @Zc5(Ze = "cssId", ZS = "null") String paramString4, @Zc5(Ze = "viewOrScrollTimeline", ZS = "null") ViewOrScrollTimeline paramViewOrScrollTimeline) {
    this.id = paramString1;
    this.name = paramString2;
    this.pausedState = paramBoolean;
    this.playState = paramString3;
    this.playbackRate = paramDouble1;
    this.startTime = paramDouble2;
    this.currentTime = paramDouble3;
    this.type = paramAnimationType;
    this.source = paramAnimationEffect;
    this.cssId = paramString4;
    String[] arrayOfString = ViewOrScrollTimeline.ZP();
    this.viewOrScrollTimeline = paramViewOrScrollTimeline;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\animation\Animation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */