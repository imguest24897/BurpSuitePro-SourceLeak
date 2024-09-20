package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public interface Zmfv extends Zg35<Zmfv>, List<Boolean> {
  public static final Zri6 ZO = new Zri6();
  
  default void sort(Comparator<? super Boolean> paramComparator) {
    Object[] arrayOfObject = toArray();
    Arrays.sort(arrayOfObject, (Comparator)paramComparator);
    int i = Zri6.Zz();
    byte b = 0;
    while (b < size()) {
      set(b, (Boolean)arrayOfObject[b]);
      b++;
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */