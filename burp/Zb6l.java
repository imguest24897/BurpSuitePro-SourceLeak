package burp;

import net.portswigger.Zie;

public class Zb6l {
  private final Zec4 ZX;
  
  private final Object ZI;
  
  private static final String a;
  
  public Zb6l(Zec4 paramZec4, Object paramObject) {
    this.ZX = paramZec4;
    this.ZI = paramObject;
  }
  
  public Zb6l(Zec4 paramZec4) {
    this(paramZec4, null);
  }
  
  public int ZR() {
    return this.ZX.ZY();
  }
  
  public String ZX() {
    return this.ZX.Za().ZB(new Object[] { this.ZI });
  }
  
  public boolean Zh() {
    return this.ZX.Zz();
  }
  
  public String Z_(Zskh paramZskh, Zra1 paramZra1) {
    return this.ZX.Za().Zl((paramZskh != null && Zh()) ? paramZskh : Zskh.Zo, Zkqn.INFORMATION, Zie.UNSPECIFIED, (paramZra1 == Zra1.EXECUTION_MODE_DESKTOP) ? a : "", new Object[] { this.ZI });
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc '\\br:a !Y,r<ye!\\f=3;}e'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb6l.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #24
    //   82: goto -> 110
    //   85: bipush #83
    //   87: goto -> 110
    //   90: bipush #15
    //   92: goto -> 110
    //   95: bipush #82
    //   97: goto -> 110
    //   100: iconst_5
    //   101: goto -> 110
    //   104: iconst_5
    //   105: goto -> 110
    //   108: bipush #57
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */