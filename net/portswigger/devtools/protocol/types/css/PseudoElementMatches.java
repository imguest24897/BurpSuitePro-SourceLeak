package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.PseudoType;

@Zsi("net.portswigger.devtools.protocol.types.css.PseudoElementMatches")
public class PseudoElementMatches {
  @Zvd(Zp = "pseudoType")
  public final PseudoType pseudoType;
  
  @Zvd(Zp = "pseudoIdentifier")
  @Zj
  public final String pseudoIdentifier;
  
  @Zvd(Zp = "matches")
  public final List<RuleMatch> matches;
  
  @Zox
  public PseudoElementMatches(@Zc5(Ze = "pseudoType") PseudoType paramPseudoType, @Zc5(Ze = "pseudoIdentifier", ZS = "null") String paramString, @Zc5(Ze = "matches") List<RuleMatch> paramList) {
    this.pseudoType = paramPseudoType;
    this.pseudoIdentifier = paramString;
    this.matches = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\PseudoElementMatches.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */