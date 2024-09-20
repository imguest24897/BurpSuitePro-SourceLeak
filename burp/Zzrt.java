package burp;

import net.portswigger.Zl4;
import net.portswigger.Zz4;

public class Zzrt extends Zzrd {
  private static final Zz4 Ze = new Zz4();
  
  private final Zl4 Zg;
  
  private final int ZH;
  
  private Zzrt(Zl4 paramZl4, int paramInt) {
    this.Zg = paramZl4;
    this.ZH = paramInt;
  }
  
  public static Zzrd ZL(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new Zzrt(Ze.ZA(paramArrayOfbyte, !paramBoolean), paramArrayOfbyte.length);
  }
  
  public Zbu4 Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return Zq; 
    if (paramInt2 < 0)
      paramInt2 = paramArrayOfbyte.length; 
    int i = this.Zg.Zh(new Zza_(Zyf.Zy(paramArrayOfbyte)), paramInt1, paramInt2);
    return (i < 0) ? Zq : new Zbu4(i, i + this.ZH, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */