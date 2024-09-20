package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zgy_ {
  private final int ZK;
  
  private final int ZC;
  
  private List<Zes2> Zc = new ArrayList<>();
  
  private boolean Zr;
  
  private static boolean ZB;
  
  public Zgy_(int paramInt) {
    this.ZC = paramInt;
    this.ZK = Zr4s.ZL();
  }
  
  public int Zy() {
    return this.ZK;
  }
  
  public int Zn() {
    return this.ZC;
  }
  
  public void Zz(Zes2 paramZes2) {
    this.Zc.add(paramZes2);
  }
  
  public void Zv() {
    this.Zr = true;
  }
  
  public boolean Zp() {
    return this.Zr;
  }
  
  public void Zp(Zr9_ paramZr9_, List<Zes2> paramList) {
    boolean bool1 = false;
    Iterator<Zes2> iterator = this.Zc.iterator();
    boolean bool = ZF();
    while (iterator.hasNext()) {
      Zes2 zes2 = iterator.next();
      if (zes2.Zv == paramZr9_) {
        bool1 = true;
        if (!bool)
          continue; 
        break;
      } 
      continue;
      if (!bool)
        break; 
    } 
    if (bool1)
      this.Zc.addAll(paramList); 
  }
  
  public List<Zes2> ZO() {
    ArrayList<Zes2> arrayList = new ArrayList();
    Iterator<Zes2> iterator = this.Zc.iterator();
    boolean bool = ZF();
    while (iterator.hasNext()) {
      Zes2 zes2 = iterator.next();
      if (zes2.Zv == Zg4p.EPSILON)
        arrayList.add(zes2); 
      if (!bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zl(!bool); 
    return arrayList;
  }
  
  public Set<Zgy_> Zx() {
    HashSet<Zgy_> hashSet = new HashSet();
    hashSet.add(this);
    ZY(this, hashSet);
    return hashSet;
  }
  
  private void ZY(Zgy_ paramZgy_, Set<Zgy_> paramSet) {
    boolean bool = ZF();
    for (Zes2 zes2 : paramZgy_.ZO()) {
      if (!paramSet.contains(zes2.ZD)) {
        paramSet.add(zes2.ZD);
        ZY(zes2.ZD, paramSet);
      } 
      if (!bool)
        break; 
    } 
  }
  
  public boolean equals(Object paramObject) {
    return !(paramObject instanceof Zgy_) ? false : ((((Zgy_)paramObject).ZK == this.ZK));
  }
  
  public int hashCode() {
    return this.ZK;
  }
  
  public Zgy_ ZD(Ztx4 paramZtx4) {
    boolean bool = ZN();
    for (Zes2 zes2 : this.Zc) {
      if (zes2.Zv == paramZtx4)
        return zes2.ZD; 
      if (bool)
        break; 
    } 
    return null;
  }
  
  public static void Zl(boolean paramBoolean) {
    ZB = paramBoolean;
  }
  
  public static boolean ZF() {
    return ZB;
  }
  
  public static boolean ZN() {
    boolean bool = ZF();
    return !bool;
  }
  
  static {
    if (ZN())
      Zl(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgy_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */