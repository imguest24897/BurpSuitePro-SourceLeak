package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zjn;
import net.portswigger.browser.Zt3;

public interface Zkg8 {
  Zel Zr();
  
  List<Zzjv> Zk();
  
  static List<Zzjv> ZA(Zel paramZel, Zt3 paramZt3) {
    return ((Boolean)paramZel.ZW().map(Zjn::Za9).orElse(Boolean.valueOf(false))).booleanValue() ? Zj(paramZel) : Zl(paramZel, paramZt3);
  }
  
  private static List<Zzjv> Zj(Zel paramZel) {
    return paramZel.ZW().stream().map(Zzjv::ZY).toList();
  }
  
  private static List<Zzjv> Zl(Zel paramZel, Zt3 paramZt3) {
    LinkedList<Zel> linkedList = new LinkedList();
    linkedList.add(paramZel);
    linkedList.addAll(paramZel.ZZ(paramZt3));
    return linkedList.stream().flatMap(paramZt3::lambda$visibleTextForDescendants$0).map(Zzjv::ZY).toList();
  }
  
  private static Stream lambda$visibleTextForDescendants$0(Zt3 paramZt3, Zel paramZel) {
    return paramZel.ZH(paramZt3).stream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkg8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */