package burp;

import java.awt.Window;

public class Zted implements Zb6n {
  private final Zxei Zy;
  
  private final Zzxi Zk;
  
  private final Zt90 ZK;
  
  public Zted(Zxei paramZxei, Zzxi paramZzxi, Zt90 paramZt90) {
    this.Zy = paramZxei;
    this.Zk = paramZzxi;
    this.ZK = paramZt90;
  }
  
  public Zg33 Zh(Zkce paramZkce) {
    return ZY(null, this.Zy, this.Zk, this.ZK, paramZkce);
  }
  
  public Zg33 Zz(Zkce paramZkce) {
    return (new Zz9c(null, this.Zy, this.Zk, this.ZK, 2, paramZkce)).Zl();
  }
  
  public static Zg33 ZY(Window paramWindow, Zxei paramZxei, Zzxi paramZzxi, Zt90 paramZt90, Zkce paramZkce) {
    return (new Zz9c(paramWindow, paramZxei, paramZzxi, paramZt90, 1, paramZkce)).Zl();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */