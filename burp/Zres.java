package burp;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zres implements Zlvj {
  private final Zz3o ZA;
  
  private final String Zq;
  
  private final Zski Zb;
  
  private final List<String> ZB;
  
  private final String Zt;
  
  private final List<Ze7n> ZP;
  
  private static Zbqc[] Zc;
  
  protected Zres(Zkkb<?> paramZkkb) {
    this.ZA = paramZkkb.ZS;
    this.Zq = paramZkkb.ZE;
    this.Zb = paramZkkb.ZI;
    this.ZB = Collections.unmodifiableList(paramZkkb.Zu);
    this.Zt = paramZkkb.Zt;
    this.ZP = paramZkkb.ZW;
  }
  
  public Zz3o ZM() {
    return this.ZA;
  }
  
  public Zski Zx() {
    return this.Zb;
  }
  
  public String ZY() {
    return this.Zq;
  }
  
  public String Zf() {
    return this.Zt;
  }
  
  public List<Ze7n> Zh() {
    return this.ZP;
  }
  
  public List<String> Z_() {
    return this.ZB;
  }
  
  public Zm6i Zw() {
    return (new Zlx3()).ZZ(ZM()).ZW(Zx()).ZC(ZY()).ZI(Zsba.ZQ(Zf())).Zb(Zh().stream().map(Ze7n::Zn).toList()).ZN();
  }
  
  public String ZO() {
    return Zlvj.ZU(this);
  }
  
  public boolean Zp(Zg8y paramZg8y) {
    Zbqc[] arrayOfZbqc = Zu();
    if (paramZg8y instanceof Zlvj) {
      Zlvj zlvj = (Zlvj)paramZg8y;
      if (arrayOfZbqc != null)
        return Objects.equals(zlvj.Zx(), Zx()); 
    } 
    return false;
  }
  
  public String toString() {
    return ZO();
  }
  
  public static void Zr(Zbqc[] paramArrayOfZbqc) {
    Zc = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zu() {
    return Zc;
  }
  
  static {
    if (Zu() == null)
      Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zres.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */