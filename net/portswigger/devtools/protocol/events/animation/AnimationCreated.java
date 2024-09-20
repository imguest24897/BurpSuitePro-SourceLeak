package net.portswigger.devtools.protocol.events.animation;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.animation.AnimationCreated")
public class AnimationCreated implements Zl {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zox
  public AnimationCreated(@Zc5(Ze = "id") String paramString) {
    Zbqc[] arrayOfZbqc = AnimationUpdated.Za();
    this.id = paramString;
    if (Zbqc.Zwu() == null)
      AnimationUpdated.ZN(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\animation\AnimationCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */