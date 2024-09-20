package burp;

import java.awt.Component;
import java.util.List;
import java.util.function.Supplier;

class Ze96 implements Zmgv {
  private final Supplier<Zbdf> Zg;
  
  public Ze96(Supplier<Zbdf> paramSupplier) {
    this.Zg = paramSupplier;
  }
  
  public Zmzk Zod() {
    Zefx zefx = ZC(Zw());
    return (zefx == null) ? null : zefx.ZT();
  }
  
  public Zstu Zos() {
    Zefx zefx = ZC(Zw());
    return (zefx == null) ? null : Zyf.Zy(zefx.ZD());
  }
  
  public Zstu ZoO() {
    Zxpe zxpe = ZH(Zw());
    return (zxpe == null) ? null : zxpe.ZS();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  private Zsmh Zw() {
    Zbdf zbdf = this.Zg.get();
    return (zbdf == null) ? null : zbdf.Zi();
  }
  
  private static Zefx ZC(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    Zg79 zg79 = new Zg79();
    paramZsmh.Zh(zg79);
    return zg79.Z_;
  }
  
  private static Zxpe ZH(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    Zg79 zg79 = new Zg79();
    paramZsmh.Zh(zg79);
    return zg79.Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze96.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */