package burp;

import java.util.EnumSet;
import java.util.Locale;

public class Zgdy implements Zlei {
  private final String ZP;
  
  private final boolean ZK;
  
  private final boolean ZU;
  
  private final boolean Zq;
  
  private static int[] ZJ;
  
  public Zgdy(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.ZP = paramString;
    int[] arrayOfInt = ZW();
    this.ZK = paramBoolean1;
    this.ZU = paramBoolean2;
    this.Zq = paramBoolean3;
    if (Zbqc.Zwu() == null)
      Zi(new int[3]); 
  }
  
  public EnumSet<Zklf> Zb() {
    return (this.ZP == null) ? Zz8g.ZX.Zo(this.ZU, this.Zq) : (new Zsj8(this.ZK, this.ZP.toLowerCase(Locale.ENGLISH), this.ZU, this.Zq)).Zb();
  }
  
  public static void Zi(int[] paramArrayOfint) {
    ZJ = paramArrayOfint;
  }
  
  public static int[] ZW() {
    return ZJ;
  }
  
  static {
    if (ZW() != null)
      Zi(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */