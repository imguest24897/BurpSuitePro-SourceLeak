package burp;

import java.util.Objects;

class Zb1g implements Zlr9 {
  private static final Zly6 ZW = Zly6.Zq(false, null, 10000L);
  
  private final Zlr9 Z_;
  
  private final Zlr9 Zy;
  
  private Zmzk ZP;
  
  public Zb1g(Zzu paramZzu, Zgzx paramZgzx, Zxtb paramZxtb, Zsil paramZsil, Zzen paramZzen, Ze6v paramZe6v, Zxg_ paramZxg_, Zxw2 paramZxw2, Zgb6 paramZgb6, Zlg9 paramZlg9, Zgg0 paramZgg0, Zxy1 paramZxy1, Ztbb paramZtbb) {
    Zxtb zxtb1 = Zxtb.ZX(paramZxtb, Ze45.ATTEMPT_HTTP2);
    if (paramZzu.Zi().Za())
      zxtb1 = Zxtb.Zd(paramZxtb, Ze45.ATTEMPT_HTTP2, Zl7q.Zb); 
    Zkuw zkuw = new Zkuw(paramZsil, zxtb1, paramZgb6, paramZtbb);
    Zvoy zvoy = new Zvoy(paramZzu);
    Objects.requireNonNull(paramZxw2);
    this.Z_ = new Zs6j(zvoy, paramZgzx, zxtb1, zkuw, paramZzen, paramZe6v, paramZxg_, paramZxw2::Zt, paramZgb6.ZfD(), paramZlg9, new Zmzm(paramZgg0), paramZxy1);
    Zl2u zl2u = Zl2u.Zs(paramZgzx);
    Zxtb zxtb2 = Zxtb.Zk(zxtb1, ZW);
    Objects.requireNonNull(paramZxw2);
    this.Zy = new Zs6j(zvoy, zl2u, zxtb2, zkuw, paramZzen, paramZe6v, paramZxg_, paramZxw2::Zt, paramZgb6.ZfD(), paramZlg9, new Zmzm(paramZgg0), paramZxy1);
  }
  
  void ZJ(Zmzk paramZmzk) {
    this.ZP = paramZmzk;
  }
  
  public Zz9e Zm(Zsw paramZsw) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zh : (Lburp/Zb1g;Lburp/Zsw;)Lburp/Zz9e;
    //   7: areturn
  }
  
  private Zsxd lambda$withCookieProcessor$0(Zsw paramZsw, Zefx paramZefx, Zlhj paramZlhj) {
    Zz9e zz9e = (this.ZP.compareTo(paramZefx.ZT()) == 0) ? this.Z_.Zm(paramZsw) : this.Zy.Zm(paramZsw);
    return zz9e.Zh(paramZefx, paramZlhj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */