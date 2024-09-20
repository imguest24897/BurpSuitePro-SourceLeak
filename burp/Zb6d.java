package burp;

import net.portswigger.Zsy;

class Zb6d implements Zrbu {
  private final Zsy ZA;
  
  private final int Zf;
  
  private final Ze3n Zj;
  
  private final Zbjl Zl;
  
  Zb6d(Zsy paramZsy, int paramInt, Ze3n paramZe3n, Zbjl paramZbjl) {
    this.Zf = paramInt;
    this.Zj = paramZe3n;
    this.ZA = paramZsy;
    this.Zl = paramZbjl;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return new Zmzu(Zk7g.EXTERNAL_SERVICE_INTERACTION, this.ZA, this.Zf, this.Zj.ZM().Zgv(), paramZxs7, this.Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */