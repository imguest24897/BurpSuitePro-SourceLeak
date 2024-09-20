package burp;

import net.portswigger.Zkb;

class Zzmj implements Zmrh {
  private final Zxwh Zx;
  
  Zzmj(Zxwh paramZxwh) {
    this.Zx = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbtr(this.Zx);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte1 = Zkb.Zy(this.Zx.ZWP());
    byte[] arrayOfByte2 = new byte[paramArrayOfbyte1.length + arrayOfByte1.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte2, 0, paramArrayOfbyte1.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, paramArrayOfbyte1.length, arrayOfByte1.length);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */