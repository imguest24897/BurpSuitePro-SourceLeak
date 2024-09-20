package burp;

import java.util.Iterator;
import java.util.List;

public class Zxp0 {
  private final Zes3 Zh;
  
  private final Zxpd ZE;
  
  private static int[] ZU;
  
  public Zxp0(Zes3 paramZes3, Zxpd paramZxpd) {
    this.Zh = paramZes3;
    this.ZE = paramZxpd;
  }
  
  public void ZW() {
    Zz61 zz61 = new Zz61(this.Zh.Zq());
    Iterator<Zb3t> iterator = zz61.iterator();
    int[] arrayOfInt = ZU();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.ZE.ZZ();
      ZT(zb3t);
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
  }
  
  private void ZT(Zesp paramZesp) {
    Zkr1<Zesp> zkr1 = new Zkr1();
    zkr1.Zy(paramZesp);
    int[] arrayOfInt = ZU();
    while (zkr1.ZP() != null) {
      paramZesp = zkr1.Zc();
      Zy(paramZesp, zkr1);
      Zc(paramZesp, zkr1);
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void Zy(Zesp paramZesp, Zkr1<Zesp> paramZkr1) {
    int[] arrayOfInt = ZU();
    if (!ZI(paramZesp)) {
      List<Zgbi> list = paramZesp.<List>ZO(Zxc6.TaintHops);
      if (list != null && !list.isEmpty()) {
        boolean bool = false;
        for (Zgbi zgbi : list) {
          if (zgbi.Zm() == paramZesp) {
            bool = true;
            if (arrayOfInt == null)
              continue; 
            break;
          } 
          continue;
          if (arrayOfInt == null)
            break; 
        } 
        if (!bool)
          Zu(paramZesp, list, paramZkr1); 
      } 
    } 
  }
  
  private void Zc(Zesp paramZesp, Zkr1<Zesp> paramZkr1) {
    int[] arrayOfInt = ZU();
    if (!Zf(paramZesp)) {
      List<Zgbi> list = paramZesp.<List>ZO(Zxc6.TaintHops);
      if (list != null && !list.isEmpty()) {
        boolean bool = false;
        for (Zgbi zgbi : list) {
          if (zgbi.ZX() == paramZesp) {
            bool = true;
            if (arrayOfInt == null)
              continue; 
            break;
          } 
          continue;
          if (arrayOfInt == null)
            break; 
        } 
        if (!bool)
          Zw(paramZesp, list, paramZkr1); 
      } 
    } 
  }
  
  private void Zu(Zesp paramZesp, List<Zgbi> paramList, Zkr1<Zesp> paramZkr1) {
    int[] arrayOfInt = ZU();
    Iterator<Zgbi> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      Zgbi zgbi = iterator.next();
      List list = zgbi.Zm().<List>ZO(Zxc6.TaintHops);
      list.remove(zgbi);
      iterator.remove();
      paramZkr1.Zy(zgbi.Zm());
      if (arrayOfInt == null)
        break; 
    } 
    if (paramList.isEmpty())
      paramZesp.Zw(Zxc6.TaintHops); 
  }
  
  private void Zw(Zesp paramZesp, List<Zgbi> paramList, Zkr1<Zesp> paramZkr1) {
    int[] arrayOfInt = ZU();
    Iterator<Zgbi> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      Zgbi zgbi = iterator.next();
      List list = zgbi.ZX().<List>ZO(Zxc6.TaintHops);
      list.remove(zgbi);
      iterator.remove();
      paramZkr1.Zy(zgbi.ZX());
      if (arrayOfInt == null)
        break; 
    } 
    if (paramList.isEmpty())
      paramZesp.Zw(Zxc6.TaintHops); 
  }
  
  public boolean Zf(Zesp paramZesp) {
    return (paramZesp.ZO(Zxc6.TaintSource) != null);
  }
  
  public boolean ZI(Zesp paramZesp) {
    return (paramZesp.ZO(Zxc6.TaintSink) != null);
  }
  
  public static void ZZ(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return ZU;
  }
  
  static {
    if (ZU() == null)
      ZZ(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxp0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */