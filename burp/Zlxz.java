package burp;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Zlxz {
  private final Zr_4 Zh;
  
  private final Ze_7 ZK;
  
  private final Zm6e ZO;
  
  private final Zbnt Zi;
  
  private final Zrgd Zf;
  
  private final Zgb6 Ze;
  
  private final Zskh ZF;
  
  private final Zey9 ZW;
  
  public Zlxz(Zr_4 paramZr_4, Ze_7 paramZe_7, Zm6e paramZm6e, Zbnt paramZbnt, Zrgd paramZrgd, Zgb6 paramZgb6, Zskh paramZskh, Zey9 paramZey9) {
    this.Zh = paramZr_4;
    Zbqc[] arrayOfZbqc = Zzgk.Zy();
    this.ZK = paramZe_7;
    this.ZO = paramZm6e;
    this.Zi = paramZbnt;
    this.Zf = paramZrgd;
    this.Ze = paramZgb6;
    this.ZF = paramZskh;
    this.ZW = paramZey9;
    if (Zbqc.Zwu() == null)
      Zzgk.Zg(new Zbqc[5]); 
  }
  
  public Zbu5 ZU() {
    Zziy zziy = this.Zh.<Zziy>ZH(new Zlnw());
    Zmtq zmtq = new Zmtq(zziy);
    return Zn(zmtq);
  }
  
  public Zbu5 Zn(Zmtq paramZmtq) {
    Ztz_ ztz_ = new Ztz_(this.ZK, this.Zi, paramZmtq, this.ZO, new Zxpt(), this.Zf, this.ZW);
    Zg13 zg13 = new Zg13(this.Ze);
    Objects.requireNonNull(this.Ze);
    Zrk_ zrk_ = new Zrk_(ztz_, this.Ze::ZU0, this.ZF);
    AtomicLong atomicLong = new AtomicLong();
    Zzgk zzgk = new Zzgk(paramZmtq.Ze(), atomicLong, zg13);
    Zbqc[] arrayOfZbqc = Zzgk.Zy();
    Zg1t zg1t = new Zg1t(zrk_, zg13);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zbu5(zzgk, zg1t, paramZmtq, zg13);
  }
  
  public Zxnl ZV() {
    return new Zxnl(this.Zh, this.Zi, this.Ze);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */