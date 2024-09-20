package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.css.Specificity")
public class Specificity {
  @Zvd(Zp = "a")
  public final Integer a;
  
  @Zvd(Zp = "b")
  public final Integer b;
  
  @Zvd(Zp = "c")
  public final Integer c;
  
  @Zox
  public Specificity(@Zc5(Ze = "a") Integer paramInteger1, @Zc5(Ze = "b") Integer paramInteger2, @Zc5(Ze = "c") Integer paramInteger3) {
    this.a = paramInteger1;
    this.b = paramInteger2;
    this.c = paramInteger3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\Specificity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */