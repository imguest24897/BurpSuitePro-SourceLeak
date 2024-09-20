package burp;

import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zdo;

public class Zg8g extends Zg8k {
  Zg8g(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zzlx paramZzlx) {
    super(paramZlfa, paramList, paramZr_d, paramZzlx);
  }
  
  Zg8g(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    super(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
  }
  
  protected void ZP() {
    int i = -1;
    boolean bool = false;
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    byte b = 0;
    while (b < this.Zy.ZR()) {
      Zkq1 zkq1 = this.ZY.get(b);
      if (zkq1.ZyP())
        bool = true; 
      int j = zkq1.Zyv();
      if (j > 0 && (i == -1 || j < i))
        i = j; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.Zq.set(i);
    this.Zn.set(bool);
  }
  
  public byte[][][] Zw() {
    Zxph zxph = this.ZC.ZjB();
    int i = this.Zy.ZR();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    while (b < i) {
      zxph.Zc(Integer.valueOf(b), ((Zkq1)this.ZY.get(b)).ZD(this.Zj.get(), (b * 2 + 1 < i) ? this.Zy.Zl(b) : Zdo.ZQ));
      if (zxph.Zo(Integer.valueOf(b)) == null)
        return null; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    this.ZE.ZV();
    b = 0;
    while (b < i) {
      Zkq1 zkq1 = this.ZY.get(b);
      if (zkq1.Zgx())
        zxph.Zc(Integer.valueOf(b), zkq1.ZK(this.Zj.get(), (b * 2 + 1 < i) ? this.Zy.Zl(b) : Zdo.ZQ, zxph.ZxY())); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zxph.ZxY();
  }
  
  protected void Zz(Zxph paramZxph, int paramInt) {
    Zkq1 zkq1 = this.ZY.get(paramInt);
    paramZxph.Zs(Integer.valueOf(paramInt), zkq1.Zm(paramZxph.Zm(Integer.valueOf(paramInt)), false));
    paramZxph.Zz(Integer.valueOf(paramInt), zkq1.Zyn().Zd(paramZxph.ZK(Integer.valueOf(paramInt))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */