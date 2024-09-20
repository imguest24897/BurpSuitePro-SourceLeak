package net.portswigger.devtools.protocol.events.media;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.media.PlayersCreated")
public class PlayersCreated implements Zl {
  @Zvd(Zp = "players")
  public final List<String> players;
  
  private static String ZX;
  
  @Zox
  public PlayersCreated(@Zc5(Ze = "players") List<String> paramList) {
    this.players = paramList;
  }
  
  public static void Zv(String paramString) {
    ZX = paramString;
  }
  
  public static String Zi() {
    return ZX;
  }
  
  static {
    if (Zi() != null)
      Zv("DScNxc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\media\PlayersCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */