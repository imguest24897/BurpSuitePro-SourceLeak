package burp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Zk1r {
  private final Set<String> Zo;
  
  public Zk1r(Set<String> paramSet) {
    this.Zo = Collections.unmodifiableSet(paramSet);
  }
  
  public Set<String> Zw(Set<String> paramSet) {
    HashSet<String> hashSet = new HashSet();
    Iterator<String> iterator = paramSet.iterator();
    Zbqc[] arrayOfZbqc = Zems.Ze();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (Zh(str))
        hashSet.add(str); 
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    return hashSet;
  }
  
  public boolean Zh(String paramString) {
    Zbqc[] arrayOfZbqc = Zems.Ze();
    for (String str : this.Zo) {
      if (str.equalsIgnoreCase(paramString))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk1r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */