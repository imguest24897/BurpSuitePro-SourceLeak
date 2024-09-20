package burp;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Zz99 implements Iterable<Zb2h> {
  private final List<Zb2h> Zm;
  
  public Zz99(List<Zb2h> paramList) {
    this.Zm = paramList;
  }
  
  public boolean Zt(List<? extends Zrsc> paramList) {
    boolean bool = Zsou.Zu();
    if (this.Zm.size() != paramList.size())
      return false; 
    byte b = 0;
    while (b < this.Zm.size()) {
      if (!((Zrsc)paramList.get(b)).ZA(this.Zm.get(b)))
        return false; 
      b++;
      if (!bool)
        break; 
    } 
    return true;
  }
  
  public Stream<Zb2h> Za() {
    return this.Zm.stream();
  }
  
  public Iterator<Zb2h> iterator() {
    return this.Zm.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz99.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */