package burp;

import java.io.ByteArrayOutputStream;

public class Ztf8 implements Ztr2 {
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
      Zr21.Zb(paramArrayOfint, arrayOfInt, byteArrayOutputStream, b);
      byte b1 = paramArrayOfbyte[b];
      switch (b1) {
        case 0:
          byteArrayOutputStream.write(37);
          byteArrayOutputStream.write(48);
          byteArrayOutputStream.write(48);
        case 13:
          byteArrayOutputStream.write(37);
          byteArrayOutputStream.write(48);
          byteArrayOutputStream.write(100);
        case 10:
          byteArrayOutputStream.write(37);
          byteArrayOutputStream.write(48);
          byteArrayOutputStream.write(97);
        default:
          byteArrayOutputStream.write(b1);
          break;
      } 
      b++;
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    Zr21.Zb(paramArrayOfint, arrayOfInt, byteArrayOutputStream, paramArrayOfbyte.length);
    paramArrayOfint[0] = arrayOfInt[0];
    paramArrayOfint[1] = arrayOfInt[1];
    return byteArrayOutputStream.toByteArray();
  }
  
  public byte[] Zp(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZD : ()[Lburp/Zbqc;
    //   11: iconst_0
    //   12: istore #4
    //   14: astore_2
    //   15: iload #4
    //   17: aload_1
    //   18: arraylength
    //   19: if_icmpge -> 157
    //   22: aload_1
    //   23: iload #4
    //   25: baload
    //   26: istore #5
    //   28: iload #5
    //   30: bipush #37
    //   32: if_icmpne -> 144
    //   35: aload_1
    //   36: arraylength
    //   37: iload #4
    //   39: iconst_2
    //   40: iadd
    //   41: if_icmple -> 144
    //   44: aload_1
    //   45: iload #4
    //   47: iconst_1
    //   48: iadd
    //   49: baload
    //   50: bipush #48
    //   52: if_icmpne -> 144
    //   55: aload_1
    //   56: iload #4
    //   58: iconst_2
    //   59: iadd
    //   60: baload
    //   61: lookupswitch default -> 134, 48 -> 96, 97 -> 121, 100 -> 108
    //   96: aload_3
    //   97: iconst_0
    //   98: invokevirtual write : (I)V
    //   101: iinc #4, 2
    //   104: aload_2
    //   105: ifnull -> 150
    //   108: aload_3
    //   109: bipush #13
    //   111: invokevirtual write : (I)V
    //   114: iinc #4, 2
    //   117: aload_2
    //   118: ifnull -> 150
    //   121: aload_3
    //   122: bipush #10
    //   124: invokevirtual write : (I)V
    //   127: iinc #4, 2
    //   130: aload_2
    //   131: ifnull -> 150
    //   134: aload_3
    //   135: iload #5
    //   137: invokevirtual write : (I)V
    //   140: aload_2
    //   141: ifnull -> 150
    //   144: aload_3
    //   145: iload #5
    //   147: invokevirtual write : (I)V
    //   150: iinc #4, 1
    //   153: aload_2
    //   154: ifnull -> 15
    //   157: aload_3
    //   158: invokevirtual toByteArray : ()[B
    //   161: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztf8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */