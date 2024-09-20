package net.portswigger.devtools.protocol.types.media;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.media.PlayerMessage")
public class PlayerMessage {
  @Zvd(Zp = "level")
  public final PlayerMessageLevel level;
  
  @Zvd(Zp = "message")
  public final String message;
  
  @Zox
  public PlayerMessage(@Zc5(Ze = "level") PlayerMessageLevel paramPlayerMessageLevel, @Zc5(Ze = "message") String paramString) {
    Zbqc[] arrayOfZbqc = PlayerProperty.Zs();
    this.level = paramPlayerMessageLevel;
    this.message = paramString;
    if (Zbqc.Zwu() == null)
      PlayerProperty.Zy(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\media\PlayerMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */