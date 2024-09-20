package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.InheritedPseudoElementMatches")
public class InheritedPseudoElementMatches {
  @Zvd(Zp = "pseudoElements")
  public final List<PseudoElementMatches> pseudoElements;
  
  @Zox
  public InheritedPseudoElementMatches(@Zc5(Ze = "pseudoElements") List<PseudoElementMatches> paramList) {
    this.pseudoElements = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\InheritedPseudoElementMatches.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */