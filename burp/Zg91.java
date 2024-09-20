package burp;

public class Zg91 {
  private final Zkcl Zv;
  
  private final Zskh ZT;
  
  private final Zmv7 Zp;
  
  public Zg91(Zkcl paramZkcl, Zskh paramZskh, Zmv7 paramZmv7) {
    this.Zv = paramZkcl;
    this.ZT = paramZskh;
    this.Zp = paramZmv7;
  }
  
  public void Zg(Zlli<Zt18> paramZlli) {
    paramZlli.ZE(Zt18.ZD, this::lambda$subscribeTo$0);
    Zts2.Zr().<Void>Zz(paramZlli, Zt18.ZW, this::lambda$subscribeTo$1).<Void>Zv(paramZlli, Zt18.ZL, this::lambda$subscribeTo$2).<Void>Zv(paramZlli, Zt18.Ze, this::lambda$subscribeTo$3).Zv(paramZlli, Zt18.ZK, this::lambda$subscribeTo$4);
  }
  
  private void Zo() {
    Zmgc.CRAWL_FINISHED.ZK(this.ZT, new Object[0]);
    if (this.Zv == Zkcl.SCAN_CRAWL_AND_AUDIT)
      Zmgc.IDENTIFYING_ITEMS.ZK(this.ZT, new Object[0]); 
  }
  
  private void Zx(Zlq7 paramZlq7) {
    this.Zp.Zy(Zrp6.INFO, paramZlq7, new Object[0]);
    if (this.Zv == Zkcl.SCAN_CRAWL_AND_AUDIT)
      Zmgc.IDENTIFYING_ITEMS.ZK(this.ZT, new Object[0]); 
  }
  
  private void lambda$subscribeTo$4(Zxr8 paramZxr8) {
    Zx(Zlq7.TOO_MANY_ROOMS);
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    Zx(Zlq7.TIME_LIMIT_EXCEEDED);
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    Zx(Zlq7.TOO_MANY_REQUESTS);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    Zo();
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zmgc.CRAWL_STARTED.ZK(this.ZT, new Object[0]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg91.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */