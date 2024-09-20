package burp;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zetg {
  private static String ZH;
  
  public static boolean ZK(Zmg paramZmg, Object paramObject) {
    int i = paramZmg.indexOf(paramObject);
    try {
      if (i == -1)
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    paramZmg.remove(i);
    return true;
  }
  
  public static boolean Zb(Zmg paramZmg, Object paramObject) {
    try {
      if (!(paramObject instanceof List))
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    List list = (List)paramObject;
    try {
      if (list.size() != paramZmg.size())
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    Iterator<Integer> iterator = paramZmg.iterator();
    Iterator iterator1 = list.iterator();
    while (iterator.hasNext()) {
      if (!((Integer)iterator.next()).equals(iterator1.next()))
        return false; 
    } 
    return true;
  }
  
  public static <A> A[] Zk(Zmg paramZmg, A[] paramArrayOfA) {
    int i = paramZmg.size();
    A[] arrayOfA = paramArrayOfA;
    String str = Z_();
    if (paramArrayOfA.length < i)
      arrayOfA = (A[])Array.newInstance(paramArrayOfA.getClass().getComponentType(), i); 
    byte b = 0;
    while (b < i) {
      try {
        arrayOfA[b] = (A)paramZmg.get(b);
      } catch (ClassCastException classCastException) {
        Zah.Zl(classCastException, Zk_.UNEXPECTED);
        throw new ArrayStoreException();
      } 
      b++;
      if (str != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    try {
      if (arrayOfA.length > i)
        arrayOfA[i] = null; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return arrayOfA;
  }
  
  public static Object[] ZB(Zmg paramZmg) {
    int i = paramZmg.size();
    Object[] arrayOfObject = new Object[i];
    String str = Z_();
    byte b = 0;
    while (b < i) {
      arrayOfObject[b] = paramZmg.get(b);
      b++;
      if (str != null)
        break; 
    } 
    return arrayOfObject;
  }
  
  public static boolean Za(Zmg paramZmg, Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    String str = Z_();
    while (iterator.hasNext()) {
      Object object = iterator.next();
      try {
        if (!paramZmg.contains(object))
          return false; 
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    return true;
  }
  
  public static int ZW(Zmg paramZmg) {
    int i = 1;
    String str = Z_();
    for (Integer integer : paramZmg) {
      try {
      
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      i = 31 * i + ((integer == null) ? 0 : integer.hashCode());
      if (str != null)
        break; 
    } 
    return i;
  }
  
  public static void ZA(String paramString) {
    ZH = paramString;
  }
  
  public static String Z_() {
    return ZH;
  }
  
  private static ClassCastException a(ClassCastException paramClassCastException) {
    return paramClassCastException;
  }
  
  static {
    if (Z_() != null)
      ZA("LzHmF"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */