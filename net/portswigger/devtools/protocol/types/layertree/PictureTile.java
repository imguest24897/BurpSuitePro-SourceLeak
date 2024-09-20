package net.portswigger.devtools.protocol.types.layertree;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.layertree.PictureTile")
public class PictureTile {
  @Zvd(Zp = "x")
  public final Double x;
  
  @Zvd(Zp = "y")
  public final Double y;
  
  @Zvd(Zp = "picture")
  public final String picture;
  
  @Zox
  public PictureTile(@Zc5(Ze = "x") Double paramDouble1, @Zc5(Ze = "y") Double paramDouble2, @Zc5(Ze = "picture") String paramString) {
    this.x = paramDouble1;
    this.y = paramDouble2;
    this.picture = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\layertree\PictureTile.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */