package burp;

import java.util.regex.Pattern;

public class Zrbg {
  private Pattern Zr;
  
  private Integer Zb;
  
  private Integer Zj;
  
  private Integer Zy;
  
  private Integer ZX;
  
  public Zrbg ZF(Pattern paramPattern) {
    this.Zr = paramPattern;
    return this;
  }
  
  public Zrbg Zp(Integer paramInteger) {
    this.Zb = paramInteger;
    return this;
  }
  
  public Zrbg Zj(Integer paramInteger) {
    this.Zj = paramInteger;
    return this;
  }
  
  public Zrbg Zq(Integer paramInteger) {
    this.Zy = paramInteger;
    return this;
  }
  
  public Zrbg ZE(Integer paramInteger) {
    this.ZX = paramInteger;
    return this;
  }
  
  public Zmlc ZV() {
    return new Zmlc(this.Zr, this.Zb, this.Zj, this.Zy, this.ZX);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */