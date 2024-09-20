package burp;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Zte0<T extends Zgyu> implements Iterable<T> {
  private final List<T> ZI;
  
  public Zte0(List<T> paramList) {
    this.ZI = paramList;
  }
  
  public boolean Zn(List<? extends Zzu4> paramList) {
    boolean bool = Zsou.Zs();
    if (this.ZI.size() != paramList.size())
      return false; 
    byte b = 0;
    while (b < this.ZI.size()) {
      if (!((Zzu4)paramList.get(b)).Zq((Zgyu)this.ZI.get(b)))
        return false; 
      b++;
      if (bool)
        break; 
    } 
    return true;
  }
  
  public Stream<T> Zw() {
    return this.ZI.stream();
  }
  
  public Iterator<T> iterator() {
    return this.ZI.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zte0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */