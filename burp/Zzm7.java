package burp;

import java.util.Iterator;
import java.util.List;

public class Zzm7<C extends Zgd8<M>, M extends Zgpi> implements Iterator<C> {
  private final Iterator<C> Zc;
  
  private final Iterator<M> Zh;
  
  public Zzm7(List<C> paramList, Zefg<M> paramZefg) {
    this.Zc = paramList.iterator();
    this.Zh = paramZefg.iterator();
  }
  
  public boolean hasNext() {
    return this.Zc.hasNext();
  }
  
  public C Zl() {
    this.Zh.next();
    return this.Zc.next();
  }
  
  public void remove() {
    this.Zh.remove();
    this.Zc.remove();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */