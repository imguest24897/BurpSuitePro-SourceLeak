package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Zs {
  private static final byte[] ZO;
  
  private static final String a;
  
  public static String Zz(File paramFile) throws NoSuchAlgorithmException, IOException {
    MessageDigest messageDigest = MessageDigest.getInstance(a);
    DigestInputStream digestInputStream = new DigestInputStream(new BufferedInputStream(new FileInputStream(paramFile)), messageDigest);
    try {
      while (digestInputStream.read() != -1);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw a(null);
    } 
    digestInputStream.close();
    return Zd(messageDigest.digest());
  }
  
  private static String Zd(byte[] paramArrayOfbyte) {
    String str = DevtoolsBinariesInfo.ZW();
    if (paramArrayOfbyte == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      short s = (short)(0xFF & b1);
      stringBuilder.append((char)ZO[s / 16]);
      stringBuilder.append((char)ZO[s % 16]);
      b++;
      if (str == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc ' k_'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zs.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #55
    //   87: goto -> 112
    //   90: bipush #114
    //   92: goto -> 112
    //   95: bipush #125
    //   97: goto -> 112
    //   100: bipush #56
    //   102: goto -> 112
    //   105: bipush #87
    //   107: goto -> 112
    //   110: bipush #73
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: bipush #16
    //   156: newarray byte
    //   158: dup
    //   159: iconst_0
    //   160: bipush #48
    //   162: bastore
    //   163: dup
    //   164: iconst_1
    //   165: bipush #49
    //   167: bastore
    //   168: dup
    //   169: iconst_2
    //   170: bipush #50
    //   172: bastore
    //   173: dup
    //   174: iconst_3
    //   175: bipush #51
    //   177: bastore
    //   178: dup
    //   179: iconst_4
    //   180: bipush #52
    //   182: bastore
    //   183: dup
    //   184: iconst_5
    //   185: bipush #53
    //   187: bastore
    //   188: dup
    //   189: bipush #6
    //   191: bipush #54
    //   193: bastore
    //   194: dup
    //   195: bipush #7
    //   197: bipush #55
    //   199: bastore
    //   200: dup
    //   201: bipush #8
    //   203: bipush #56
    //   205: bastore
    //   206: dup
    //   207: bipush #9
    //   209: bipush #57
    //   211: bastore
    //   212: dup
    //   213: bipush #10
    //   215: bipush #97
    //   217: bastore
    //   218: dup
    //   219: bipush #11
    //   221: bipush #98
    //   223: bastore
    //   224: dup
    //   225: bipush #12
    //   227: bipush #99
    //   229: bastore
    //   230: dup
    //   231: bipush #13
    //   233: bipush #100
    //   235: bastore
    //   236: dup
    //   237: bipush #14
    //   239: bipush #101
    //   241: bastore
    //   242: dup
    //   243: bipush #15
    //   245: bipush #102
    //   247: bastore
    //   248: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zs.ZO : [B
    //   251: return
  }
  
  private static NoSuchAlgorithmException a(NoSuchAlgorithmException paramNoSuchAlgorithmException) {
    return paramNoSuchAlgorithmException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */