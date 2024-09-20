package burp;

import java.util.Collections;
import java.util.List;

class Zei6 {
  private final Zm6x ZE;
  
  private final Zekl Zd;
  
  private final Zbw_<?> Zy;
  
  private Zmzk Zl;
  
  private Ztf_<?> ZO;
  
  private List<Zz6e<?>> Zg;
  
  private boolean ZC;
  
  private boolean Zr;
  
  Zei6(Zm6x paramZm6x, Zekl paramZekl, Zbw_<?> paramZbw_) {
    this.ZE = paramZm6x;
    this.Zd = paramZekl;
    this.Zy = paramZbw_;
    this.ZC = paramZekl.Zl6();
    this.Zg = Collections.emptyList();
  }
  
  boolean Zx() {
    return this.Zl.ZJZ();
  }
  
  String Zc() {
    return this.ZO.ZB(this.ZO.ZJ());
  }
  
  Zz6e<?> Zy() {
    return this.ZO;
  }
  
  void ZN(Ztf_<?> paramZtf_) {
    this.ZO = paramZtf_;
    this.Zl = (paramZtf_ == null) ? null : paramZtf_.ZJ();
    this.ZE.ZB(new Ztzz(this.ZO));
  }
  
  List<Zz6e<?>> Zl() {
    return this.Zg;
  }
  
  void Zj(List<Zz6e<?>> paramList) {
    this.Zg = paramList;
    this.ZE.ZB(new Zs4u(this.Zg));
  }
  
  void ZM(boolean paramBoolean) {
    if (this.ZC != paramBoolean) {
      this.ZC = paramBoolean;
      this.Zd.Zh(paramBoolean, this.Zy);
      this.ZE.ZB(new Zlp(paramBoolean));
    } 
  }
  
  boolean ZU() {
    return this.ZC;
  }
  
  boolean ZZ() {
    return this.Zr;
  }
  
  void Zx(boolean paramBoolean) {
    this.Zr = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zei6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */