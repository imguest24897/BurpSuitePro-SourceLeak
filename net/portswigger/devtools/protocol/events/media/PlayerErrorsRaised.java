package net.portswigger.devtools.protocol.events.media;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.media.PlayerError;

@Zsi("net.portswigger.devtools.protocol.events.media.PlayerErrorsRaised")
public class PlayerErrorsRaised implements Zl {
  @Zvd(Zp = "playerId")
  public final String playerId;
  
  @Zvd(Zp = "errors")
  public final List<PlayerError> errors;
  
  @Zox
  public PlayerErrorsRaised(@Zc5(Ze = "playerId") String paramString, @Zc5(Ze = "errors") List<PlayerError> paramList) {
    this.playerId = paramString;
    this.errors = paramList;
    String str = PlayersCreated.Zi();
    if (Zbqc.Zwu() == null)
      PlayersCreated.Zv("V07Dg"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\media\PlayerErrorsRaised.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */