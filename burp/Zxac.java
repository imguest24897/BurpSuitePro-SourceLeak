package burp;

import burp.api.montoya.core.ByteArray;

public class Zxac implements ITempFile {
  private final ByteArray Zr;
  
  public Zxac(ByteArray paramByteArray) {
    this.Zr = paramByteArray;
  }
  
  public byte[] getBuffer() {
    return this.Zr.copy().getBytes();
  }
  
  public void delete() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */