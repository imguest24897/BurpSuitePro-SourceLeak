package burp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxkn extends Zxkx {
  private final byte[] Zj;
  
  private InputStream ZX;
  
  Zxkn(String paramString) {
    try {
      this.ZX = new BufferedInputStream(new FileInputStream(paramString));
    } catch (FileNotFoundException fileNotFoundException) {
      Zah.Zl(fileNotFoundException, Zk_.IGNORED);
    } 
    this.Zj = new byte[128];
  }
  
  protected byte[] ZP() {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZX : Ljava/io/InputStream;
    //   8: ifnonnull -> 17
    //   11: aconst_null
    //   12: areturn
    //   13: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   16: athrow
    //   17: aload_0
    //   18: getfield ZX : Ljava/io/InputStream;
    //   21: invokevirtual read : ()I
    //   24: istore_2
    //   25: iload_2
    //   26: bipush #10
    //   28: if_icmpeq -> 17
    //   31: iload_2
    //   32: bipush #13
    //   34: if_icmpeq -> 17
    //   37: goto -> 40
    //   40: iconst_0
    //   41: istore_3
    //   42: iload_3
    //   43: sipush #128
    //   46: if_icmpge -> 113
    //   49: iload_2
    //   50: lookupswitch default -> 90, -1 -> 84, 10 -> 86, 13 -> 86
    //   84: aconst_null
    //   85: areturn
    //   86: aload_1
    //   87: ifnonnull -> 113
    //   90: aload_0
    //   91: getfield Zj : [B
    //   94: iload_3
    //   95: iload_2
    //   96: i2b
    //   97: bastore
    //   98: aload_0
    //   99: getfield ZX : Ljava/io/InputStream;
    //   102: invokevirtual read : ()I
    //   105: istore_2
    //   106: iinc #3, 1
    //   109: aload_1
    //   110: ifnonnull -> 42
    //   113: iload_3
    //   114: ifle -> 125
    //   117: iconst_1
    //   118: goto -> 126
    //   121: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   124: athrow
    //   125: iconst_0
    //   126: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   129: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   132: iload_3
    //   133: newarray byte
    //   135: astore #4
    //   137: aload_0
    //   138: getfield Zj : [B
    //   141: iconst_0
    //   142: aload #4
    //   144: iconst_0
    //   145: iload_3
    //   146: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   149: aload #4
    //   151: areturn
    //   152: astore_2
    //   153: aload_2
    //   154: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   157: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   160: aconst_null
    //   161: areturn
    // Exception table:
    //   from	to	target	type
    //   4	13	13	java/io/IOException
    //   17	85	152	java/io/IOException
    //   86	151	152	java/io/IOException
    //   113	121	121	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */