package burp;

class Zl9u extends Zl9l {
  private final Ztdi Zj;
  
  private final Zl6 Zc;
  
  private float ZK;
  
  private final float ZW;
  
  private final String Zu;
  
  final Zgw3 ZC;
  
  private Zl9u(Zgw3 paramZgw3, Ztdi paramZtdi, Zl6 paramZl6, float paramFloat1, float paramFloat2, String paramString) {
    this.Zj = paramZtdi;
    this.Zc = paramZl6;
    this.ZK = paramFloat1;
    this.ZW = paramFloat2;
    this.Zu = paramString;
  }
  
  protected boolean ZF(Zez3 paramZez3) {
    if (!this.ZC.ZS(paramZez3, this.Zj, this.Zc, this.ZK, this.ZW, this.Zu))
      return true; 
    this.ZK += this.ZW;
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */