package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zzsd {
  private final Set<Zgy_> ZS;
  
  private final List<Zg6w> Zx = new ArrayList<>();
  
  private static boolean ZA;
  
  public Zzsd(Set<Zgy_> paramSet) {
    this.ZS = paramSet;
  }
  
  public List<Zg6w> Zv() {
    return this.Zx;
  }
  
  public void ZK(Zg6w paramZg6w) {
    this.Zx.add(paramZg6w);
  }
  
  public Set<Zgy_> ZM(Ztx4 paramZtx4) {
    HashSet<Zgy_> hashSet = new HashSet();
    Iterator<Zgy_> iterator = this.ZS.iterator();
    boolean bool = ZW();
    while (iterator.hasNext()) {
      Zgy_ zgy_1 = iterator.next();
      Zgy_ zgy_2 = zgy_1.ZD(paramZtx4);
      if (zgy_2 != null)
        hashSet.addAll(zgy_2.Zx()); 
      if (bool)
        break; 
    } 
    return hashSet;
  }
  
  public Set<Zgy_> Zo() {
    return this.ZS;
  }
  
  public Set<Zgy_> Zr() {
    HashSet<Zgy_> hashSet = new HashSet();
    Iterator<Zgy_> iterator = this.ZS.iterator();
    boolean bool = Zq();
    while (iterator.hasNext()) {
      Zgy_ zgy_ = iterator.next();
      if (zgy_.Zp())
        hashSet.add(zgy_); 
      if (!bool)
        break; 
    } 
    return hashSet;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = Zq();
    if (!(paramObject instanceof Zzsd))
      return false; 
    Zzsd zzsd = (Zzsd)paramObject;
    if (zzsd.ZS.size() != this.ZS.size())
      return false; 
    for (Zgy_ zgy_ : this.ZS) {
      if (!zzsd.ZS.contains(zgy_))
        return false; 
      if (!bool)
        break; 
    } 
    return true;
  }
  
  public int hashCode() {
    String str = "";
    Iterator<Zgy_> iterator = this.ZS.iterator();
    boolean bool = ZW();
    while (iterator.hasNext()) {
      Zgy_ zgy_ = iterator.next();
      str = str + str;
      if (bool)
        break; 
    } 
    return str.hashCode();
  }
  
  public static void Zt(boolean paramBoolean) {
    ZA = paramBoolean;
  }
  
  public static boolean Zq() {
    return ZA;
  }
  
  public static boolean ZW() {
    boolean bool = Zq();
    return !bool;
  }
  
  static {
    if (!Zq())
      Zt(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */