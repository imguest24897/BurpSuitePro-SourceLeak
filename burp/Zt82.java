package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zt82 {
  private final Map<Zlug, Zb1i> ZN = new HashMap<>();
  
  private final StringBuilder Zy = new StringBuilder();
  
  public Zt82 Ze(Zlug paramZlug, int paramInt) {
    return Z_(paramZlug, Zb1i.Zk(paramInt));
  }
  
  public Zt82 Z_(Zlug paramZlug, Zb1i paramZb1i) {
    if (!this.ZN.containsKey(paramZlug))
      this.ZN.put(paramZlug, paramZb1i); 
    return this;
  }
  
  public Zt82 Zh(String paramString) {
    this.Zy.append(paramString.trim()).append(" ");
    return this;
  }
  
  public Zs6y Zc() {
    return new Zs6y(Zx(), this.Zy.toString().trim());
  }
  
  private Zb1i[] Zx() {
    Zb1i[] arrayOfZb1i = new Zb1i[(Zlug.values()).length];
    Iterator<Map.Entry> iterator = this.ZN.entrySet().iterator();
    int i = Zlug.ZJ();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      arrayOfZb1i[((Zlug)entry.getKey()).Zs()] = (Zb1i)entry.getValue();
      if (i != 0)
        break; 
    } 
    return arrayOfZb1i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */