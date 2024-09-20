package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public interface Zefg<T extends Zgpi> extends Zg35<Zefg<T>>, List<T> {
  Iterable<T> ZmX(int paramInt);
  
  int Zmr(int paramInt);
  
  void ZB(Zm5q paramZm5q);
  
  default void sort(Comparator<? super T> paramComparator) {
    Object[] arrayOfObject = toArray();
    int i = Zkk.Zn();
    Arrays.sort(arrayOfObject, (Comparator)paramComparator);
    byte b = 0;
    while (b < size()) {
      set(b, (T)arrayOfObject[b]);
      b++;
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */