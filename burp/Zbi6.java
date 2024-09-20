package burp;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbi6 {
  public static <T extends Zgpi> boolean Z_(Zefg<T> paramZefg, Object paramObject) {
    int i = paramZefg.indexOf(paramObject);
    try {
      if (i == -1)
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    paramZefg.remove(i);
    return true;
  }
  
  public static <A, T extends Zgpi> A[] ZB(Zefg<T> paramZefg, A[] paramArrayOfA) {
    int j = paramZefg.size();
    A[] arrayOfA = paramArrayOfA;
    int i = Zkk.Zn();
    if (paramArrayOfA.length < j)
      arrayOfA = (A[])Array.newInstance(paramArrayOfA.getClass().getComponentType(), j); 
    byte b = 0;
    while (b < j) {
      try {
        arrayOfA[b] = (A)paramZefg.get(b);
      } catch (ClassCastException classCastException) {
        Zah.Zl(classCastException, Zk_.UNEXPECTED);
        throw new ArrayStoreException();
      } 
      b++;
      if (i == 0)
        break; 
    } 
    try {
      if (arrayOfA.length > j)
        arrayOfA[j] = null; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zkk.Ze(++i); 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return arrayOfA;
  }
  
  public static <T extends Zgpi> Object[] ZM(Zefg<T> paramZefg) {
    int j = paramZefg.size();
    int i = Zkk.ZZ();
    Object[] arrayOfObject = new Object[j];
    byte b = 0;
    while (b < j) {
      arrayOfObject[b] = paramZefg.get(b);
      b++;
      if (i != 0)
        break; 
    } 
    return arrayOfObject;
  }
  
  public static <T extends Zgpi> boolean ZL(Zefg<T> paramZefg, Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    int i = Zkk.ZZ();
    while (iterator.hasNext()) {
      Object object = iterator.next();
      try {
        if (!paramZefg.contains(object))
          return false; 
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  public static <T extends Zgpi> boolean ZU(Zefg<T> paramZefg, Object paramObject) {
    int i = Zkk.ZZ();
    try {
      if (!(paramObject instanceof List))
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    List list = (List)paramObject;
    try {
      if (list.size() != paramZefg.size())
        return false; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    Iterator<T> iterator = paramZefg.iterator();
    Iterator<Object> iterator1 = list.iterator();
    while (iterator.hasNext()) {
      Zgpi zgpi = (Zgpi)iterator.next();
      Object object = iterator1.next();
      try {
        if (zgpi == null) {
          try {
            if (object != null)
              return false; 
          } catch (ClassCastException classCastException) {
            throw a(null);
          } 
        } else {
          try {
            if (!zgpi.equals(object))
              return false; 
          } catch (ClassCastException classCastException) {
            throw a(null);
          } 
        } 
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return true;
  }
  
  public static <T extends Zgpi> int ZG(Zefg<T> paramZefg) {
    int j = 1;
    Iterator<T> iterator = paramZefg.iterator();
    int i = Zkk.Zn();
    while (iterator.hasNext()) {
      Zgpi zgpi = (Zgpi)iterator.next();
      try {
      
      } catch (ClassCastException classCastException) {
        throw a(null);
      } 
      j = 31 * j + ((zgpi == null) ? 0 : zgpi.hashCode());
      if (i == 0)
        break; 
    } 
    return j;
  }
  
  public static boolean ZX(Collection<?> paramCollection) {
    return paramCollection.stream().anyMatch(Objects::isNull);
  }
  
  private static ClassCastException a(ClassCastException paramClassCastException) {
    return paramClassCastException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbi6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */