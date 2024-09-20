package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Zmlk {
  public static Zm6i Zi(Iterable<Zm6i> paramIterable, Zbj5 paramZbj5, Zrho paramZrho) {
    Zz3o zz3o = paramZrho.ZAA().Zm2();
    List<Zeib> list = Zlk0.ZK(paramIterable).Zi(zz3o);
    Collection<Zrho> collection = paramZbj5.Zg(zz3o);
    Iterator<Zeib> iterator = list.iterator();
    int[] arrayOfInt = Ze0_.Zq();
    label21: while (iterator.hasNext()) {
      Zeib zeib = iterator.next();
      if (paramZrho.Zt(zeib)) {
        for (Zrho zrho : collection) {
          if (zrho.ZF(paramZrho) || zrho.ZE(paramZrho))
            break; 
          if (zrho.Zt(zeib))
            continue label21; 
          if (arrayOfInt == null)
            break; 
        } 
        return zeib.Zja();
      } 
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Ze0_.Zk(new int[1]); 
    return null;
  }
  
  public static Zm6i Zv(Iterable<Zm6i> paramIterable, Zbj5 paramZbj5, Zrho paramZrho) {
    Zz3o zz3o = paramZrho.ZAA().Zm2();
    List<Zeib> list = Zlk0.ZK(paramIterable).Zi(zz3o);
    Collection<Zrho> collection = paramZbj5.Zg(zz3o);
    int[] arrayOfInt = Ze0_.Zq();
    label24: for (Zeib zeib : list) {
      Zrho zrho = paramZrho;
      while (zrho != null) {
        if (zrho.Zt(zeib)) {
          for (Zrho zrho1 : collection) {
            if (zrho1.ZF(zrho) || zrho1.ZE(zrho))
              break; 
            if (zrho1.Zt(zeib))
              continue label24; 
            if (arrayOfInt == null) {
              Zbqc.Zr(new Zbqc[4]);
              break;
            } 
          } 
          return zeib.Zja();
        } 
        zrho = Ztfy.Zl(zrho);
        if (arrayOfInt == null)
          break; 
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */