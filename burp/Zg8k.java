package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public abstract class Zg8k {
  protected final Zttp ZE;
  
  protected final Zlfa ZC;
  
  protected final List<Zkq1> ZY;
  
  protected final Zr_d Zy;
  
  protected final AtomicInteger Zq;
  
  protected final AtomicBoolean Zn;
  
  protected final Supplier<Zzlx> Zj;
  
  private static Zbqc[] ZS;
  
  protected Zg8k(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zzlx paramZzlx) {
    this.ZC = paramZlfa;
    this.ZY = paramList;
    this.Zy = paramZr_d;
    this.Zq = new AtomicInteger(0);
    this.Zn = new AtomicBoolean(true);
    this.ZE = Zttp.Zo();
    this.Zj = paramZzlx::lambda$new$0;
    ZK(paramZlfa);
  }
  
  private void ZK(Zlfa paramZlfa) {
    Zxph zxph = paramZlfa.ZjB();
    int i = this.Zy.ZR();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zt();
    while (b < i) {
      zxph.ZW(Short.valueOf((short)b), (Zm8f)null);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public Zg8k(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    this.ZC = paramZlfa;
    this.ZY = paramList;
    this.Zy = paramZr_d;
    this.Zj = paramSupplier;
    this.Zq = new AtomicInteger(paramInt);
    this.Zn = new AtomicBoolean(paramBoolean);
    this.ZE = Zttp.Zo();
  }
  
  public int Za() {
    this.ZE.ZV();
    if (!this.Zn.get())
      return this.Zq.get(); 
    synchronized (this) {
      ZP();
    } 
    return this.Zq.get();
  }
  
  protected abstract void ZP();
  
  public abstract byte[][][] Zw() throws Ztku;
  
  public short ZZ() {
    this.ZE.ZV();
    return this.ZC.Zjs();
  }
  
  public boolean ZI(Zxph paramZxph) {
    int i = this.Zy.ZR();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zt();
    while (b < i) {
      if (paramZxph.Zg(Integer.valueOf(b))) {
        Zz(paramZxph, b);
        if (paramZxph.<Integer>Zo(Integer.valueOf(b)).ZoI() == null) {
          byte b1 = 0;
          while (b1 < b) {
            if (paramZxph.Zg(Integer.valueOf(b1)))
              paramZxph.<Integer>Zo(Integer.valueOf(b1)).Zov(); 
            b1++;
            if (arrayOfZbqc != null)
              break; 
          } 
          return false;
        } 
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  protected abstract void Zz(Zxph paramZxph, int paramInt);
  
  private static Zzlx lambda$new$0(Zzlx paramZzlx) {
    return paramZzlx;
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    ZS = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zt() {
    return ZS;
  }
  
  static {
    if (Zt() != null)
      Z_(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */