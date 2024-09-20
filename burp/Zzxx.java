package burp;

import net.portswigger.Zrz_;

public class Zzxx {
  private final Zgb6 ZP;
  
  private final Zrgd Z_;
  
  private final Zr1j Zg;
  
  private final Zkh7 Zh;
  
  private final Zlcx Zt;
  
  public Zzxx(Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7, Zlcx paramZlcx) {
    this.ZP = paramZgb6;
    int[] arrayOfInt = Zz8h.ZU();
    this.Z_ = paramZrgd;
    this.Zg = paramZr1j;
    this.Zh = paramZkh7;
    this.Zt = paramZlcx;
    if (Zbqc.Zwu() == null)
      Zz8h.ZY(new int[5]); 
  }
  
  public Zsyf Zq(Zlit paramZlit, Zrz_ paramZrz_, Ze3o paramZe3o, Zzh2 paramZzh2) {
    return new Zsyf(paramZlit, paramZrz_, paramZe3o, paramZzh2, this.Zt);
  }
  
  public Zbw8 ZP(byte[] paramArrayOfbyte, Zgu3 paramZgu3, Zml3 paramZml3, Zmzk paramZmzk, Zbnt paramZbnt, Zgsq paramZgsq) {
    int[] arrayOfInt = Zz8h.ZU();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zbw8(paramArrayOfbyte, paramZgu3, paramZml3, paramZmzk, paramZbnt, paramZgsq, this.ZP, this.Z_, this.Zg, this.Zh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */