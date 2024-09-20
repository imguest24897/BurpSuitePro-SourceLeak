package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Zg1b {
  private static int Ze;
  
  public static Zttl ZG(Zbj5 paramZbj5, List<Zg8y> paramList, Zeu9 paramZeu9, Zr_4 paramZr_4) {
    Collection<Zrho> collection = paramZbj5.Zfz();
    ArrayList<Zl_> arrayList = new ArrayList(collection.size());
    Iterator<Zrho> iterator = collection.iterator();
    int i = Z_();
    while (iterator.hasNext()) {
      Zrho zrho = iterator.next();
      Zxw8 zxw8 = paramZr_4.<Zxw8>ZH(new Zkah(zrho));
      Zl_ zl_ = zrho.ZAA().ZE(paramZeu9, zxw8, paramZr_4);
      arrayList.add(zl_);
      if (i == 0)
        break; 
    } 
    LinkedList<Zgyy> linkedList = new LinkedList();
    for (Zg8y zg8y : paramList) {
      if (zg8y instanceof Zlvj) {
        Zlvj zlvj = (Zlvj)zg8y;
        switch (Zzw3.Zu[zlvj.ZM().ordinal()]) {
          case 1:
          
          case 2:
          
          case 3:
          
          default:
            break;
        } 
        Object object = null;
        if (object != null)
          linkedList.add(object); 
        if (i == 0)
          break; 
      } 
    } 
    if (Zbqc.Zwu() == null)
      ZA(++i); 
    return paramZr_4.<Zttl>ZH(new Zev_(arrayList, linkedList));
  }
  
  static void Zr(Zsiv paramZsiv, Ztk0 paramZtk0, List<Zrp0> paramList, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    int i = Zg();
    for (Zrp0 zrp0 : paramList) {
      zrp0.Zv(new Zzqe(paramZtk0, zrp0, paramZsiv, paramZr69, paramZz1m));
      if (i != 0)
        break; 
    } 
  }
  
  static void Zt(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zzbs paramZzbs, Zkmk paramZkmk, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    paramZkmk.ZK(paramZrp0);
    paramZkmk.ZQ(paramZrp0, paramZszw, paramZlru, paramZzbs, paramZtk0, paramZt1i, paramZz1m, paramZr69);
  }
  
  public static void ZA(int paramInt) {
    Ze = paramInt;
  }
  
  public static int Z_() {
    return Ze;
  }
  
  public static int Zg() {
    int i = Z_();
    return (i == 0) ? 72 : 0;
  }
  
  static {
    if (Zg() != 0)
      ZA(39); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */