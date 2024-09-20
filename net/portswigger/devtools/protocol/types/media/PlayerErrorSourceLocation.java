package net.portswigger.devtools.protocol.types.media;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.media.PlayerErrorSourceLocation")
public class PlayerErrorSourceLocation {
  @Zvd(Zp = "file")
  public final String file;
  
  @Zvd(Zp = "line")
  public final Integer line;
  
  @Zox
  public PlayerErrorSourceLocation(@Zc5(Ze = "file") String paramString, @Zc5(Ze = "line") Integer paramInteger) {
    this.file = paramString;
    this.line = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\media\PlayerErrorSourceLocation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */