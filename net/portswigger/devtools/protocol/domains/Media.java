package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.media.PlayerErrorsRaised;
import net.portswigger.devtools.protocol.events.media.PlayerEventsAdded;
import net.portswigger.devtools.protocol.events.media.PlayerMessagesLogged;
import net.portswigger.devtools.protocol.events.media.PlayerPropertiesChanged;
import net.portswigger.devtools.protocol.events.media.PlayersCreated;

@Zy
public interface Media {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zb("playerPropertiesChanged")
  Zs onPlayerPropertiesChanged(Zp<PlayerPropertiesChanged> paramZp) throws Zp;
  
  @Zb("playerEventsAdded")
  Zs onPlayerEventsAdded(Zp<PlayerEventsAdded> paramZp) throws Zp;
  
  @Zb("playerMessagesLogged")
  Zs onPlayerMessagesLogged(Zp<PlayerMessagesLogged> paramZp) throws Zp;
  
  @Zb("playerErrorsRaised")
  Zs onPlayerErrorsRaised(Zp<PlayerErrorsRaised> paramZp) throws Zp;
  
  @Zb("playersCreated")
  Zs onPlayersCreated(Zp<PlayersCreated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Media.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */