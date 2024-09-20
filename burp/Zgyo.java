package burp;

import java.io.IOException;

public class Zgyo {
  private static final String a;
  
  public static byte[] ZJ(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Zgyo.a : Ljava/lang/String;
    //   4: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   7: ifne -> 18
    //   10: iconst_1
    //   11: goto -> 19
    //   14: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   17: athrow
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   22: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   25: ldc burp/Zgyo
    //   27: aload_0
    //   28: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnonnull -> 50
    //   36: iconst_0
    //   37: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   40: aload_0
    //   41: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   44: aconst_null
    //   45: areturn
    //   46: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   49: athrow
    //   50: sipush #4096
    //   53: newarray byte
    //   55: astore_3
    //   56: new java/io/ByteArrayOutputStream
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: astore #4
    //   65: aload_1
    //   66: aload_3
    //   67: iconst_0
    //   68: sipush #4096
    //   71: invokevirtual read : ([BII)I
    //   74: dup
    //   75: istore_2
    //   76: iconst_m1
    //   77: if_icmpeq -> 95
    //   80: aload #4
    //   82: aload_3
    //   83: iconst_0
    //   84: iload_2
    //   85: invokevirtual write : ([BII)V
    //   88: goto -> 65
    //   91: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   94: athrow
    //   95: aload #4
    //   97: invokevirtual toByteArray : ()[B
    //   100: astore #5
    //   102: aload_1
    //   103: invokevirtual close : ()V
    //   106: goto -> 119
    //   109: astore #6
    //   111: aload #6
    //   113: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   116: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   119: aload #5
    //   121: areturn
    //   122: astore_2
    //   123: aload_2
    //   124: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   127: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   130: aload_1
    //   131: invokevirtual close : ()V
    //   134: goto -> 170
    //   137: astore_2
    //   138: aload_2
    //   139: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   142: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   145: goto -> 170
    //   148: astore #7
    //   150: aload_1
    //   151: invokevirtual close : ()V
    //   154: goto -> 167
    //   157: astore #8
    //   159: aload #8
    //   161: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   164: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   167: aload #7
    //   169: athrow
    //   170: aconst_null
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   0	14	14	java/io/IOException
    //   32	46	46	java/io/IOException
    //   50	102	122	java/lang/Exception
    //   50	102	148	finally
    //   76	91	91	java/io/IOException
    //   102	106	109	java/io/IOException
    //   122	130	148	finally
    //   130	134	137	java/io/IOException
    //   148	150	148	finally
    //   150	154	157	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: ldc '"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgyo.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_1
    //   81: goto -> 111
    //   84: bipush #40
    //   86: goto -> 111
    //   89: bipush #93
    //   91: goto -> 111
    //   94: bipush #55
    //   96: goto -> 111
    //   99: bipush #20
    //   101: goto -> 111
    //   104: bipush #10
    //   106: goto -> 111
    //   109: bipush #38
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
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
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */