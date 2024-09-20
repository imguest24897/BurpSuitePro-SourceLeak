package burp;

import java.io.ByteArrayOutputStream;

public class Zt56 implements Ztr2 {
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int[] arrayOfInt = new int[2];
    Zbqc[] arrayOfZbqc = Zr21.ZD();
    arrayOfInt[0] = paramArrayOfint[0];
    arrayOfInt[1] = paramArrayOfint[1];
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      ZP(paramArrayOfint, arrayOfInt, byteArrayOutputStream, b);
      byte b1 = paramArrayOfbyte[b];
      if (b1 == 34)
        byteArrayOutputStream.write(92); 
      byteArrayOutputStream.write(b1);
      b++;
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    ZP(paramArrayOfint, arrayOfInt, byteArrayOutputStream, paramArrayOfbyte.length);
    paramArrayOfint[0] = arrayOfInt[0];
    paramArrayOfint[1] = arrayOfInt[1];
    return byteArrayOutputStream.toByteArray();
  }
  
  private void ZP(int[] paramArrayOfint1, int[] paramArrayOfint2, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramByteArrayOutputStream.size(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramByteArrayOutputStream.size(); 
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zr21.ZD();
    while (b < paramArrayOfbyte.length) {
      byte b1 = paramArrayOfbyte[b];
      if (b1 == 92 && b < paramArrayOfbyte.length - 1 && paramArrayOfbyte[b + 1] == 34) {
        b++;
        b1 = 34;
      } 
      byteArrayOutputStream.write(b1);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt56.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */