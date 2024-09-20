package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.SelectorList")
public class SelectorList {
  @Zvd(Zp = "selectors")
  public final List<Value> selectors;
  
  @Zvd(Zp = "text")
  public final String text;
  
  @Zox
  public SelectorList(@Zc5(Ze = "selectors") List<Value> paramList, @Zc5(Ze = "text") String paramString) {
    this.selectors = paramList;
    this.text = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\SelectorList.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */