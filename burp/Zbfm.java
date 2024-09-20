package burp;

import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zf9;
import net.portswigger.Zg_;
import net.portswigger.Zgu;
import net.portswigger.Zht;
import net.portswigger.Zm2;
import net.portswigger.Znn;
import net.portswigger.Zq0;
import net.portswigger.Zq7;

public class Zbfm implements Zg_ {
  private final Ztpm ZW;
  
  private final AtomicReference<Ztj1> ZM;
  
  private final Zsjt ZQ;
  
  private static Zbqc[] Zl;
  
  public Zbfm(Zra1 paramZra1, Zbxg paramZbxg, Zlbo paramZlbo, Zrfd paramZrfd, Zm0l paramZm0l, Zkl6 paramZkl6, Zr_4 paramZr_4, Zzkr paramZzkr, Zz6q paramZz6q, Zskh paramZskh, Zzov paramZzov) {
    this.ZW = new Ztpm(paramZlbo, paramZbxg);
    this.ZM = new AtomicReference<>();
    this.ZQ = Zsjt.ZL(this.ZW, paramZra1, paramZz6q, paramZzkr, paramZrfd, paramZm0l, paramZkl6.Zq(), paramZkl6, paramZr_4, paramZskh, paramZzov);
  }
  
  public Zht ZP(Zf9 paramZf9) {
    Ztj1 ztj1 = this.ZQ.ZN(paramZf9);
    this.ZM.compareAndSet(null, ztj1);
    return new Zht(Integer.valueOf(ztj1.Zh()));
  }
  
  public Zht Z_(Zf9 paramZf9) {
    Ztj1 ztj1 = this.ZQ.Za(paramZf9);
    this.ZM.compareAndSet(null, ztj1);
    Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_ENABLED_AT_ENT_SCAN_LAUNCH, paramZf9.Zk.size());
    return new Zht(Integer.valueOf(ztj1.Zh()));
  }
  
  public Zht Zr(Zq0 paramZq0) {
    Ztj1 ztj1 = this.ZQ.Zk(paramZq0);
    this.ZM.compareAndSet(null, ztj1);
    Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_ENABLED_AT_ENT_SCAN_LAUNCH, paramZq0.ZO.size());
    return new Zht(Integer.valueOf(ztj1.Zh()));
  }
  
  public Zht ZQ(Zq7 paramZq7) {
    Ztj1 ztj1 = this.ZQ.ZW(paramZq7);
    this.ZM.compareAndSet(null, ztj1);
    Zm2.Zi(Zv8r.SCANNER_BCHECK_NO_ENABLED_AT_ENT_SCAN_LAUNCH, paramZq7.ZB.size());
    return new Zht(Integer.valueOf(ztj1.Zh()));
  }
  
  public Zgu Ze(int paramInt1, int paramInt2, int paramInt3) {
    return this.ZW.Zb(paramInt1, paramInt2, paramInt3);
  }
  
  public void Zy(int paramInt, Znn paramZnn) {
    this.ZW.ZO(paramInt, paramZnn);
  }
  
  public void Zz() {
    Zj();
  }
  
  private void Zj() {
    Ztj1 ztj1 = this.ZM.get();
    if (ztj1 != null) {
      Zb6l zb6l = new Zb6l(Zec4.SCAN_CANCELLED_BY_API);
      ztj1.Za();
      this.ZW.Zb(ztj1.Zh(), zb6l);
    } 
    this.ZW.Zu();
  }
  
  public static void ZO(Zbqc[] paramArrayOfZbqc) {
    Zl = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zf() {
    return Zl;
  }
  
  static {
    if (Zf() == null)
      ZO(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */