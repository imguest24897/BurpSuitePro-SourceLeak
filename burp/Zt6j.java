package burp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Zt6j extends Zt68 {
  final Zz1p ZI;
  
  Zt6j(Zz1p paramZz1p) {
    this.ZI = paramZz1p;
  }
  
  public Zlit Zo() {
    return this.ZI.Zo;
  }
  
  public String ZX() {
    return this.ZI.Zb;
  }
  
  public String ZV() {
    return this.ZI.Zh;
  }
  
  public List<String> ZP() {
    return this.ZI.ZG();
  }
  
  public Zsba Zr() {
    return this.ZI.ZY;
  }
  
  boolean Zy() {
    return (this.ZI.ZY == Zsba.MULTIPART);
  }
  
  void ZO(Zbi1 paramZbi1) {
    paramZbi1.ZH(this);
  }
  
  public List<Zlou> Zm() {
    return (this.ZI.ZV == null) ? null : Collections.<Zlou>unmodifiableList((List<? extends Zlou>)this.ZI.ZV.stream().map(Zlou::Zs).collect(Collectors.toList()));
  }
  
  public int Zl() {
    return this.ZI.ZO();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */