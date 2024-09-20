package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public interface Zxsn extends Zg35<Zxsn>, List<Long> {
  public static final Zsif ZY = new Zsif();
  
  default void sort(Comparator<? super Long> paramComparator) {
    Object[] arrayOfObject = toArray();
    Arrays.sort(arrayOfObject, (Comparator)paramComparator);
    int i = Zsif.ZP();
    byte b = 0;
    while (b < size()) {
      set(b, (Long)arrayOfObject[b]);
      b++;
      if (i != 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */