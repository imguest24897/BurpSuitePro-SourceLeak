package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public interface Zmg extends Zg35<Zmg>, List<Integer> {
  void ZE(Zm4x paramZm4x);
  
  default void sort(Comparator<? super Integer> paramComparator) {
    Object[] arrayOfObject = toArray();
    String str = Zetg.Z_();
    Arrays.sort(arrayOfObject, (Comparator)paramComparator);
    byte b = 0;
    while (b < size()) {
      set(b, (Integer)arrayOfObject[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */