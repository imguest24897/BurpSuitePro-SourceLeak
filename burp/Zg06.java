package burp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public interface Zg06 extends Zg35<Zg06>, List<Short> {
  public static final Zx8z Zs = new Zx8z();
  
  default void sort(Comparator<? super Short> paramComparator) {
    Object[] arrayOfObject = toArray();
    Arrays.sort(arrayOfObject, (Comparator)paramComparator);
    boolean bool = Zx8z.Zj();
    byte b = 0;
    while (b < size()) {
      set(b, (Short)arrayOfObject[b]);
      b++;
      if (!bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */