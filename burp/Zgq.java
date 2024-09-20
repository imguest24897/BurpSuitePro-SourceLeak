package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Zgq<T extends Zgpi<T>> implements Iterable<Zsqx<T>> {
  private static final Zgq ZY = new Zgh();
  
  private final List<Zsqx<T>> Zk = new ArrayList<>();
  
  public void ZX() {
    this.Zk.clear();
  }
  
  public void ZF(Zgq<T> paramZgq) {
    this.Zk.addAll(paramZgq.Zk);
  }
  
  public void Zu(Zsqx<T> paramZsqx) {
    this.Zk.add(paramZsqx);
  }
  
  public int ZY() {
    return this.Zk.size();
  }
  
  public Iterator<Zsqx<T>> iterator() {
    return this.Zk.iterator();
  }
  
  public Stream<Zsqx<T>> ZA() {
    return this.Zk.stream();
  }
  
  public void ZM(Zsqx<T> paramZsqx) {
    if (paramZsqx != null)
      Zu(paramZsqx); 
  }
  
  public boolean Zn() {
    return (ZY() == 0);
  }
  
  public boolean Zc() {
    return !Zn();
  }
  
  public static <T extends Zgpi<T>> Zgq<T> ZI() {
    return ZY;
  }
  
  public static <T extends Zgpi<T>> Zgq<T> Zo(Zsqx<T> paramZsqx) {
    Zgq<Zgpi> zgq = new Zgq<>();
    zgq.ZM(paramZsqx);
    int i = Zklz.ZQ();
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
    return (Zgq)zgq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */