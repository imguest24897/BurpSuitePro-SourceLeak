package burp;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zgty implements Zt7b, Iterable<Zt7b> {
  private final List<Zt7b> ZA = new CopyOnWriteArrayList<>();
  
  private Zgu3 Zy;
  
  public void Zk(Zt7b paramZt7b) {
    if (this.Zy != null)
      paramZt7b.Zj(this.Zy); 
    this.ZA.add(paramZt7b);
  }
  
  public void ZB(Zt7b paramZt7b) {
    this.ZA.remove(paramZt7b);
  }
  
  public void ZO() {
    this.ZA.clear();
  }
  
  public void Zj(Zgu3 paramZgu3) {
    this.Zy = paramZgu3;
    this.ZA.forEach(paramZgu3::lambda$messageReplaced$0);
  }
  
  public void ZU() {
    this.ZA.forEach(Zt7b::ZU);
  }
  
  public void Zn() {
    this.ZA.forEach(Zt7b::Zn);
  }
  
  public Iterator<Zt7b> iterator() {
    return this.ZA.iterator();
  }
  
  private static void lambda$messageReplaced$0(Zgu3 paramZgu3, Zt7b paramZt7b) {
    paramZt7b.Zj(paramZgu3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */