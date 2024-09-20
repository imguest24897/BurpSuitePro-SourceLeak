package burp;

public class Zb3f implements Zrsu {
  private final Zlba Zj;
  
  Zb3f(Zlba paramZlba) {
    this.Zj = paramZlba;
  }
  
  public void ZL(Ze3n paramZe3n, Zlkb paramZlkb, Zb6q paramZb6q, Zz4_ paramZz4_) {
    Zsxt zsxt = new Zsxt(Integer.valueOf(paramZlkb.ZM.Zgv()), paramZlkb.Zw.Zl().toString(), Integer.valueOf(paramZe3n.ZM().Zgv()));
    this.Zj.ZW(zsxt.ZU.intValue()).Zgh().ZF(zsxt);
    paramZe3n.ZM().Zi(paramZlkb.ZM.Zgv(), paramZlkb.Zw.Zl());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */