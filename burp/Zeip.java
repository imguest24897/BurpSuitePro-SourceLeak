package burp;

public class Zeip implements Zta_ {
  private Zsvc Zl;
  
  public void ZQ(Zxr9 paramZxr9, Zkr1 paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    if (paramZsvc != null && paramZsvc.ZE.isKeyword) {
      Zsvc zsvc = ZK(paramZsvc);
      paramZtm5.ZJ(zsvc);
      this.Zl = paramZsvc;
    } 
  }
  
  public Zsvc Zd(Zxr9 paramZxr9, Zkr1 paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    if (this.Zl != null) {
      paramZtm5.Zq();
      paramZsvc = this.Zl;
      this.Zl = null;
    } 
    return paramZsvc;
  }
  
  public void Zz(Ztm5 paramZtm5) {
    if (this.Zl != null) {
      paramZtm5.Zq();
      this.Zl = null;
    } 
  }
  
  private Zsvc ZK(Zsvc paramZsvc) {
    String str = paramZsvc.Zy.substring(paramZsvc.ZH, paramZsvc.ZJ);
    return new Zsvc(Zgho.IDENTIFIER, str, paramZsvc.ZY, paramZsvc.ZH, paramZsvc.ZJ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */