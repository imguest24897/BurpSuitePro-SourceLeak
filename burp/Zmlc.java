package burp;

import java.util.Optional;
import java.util.regex.Pattern;

public class Zmlc {
  private final Pattern Zn;
  
  private final Integer ZD;
  
  private final Integer ZF;
  
  private final Integer Zd;
  
  private final Integer Zr;
  
  private Zmlc(Pattern paramPattern, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4) {
    this.Zn = paramPattern;
    this.ZD = paramInteger1;
    this.ZF = paramInteger2;
    this.Zd = paramInteger3;
    this.Zr = paramInteger4;
  }
  
  public Optional<Pattern> Za() {
    return Optional.ofNullable(this.Zn);
  }
  
  public Optional<Integer> ZQ() {
    return (this.ZD != null && this.ZD.intValue() < 0) ? Optional.empty() : Optional.ofNullable(this.ZD);
  }
  
  public Optional<Integer> Zb() {
    return (this.ZF != null && this.ZF.intValue() < 0) ? Optional.empty() : Optional.ofNullable(this.ZF);
  }
  
  public Optional<Integer> ZC() {
    return Optional.ofNullable(this.Zd);
  }
  
  public Optional<Integer> Zx() {
    return Optional.ofNullable(this.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */