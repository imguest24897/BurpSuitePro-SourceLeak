package net.portswigger.devtools.protocol.types.media;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.media.PlayerEvent")
public class PlayerEvent {
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zox
  public PlayerEvent(@Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "value") String paramString) {
    this.timestamp = paramDouble;
    this.value = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\media\PlayerEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */