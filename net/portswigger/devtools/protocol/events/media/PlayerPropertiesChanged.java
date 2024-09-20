package net.portswigger.devtools.protocol.events.media;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.media.PlayerProperty;

@Zsi("net.portswigger.devtools.protocol.events.media.PlayerPropertiesChanged")
public class PlayerPropertiesChanged implements Zl {
  @Zvd(Zp = "playerId")
  public final String playerId;
  
  @Zvd(Zp = "properties")
  public final List<PlayerProperty> properties;
  
  @Zox
  public PlayerPropertiesChanged(@Zc5(Ze = "playerId") String paramString, @Zc5(Ze = "properties") List<PlayerProperty> paramList) {
    this.playerId = paramString;
    String str = PlayersCreated.Zi();
    this.properties = paramList;
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\media\PlayerPropertiesChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */