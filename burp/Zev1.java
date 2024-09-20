package burp;

import java.io.File;

public class Zev1 extends Zev3 {
  public final File Zv;
  
  private static final String a;
  
  Zev1(File paramFile) {
    super(a);
    this.Zv = paramFile;
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc '\\b]~])ij,,jW/\\rMcz+m|>Mi.Yj<|.H8oz,,oV.^b`W>^,{K/C'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zev1.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #34
    //   82: goto -> 111
    //   85: bipush #22
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #21
    //   96: goto -> 111
    //   99: bipush #100
    //   101: goto -> 111
    //   104: bipush #102
    //   106: goto -> 111
    //   109: bipush #80
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zev1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */