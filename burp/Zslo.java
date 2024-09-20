package burp;

public class Zslo {
  private final Zskh ZK;
  
  private final Zkcl ZS;
  
  public Zslo(Zskh paramZskh, Zkcl paramZkcl) {
    this.ZK = paramZskh;
    this.ZS = paramZkcl;
  }
  
  void Zt(Zlli<Zt1o> paramZlli) {
    if (this.ZS != Zkcl.LIVE_AUDIT) {
      paramZlli.ZE(Zt1o.Zv, this::lambda$subscribeTo$0);
      paramZlli.ZE(Zt1o.Zx, this::lambda$subscribeTo$1);
    } 
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    Zmgc.AUDIT_FINISHED.ZK(this.ZK, new Object[0]);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zmgc.AUDIT_STARTED.ZK(this.ZK, new Object[0]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zslo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */