package burp;

import java.util.List;

public abstract class Ztvs implements Zs69 {
  private final List<Zs69> ZI;
  
  private static Zbqc[] ZA;
  
  Ztvs(List<Zs69> paramList) {
    this.ZI = paramList;
  }
  
  public boolean ZZ(Ze7n paramZe7n) {
    Zbqc[] arrayOfZbqc = Zd();
    for (Zs69 zs69 : this.ZI) {
      if (zs69.ZZ(paramZe7n))
        return true; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  public String Za(Ze7n paramZe7n) {
    Zbqc[] arrayOfZbqc = Zd();
    if (paramZe7n instanceof Zs3b)
      for (String str : paramZe7n.ZX()) {
        if (Zsw8.ZS(str))
          return str; 
        if (arrayOfZbqc == null)
          break; 
      }  
    for (Zs69 zs69 : this.ZI) {
      if (zs69.ZZ(paramZe7n)) {
        String str = zs69.Za(paramZe7n);
        if (str != null)
          return str; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  public static void ZQ(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zd() {
    return ZA;
  }
  
  static {
    if (Zd() == null)
      ZQ(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */