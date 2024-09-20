package net.portswigger.devtools.protocol.types.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.dom.RGBA")
public class RGBA {
  @Zvd(Zp = "r")
  public final Integer r;
  
  @Zvd(Zp = "g")
  public final Integer g;
  
  @Zvd(Zp = "b")
  public final Integer b;
  
  @Zvd(Zp = "a")
  @Zj
  public final Double a;
  
  @Zox
  public RGBA(@Zc5(Ze = "r") Integer paramInteger1, @Zc5(Ze = "g") Integer paramInteger2, @Zc5(Ze = "b") Integer paramInteger3, @Zc5(Ze = "a", ZS = "null") Double paramDouble) {
    this.r = paramInteger1;
    this.g = paramInteger2;
    this.b = paramInteger3;
    this.a = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\RGBA.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */