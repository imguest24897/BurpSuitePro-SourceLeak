package burp;

import java.util.Objects;
import java.util.Optional;

class Zg3w {
  private final String ZM;
  
  private final Zznm ZN;
  
  private Zgob Zt;
  
  Zg3w(String paramString) {
    this(paramString, Zznm.DEFAULT);
  }
  
  Zg3w(String paramString, Zznm paramZznm) {
    this.ZM = Objects.<String>requireNonNull(paramString);
    this.ZN = Objects.<Zznm>requireNonNull(paramZznm);
  }
  
  String ZM() {
    return this.ZM;
  }
  
  Zgob ZU() {
    return this.Zt;
  }
  
  Optional<Zbqc> Zy(Zbqc paramZbqc) {
    Zgob zgob = null;
    if (this.Zt == null) {
      this.Zt = new Zgob(this.ZN);
      zgob = this.Zt;
    } 
    this.Zt.Zj(paramZbqc);
    return Optional.ofNullable(zgob);
  }
  
  public String toString() {
    return this.ZM;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */