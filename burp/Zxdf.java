package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;

public class Zxdf {
  private static final Comparator<Zgit> ZG = Zxdf::lambda$static$0;
  
  public static Iterable<Zgit> Zd(Zgfe paramZgfe, Zxs7 paramZxs7, Zm80 paramZm80) {
    ArrayList<Zgit> arrayList = new ArrayList();
    Iterator<Zsjk> iterator = Collections.unmodifiableList(Arrays.asList((Object[])new Zsjk[] { Zsjk.REPLACE, Zsjk.APPEND })).iterator();
    String str = Zgit.ZA();
    while (iterator.hasNext()) {
      Zsjk zsjk = iterator.next();
      Zku6 zku6 = paramZgfe.Zq(zsjk);
      ZG(zsjk, zku6, paramZm80, paramZxs7, arrayList);
      if (str == null)
        break; 
    } 
    arrayList.sort(ZG);
    if (Zbqc.Zwu() == null)
      Zgit.Zv("lEW0lb"); 
    return arrayList;
  }
  
  public static Iterable<Zgit> ZP(Zxs7 paramZxs7, Zm80 paramZm80, Zku6 paramZku6) {
    ArrayList<Zgit> arrayList = new ArrayList();
    ZG(Zsjk.REPLACE, paramZku6, paramZm80, paramZxs7, arrayList);
    return arrayList;
  }
  
  private static void ZG(Zsjk paramZsjk, Zku6 paramZku6, Zm80 paramZm80, Zxs7 paramZxs7, List<Zgit> paramList) {
    String str = Zgit.ZA();
    if (!paramZku6.Zu())
      return; 
    boolean bool = false;
    HashSet<String> hashSet = new HashSet();
    byte[] arrayOfByte = { 2, 1 };
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      if (b1 != 1 || paramZku6.Zn())
        for (Zkv8 zkv8 : paramZku6.ZP(b1)) {
          String str1 = paramZm80.ZC(paramZku6, zkv8);
          if (str1 != null) {
            Zrr2 zrr21 = (new Zr4e()).ZP(zkv8.<String>ZH(new Zxoc(str1)));
            String str2 = Zkb.ZG(paramZku6.ZY());
            if (paramZsjk.Z_() == 1)
              str2 = paramZxs7.ZI() + paramZxs7.ZI(); 
            if (zrr21.Zr(str2) && hashSet.contains(str1))
              continue; 
            if (zrr21.Zv(str2)) {
              if (bool)
                continue; 
              bool = true;
            } 
            hashSet.add(str1);
            Zrr2 zrr22 = (new Zr4e()).ZP(str2);
            paramList.add(new Zgit(zrr21, zrr22, str1, str2, paramZku6, zkv8, b1));
          } 
          if (str == null)
            break; 
        }  
      b++;
      if (str == null)
        break; 
    } 
  }
  
  private static int lambda$static$0(Zgit paramZgit1, Zgit paramZgit2) {
    int i = paramZgit1.Zo.Zw;
    int j = paramZgit2.Zo.Zw;
    return Integer.compare(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */