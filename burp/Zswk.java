package burp;

public class Zswk implements Zrkn {
  private final Zmzk Zm;
  
  private final Zbnt Z_;
  
  private Zsjh<? extends Ztkk> Zd;
  
  public Zswk(Zmzk paramZmzk, Zbnt paramZbnt) {
    this.Zm = paramZmzk;
    this.Z_ = paramZbnt;
  }
  
  public Zsjh<? extends Ztkk> Zj(Zer0 paramZer0) {
    if (paramZer0 == null)
      return null; 
    paramZer0.ZQ(this);
    return this.Zd;
  }
  
  public void ZK(Zxyt paramZxyt) {
    if (paramZxyt.ZT() == null || paramZxyt.ZM() == null)
      return; 
    Zvow zvow = (new Zvow(this.Zm, this.Z_)).Zp(paramZxyt.ZT()).ZK(paramZxyt.ZM());
    this.Zd = new Zqc(zvow, paramZxyt.Zd(), paramZxyt.ZJ(), paramZxyt.Zv(), paramZxyt.Zu(), 0L, paramZxyt.Zx());
  }
  
  public void ZJ(Zxyr paramZxyr) {
    this.Zd = new Zrln(paramZxyr.Zk(), paramZxyr.ZW(), paramZxyr.ZG(), paramZxyr.ZJ(), paramZxyr.Zv(), paramZxyr.Zu(), 0L, paramZxyr.Zx());
  }
  
  public void ZR(Zxyy paramZxyy) {
    String str = Zllh.ZJ();
    this.Zd = new Zlyq(paramZxyy.Zh(), paramZxyy.Zq(), paramZxyy.ZP(), paramZxyy.ZI(), paramZxyy.Zd(), paramZxyy.ZJ(), paramZxyy.Zv(), paramZxyy.Zu(), 0L, paramZxyy.Zx());
    if (Zbqc.Zwu() == null)
      Zllh.Zl("TOW6Sc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */