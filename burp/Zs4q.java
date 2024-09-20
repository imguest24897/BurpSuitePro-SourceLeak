package burp;

import net.portswigger.Zmw;

class Zs4q implements Zmrh {
  private final Zxwh Zf;
  
  Zs4q(Zxwh paramZxwh) {
    this.Zf = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbyx(this.Zf);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = Math.min(this.Zf.ZWN(), paramArrayOfbyte1.length);
    int j = Math.min(this.Zf.ZWn() + i, paramArrayOfbyte1.length);
    return Zmw.Zz(paramArrayOfbyte1, i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */