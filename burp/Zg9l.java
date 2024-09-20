package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zi7;
import net.portswigger.Zrmq;

class Zg9l {
  static List<String> Zm(Zi7 paramZi7, Iterable<String> paramIterable) {
    LinkedList<String> linkedList = new LinkedList();
    Iterator<String> iterator = paramIterable.iterator();
    Zbqc[] arrayOfZbqc = Zsyq.ZO();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      String str2 = Zo(paramZi7, str1);
      if (str2 != null)
        linkedList.add(str2); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return linkedList;
  }
  
  static List<String> ZK(Zi7 paramZi7, Iterable<String> paramIterable) {
    LinkedList<String> linkedList = new LinkedList();
    Iterator<String> iterator = paramIterable.iterator();
    Zbqc[] arrayOfZbqc = Zsyq.ZO();
    while (iterator.hasNext()) {
      String str = iterator.next();
      linkedList.addAll(Zq(paramZi7, str));
      if (arrayOfZbqc == null)
        break; 
    } 
    return linkedList;
  }
  
  private static String Zo(Zi7 paramZi7, String paramString) {
    if (!paramZi7.Zm(paramString))
      return null; 
    Zrmq zrmq = paramZi7.Zo(paramString);
    return zrmq.Zr() ? zrmq.ZN().ZW() : null;
  }
  
  private static List<String> Zq(Zi7 paramZi7, String paramString) {
    if (!paramZi7.Zm(paramString))
      return Collections.emptyList(); 
    Zrmq zrmq = paramZi7.Zo(paramString);
    return zrmq.Zw() ? (List<String>)zrmq.ZT().Zc().filter(Zrmq::Zr).map(Zg9l::lambda$findArrayAttribute$0).collect(Collectors.toList()) : Collections.<String>emptyList();
  }
  
  private static String lambda$findArrayAttribute$0(Zrmq paramZrmq) {
    return paramZrmq.ZN().ZW();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */