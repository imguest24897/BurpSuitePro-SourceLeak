package burp;

import java.util.List;

public class Zz1l extends Zz1f<Zz5i> {
  private final Zz1_ ZQ;
  
  private final Zk7g ZN;
  
  private final int Zd;
  
  public Zz1l(Zk7g paramZk7g, Zesv paramZesv, Zxs7 paramZxs7, Zbjl paramZbjl, Zroy paramZroy, Zz5i paramZz5i, Zer0 paramZer0, List<Zer0> paramList, Zew0 paramZew0, Ze3n paramZe3n, int paramInt) {
    super(paramZesv, paramZbjl, paramZroy, paramZxs7, paramZer0, paramZz5i, paramZew0, paramZe3n);
    this.ZN = paramZk7g;
    int i = Zz1f.ZB();
    this.Zd = paramInt;
    this.ZQ = new Zk99(paramZew0.ZG(), paramZz5i, paramZroy, paramZer0, paramList);
    if (Zbqc.Zwu() == null)
      Zz1f.ZN(++i); 
  }
  
  void Zw(Zbll paramZbll) {
    super.Zw(paramZbll);
    Ztt6 ztt6 = (new Zrh3((this.Zh.ZF()).ZO)).Zd();
    if (!this.Zt.Za(this.Zh.ZG()) || ztt6 == null)
      return; 
    Zzow zzow = (new Zgrd(this.ZL, ztt6.Zc(), ztt6.ZK())).ZO(this.Zh.ZG(), this.Zh.ZF());
    this.ZL.Zz(zzow.ZL(), this.Zd, ztt6.ZK());
  }
  
  public Zbll Z_() {
    return (new Zrsb(this)).Zg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */