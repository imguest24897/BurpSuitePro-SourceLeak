package net.portswigger;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

public final class Zku {
  private static KeyFactory ZY;
  
  public static PublicKey ZQ(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return ZA(new BigInteger(paramArrayOfbyte1), new BigInteger(paramArrayOfbyte2));
  }
  
  public static PublicKey ZA(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(paramBigInteger1, paramBigInteger2);
    PublicKey publicKey = null;
    try {
      if (ZY != null)
        publicKey = ZY.generatePublic(rSAPublicKeySpec); 
    } catch (InvalidKeySpecException invalidKeySpecException) {
      Zah.Zl(invalidKeySpecException, Zk_.UNEXPECTED);
    } 
    return publicKey;
  }
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc ';y+'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 153
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
    //   27: if_icmpgt -> 127
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #7
    //   82: goto -> 111
    //   85: bipush #68
    //   87: goto -> 111
    //   90: iconst_4
    //   91: goto -> 111
    //   94: bipush #49
    //   96: goto -> 111
    //   99: bipush #58
    //   101: goto -> 111
    //   104: bipush #119
    //   106: goto -> 111
    //   109: bipush #88
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #1, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 33
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_1
    //   131: if_icmpgt -> 30
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: aload_0
    //   154: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   157: putstatic net/portswigger/Zku.ZY : Ljava/security/KeyFactory;
    //   160: goto -> 171
    //   163: astore_2
    //   164: aload_2
    //   165: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   168: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   171: return
    // Exception table:
    //   from	to	target	type
    //   153	160	163	java/security/NoSuchAlgorithmException
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */