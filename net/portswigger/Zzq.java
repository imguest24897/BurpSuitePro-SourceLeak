package net.portswigger;

import java.util.Optional;
import org.openapi4j.Zr;

public class Zzq {
  private final Zr ZW;
  
  public Zzq(Zr paramZr) {
    this.ZW = paramZr;
  }
  
  public Zfe ZB() {
    String str1 = Optional.<String>ofNullable(this.ZW.getType()).orElse("");
    String str2 = Optional.<String>ofNullable(this.ZW.getScheme()).orElse(Optional.<String>ofNullable(this.ZW.getIn()).orElse(""));
    return Zfe.Zz(str1, str2);
  }
  
  public String ZJ() {
    return this.ZW.getName();
  }
  
  public String Zw() {
    return this.ZW.getScheme();
  }
  
  public String ZY() {
    return this.ZW.getReadableName();
  }
  
  public String Zy() {
    return this.ZW.getBearerFormat();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */