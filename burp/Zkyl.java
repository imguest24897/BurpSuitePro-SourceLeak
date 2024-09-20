package burp;

import java.io.IOException;
import net.portswigger.Zdo;

public class Zkyl extends Zkte {
  private static final byte[] ZT = new byte[] { 110, 117, 108, 108 };
  
  private final Zl61 Zr;
  
  public Zkyl(Zl61 paramZl61, Zr_4 paramZr_4) {
    super(paramZr_4, paramZl61);
    this.Zr = paramZl61;
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    int i = this.Zr.Zyv();
    int j = this.Zr.ZDU() + 1;
    this.Zr.ZCh(j);
    int[] arrayOfInt = Zmce.ZL();
    if (i == -1 || j <= i)
      return this.Zr.Zyn().ZL(new Zr1f(paramZzlx), paramArrayOfbyte, new byte[][] { Zdo.ZQ, null, ZT }); 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return null;
  }
  
  public void Zy4() {
    Zmce.Zi(this.Zr);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zr.ZS(paramZs4f);
  }
  
  public byte[] Zm(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return Zdo.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */