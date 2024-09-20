package burp;

import java.time.Duration;
import net.portswigger.Zgl;
import net.portswigger.Zm2;

public class Zl7y {
  private final Zbnt Zp;
  
  private final Zey9 ZS;
  
  private final Zsus Zr;
  
  public Zl7y(Zbnt paramZbnt, Zey9 paramZey9, Zsus paramZsus) {
    this.Zp = paramZbnt;
    this.ZS = paramZey9;
    this.Zr = paramZsus;
  }
  
  public Zxn8 Zn(Zzep paramZzep, Zezo paramZezo, Zriy paramZriy, Zr69 paramZr69, Zkq4 paramZkq4, Zb9a paramZb9a, Zto9 paramZto9, Zskh paramZskh, Zkf3 paramZkf3) {
    (new Zgsz(paramZkf3)).Zv(paramZto9, paramZriy.ZO());
    boolean bool = paramZzep.Zd2().isZero();
    String str = Zxn8.Zr();
    if (bool)
      paramZriy.ZO().ZE(Zt1o.Zv, paramZzep::lambda$build$0); 
    Zts2.Zr().Zz(paramZriy.ZO(), Zt1o.Zx, paramZzep::lambda$build$1);
    Zmci zmci = new Zmci(paramZzep, paramZkq4, this.Zp, this.ZS, paramZr69, paramZb9a, paramZriy.ZO(), this.Zr);
    if (paramZkq4.ZqB() > 0) {
      paramZzep.Zr(Duration.ofMinutes(paramZkq4.ZqB()));
      Zm2.Ze(new Zgl(paramZzep.ZPy()), Zv8r.CRAWL_AND_AUDIT_MAX_TIME_MINS, paramZkq4.ZqB());
    } 
    if (Zbqc.Zwu() == null)
      Zxn8.ZP("pXGOCc"); 
    return new Zxn8(paramZezo, paramZriy, zmci, paramZto9, paramZskh, paramZzep.ZnH().ZVg());
  }
  
  private static void lambda$build$1(Zzep paramZzep, Zxr8 paramZxr8) {
    Zm2.Ze(new Zgl(paramZzep.ZPy()), Zv8r.CRAWL_AND_AUDIT_FINISHED_CODE, 0L);
  }
  
  private static void lambda$build$0(Zzep paramZzep, Zxr8 paramZxr8) {
    paramZzep.Zl(paramZzep.ZPB());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */