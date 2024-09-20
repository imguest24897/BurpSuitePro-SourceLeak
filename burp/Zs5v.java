package burp;

public class Zs5v implements Zta_ {
  private Zxr9 ZI;
  
  private Zkr1<Zss1> ZY;
  
  private Ztm5 Zk;
  
  private Zss1 ZU;
  
  private static String ZC;
  
  public void ZQ(Zxr9 paramZxr9, Zkr1<Zss1> paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    this.ZI = paramZxr9;
    this.ZY = paramZkr1;
    this.Zk = paramZtm5;
    Zss1 zss1 = paramZkr1.ZP();
    if (ZZ(zss1)) {
      if (!ZH(zss1))
        return; 
      this.ZU = zss1;
    } 
  }
  
  public Zsvc Zd(Zxr9 paramZxr9, Zkr1<Zss1> paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    if (this.ZU != null) {
      paramZkr1.Zc();
      paramZkr1.Zy(this.ZU);
      this.ZU = null;
    } 
    return paramZsvc;
  }
  
  public void Zz(Ztm5 paramZtm5) {
    this.ZU = null;
  }
  
  private boolean ZZ(Zss1 paramZss1) {
    if (paramZss1 == null || !Zl19.ZC(paramZss1.Zu))
      return false; 
    Zsvc zsvc = Zo(paramZss1);
    return (zsvc != null && zsvc.ZE.isKeyword);
  }
  
  private boolean ZH(Zss1 paramZss1) {
    Zsvc zsvc = Zo(paramZss1);
    this.ZY.Zc();
    this.Zk.ZJ(ZV(zsvc));
    if (!Zq()) {
      this.Zk.Zq();
      this.ZY.Zy(paramZss1);
      return false;
    } 
    return true;
  }
  
  private Zsvc Zo(Zss1 paramZss1) {
    return ((Zgcc)paramZss1.Zu).ZK();
  }
  
  private boolean Zq() {
    Zkdl zkdl = new Zkdl(this.ZI.ZV());
    do {
      this.ZI.Zn(zkdl);
    } while (!zkdl.ZM && !zkdl.Zh);
    return zkdl.Zh;
  }
  
  private Zsvc ZV(Zsvc paramZsvc) {
    return new Zsvc(Zgho.IDENTIFIER, Zk(paramZsvc), paramZsvc.ZY, paramZsvc.ZH, paramZsvc.ZJ);
  }
  
  private String Zk(Zsvc paramZsvc) {
    return paramZsvc.Zy.substring(paramZsvc.ZH, paramZsvc.ZJ);
  }
  
  public static void Zu(String paramString) {
    ZC = paramString;
  }
  
  public static String Zf() {
    return ZC;
  }
  
  static {
    if (Zf() != null)
      Zu("ggxzjc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */