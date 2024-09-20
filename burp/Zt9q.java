package burp;

import javax.swing.JComponent;

class Zt9q {
  private final Zbkv ZT;
  
  Zt9q(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this.ZT = new Zbkv(false, paramZgb6, paramZb0h, paramZtwv);
  }
  
  void ZB(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length - paramInt];
    System.arraycopy(paramArrayOfbyte, paramInt, arrayOfByte, 0, paramArrayOfbyte.length - paramInt);
    this.ZT.Zx(arrayOfByte);
  }
  
  public JComponent Zr() {
    return this.ZT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */