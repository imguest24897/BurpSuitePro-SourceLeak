package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zsfh implements Zxdl {
  private final Zewm ZO;
  
  private final Zedm Zt;
  
  private final Zrc_ ZM;
  
  public Zsfh(Zewm paramZewm, Zedm paramZedm, Zrc_ paramZrc_) {
    this.ZO = paramZewm;
    this.Zt = paramZedm;
    this.ZM = paramZrc_;
  }
  
  public Set<Zbop> Zc() {
    HashSet<Zbop> hashSet = new HashSet();
    byte b = 1;
    int[] arrayOfInt = Zrc_.Zm();
    while (b < this.ZO.ZN()) {
      ArrayList<Ztx4> arrayList1 = new ArrayList();
      ArrayList<Ztx4> arrayList2 = new ArrayList();
      byte b1 = 0;
      while (b1 < b) {
        arrayList1.add(this.ZO.ZU().get(b1));
        b1++;
        if (arrayOfInt != null)
          break; 
      } 
      b1 = b;
      while (b1 < this.ZO.ZN()) {
        arrayList2.add(this.ZO.ZU().get(b1));
        b1++;
        if (arrayOfInt != null)
          break; 
      } 
      Zewm zewm1 = new Zewm(arrayList1);
      Zewm zewm2 = new Zewm(arrayList2);
      hashSet.addAll(this.ZM.ZI(zewm1));
      if (this.Zt.Zc(zewm1))
        hashSet.addAll(this.ZM.ZI(zewm2)); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */