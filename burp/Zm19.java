package burp;

import java.nio.ByteBuffer;

class Zm19 implements Zih {
  private final Zkko Zp;
  
  private Zm19(Zkko paramZkko) {
    this.Zp = paramZkko;
  }
  
  public byte[] ZL(Zsp paramZsp) {
    byte[] arrayOfByte1 = paramZsp.Zd();
    byte[] arrayOfByte2 = new byte[9 + arrayOfByte1.length];
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte2);
    this.Zp.ZE(byteBuffer, paramZsp, arrayOfByte1.length);
    byteBuffer.put(arrayOfByte1);
    return arrayOfByte2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm19.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */