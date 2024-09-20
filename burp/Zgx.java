package burp;

import java.io.ByteArrayOutputStream;

class Zgx extends Zgj {
  private static byte[] Zw = new byte[] { 
      48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
      97, 98, 99, 100, 101, 102 };
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(35);
    paramByteArrayOutputStream.write(120);
    short s = (short)(0xFF & paramZbi8.Zu[paramZbi8.Zv]);
    paramByteArrayOutputStream.write(Zw[s / 16]);
    paramByteArrayOutputStream.write(Zw[s % 16]);
    paramByteArrayOutputStream.write(59);
    paramZbi8.Zv++;
    paramZbi8.Zo--;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */