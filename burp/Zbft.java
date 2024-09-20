package burp;

import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbft extends Zbfr {
  private final Zey9 ZV;
  
  private final Supplier<Zrri> Zz;
  
  private final Zbd8 ZW;
  
  private boolean ZH;
  
  private Zbft(Zth5 paramZth5, Zbd8 paramZbd8, Zey9 paramZey9, Supplier<Zrri> paramSupplier, Zzmn... paramVarArgs) {
    super(paramZth5, paramVarArgs);
    this.ZW = paramZbd8;
    this.ZV = paramZey9;
    this.Zz = paramSupplier;
  }
  
  public boolean ZB(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    return paramZge7.ZD(this.ZV.Zy(paramZsmh));
  }
  
  public void ZS(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    Zuh.Zb((paramZsmh != null), Zqf.Zr);
    paramZge7.Zs(this.ZV.Zy(paramZsmh), paramBoolean);
  }
  
  public void ZH(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean1, boolean paramBoolean2) {
    Zuh.Zb((paramZsmh != null), Zqf.Zr);
    paramZge7.ZC(this.ZV.Zy(paramZsmh), paramBoolean1, paramBoolean2);
  }
  
  Zgu3 ZQ() {
    return Zgu3.HTTP_REQUEST;
  }
  
  boolean ZA(Zsmh paramZsmh) {
    Zefx zefx = (paramZsmh == null) ? null : this.ZV.Zy(paramZsmh);
    return (Zt(zefx) || Z_(zefx));
  }
  
  private static boolean Zt(Zefx paramZefx) {
    Zsba zsba = (paramZefx == null) ? null : paramZefx.Zv();
    String str = Zz78.ZZ(zsba).ZC();
    return Zbfr.ZB.contains(str);
  }
  
  private boolean Z_(Zefx paramZefx) {
    this.ZH &= (this.Zz.get() == Zrri.PRETTY) ? 1 : 0;
    return (this.ZH || Zu(paramZefx));
  }
  
  private boolean Zu(Zefx paramZefx) {
    if (paramZefx == null)
      return false; 
    Objects.requireNonNull(Ztji.Zb);
    boolean bool = paramZefx.ZG().stream().map(Zbft::lambda$containsUninterestingHeaders$0).anyMatch(Ztji.Zb::contains);
    if (bool)
      this.ZH = true; 
    return bool;
  }
  
  void ZY(Zren paramZren) {
    this.ZW.ZA(paramZren);
  }
  
  private static String lambda$containsUninterestingHeaders$0(String paramString) {
    String str = paramString.split(":", 2)[0];
    return str.toLowerCase();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */