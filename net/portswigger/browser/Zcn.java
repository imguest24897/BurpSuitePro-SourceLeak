package net.portswigger.browser;

import java.util.function.BiFunction;
import java.util.function.Function;
import net.portswigger.Zi7;
import net.portswigger.Zrmq;

abstract class Zcn<T> {
  protected final String ZW;
  
  protected final BiFunction<Zdp, T, Zdp> Zq;
  
  protected final Function<Zjp, T> ZM;
  
  protected final T ZJ;
  
  private Zcn(String paramString, Function<Zjp, T> paramFunction, BiFunction<Zdp, T, Zdp> paramBiFunction, T paramT) {
    this.ZW = paramString;
    this.Zq = paramBiFunction;
    this.ZM = paramFunction;
    this.ZJ = paramT;
  }
  
  public boolean Zu(Zjp paramZjp) {
    return (this.ZM.apply(paramZjp) != null && !this.ZM.apply(paramZjp).equals(this.ZJ));
  }
  
  void Zi(Zdp paramZdp, Zi7 paramZi7) {
    this.Zq.apply(paramZdp, Zr(paramZi7.Zo(this.ZW)));
  }
  
  public boolean ZU(Zi7 paramZi7) {
    return (paramZi7.Zm(this.ZW) && Zr(paramZi7.Zo(this.ZW)) != null && !Zr(paramZi7.Zo(this.ZW)).equals(this.ZJ));
  }
  
  protected abstract T Zr(Zrmq paramZrmq);
  
  public abstract void Zs(Zjp paramZjp, Zi7 paramZi7);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */