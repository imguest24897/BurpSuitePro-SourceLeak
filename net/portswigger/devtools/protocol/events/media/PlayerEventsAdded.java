package net.portswigger.devtools.protocol.events.media;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.media.PlayerEvent;

@Zsi("net.portswigger.devtools.protocol.events.media.PlayerEventsAdded")
public class PlayerEventsAdded implements Zl {
  @Zvd(Zp = "playerId")
  public final String playerId;
  
  @Zvd(Zp = "events")
  public final List<PlayerEvent> events;
  
  @Zox
  public PlayerEventsAdded(@Zc5(Ze = "playerId") String paramString, @Zc5(Ze = "events") List<PlayerEvent> paramList) {
    this.playerId = paramString;
    this.events = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\media\PlayerEventsAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */