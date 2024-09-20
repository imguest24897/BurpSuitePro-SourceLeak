package burp;

import java.util.List;

public final class Zs2k {
  private static String ZJ;
  
  public static boolean Zb(List<Zb6q> paramList1, List<Zb6q> paramList2) {
    String str = ZL();
    if (paramList1.size() != paramList2.size())
      return true; 
    byte b = 0;
    while (b < paramList1.size()) {
      if (Zb(paramList1.get(b), paramList2.get(b)))
        return true; 
      b++;
      if (str == null)
        break; 
    } 
    return false;
  }
  
  public static boolean Zb(Zb6q paramZb6q1, Zb6q paramZb6q2) {
    return !Zlt_.ZH((paramZb6q1 == null) ? null : paramZb6q1.Za(), (paramZb6q2 == null) ? null : paramZb6q2.Za());
  }
  
  public static void Zd(String paramString) {
    ZJ = paramString;
  }
  
  public static String ZL() {
    return ZJ;
  }
  
  static {
    if (ZL() == null)
      Zd("GYGvNc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */