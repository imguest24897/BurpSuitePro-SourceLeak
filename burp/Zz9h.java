package burp;

public class Zz9h implements Zxg_ {
  private final Zz9f Zo;
  
  private final Zgb6 ZN;
  
  private static final String a;
  
  public Zz9h(Zt4u paramZt4u, Zgb6 paramZgb6, Zslu paramZslu, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1j paramZr1j) {
    this.ZN = paramZgb6;
    Zm39 zm39 = paramZt4u.ZN().ZvB().ZmM();
    Zeek zeek = zm39.Zfr();
    this.Zo = new Zz9f(a, 2, zeek, paramZr_41, paramZr_42, paramZslu, paramZr1j);
    paramZgb6.Zd(this.Zo);
  }
  
  public Zz9f Zp() {
    return this.Zo;
  }
  
  public boolean Zt(Zefx paramZefx) {
    return this.ZN.Zfi() ? (!Zm(paramZefx)) : false;
  }
  
  public boolean Zm(Zefx paramZefx) {
    return (this.Zo.ZB(paramZefx.ZT()) && this.Zo.ZG(paramZefx.ZF()));
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '?'O$\\bl:Q(v<{J/},!J/6  z.\\rG<6U$4j*$@2k'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz9h.a : Ljava/lang/String;
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
    //   80: bipush #121
    //   82: goto -> 112
    //   85: bipush #99
    //   87: goto -> 112
    //   90: bipush #69
    //   92: goto -> 112
    //   95: bipush #19
    //   97: goto -> 112
    //   100: bipush #119
    //   102: goto -> 112
    //   105: bipush #93
    //   107: goto -> 112
    //   110: bipush #46
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */