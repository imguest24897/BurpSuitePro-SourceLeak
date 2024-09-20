package burp;

public class Zblh implements Zmf5 {
  private Zta_ Zk;
  
  private Zta_ Zc;
  
  private Zta_ ZK;
  
  private int ZA;
  
  public Zblh() {
    Zm();
  }
  
  public boolean ZX(Zxr9 paramZxr9, Zkr1<Zss1> paramZkr1, Ztm5 paramZtm5) {
    Zsvc zsvc = paramZtm5.Zk();
    Zta_ zta_1 = ZH(this.ZA);
    String str = Zs5v.Zf();
    if (zta_1 != null)
      zsvc = zta_1.Zd(paramZxr9, paramZkr1, paramZtm5, zsvc); 
    this.ZA++;
    boolean bool = false;
    Zta_ zta_2 = ZH(this.ZA);
    if (zta_2 != null) {
      zta_2.ZQ(paramZxr9, paramZkr1, paramZtm5, zsvc);
      bool = paramZxr9.ZT();
      if (bool) {
        ZB(paramZtm5);
        if (str != null) {
          Zbqc.Zr(new Zbqc[3]);
        } else {
          return bool;
        } 
      } else {
        return bool;
      } 
    } 
    ZB(paramZtm5);
    return bool;
  }
  
  public void Zm() {
    this.ZA = 0;
    this.Zk = new Zeip();
    String str = Zs5v.Zf();
    this.Zc = new Zs5v();
    this.ZK = new Ztmn();
    if (Zbqc.Zwu() == null)
      Zs5v.Zu("J6blRc"); 
  }
  
  private Zta_ ZH(int paramInt) {
    switch (paramInt) {
      case 1:
        return this.Zk;
      case 2:
        return this.Zc;
      case 3:
        return this.ZK;
    } 
    return null;
  }
  
  private void ZB(Ztm5 paramZtm5) {
    this.ZA = 0;
    this.ZK.Zz(paramZtm5);
    this.Zc.Zz(paramZtm5);
    this.Zk.Zz(paramZtm5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */