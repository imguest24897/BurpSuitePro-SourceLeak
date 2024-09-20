package burp;

import java.io.ByteArrayOutputStream;

class Zgn extends Zgj {
  private static byte[] ZM = new byte[] { 
      48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
      97, 98, 99, 100, 101, 102 };
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    paramByteArrayOutputStream.write(37);
    short s = (short)(0xFF & paramZbi8.Zu[paramZbi8.Zv]);
    paramByteArrayOutputStream.write(ZM[s / 16]);
    paramByteArrayOutputStream.write(ZM[s % 16]);
    paramZbi8.Zv++;
    paramZbi8.Zo--;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */