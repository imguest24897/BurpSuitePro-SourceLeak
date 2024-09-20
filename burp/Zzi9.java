package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Zzi9 {
  private final List<Zxov> ZK;
  
  Zzi9(List<Zxov> paramList) {
    this.ZK = paramList;
  }
  
  List<Zlp9> ZM() {
    List<Zsv6> list1 = ZT();
    List<Zsv6> list2 = ZM(list1);
    List<Zsv6> list3 = ZY(list2, list1);
    return Zl(list3);
  }
  
  private List<Zlp9> Zl(List<Zsv6> paramList) {
    ArrayList<Zlp9> arrayList = new ArrayList();
    Iterator<Zsv6> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zsv6 zsv6 = iterator.next();
      arrayList.add(zsv6.Ze);
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
  
  private List<Zsv6> ZY(List<Zsv6> paramList1, List<Zsv6> paramList2) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    if (Zk(paramList1))
      return paramList1; 
    Zsv6 zsv6 = ZL(paramList2);
    if (zsv6 != null)
      for (Zsv6 zsv61 : paramList1) {
        ArrayList<Zxov> arrayList = new ArrayList();
        for (Zxov zxov : zsv6.Zf) {
          arrayList.add(zxov);
          if (arrayOfZbqc != null)
            break; 
        } 
        for (Zsv6 zsv62 : paramList1) {
          if (zsv62 == zsv61)
            continue; 
          for (Zxov zxov : zsv62.Zf) {
            Zliq.Zs(zxov, arrayList);
            if (arrayOfZbqc != null)
              break; 
          } 
          if (arrayOfZbqc != null)
            break; 
        } 
        if (Zw(paramList1) == arrayList.size()) {
          paramList1.remove(zsv61);
          paramList1.add(zsv6);
          return paramList1;
        } 
        if (arrayOfZbqc != null)
          break; 
      }  
    return paramList1;
  }
  
  private Zsv6 ZL(List<Zsv6> paramList) {
    Zsv6 zsv6 = null;
    for (Zsv6 zsv61 : paramList) {
      if (zsv61.Ze == Zlp9.NON_SCHEMA_URL_PAYLOAD) {
        zsv6 = zsv61;
        break;
      } 
    } 
    return zsv6;
  }
  
  private boolean Zk(List<Zsv6> paramList) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zsv6 zsv6 : paramList) {
      if (zsv6.Ze == Zlp9.NON_SCHEMA_URL_PAYLOAD)
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private int Zw(List<Zsv6> paramList) {
    ArrayList<Zxov> arrayList = new ArrayList();
    Iterator<Zsv6> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zsv6 zsv6 = iterator.next();
      for (Zxov zxov : zsv6.Zf) {
        Zliq.Zs(zxov, arrayList);
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList.size();
  }
  
  private List<Zsv6> ZM(List<Zsv6> paramList) {
    ArrayList<Zsv6> arrayList = new ArrayList();
    Iterator<Zsv6> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zsv6 zsv6 = iterator.next();
      boolean bool = true;
      for (Zsv6 zsv61 : arrayList) {
        if (!ZA(zsv6, zsv61)) {
          bool = false;
          if (arrayOfZbqc != null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (bool)
        arrayList.add(zsv6); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList;
  }
  
  private boolean ZA(Zsv6 paramZsv61, Zsv6 paramZsv62) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Zxov zxov : paramZsv61.Zf) {
      boolean bool = true;
      for (Zxov zxov1 : paramZsv62.Zf) {
        if (zxov.Zg.Zg(zxov1.Zg)) {
          bool = false;
          if (arrayOfZbqc != null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (bool)
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private List<Zsv6> ZT() {
    ArrayList<Zsv6> arrayList = new ArrayList();
    Iterator<Zxov> iterator = this.ZK.iterator();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (iterator.hasNext()) {
      Zxov zxov = iterator.next();
      Zsv6 zsv6 = null;
      for (Zsv6 zsv61 : arrayList) {
        if (zsv61.Ze == zxov.ZR.Zy.ZN()) {
          zsv6 = zsv61;
          break;
        } 
      } 
      if (zsv6 == null) {
        zsv6 = new Zsv6(zxov.ZR.Zy.ZN(), new ArrayList<>());
        arrayList.add(zsv6);
      } 
      Zliq.Zs(zxov, zsv6.Zf);
      if (arrayOfZbqc != null)
        break; 
    } 
    Collections.sort(arrayList);
    Collections.reverse(arrayList);
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzi9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */