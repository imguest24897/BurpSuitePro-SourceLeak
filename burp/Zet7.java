package burp;

import net.portswigger.Zmw;

public class Zet7 {
  private static final byte[] Zb = new byte[0];
  
  private final byte[] ZH;
  
  private Zet7(byte[] paramArrayOfbyte) {
    this.ZH = paramArrayOfbyte;
  }
  
  public byte[] ZZ() {
    return this.ZH;
  }
  
  public int ZJ() {
    return this.ZH.length;
  }
  
  public byte[] ZL(int paramInt1, int paramInt2) {
    int i = this.ZH.length;
    Zbqc[] arrayOfZbqc = Zz_d.ZV();
    if (Zbqc.Zwu() == null)
      Zz_d.ZL(new Zbqc[4]); 
    return (paramInt1 >= i) ? Zb : Zmw.Zz(this.ZH, paramInt1, Math.min(paramInt2, i));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */