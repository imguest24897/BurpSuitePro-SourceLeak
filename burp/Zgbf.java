package burp;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import net.portswigger.Ztu;

public class Zgbf implements Ztr2 {
  private final Map<Byte, byte[]> ZR = (Map)new HashMap<>();
  
  public byte[] ZD(byte[] paramArrayOfbyte) {
    return Zx(paramArrayOfbyte, new int[] { 0, paramArrayOfbyte.length });
  }
  
  public byte[] Zx(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramArrayOfint[0];
    arrayOfInt[1] = paramArrayOfint[1];
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zr21.ZD();
    while (b < paramArrayOfbyte.length) {
      byte[] arrayOfByte;
      ZR(paramArrayOfint, arrayOfInt, byteArrayOutputStream, b);
      byte b1 = paramArrayOfbyte[b];
      switch (b1) {
        case 32:
        case 34:
        case 35:
        case 37:
        case 38:
        case 43:
        case 44:
        case 58:
        case 59:
        case 60:
        case 61:
        case 62:
        case 63:
        case 92:
        case 94:
        case 96:
        case 123:
        case 124:
        case 125:
          ZU(byteArrayOutputStream, b1);
        default:
          arrayOfByte = this.ZR.get(Byte.valueOf(b1));
      } 
      b++;
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    ZR(paramArrayOfint, arrayOfInt, byteArrayOutputStream, paramArrayOfbyte.length);
    paramArrayOfint[0] = arrayOfInt[0];
    paramArrayOfint[1] = arrayOfInt[1];
    if (Zbqc.Zwu() == null)
      Zr21.Zv(new Zbqc[4]); 
    return byteArrayOutputStream.toByteArray();
  }
  
  private void ZR(int[] paramArrayOfint1, int[] paramArrayOfint2, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramByteArrayOutputStream.size(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramByteArrayOutputStream.size(); 
  }
  
  private boolean ZJ(byte paramByte) {
    return (paramByte < 32 || paramByte >= Byte.MAX_VALUE);
  }
  
  private void ZU(ByteArrayOutputStream paramByteArrayOutputStream, byte paramByte) {
    paramByteArrayOutputStream.write(37);
    short s = (short)(0xFF & paramByte);
    paramByteArrayOutputStream.write(Ztu.Ze[s / 16]);
    paramByteArrayOutputStream.write(Ztu.Ze[s % 16]);
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    return Ztu.ZS(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */