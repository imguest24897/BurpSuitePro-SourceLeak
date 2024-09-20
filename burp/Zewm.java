package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zewm {
  private final List<Ztx4> ZW;
  
  private static int[] Zq;
  
  public Zewm(Ztx4... paramVarArgs) {
    this(Arrays.asList(paramVarArgs));
  }
  
  public Zewm(List<Ztx4> paramList) {
    this.ZW = Collections.unmodifiableList(new ArrayList<>(paramList));
    if (Zbqc.Zwu() == null)
      Zu(new int[1]); 
  }
  
  public List<Ztx4> ZU() {
    return this.ZW;
  }
  
  public boolean Zv() {
    return this.ZW.isEmpty();
  }
  
  public int ZN() {
    return this.ZW.size();
  }
  
  public Ztx4 ZQ() {
    return this.ZW.get(0);
  }
  
  public List<Zewm> Zp() {
    ArrayList<Zewm> arrayList = new ArrayList();
    byte b = 1;
    int[] arrayOfInt = ZZ();
    while (b <= this.ZW.size()) {
      byte b1 = 0;
      while (b1 <= this.ZW.size() - b) {
        arrayList.add(Zh(b1, b));
        b1++;
        if (arrayOfInt != null) {
          Zbqc.Zr(new Zbqc[2]);
          break;
        } 
      } 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  private Zewm Zh(int paramInt1, int paramInt2) {
    ArrayList<Ztx4> arrayList = new ArrayList();
    int i = paramInt1;
    int[] arrayOfInt = ZZ();
    while (i < paramInt1 + paramInt2) {
      arrayList.add(this.ZW.get(i));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
    return new Zewm(arrayList);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Zewm))
      return false; 
    Zewm zewm = (Zewm)paramObject;
    return zewm.ZW.equals(this.ZW);
  }
  
  public int hashCode() {
    return this.ZW.hashCode();
  }
  
  public static void Zu(int[] paramArrayOfint) {
    Zq = paramArrayOfint;
  }
  
  public static int[] ZZ() {
    return Zq;
  }
  
  static {
    if (ZZ() != null)
      Zu(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zewm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */