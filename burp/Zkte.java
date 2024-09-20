package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zkte implements Zkq1 {
  private final Ze9k ZX;
  
  protected final Zr_4 Zn;
  
  private static String Zz;
  
  protected Zkte(Zr_4 paramZr_4, Ze9k paramZe9k) {
    this.Zn = paramZr_4;
    this.ZX = paramZe9k;
  }
  
  public Zzvm Zyi() {
    return this.ZX.Zyi();
  }
  
  public boolean ZyP() {
    return this.ZX.ZyP();
  }
  
  public void ZcN(boolean paramBoolean) {
    this.ZX.ZcN(paramBoolean);
  }
  
  public Zm41 Zyn() {
    return this.ZX.Zyn();
  }
  
  public void Zh(Zl83 paramZl83) {
    this.ZX.Zh(paramZl83);
  }
  
  public byte[][] ZD(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    byte[][] arrayOfByte;
    while (true) {
      arrayOfByte = Zw(paramZzlx, paramArrayOfbyte);
      if (arrayOfByte != null && arrayOfByte[0] == Zm41.ZI) {
        if (paramZzlx.ZF())
          return null; 
        continue;
      } 
      break;
    } 
    return arrayOfByte;
  }
  
  public byte[] Zm(byte[] paramArrayOfbyte, boolean paramBoolean) {
    Zuh.Zb((paramArrayOfbyte != null), Zqf.Zx);
    return (paramArrayOfbyte.length < 200) ? (paramBoolean ? Zyn().Zd(paramArrayOfbyte) : paramArrayOfbyte) : null;
  }
  
  public int Zyv() {
    return this.ZX.Zyv();
  }
  
  public void ZvH(int paramInt) {
    this.ZX.ZvH(paramInt);
  }
  
  public void ZyK() {
    this.ZX.ZyK();
  }
  
  protected abstract byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte);
  
  public static void ZU(String paramString) {
    Zz = paramString;
  }
  
  public static String Zwh() {
    return Zz;
  }
  
  static {
    if (Zwh() != null)
      ZU("hlUWT"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkte.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */