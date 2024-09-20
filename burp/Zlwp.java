package burp;

import net.portswigger.Zkb;

class Zlwp implements Zmrh {
  private final Zxwh ZH;
  
  Zlwp(Zxwh paramZxwh) {
    this.ZH = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbtd(this.ZH);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte1 = Zkb.Zy(this.ZH.ZWP());
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfbyte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte2, arrayOfByte1.length, paramArrayOfbyte1.length);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlwp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */