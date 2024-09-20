package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg0o {
  static void Zu(Zl34 paramZl34, Zg55 paramZg55, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zg55> zefg = paramZl34.Zjg();
      int i = zefg.size();
      zefg.add(paramZg55);
      paramZtn0.fireTableRowsInserted(i, i);
    } 
  }
  
  static void Zi(Zl34 paramZl34, Zg55 paramZg55, int paramInt, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zg55> zefg = paramZl34.Zjg();
      zefg.remove(paramInt);
      zefg.add(paramInt, paramZg55);
      paramZtn0.fireTableRowsUpdated(paramInt, paramInt);
    } 
  }
  
  static void Zz(Zl34 paramZl34, Zg55 paramZg55, Ztn0 paramZtn0) {
    int[] arrayOfInt = Ztwg.ZU();
    synchronized (paramZl34.Zz6()) {
      Zefg<Zg55> zefg = paramZl34.Zjg();
      byte b = 0;
      Iterator<Zg55> iterator = zefg.iterator();
      while (iterator.hasNext()) {
        Zg55 zg55 = iterator.next();
        try {
          if (zg55.ZaD().equals(paramZg55.ZaD())) {
            iterator.remove();
            paramZtn0.fireTableRowsDeleted(b, b);
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
  
  static void Zt(Zl34 paramZl34, int paramInt, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zg55> zefg = paramZl34.Zjg();
      zefg.remove(paramInt);
      paramZtn0.fireTableRowsDeleted(paramInt, paramInt);
    } 
  }
  
  static void Zu(Zl34 paramZl34, Zmy8 paramZmy8, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zmy8> zefg = paramZl34.ZjM();
      int i = zefg.size();
      zefg.add(paramZmy8);
      paramZtn0.fireTableRowsInserted(i, i);
    } 
  }
  
  static void Zx(Zl34 paramZl34, Zmy8 paramZmy8, int paramInt, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zmy8> zefg = paramZl34.ZjM();
      zefg.set(paramInt, paramZmy8);
      paramZtn0.fireTableRowsUpdated(paramInt, paramInt);
    } 
  }
  
  static void ZA(Zl34 paramZl34, Zmy8 paramZmy8, Ztn0 paramZtn0) {
    int[] arrayOfInt = Ztwg.ZU();
    synchronized (paramZl34.Zz6()) {
      Zefg<Zmy8> zefg = paramZl34.ZjM();
      Iterator<Zmy8> iterator = zefg.iterator();
      while (iterator.hasNext()) {
        Zmy8 zmy8 = iterator.next();
        try {
          if (zmy8.Zl5() == paramZmy8.Zl5())
            try {
              if (zmy8.Zlg().equals(paramZmy8.Zlg()))
                try {
                  if (zmy8.ZlU().equals(paramZmy8.ZlU()) && zmy8.ZlO().equals(paramZmy8.ZlO())) {
                    int i = zefg.indexOf(zmy8);
                    iterator.remove();
                    paramZtn0.fireTableRowsDeleted(i, i);
                  } 
                } catch (UnsupportedOperationException unsupportedOperationException) {
                  throw a(null);
                }  
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
  
  static void ZT(Zl34 paramZl34, int paramInt, Ztn0 paramZtn0) {
    synchronized (paramZl34.Zz6()) {
      Zefg<Zmy8> zefg = paramZl34.ZjM();
      zefg.remove(paramInt);
      paramZtn0.fireTableRowsDeleted(paramInt, paramInt);
    } 
  }
  
  static boolean Zm(Zl34 paramZl34, boolean paramBoolean, List<Zlwx> paramList, Zr_4 paramZr_4, Ztn0 paramZtn0) {
    int[] arrayOfInt = Ztwg.ZU();
    synchronized (paramZl34.Zz6()) {
      List list1 = (List)(paramBoolean ? ZN(paramList, paramZr_4) : Collections.emptyList());
      boolean bool = Zr(paramZl34, list1, paramZtn0);
      try {
      
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      List list2 = (List)(paramBoolean ? Collections.emptyList() : Zu(paramList, paramZr_4));
      bool |= ZR(paramZl34, list2, paramZtn0);
      if (Zbqc.Zwu() == null)
        Ztwg.Zw(new int[5]); 
      return bool;
    } 
  }
  
  public static Zl34 Zk(Zvt paramZvt, String paramString1, String paramString2, Zr_4 paramZr_4, boolean paramBoolean) {
    int[] arrayOfInt = Ztwg.ZU();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    boolean bool = (paramZvt.Zi(paramString1) != Zlwx.Zn) ? true : false;
    boolean bool1 = paramZvt.Zc(paramString1, true);
    Zlwx zlwx = paramZvt.Zi(paramString2);
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zl34 zl34 = paramZr_4.<Zl34>ZH(new Ztwg(paramBoolean, !bool1));
    try {
      if (zlwx.ZN()) {
        try {
        
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        Collection collection1 = (Collection)(bool1 ? ZN(zlwx.ZO(), paramZr_4) : Collections.emptyList());
        try {
          zl34.ZjM().addAll(collection1);
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        Collection collection2 = (Collection)(bool1 ? Collections.emptyList() : Zu(zlwx.ZO(), paramZr_4));
        zl34.Zjg().addAll(collection2);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (bool1)
        try {
          if (!bool)
            try {
              if (zl34.ZjM().isEmpty())
                zl34.ZOt(true); 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfInt == null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return zl34;
  }
  
  private static List<Zg55> Zu(List<Zlwx> paramList, Zr_4 paramZr_4) {
    ArrayList<Zg55> arrayList = new ArrayList();
    Iterator<Zlwx> iterator = paramList.iterator();
    int[] arrayOfInt = Ztwg.ZU();
    while (iterator.hasNext()) {
      Zlwx zlwx = iterator.next();
      try {
        if (zlwx.Zq()) {
          Zg55 zg55 = Zsl2.ZN(zlwx.Zf(), paramZr_4);
          try {
            if (zg55 != null)
              arrayList.add(zg55); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        Zah.Zl(unsupportedOperationException, Zk_.USER_ERROR);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private static List<Zmy8> ZN(List<Zlwx> paramList, Zr_4 paramZr_4) {
    ArrayList<Zmy8> arrayList = new ArrayList();
    Iterator<Zlwx> iterator = paramList.iterator();
    int[] arrayOfInt = Ztwg.ZU();
    while (iterator.hasNext()) {
      Zlwx zlwx = iterator.next();
      try {
        if (zlwx.Zq()) {
          Zmy8 zmy8 = Zxxp.ZD(zlwx.Zf(), paramZr_4);
          try {
            if (zmy8 != null)
              arrayList.add(zmy8); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        Zah.Zl(unsupportedOperationException, Zk_.USER_ERROR);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean ZR(Zl34 paramZl34, List<Zg55> paramList, Ztn0 paramZtn0) {
    Zefg<Zg55> zefg = paramZl34.Zjg();
    List list1 = (List)zefg.stream().filter(Zg55::ZaS).sorted().collect(Collectors.toList());
    int[] arrayOfInt = Ztwg.ZU();
    List list2 = (List)paramList.stream().filter(Zg55::ZaS).sorted().collect(Collectors.toList());
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    boolean bool = !list2.equals(list1) ? true : false;
    zefg.clear();
    paramZtn0.fireTableDataChanged();
    for (Zg55 zg55 : paramList) {
      Zu(paramZl34, zg55, paramZtn0);
      if (arrayOfInt == null)
        break; 
    } 
    return bool;
  }
  
  private static boolean Zr(Zl34 paramZl34, List<Zmy8> paramList, Ztn0 paramZtn0) {
    Zefg<Zmy8> zefg = paramZl34.ZjM();
    List list1 = (List)zefg.stream().filter(Zmy8::ZlM).sorted().collect(Collectors.toList());
    List list2 = (List)paramList.stream().filter(Zmy8::ZlM).sorted().collect(Collectors.toList());
    int[] arrayOfInt = Ztwg.ZU();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    boolean bool = !list2.equals(list1) ? true : false;
    zefg.clear();
    paramZtn0.fireTableDataChanged();
    for (Zmy8 zmy8 : paramList) {
      Zu(paramZl34, zmy8, paramZtn0);
      if (arrayOfInt == null)
        break; 
    } 
    return bool;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */