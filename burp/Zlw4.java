package burp;

public class Zlw4 implements Zrb2 {
  private final Zxs7 ZF;
  
  private final Zlk4 Zj;
  
  private static final String a;
  
  public Zlw4(Zxs7 paramZxs7, Zlk4 paramZlk4) {
    this.ZF = paramZxs7;
    this.Zj = paramZlk4;
  }
  
  public String Zd() {
    return a;
  }
  
  public byte Zz() {
    return 4;
  }
  
  public byte Zq() {
    return 0;
  }
  
  public boolean Zw() {
    return (this.ZF.Zy() && this.Zj.ZH(Zlk4.NORMAL));
  }
  
  static {
    // Byte code:
    //   0: bipush #80
    //   2: ldc '@4,\Sz\\bmrZSr/U *\\b'exq\[7oS4lT\\b<n=STA7#X&sZN06x`q35>H%cqrWjM82//U &}'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlw4.a : Ljava/lang/String;
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
    //   80: bipush #33
    //   82: goto -> 111
    //   85: bipush #77
    //   87: goto -> 111
    //   90: bipush #71
    //   92: goto -> 111
    //   95: bipush #101
    //   97: goto -> 111
    //   100: bipush #101
    //   102: goto -> 111
    //   105: iconst_2
    //   106: goto -> 111
    //   109: bipush #91
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */