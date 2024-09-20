package burp;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public interface Zrte<T extends Zgpi> extends Ze34<Zrte<T>>, Iterable<T> {
  void ZE(Zrte<T> paramZrte);
  
  T[] ZbF();
  
  Zrte<T> ZP(T[] paramArrayOfT);
  
  T ZdF(int paramInt);
  
  void ZU(int paramInt, T paramT);
  
  @NotNull
  default Iterator<T> iterator() {
    return new Ze11(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrte.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */