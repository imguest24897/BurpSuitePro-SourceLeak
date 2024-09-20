package burp;

import java.util.Objects;

public class Zthw implements Zmxz {
  private static Zbqc[] Zu;
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    String str1 = paramZrdb1.ZaT().ZJ(Ztz3.ISSUE_NAME);
    String str2 = paramZrdb2.ZaT().ZJ(Ztz3.ISSUE_NAME);
    String str3 = paramZrdb1.ZaT().ZJ(Ztz3.EXTENSION_NAME);
    Zbqc[] arrayOfZbqc = Zg();
    String str4 = paramZrdb2.ZaT().ZJ(Ztz3.EXTENSION_NAME);
    if (!Objects.equals(str1, str2) || !Objects.equals(str3, str4))
      return Zl4m.ZX; 
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
    return Zl4m.Zh;
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    Zu = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zg() {
    return Zu;
  }
  
  static {
    if (Zg() != null)
      ZS(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zthw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */