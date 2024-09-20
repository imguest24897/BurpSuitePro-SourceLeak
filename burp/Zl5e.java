package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zkb;

public class Zl5e {
  private final Map<String, Zlqf> ZM = new HashMap<>();
  
  private final Map<String, Zlqf> ZK;
  
  private final Map<String, String> ZI;
  
  private static String[] Zz;
  
  public Zl5e() {
    String[] arrayOfString = Zr();
    this.ZK = new HashMap<>();
    this.ZI = new HashMap<>();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public synchronized void Zz(String paramString, Zx8_ paramZx8_) {
    Zlqf zlqf = ZQ(paramString);
    String str = Zkb.ZG(paramZx8_.ZZa().Zd4());
    String[] arrayOfString = Zr();
    if (zlqf == null) {
      zlqf = new Zlqf();
      if (str != null && !str.trim().isEmpty()) {
        this.ZM.put(str, zlqf);
        this.ZI.put(str, paramString);
      } 
      this.ZK.put(paramString, zlqf);
    } 
    zlqf.ZV(paramZx8_);
    if (Zbqc.Zwu() == null)
      ZY(new String[5]); 
  }
  
  public synchronized String ZO(String paramString1, String paramString2) {
    return (paramString1 == null || paramString1.trim().isEmpty()) ? this.ZI.get(paramString2) : paramString1;
  }
  
  public synchronized Zlqf ZQ(String paramString) {
    return this.ZK.get(paramString);
  }
  
  public static void ZY(String[] paramArrayOfString) {
    Zz = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return Zz;
  }
  
  static {
    if (Zr() != null)
      ZY(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl5e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */