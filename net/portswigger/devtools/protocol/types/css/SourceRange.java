package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.SourceRange")
public class SourceRange {
  @Zvd(Zp = "startLine")
  public final Integer startLine;
  
  @Zvd(Zp = "startColumn")
  public final Integer startColumn;
  
  @Zvd(Zp = "endLine")
  public final Integer endLine;
  
  @Zvd(Zp = "endColumn")
  public final Integer endColumn;
  
  @Zox
  public SourceRange(@Zc5(Ze = "startLine") Integer paramInteger1, @Zc5(Ze = "startColumn") Integer paramInteger2, @Zc5(Ze = "endLine") Integer paramInteger3, @Zc5(Ze = "endColumn") Integer paramInteger4) {
    this.startLine = paramInteger1;
    this.startColumn = paramInteger2;
    this.endLine = paramInteger3;
    this.endColumn = paramInteger4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\SourceRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */