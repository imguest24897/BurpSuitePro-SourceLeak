package burp;

public class Zreq implements Zln3 {
  private final Ztq1 Zg;
  
  private final Zemk Zx;
  
  public Zreq(Ztq1 paramZtq1, Zemk paramZemk) {
    this.Zg = paramZtq1;
    this.Zx = paramZemk;
  }
  
  public Zryx ZZ(String paramString, boolean paramBoolean) {
    (new Zkk7[1])[0] = Zkk7.ENABLE;
    Zkk7[] arrayOfZkk7 = paramBoolean ? new Zkk7[1] : new Zkk7[0];
    Zryx zryx = this.Zg.ZJ(paramString, arrayOfZkk7);
    return this.Zx.Zw(zryx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zreq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */