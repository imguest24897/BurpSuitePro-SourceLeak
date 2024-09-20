package net.portswigger.devtools.protocol.events.animation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.animation.Animation;

@Zsi("net.portswigger.devtools.protocol.events.animation.AnimationUpdated")
public class AnimationUpdated implements Zl {
  @Zvd(Zp = "animation")
  public final Animation animation;
  
  private static Zbqc[] ZI;
  
  @Zox
  public AnimationUpdated(@Zc5(Ze = "animation") Animation paramAnimation) {
    this.animation = paramAnimation;
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    ZI = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return ZI;
  }
  
  static {
    if (Za() == null)
      ZN(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\animation\AnimationUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */