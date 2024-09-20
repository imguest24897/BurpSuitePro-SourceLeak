package burp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Zb01 {
  private final Map<Zeu9, Set<Zszw>> ZM = new Zrlv<>();
  
  boolean ZW(Zeu9 paramZeu9, Zszw paramZszw) {
    Set set = this.ZM.get(paramZeu9);
    return (set != null && set.contains(paramZszw));
  }
  
  void ZD(Zeu9 paramZeu9, Zszw paramZszw) {
    if (!ZW(paramZeu9, paramZszw)) {
      Set<Zszw> set = this.ZM.computeIfAbsent(paramZeu9, Zb01::lambda$addRoomInState$0);
      set.add(paramZszw);
    } 
  }
  
  private static Set lambda$addRoomInState$0(Zeu9 paramZeu9) {
    return new HashSet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */