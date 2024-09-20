package burp;

import burp.api.montoya.http.message.Cookie;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Zezj {
  static final Zezj Zl = new Zezl();
  
  final Zs68 ZP;
  
  Zezj(Zs68 paramZs68) {
    this.ZP = paramZs68;
  }
  
  public List<String> Zi() {
    return (this.ZP == null) ? null : this.ZP.Zy();
  }
  
  public List<Cookie> ZA() {
    return (this.ZP == null || this.ZP.ZN == null) ? null : (List<Cookie>)this.ZP.ZN.stream().map(Zxzs::new).collect(Collectors.toUnmodifiableList());
  }
  
  boolean Z_() {
    return (Zi() != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */