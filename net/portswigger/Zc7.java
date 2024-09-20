package net.portswigger;

import burp.Zbqc;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Zc7 {
  private static String ZQ;
  
  private static final String b;
  
  public static void Zd(ByteArrayOutputStream paramByteArrayOutputStream, byte[]... paramVarArgs) {
    byte[][] arrayOfByte = paramVarArgs;
    int i = arrayOfByte.length;
    byte b = 0;
    String str = ZD();
    while (b < i) {
      byte[] arrayOfByte1 = arrayOfByte[b];
      paramByteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      b++;
      if (str != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zm("aZ2gyb"); 
  }
  
  public static byte[] Zs(InputStream paramInputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    BufferedInputStream bufferedInputStream = new BufferedInputStream(paramInputStream);
    byte[] arrayOfByte = new byte[4096];
    while (true) {
      int i;
      try {
        if ((i = bufferedInputStream.read(arrayOfByte)) != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return byteArrayOutputStream.toByteArray();
    } 
  }
  
  public static byte[] Zz(InputStream paramInputStream, int paramInt) throws IOException {
    byte[] arrayOfByte = new byte[paramInt];
    String str = ZD();
    int i = 0;
    while (i < paramInt) {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      try {
        if (j == -1)
          throw new IOException(b); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      i += j;
      if (str != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    return arrayOfByte;
  }
  
  public static void Zm(String paramString) {
    ZQ = paramString;
  }
  
  public static String ZD() {
    return ZQ;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'x5B9Mc'
    //   8: invokestatic Zm : (Ljava/lang/String;)V
    //   11: bipush #39
    //   13: ldc '2 ULn'CW\\n(:GfO\\b:T\e'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic net/portswigger/Zc7.b : Ljava/lang/String;
    //   22: goto -> 165
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 139
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #92
    //   94: goto -> 123
    //   97: bipush #105
    //   99: goto -> 123
    //   102: iconst_1
    //   103: goto -> 123
    //   106: bipush #30
    //   108: goto -> 123
    //   111: bipush #89
    //   113: goto -> 123
    //   116: bipush #47
    //   118: goto -> 123
    //   121: bipush #72
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 46
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 43
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 19
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */