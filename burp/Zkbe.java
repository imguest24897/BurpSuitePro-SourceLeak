package burp;

public class Zkbe implements Zg7n {
  private final Zzpq Z_;
  
  protected Zkbe(Zt4u paramZt4u, Zgb6 paramZgb6, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1j paramZr1j) {
    Zm39 zm39 = paramZt4u.ZN().ZvB().ZmM();
    Zl34 zl34 = zm39.Zf9();
    this.Z_ = new Zzpq(zl34, new Zt_k(zl34.Zjg()), new Zt_c(zl34.ZjM()), paramZr_41, paramZr_42, paramZr1j);
    paramZgb6.Zd(this.Z_);
  }
  
  public boolean Z_(Zefx paramZefx) {
    return (this.Z_.ZI(paramZefx.ZT()) && this.Z_.Zm(paramZefx.ZF()));
  }
  
  public Zli1 Zx() {
    return this.Z_.Zr();
  }
  
  public Zt9d Ze() {
    return this.Z_.Zb();
  }
  
  public Zga5 ZD() {
    return this.Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */