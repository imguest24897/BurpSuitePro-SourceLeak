package burp;

import java.util.Objects;

public class Zes5 {
  public final String Zo;
  
  public final String ZK;
  
  private final Zefg<Zmwr> Zk;
  
  private static Zbqc[] ZY;
  
  private static final String a;
  
  public Zes5(Zefg<Zmwr> paramZefg, String paramString1, String paramString2) {
    this.Zk = paramZefg;
    this.Zo = paramString1;
    this.ZK = paramString2;
  }
  
  public boolean Zy(Zlou paramZlou) {
    return (this.Zk == null) ? true : this.Zk.stream().filter(Objects::nonNull).filter(paramZlou::lambda$isHiddenField$0).anyMatch(Zes5::Zb);
  }
  
  private static boolean Zb(Zmwr paramZmwr) {
    return (paramZmwr.ZhK() == Zl2w.HIDDEN) ? true : ((paramZmwr.ZhB() != null && paramZmwr.ZhB().ZlP() != null && paramZmwr.ZhB().ZlP().ZJP() != null) ? paramZmwr.ZhB().ZlP().ZJP().containsKey(a) : false);
  }
  
  private static boolean lambda$isHiddenField$0(Zlou paramZlou, Zmwr paramZmwr) {
    return paramZlou.ZA.equalsIgnoreCase(paramZmwr.Zh4());
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zy() {
    return ZY;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zy : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_1
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zp : ([Lburp/Zbqc;)V
    //   13: bipush #92
    //   15: ldc 'b%PArm'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zes5.a : Ljava/lang/String;
    //   24: goto -> 166
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
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #86
    //   94: goto -> 124
    //   97: bipush #16
    //   99: goto -> 124
    //   102: bipush #104
    //   104: goto -> 124
    //   107: bipush #121
    //   109: goto -> 124
    //   112: bipush #75
    //   114: goto -> 124
    //   117: bipush #95
    //   119: goto -> 124
    //   122: bipush #124
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zes5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */