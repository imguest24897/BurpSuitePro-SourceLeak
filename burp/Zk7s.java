package burp;

import java.util.function.Consumer;

public abstract class Zk7s implements Zs7v {
  private final Ztew Zb;
  
  protected Zk7s(Ztew paramZtew) {
    this.Zb = paramZtew;
  }
  
  public final void ZF(Zeki paramZeki) {
    this.Zb.ZN(Zd(paramZeki));
  }
  
  public final void ZE(Zeke<? extends Zgpi> paramZeke) {
    this.Zb.ZN(ZA(paramZeke));
  }
  
  public final void ZN(Zekb paramZekb) {
    this.Zb.ZN(ZS(paramZekb));
  }
  
  public final void Zx(Zekk<? extends Zgpi> paramZekk) {
    this.Zb.ZN(Zm(paramZekk));
  }
  
  protected abstract Consumer<Ztew> Zd(Zeki paramZeki);
  
  protected abstract Consumer<Ztew> ZA(Zeke<? extends Zgpi> paramZeke);
  
  protected abstract Consumer<Ztew> ZS(Zekb paramZekb);
  
  protected abstract Consumer<Ztew> Zm(Zekk<? extends Zgpi> paramZekk);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */