package burp;

import java.awt.Component;
import java.util.List;

class Ztnf implements Zll9 {
  private final Zmzk Ze;
  
  private final long ZD;
  
  private final boolean ZZ;
  
  private final Zeew Zr;
  
  private final Zbr ZC;
  
  private final Zstu ZY;
  
  private final String Zm;
  
  private Zefx Zn = null;
  
  private Zs68 Zw = null;
  
  Ztnf(Zmgv paramZmgv, Zeew paramZeew, Zbnt paramZbnt, Zey9 paramZey9) {
    this.Zr = paramZeew;
    this.Ze = paramZmgv.Zod();
    this.ZD = paramZmgv.ZoB();
    this.ZC = paramZmgv.Zo3();
    if (this.ZC != null)
      this.Zn = this.ZC.ZP(paramZmgv.Zod(), paramZey9); 
    this.ZY = paramZmgv.ZoO();
    if (this.ZY != null)
      this.Zw = Zbwc.Zt((this.Zn == null) ? null : this.Zn.ZF(), this.ZY, Zt0k.NO_HTML_ANALYSIS, paramZbnt); 
    this.ZZ = paramZmgv.ZoZ();
    Zgap zgap = (Zgap)paramZmgv;
    this.Zm = (paramZmgv instanceof Zgap) ? zgap.ZZ() : null;
  }
  
  public Zeew Ze2() {
    return this.Zr;
  }
  
  public short Zl7() {
    return (this.Zw == null) ? 0 : this.Zw.Zb;
  }
  
  public int Zlq() {
    return (this.Zw == null) ? 0 : this.Zw.Zs;
  }
  
  public String ZIx() {
    return this.Zm;
  }
  
  public Zmzk Zod() {
    return this.Ze;
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public boolean ZoZ() {
    return this.ZZ;
  }
  
  public Zlit ZlL() {
    return (this.Zn == null) ? null : this.Zn.ZF();
  }
  
  public Zbr Zo3() {
    return this.ZC;
  }
  
  public Zstu Zos() {
    return (this.ZC == null) ? null : (this.ZC.Zz() ? this.ZC.Zr() : Zyf.Zy(this.Zn.Zb().ZD()));
  }
  
  public Zstu ZoO() {
    return this.ZY;
  }
  
  public long ZoB() {
    return this.ZD;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */