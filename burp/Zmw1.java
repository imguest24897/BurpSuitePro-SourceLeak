package burp;

import java.util.Locale;

public class Zmw1 extends Zmws implements Zli1 {
  Zmw1(Zl34 paramZl34, Ztn0 paramZtn0, Zr_4 paramZr_41, Zr_4 paramZr_42) {
    super(paramZl34, paramZtn0, paramZr_41, paramZr_42);
  }
  
  public Ztn0 ZAJ() {
    return this.ZC;
  }
  
  public int ZAg() {
    return this.ZI.Zjg().size();
  }
  
  public void ZI(Zlit paramZlit) {
    ZZ(Ze9z.Zj(paramZlit, this.Zq));
  }
  
  public void ZZ(Zg55 paramZg55) {
    this.ZI.Ze(paramZg55, this.ZC);
    ZC((Zz28)null);
  }
  
  public void ZO(Zg55 paramZg55, int paramInt) {
    this.ZI.Zx(paramZg55, paramInt, this.ZC);
    ZC((Zz28)null);
  }
  
  public void Zg(Zlit paramZlit) {
    Zg55 zg55 = Ze9z.Zj(paramZlit, this.ZO);
    this.ZI.Zq(zg55, this.ZC);
    ZC((Zz28)null);
  }
  
  public void Zl(int paramInt) {
    this.ZI.Zf(paramInt, this.ZC);
    ZC((Zz28)null);
  }
  
  public Zg55 Zs(int paramInt) {
    return this.ZI.ZW7(paramInt);
  }
  
  public void ZC(Zz28 paramZz28) {
    if (this.ZW != null)
      this.ZW.ZC(paramZz28); 
  }
  
  public boolean ZI(Zmzk paramZmzk) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    if (paramZmzk == null)
      return false; 
    synchronized (this.ZI.Zz6()) {
      String str = paramZmzk.toString().toLowerCase(Locale.ENGLISH);
      for (Zg55 zg55 : this.ZI.Zjg()) {
        if (zg55.ZVA(str))
          return true; 
        if (arrayOfZbqc != null)
          break; 
      } 
      for (Zg55 zg55 : this.ZI.Zjg()) {
        if (zg55.Z_(paramZmzk))
          return true; 
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return false;
  }
  
  public boolean Zm(Zlit paramZlit) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    if (paramZlit == null)
      return false; 
    synchronized (this.ZI.Zz6()) {
      String str = paramZlit.toString().toLowerCase(Locale.ENGLISH);
      for (Zg55 zg55 : this.ZI.Zjg()) {
        if (zg55.ZVA(str))
          return true; 
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return false;
  }
  
  public boolean Zh(Zlit paramZlit) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    if (paramZlit == null)
      return false; 
    synchronized (this.ZI.Zz6()) {
      String str = paramZlit.toString().toLowerCase(Locale.ENGLISH);
      for (Zg55 zg55 : this.ZI.Zjg()) {
        if (zg55.ZVo(str))
          return true; 
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return false;
  }
  
  public void ZL(Zzqw paramZzqw) {
    Zbqc[] arrayOfZbqc = Zlor.Zcp();
    for (Zg55 zg55 : this.ZI.Zjg()) {
      paramZzqw.Zx(zg55.Zaj());
      if (arrayOfZbqc != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmw1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */