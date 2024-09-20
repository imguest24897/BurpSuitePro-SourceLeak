package net.portswigger.devtools.protocol.types.media;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.media.PlayerProperty")
public class PlayerProperty {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  private static Zbqc[] ZY;
  
  @Zox
  public PlayerProperty(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.name = paramString1;
    this.value = paramString2;
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zs() {
    return ZY;
  }
  
  static {
    if (Zs() != null)
      Zy(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\media\PlayerProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */