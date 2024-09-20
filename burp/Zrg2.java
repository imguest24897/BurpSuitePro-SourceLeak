package burp;

import net.portswigger.Zsy;

public class Zrg2 extends Zrgu {
  private final boolean Zn;
  
  private static Zbqc[] Zt;
  
  private static final String a;
  
  public Zrg2(Zbxv paramZbxv, Zsy paramZsy, Ze3n paramZe3n, Zxs7 paramZxs7, Zmhe paramZmhe, Zxzq paramZxzq, boolean paramBoolean) {
    super(paramZbxv, paramZsy, paramZe3n, paramZxs7, paramZmhe, paramZxzq);
    this.Zn = paramBoolean;
  }
  
  public void Z_(Zz4_ paramZz4_, Zgit paramZgit) {
    if (this.ZE.Zp(this.Zz.ZI)) {
      String str = ZR(3) + ZR(3) + "&" + ZR(3);
      if (this.Zn)
        str = "?" + str; 
      Zgit zgit = ZM(str, Zrn2.Zw);
      if (zgit != null) {
        this.ZE.Zn(this.Zz.ZI);
        this.Zz.Zc.Zc(this.Zg.ZN(), this.Zg.Za(), this.Zi, zgit, paramZz4_);
      } 
    } 
  }
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    Zt = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return Zt;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZD : ([Lburp/Zbqc;)V
    //   13: bipush #19
    //   15: ldc 'h'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zrg2.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #81
    //   94: goto -> 123
    //   97: bipush #74
    //   99: goto -> 123
    //   102: bipush #104
    //   104: goto -> 123
    //   107: iconst_4
    //   108: goto -> 123
    //   111: bipush #11
    //   113: goto -> 123
    //   116: bipush #10
    //   118: goto -> 123
    //   121: bipush #43
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */