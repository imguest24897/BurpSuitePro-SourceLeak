package burp;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import net.portswigger.Zah;
import net.portswigger.Zk_;

final class Zgzc extends Record {
  private final byte[] zaV;
  
  private final X509Certificate zai;
  
  static Zgzc ZH;
  
  private static final String a;
  
  Zgzc(byte[] paramArrayOfbyte, X509Certificate paramX509Certificate) {
    this.zaV = paramArrayOfbyte;
    this.zai = paramX509Certificate;
  }
  
  static Zgzc Zw(Zstu paramZstu) {
    return Zl(paramZstu.ZiD());
  }
  
  static Zgzc Zl(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte != null)
        try {
          if (paramArrayOfbyte.length != 0)
            try {
              ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
              X509Certificate x509Certificate = (X509Certificate)CertificateFactory.getInstance(a).generateCertificate(byteArrayInputStream);
              return new Zgzc(paramArrayOfbyte, x509Certificate);
            } catch (CertificateException certificateException) {
              Zah.Zl(certificateException, Zk_.COMMON_RUNTIME_FAILURE);
              return ZH;
            }  
          return ZH;
        } catch (CertificateException certificateException) {
          throw a(null);
        }  
    } catch (CertificateException certificateException) {
      throw a(null);
    } 
    return ZH;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgzc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgzc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgzc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public byte[] ZaV() {
    return this.zaV;
  }
  
  public X509Certificate Zai() {
    return this.zai;
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: ldc ''.O'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgzc.a : Ljava/lang/String;
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
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #73
    //   87: goto -> 112
    //   90: bipush #102
    //   92: goto -> 112
    //   95: bipush #14
    //   97: goto -> 112
    //   100: bipush #42
    //   102: goto -> 112
    //   105: bipush #37
    //   107: goto -> 112
    //   110: bipush #54
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
    //   154: new burp/Zgzc
    //   157: dup
    //   158: aconst_null
    //   159: aconst_null
    //   160: invokespecial <init> : ([BLjava/security/cert/X509Certificate;)V
    //   163: putstatic burp/Zgzc.ZH : Lburp/Zgzc;
    //   166: return
  }
  
  private static CertificateException a(CertificateException paramCertificateException) {
    return paramCertificateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */