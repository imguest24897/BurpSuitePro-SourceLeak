package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ztvd implements Zegh {
  private final Zzlx Zh;
  
  private final Zggp ZM;
  
  private final Zsh8 ZL;
  
  private final Zm3c ZW;
  
  private final Zr_4 ZB;
  
  private final Zkn Zy;
  
  private final Zb_x Zo;
  
  private final Zxgs Zi;
  
  private final Zttp Zd;
  
  private final Zgb6 Za;
  
  private final Zemt ZN;
  
  private final Ztou ZO;
  
  private final Zz3j ZF;
  
  private final Lock ZT = new ReentrantLock();
  
  private final AtomicBoolean ZK = new AtomicBoolean(true);
  
  private final Zxr3 Zu;
  
  private static String Zc;
  
  public Ztvd(Zzlx paramZzlx, Zggp paramZggp, Zsh8 paramZsh8, Zm3c paramZm3c, Zr_4 paramZr_4, Zkn paramZkn, Zb_x paramZb_x, Zstw paramZstw, Ztwv paramZtwv, Zemt paramZemt, Ztou paramZtou, Zgb6 paramZgb6, Zz3j paramZz3j, Zxr3 paramZxr3) {
    this.Zh = paramZzlx;
    this.ZM = paramZggp;
    this.ZL = paramZsh8;
    String str = Zg();
    this.ZW = paramZm3c;
    this.ZB = paramZr_4;
    this.Zy = paramZkn;
    this.Zo = paramZb_x;
    this.ZN = paramZemt;
    this.ZO = paramZtou;
    this.ZF = paramZz3j;
    this.Zi = new Zxgs(paramZstw);
    this.Zd = Zttp.Ze(paramZtwv);
    this.Za = paramZgb6;
    this.Zu = paramZxr3;
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZW() {}
  
  public boolean ZB() {
    return this.ZK.get();
  }
  
  public Zzc4 Zs() {
    return null;
  }
  
  public Zxa2 Zt() {
    String str = Zg();
    try {
      this.ZT.lock();
      Zgxp zgxp = this.Zh.Zi();
      if (zgxp == null) {
        this.Zd.ZJ();
        this.ZK.set(false);
        this.Zi.Zd();
        return null;
      } 
      ZM(zgxp);
      this.Zi.Zi();
      Zzx5 zzx5 = new Zzx5(zgxp, this.Zh, this.ZM, this.ZL, this.ZW, this.ZB, this.Zy, this.Zo, this.Zi, this.Zd, this.ZN, this.Za, this.ZF, this.Zu);
      this.ZT.unlock();
      return zzx5;
    } finally {
      this.ZT.unlock();
    } 
  }
  
  private void ZM(Zgxp paramZgxp) {
    if (!paramZgxp.Zew()) {
      this.ZN.Zq(paramZgxp);
      this.ZO.ZD(new Zxr8<>(Zt1l.ZE, paramZgxp));
    } 
  }
  
  public boolean Zn() {
    return this.Zi.Zw();
  }
  
  public static void Zk(String paramString) {
    Zc = paramString;
  }
  
  public static String Zg() {
    return Zc;
  }
  
  static {
    if (Zg() == null)
      Zk("i1GjY"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */