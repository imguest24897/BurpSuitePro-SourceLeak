package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zg8c extends Zg8k {
  Zg8c(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zzlx paramZzlx) {
    super(paramZlfa, paramList, paramZr_d, paramZzlx);
  }
  
  Zg8c(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    super(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
  }
  
  protected void ZP() {
    Zkq1 zkq1 = this.ZY.get(0);
    this.Zq.set(zkq1.Zyv());
    this.Zn.set(zkq1.ZyP());
  }
  
  public byte[][][] Zw() {
    Zxph zxph = this.ZC.ZjB();
    int i = this.Zy.ZR();
    zxph.Zc(Integer.valueOf(0), ((Zkq1)this.ZY.get(0)).ZD(this.Zj.get(), (byte[])null));
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    if (zxph.Zo(Integer.valueOf(0)) == null)
      return null; 
    byte b = 1;
    while (b < i) {
      zxph.ZW(Integer.valueOf(b), zxph.Zo(Integer.valueOf(0)));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.ZE.ZV();
    return zxph.ZxY();
  }
  
  protected void Zz(Zxph paramZxph, int paramInt) {
    Zkq1 zkq1 = this.ZY.get(0);
    paramZxph.Zs(Integer.valueOf(paramInt), zkq1.Zm(paramZxph.Zm(Integer.valueOf(paramInt)), false));
    paramZxph.Zz(Integer.valueOf(paramInt), zkq1.Zyn().Zd(paramZxph.ZK(Integer.valueOf(paramInt))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */