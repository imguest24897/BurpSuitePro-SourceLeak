package burp;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

class Zll6 implements Zrch {
  private final MessageDigest Zq;
  
  Zll6(MessageDigest paramMessageDigest) {
    this.Zq = paramMessageDigest;
  }
  
  public short ZX(Zbi8 paramZbi8) {
    return 0;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    return (paramZbi8.Zo > 0);
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    this.Zq.update(paramZbi8.Zu, paramZbi8.Zv, paramZbi8.Zo);
    byte[] arrayOfByte = this.Zq.digest();
    paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    paramZbi8.Zv += paramZbi8.Zo;
    paramZbi8.Zo = 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zll6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */