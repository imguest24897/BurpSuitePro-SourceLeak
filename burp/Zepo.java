package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zepo {
  private static int[] ZZ;
  
  public static boolean Zu(List<?> paramList1, List<?> paramList2) {
    int[] arrayOfInt = Zi();
    if (paramList1 == null && paramList2 == null)
      return true; 
    if (paramList1 == null || paramList2 == null)
      return false; 
    if (paramList1.size() != paramList2.size())
      return false; 
    byte b = 0;
    while (b < paramList1.size()) {
      if (paramList1.get(b) != paramList2.get(b))
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static boolean ZR(List<?> paramList1, List<?> paramList2) {
    int[] arrayOfInt = Zi();
    if (paramList1 == null && paramList2 == null)
      return true; 
    if (paramList1 == null || paramList2 == null)
      return false; 
    if (paramList1.size() != paramList2.size())
      return false; 
    byte b = 0;
    while (b < paramList1.size()) {
      if (!paramList1.get(b).equals(paramList2.get(b)))
        return false; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public static <T> List<T> Zj(List<T> paramList) {
    ArrayList<T> arrayList;
    int[] arrayOfInt = Zi();
    synchronized (paramList) {
      arrayList = new ArrayList(paramList.size());
      arrayList.addAll(paramList);
    } 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return arrayList;
  }
  
  public static boolean ZN(Collection<?> paramCollection) {
    return (paramCollection == null || paramCollection.isEmpty());
  }
  
  public static boolean ZE(Collection<?> paramCollection) {
    return !ZN(paramCollection);
  }
  
  public static void Zx(int[] paramArrayOfint) {
    ZZ = paramArrayOfint;
  }
  
  public static int[] Zi() {
    return ZZ;
  }
  
  static {
    if (Zi() == null)
      Zx(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */