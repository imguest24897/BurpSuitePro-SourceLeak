package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.css.Value")
public class Value {
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "specificity")
  @Zy
  @Zj
  public final Specificity specificity;
  
  private static boolean ZY;
  
  @Zox
  public Value(@Zc5(Ze = "text") String paramString, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "specificity", ZS = "null") Specificity paramSpecificity) {
    this.text = paramString;
    this.range = paramSourceRange;
    this.specificity = paramSpecificity;
  }
  
  public static void Zs(boolean paramBoolean) {
    ZY = paramBoolean;
  }
  
  public static boolean Zo() {
    return ZY;
  }
  
  public static boolean ZH() {
    boolean bool = Zo();
    return !bool;
  }
  
  static {
    if (!Zo())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\Value.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */