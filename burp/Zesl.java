package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zesl implements Zr50 {
  private final Socket Zg;
  
  private final Zl7q Zq;
  
  private final Zspe Zr;
  
  private static final String a;
  
  public Zesl(Socket paramSocket, Zl7q paramZl7q, Zspe paramZspe) {
    this.Zg = paramSocket;
    this.Zq = paramZl7q;
    this.Zr = paramZspe;
  }
  
  public void ZS(Zefx paramZefx) throws IOException {
    byte[] arrayOfByte = paramZefx.Zb().ZD();
    OutputStream outputStream = this.Zg.getOutputStream();
    outputStream.write(arrayOfByte, 0, arrayOfByte.length - 1);
    outputStream.flush();
    try {
      this.Zr.ZL();
    } catch (Zs92 zs92) {
      Zah.Zl(zs92, Zk_.RETHROWN);
      throw new IOException(a, zs92);
    } 
    Zsk5.Ze(this.Zq.ZE());
    outputStream.write(arrayOfByte, arrayOfByte.length - 1, 1);
    outputStream.flush();
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc '[rK"Z$g3O?C$xgQY7X"caD'L zDnP bN'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zesl.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #79
    //   82: goto -> 111
    //   85: bipush #87
    //   87: goto -> 111
    //   90: bipush #53
    //   92: goto -> 111
    //   95: bipush #110
    //   97: goto -> 111
    //   100: bipush #10
    //   102: goto -> 111
    //   105: bipush #114
    //   107: goto -> 111
    //   110: iconst_5
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */