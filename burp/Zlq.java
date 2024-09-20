package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zlq extends Zl2 {
  private final AuditInsertionPoint Zk;
  
  private final Zshh Zh;
  
  final Zg_8 ZF;
  
  private static final String c;
  
  Zlq(Zg_8 paramZg_8, AuditInsertionPoint paramAuditInsertionPoint, Zshh paramZshh) {
    super(paramZshh);
    this.Zk = paramAuditInsertionPoint;
    this.Zh = paramZshh;
  }
  
  protected byte[] Zx(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    try {
      HttpRequest httpRequest = this.Zk.buildHttpRequestWithPayload(this.ZF.ZO.ZI(paramArrayOfbyte));
      try {
        if (httpRequest == null)
          throw new NullPointerException(c); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return httpRequest.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZF.Zs.ZN(throwable, this.ZF.ZS);
      return this.Zh.ZK();
    } 
  }
  
  protected int[] ZJ(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    try {
      List<Range> list = this.Zk.issueHighlights(this.ZF.ZO.ZI(paramArrayOfbyte));
      try {
        if (list == null || list.isEmpty())
          return null; 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Range range = list.getFirst();
      return new int[] { range.startIndexInclusive(), range.endIndexExclusive() };
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZF.Zs.ZN(throwable, this.ZF.ZS);
      return null;
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: ldc '2ms-RE@kc6NE@jgxT]\\f&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlq.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #68
    //   82: goto -> 111
    //   85: bipush #44
    //   87: goto -> 111
    //   90: bipush #38
    //   92: goto -> 111
    //   95: bipush #124
    //   97: goto -> 111
    //   100: bipush #68
    //   102: goto -> 111
    //   105: iconst_5
    //   106: goto -> 111
    //   109: bipush #21
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */