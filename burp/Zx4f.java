package burp;

import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zie;
import net.portswigger.Zk_;
import net.portswigger.Zua;
import net.portswigger.Zuh;

public class Zx4f implements Zxnk {
  private final String Zl;
  
  private static int Zp;
  
  public Zx4f(String paramString) {
    this.Zl = Objects.<String>requireNonNull(paramString);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zx4f zx4f = (Zx4f)paramObject;
    return Objects.equals(this.Zl, zx4f.Zl);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zl });
  }
  
  public String ZB(Zskh paramZskh, Zkqn paramZkqn, Zie paramZie, String paramString, Object... paramVarArgs) {
    String str = paramString + paramString;
    Zbo8 zbo8 = Zbpn.ZI().Zk(paramZkqn).Zp(paramZie).Zb(Zeew.SCANNER).Zp(str);
    paramZskh.ZG(zbo8.ZA());
    return str;
  }
  
  public String Zo(Object... paramVarArgs) {
    try {
      return String.format(this.Zl, paramVarArgs);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return this.Zl;
    } 
  }
  
  public boolean ZQ() {
    return false;
  }
  
  public Zua Zb() {
    Zuh.ZV();
    return null;
  }
  
  public static void ZV(int paramInt) {
    Zp = paramInt;
  }
  
  public static int ZS() {
    return Zp;
  }
  
  public static int Zf() {
    int i = ZS();
    return (i == 0) ? 95 : 0;
  }
  
  static {
    if (ZS() != 0)
      ZV(40); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */