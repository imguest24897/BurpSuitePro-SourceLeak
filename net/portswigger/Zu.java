package net.portswigger;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;

public final class Zu {
  private static KeyFactory ZV;
  
  public static PrivateKey ZV(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return ZF(new BigInteger(paramArrayOfbyte1), new BigInteger(paramArrayOfbyte2));
  }
  
  public static PrivateKey ZF(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    RSAPrivateKeySpec rSAPrivateKeySpec = new RSAPrivateKeySpec(paramBigInteger1, paramBigInteger2);
    PrivateKey privateKey = null;
    try {
      if (ZV != null)
        privateKey = ZV.generatePrivate(rSAPrivateKeySpec); 
    } catch (InvalidKeySpecException invalidKeySpecException) {
      Zah.Zl(invalidKeySpecException, Zk_.UNEXPECTED);
    } 
    return privateKey;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: ldc '5U\\n'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #108
    //   82: goto -> 112
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #64
    //   92: goto -> 112
    //   95: bipush #98
    //   97: goto -> 112
    //   100: bipush #75
    //   102: goto -> 112
    //   105: bipush #83
    //   107: goto -> 112
    //   110: bipush #23
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   158: putstatic net/portswigger/Zu.ZV : Ljava/security/KeyFactory;
    //   161: goto -> 172
    //   164: astore_2
    //   165: aload_2
    //   166: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   169: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   172: return
    // Exception table:
    //   from	to	target	type
    //   154	161	164	java/security/NoSuchAlgorithmException
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */