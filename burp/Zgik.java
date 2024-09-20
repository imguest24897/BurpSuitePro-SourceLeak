package burp;

import java.util.function.Function;

public class Zgik<E> implements Zkuq<E>, Zgni<E> {
  private final Zx67<E> Zc = new Zx67<>();
  
  private final Function<E, Object> Z_;
  
  public Zgik(Function<E, Object> paramFunction) {
    this.Z_ = paramFunction;
  }
  
  public Object Zl(E paramE) {
    return this.Zc.computeIfAbsent(paramE, this.Z_);
  }
  
  public void Zl(int paramInt, E paramE) {
    this.Zc.put(paramE, this.Z_.apply(paramE));
  }
  
  public void Zc(int paramInt, E paramE) {
    this.Zc.remove(paramE);
  }
  
  public void ZO(int paramInt, E paramE) {
    this.Zc.put(paramE, this.Z_.apply(paramE));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgik.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */