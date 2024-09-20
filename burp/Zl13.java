package burp;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Zl13 {
  private final Map<Zlug, Integer> Zn = new EnumMap<>(Zlug.class);
  
  public Zl13(Zs6y paramZs6y) {
    int i = Zlug.ZJ();
    Zlug[] arrayOfZlug = Zlug.values();
    int j = arrayOfZlug.length;
    byte b = 0;
    while (b < j) {
      Zlug zlug = arrayOfZlug[b];
      this.Zn.put(zlug, Integer.valueOf(paramZs6y.Zi(zlug)));
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  public boolean Zk(Zs6y paramZs6y) {
    boolean bool = false;
    Zlug[] arrayOfZlug = Zlug.values();
    int j = arrayOfZlug.length;
    int i = Zlug.ZS();
    byte b = 0;
    while (b < j) {
      Zlug zlug = arrayOfZlug[b];
      if (!Zd(paramZs6y, zlug) && this.Zn.remove(zlug) != null)
        bool = true; 
      b++;
      if (i == 0)
        break; 
    } 
    return bool;
  }
  
  void Zd(Zs6y paramZs6y) {
    Zlug[] arrayOfZlug = Zlug.values();
    int j = arrayOfZlug.length;
    int i = Zlug.ZS();
    byte b = 0;
    while (b < j) {
      Zlug zlug = arrayOfZlug[b];
      if (Zd(paramZs6y, zlug))
        this.Zn.remove(zlug); 
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  public void Zu(Set<Zlug> paramSet) {
    Objects.requireNonNull(this.Zn);
    paramSet.forEach(this.Zn::remove);
  }
  
  private boolean Zd(Zs6y paramZs6y, Zlug paramZlug) {
    return (this.Zn.get(paramZlug) != null && ((Integer)this.Zn.get(paramZlug)).intValue() == paramZs6y.Zi(paramZlug));
  }
  
  public void ZO(Zl13 paramZl13, Ztwq paramZtwq) {
    Zlug[] arrayOfZlug = Zlug.values();
    int j = arrayOfZlug.length;
    int i = Zlug.ZS();
    byte b = 0;
    while (b < j) {
      Zlug zlug = arrayOfZlug[b];
      boolean bool1 = this.Zn.containsKey(zlug);
      boolean bool2 = paramZl13.Zn.containsKey(zlug);
      if (bool1 || bool2)
        paramZtwq.Zh(zlug, (bool1 && bool2)); 
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  public boolean Zr() {
    return !this.Zn.isEmpty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl13.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */