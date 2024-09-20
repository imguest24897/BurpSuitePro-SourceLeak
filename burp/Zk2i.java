package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

abstract class Zk2i implements Zxd2 {
  private final Zsp4 Zq;
  
  private final Zr1x Zd;
  
  protected List Zp;
  
  private static final Comparator<Zrdb> ZY = Zk2i::lambda$static$1;
  
  private static final Comparator<List<Zrdb>> Zj = Zk2i::lambda$static$2;
  
  protected Zk2i(Collection<Zrdb> paramCollection, Zr1x paramZr1x) {
    this.Zd = paramZr1x;
    this.Zq = new Zsp4(paramCollection, paramZr1x);
  }
  
  public List Z_() {
    return this.Zp;
  }
  
  public int Zs(int paramInt1, int paramInt2) {
    return this.Zq.ZD(paramInt1, paramInt2);
  }
  
  public int Zl(int paramInt) {
    int i = 0;
    byte b = 1;
    boolean bool = Zsh9.ZX();
    while (b <= 3) {
      i += Zs(paramInt, b);
      b++;
      if (!bool)
        break; 
    } 
    return i;
  }
  
  protected List Zr(Collection<Zrdb> paramCollection) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zrdb> iterator = paramCollection.iterator();
    boolean bool = Zsh9.ZX();
    while (iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      try {
        try {
        
        } catch (Exception exception) {
          throw a(null);
        } 
        Object object = zrdb.Za6().ZH() ? (new Zew8(zrdb)).ZZV() : zrdb.Za6();
        List<Zrdb> list = (List)hashMap.computeIfAbsent(object, Zk2i::lambda$organiseIntoTypes$0);
        list.add(zrdb);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
        this.Zd.ZV();
      } 
      if (!bool)
        break; 
    } 
    ArrayList<List<Zrdb>> arrayList = new ArrayList();
    for (Object object : hashMap.keySet()) {
      List<Zrdb> list = (List)hashMap.get(object);
      list.sort(ZY);
      arrayList.add(list);
      if (!bool)
        break; 
    } 
    arrayList.sort(Zj);
    return arrayList;
  }
  
  private static int lambda$static$2(List<Zrdb> paramList1, List<Zrdb> paramList2) {
    try {
      Zrdb zrdb1 = paramList1.get(0);
      Zrdb zrdb2 = paramList2.get(0);
      byte b1 = zrdb1.ZaJ();
      byte b2 = zrdb2.ZaJ();
      if (b1 > b2)
        return -1; 
      if (b2 > b1)
        return 1; 
      int i = zrdb1.Za6().ZS();
      int j = zrdb2.Za6().ZS();
      return Integer.compare(i, j);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return 0;
    } 
  }
  
  private static int lambda$static$1(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    try {
      byte b1 = paramZrdb1.ZaJ();
      byte b2 = paramZrdb2.ZaJ();
      if (b1 > b2)
        return -1; 
      if (b2 > b1)
        return 1; 
      int i = paramZrdb1.ZaB().compareTo(paramZrdb2.ZaB());
      return (i != 0) ? i : paramZrdb1.Za0().compareTo(paramZrdb2.Za0());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return 0;
    } 
  }
  
  private static List lambda$organiseIntoTypes$0(Object paramObject) {
    return new ArrayList();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */