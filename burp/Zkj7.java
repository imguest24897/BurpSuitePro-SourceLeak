package burp;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Zkj7 extends Zkj9 {
  Zkj7(Zbws paramZbws, Zgkx paramZgkx, Point paramPoint) {
    int i = paramZbws.rowAtPoint(paramPoint);
    List<Integer> list = Arrays.stream(paramZbws.getSelectedRows()).boxed().collect((Collector)Collectors.toList());
    if (!list.contains(Integer.valueOf(i))) {
      paramZbws.changeSelection(i, 0, false, false);
      list = Collections.singletonList(Integer.valueOf(i));
    } 
    paramZgkx.Zp(list).forEach(this::add);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */