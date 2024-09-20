package net.portswigger.devtools.protocol.events.animation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.animation.Animation;

@Zsi("net.portswigger.devtools.protocol.events.animation.AnimationStarted")
public class AnimationStarted implements Zl {
  @Zvd(Zp = "animation")
  public final Animation animation;
  
  @Zox
  public AnimationStarted(@Zc5(Ze = "animation") Animation paramAnimation) {
    this.animation = paramAnimation;
    Zbqc[] arrayOfZbqc = AnimationUpdated.Za();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\animation\AnimationStarted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */