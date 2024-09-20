package burp;

import java.io.ByteArrayOutputStream;
import net.portswigger.Zvy;

class Zgl extends Zgj {
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    byte[] arrayOfByte1 = new byte[paramZbi8.Zo];
    System.arraycopy(paramZbi8.Zu, paramZbi8.Zv, arrayOfByte1, 0, paramZbi8.Zo);
    byte[] arrayOfByte2 = Zvy.ZZ(arrayOfByte1);
    paramByteArrayOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
    paramZbi8.Zv += paramZbi8.Zo;
    paramZbi8.Zo = 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */