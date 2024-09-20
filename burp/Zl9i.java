package burp;

class Zl9i extends Zl9l {
  private final Ztdi Zs;
  
  private float ZP;
  
  private final float ZJ;
  
  private final String Zq;
  
  final Zgw3 Zf;
  
  private Zl9i(Zgw3 paramZgw3, Ztdi paramZtdi, float paramFloat1, float paramFloat2, String paramString) {
    this.Zs = paramZtdi;
    this.ZP = paramFloat1;
    this.ZJ = paramFloat2;
    this.Zq = paramString;
  }
  
  protected boolean ZF(Zez3 paramZez3) {
    if (!this.Zf.ZY(paramZez3, this.Zs, this.ZP, this.ZJ, this.Zq))
      return true; 
    this.ZP += this.ZJ;
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */