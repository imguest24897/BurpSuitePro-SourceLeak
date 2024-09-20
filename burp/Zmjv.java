package burp;

import java.util.Objects;

public class Zmjv implements Zmu_ {
  private final Zz1m<Zt16> Zz;
  
  private static String[] ZH;
  
  public Zmjv(Zz1m<Zt16> paramZz1m) {
    this.Zz = Objects.<Zz1m<Zt16>>requireNonNull(paramZz1m);
  }
  
  public void Zx(Zt21 paramZt21, Zmzk paramZmzk) {
    Zzd_ zzd_ = new Zzd_(paramZt21, paramZmzk);
    this.Zz.ZD(new Zxr8(Zt16.ZV, zzd_));
  }
  
  public void Zl(Zt21 paramZt21, Zmzk paramZmzk) {
    Zzd_ zzd_ = new Zzd_(paramZt21, paramZmzk);
    this.Zz.ZD(new Zxr8(Zt16.ZV, zzd_));
  }
  
  public void Zl(Zmzk paramZmzk) {
    Zzd3 zzd3 = new Zzd3(paramZmzk);
    this.Zz.ZD(new Zxr8(Zt16.Zd, zzd3));
  }
  
  public void ZS(Zt21 paramZt21, Zmzk paramZmzk) {
    String[] arrayOfString = ZR();
    Zzds zzds = new Zzds(paramZt21, paramZmzk);
    this.Zz.ZD(new Zxr8(Zt16.Zj, zzds));
    if (Zbqc.Zwu() == null)
      ZC(new String[4]); 
  }
  
  public void ZI(Zt21 paramZt21, Zmzk paramZmzk, int paramInt) {
    String[] arrayOfString = ZR();
    Zzdu zzdu = new Zzdu(paramZt21, paramZmzk, paramInt);
    this.Zz.ZD(new Zxr8(Zt16.ZO, zzdu));
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZE(Zmzk paramZmzk) {
    Zzd9 zzd9 = new Zzd9(paramZmzk);
    this.Zz.ZD(new Zxr8(Zt16.ZQ, zzd9));
  }
  
  public void Ze() {
    Zzd1 zzd1 = new Zzd1();
    this.Zz.ZD(new Zxr8(Zt16.Ze, zzd1));
  }
  
  public void Zk() {
    Zzdi zzdi = new Zzdi();
    this.Zz.ZD(new Zxr8(Zt16.ZC, zzdi));
  }
  
  public static void ZC(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] ZR() {
    return ZH;
  }
  
  static {
    if (ZR() == null)
      ZC(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */