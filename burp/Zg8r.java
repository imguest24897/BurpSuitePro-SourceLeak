package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zg8r extends Zg8k {
  Zg8r(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zzlx paramZzlx) {
    super(paramZlfa, paramList, paramZr_d, paramZzlx);
  }
  
  Zg8r(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    super(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
  }
  
  protected void ZP() {
    Zkq1 zkq1 = Z_();
    int i = zkq1.Zyv();
    if (i != -1)
      i = this.Zy.ZR() * i; 
    this.Zq.set(i);
    this.Zn.set(zkq1.ZyP());
  }
  
  public byte[][][] Zw() throws Ztku {
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    int i = this.Zy.ZR();
    while (!Zm(ZZ())) {
      ZW();
      if (ZZ() < i) {
        ZY();
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return this.ZC.Zj3();
  }
  
  protected void Zz(Zxph paramZxph, int paramInt) {
    paramZxph.Zs(Integer.valueOf(paramInt), Z_().Zm(paramZxph.Zm(Integer.valueOf(paramInt)), false));
    paramZxph.Zz(Integer.valueOf(paramInt), Z_().Zyn().Zd(paramZxph.ZK(Integer.valueOf(paramInt))));
  }
  
  private boolean Zm(int paramInt) {
    if (paramInt < this.Zy.ZR()) {
      byte[] arrayOfByte = this.Zy.Zl(paramInt);
      byte[][] arrayOfByte1 = Zp(arrayOfByte);
      this.ZC.Zx(paramInt, arrayOfByte1);
      return (arrayOfByte1 != null);
    } 
    return true;
  }
  
  private void ZY() throws Ztku {
    Z_().Zy4();
  }
  
  private byte[][] Zp(byte[] paramArrayOfbyte) {
    return Z_().ZD(this.Zj.get(), paramArrayOfbyte);
  }
  
  private Zkq1 Z_() {
    return this.ZY.get(0);
  }
  
  private void ZW() {
    this.ZC.ZD((short)(this.ZC.Zjs() + 1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */