package burp;

import java.util.Iterator;
import java.util.List;

public abstract class Zkdw implements Zlxj {
  protected final Zb3t Zt;
  
  public Zkdw(Zb3t paramZb3t) {
    this.Zt = paramZb3t;
  }
  
  public Iterator<Zb3t> iterator() {
    return new Zkvs(this, this.Zt);
  }
  
  protected boolean Zi(Zb3t paramZb3t) {
    Zbqc[] arrayOfZbqc = Zz61.Zh();
    List list = paramZb3t.<List>ZO(Zxc6.ExecutionHops);
    if (Zbqc.Zwu() == null)
      Zz61.ZS(new Zbqc[1]); 
    return (list != null && !list.isEmpty());
  }
  
  protected abstract boolean Zo();
  
  protected abstract boolean ZY(Zb3t paramZb3t);
  
  protected abstract boolean ZM(Zb3t paramZb3t);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */