package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zb3k implements Supplier<Zlku> {
  private final List<Zrdi> Zh = new CopyOnWriteArrayList<>();
  
  private final AtomicInteger ZV;
  
  public Zb3k() {
    this(-1);
  }
  
  Zb3k(int paramInt) {
    this.ZV = new AtomicInteger(paramInt);
  }
  
  public Zlku Zp() {
    ArrayList<Zrdi> arrayList = new ArrayList<>(this.Zh);
    int i = this.ZV.incrementAndGet();
    String[] arrayOfString = Zlku.ZH();
    byte b = 0;
    while (b < arrayList.size()) {
      int j = Math.abs(i % arrayList.size());
      Zlku zlku = ((Zrdi)arrayList.get(j)).ZL();
      if (zlku != null) {
        this.ZV.set(j);
        return zlku;
      } 
      i++;
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return null;
  }
  
  public void ZE(Zrdi paramZrdi) {
    this.Zh.add(paramZrdi);
  }
  
  public void Zg(Zrdi paramZrdi) {
    this.Zh.remove(paramZrdi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */