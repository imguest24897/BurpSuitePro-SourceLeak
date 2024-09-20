package burp;

import java.util.ArrayList;
import java.util.List;

public class Zt5x implements Zmno {
  private final Zbnt Zx;
  
  private final List<Zs6y> ZS;
  
  private static final String a;
  
  public Zt5x(Zbnt paramZbnt) {
    this.Zx = paramZbnt;
    this.ZS = new ArrayList<>();
  }
  
  public void ZT(Zsxd paramZsxd) {
    if (paramZsxd.Zz().Zb() == Zvom.RESPONSE_RECEIVED)
      this.ZS.add(Za(paramZsxd)); 
  }
  
  public boolean ZJ(Zsxd paramZsxd) {
    // Byte code:
    //   0: invokestatic ZY : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZS : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: iconst_3
    //   14: if_icmpge -> 39
    //   17: iconst_0
    //   18: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   21: aload_0
    //   22: getfield ZS : Ljava/util/List;
    //   25: invokeinterface size : ()I
    //   30: i2l
    //   31: getstatic burp/Zt5x.a : Ljava/lang/String;
    //   34: invokestatic ZY : (ZLnet/portswigger/Zqf;JLjava/lang/String;)V
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_1
    //   40: invokeinterface ZX : ()Ljava/util/List;
    //   45: invokeinterface isEmpty : ()Z
    //   50: ifne -> 70
    //   53: aload_1
    //   54: invokeinterface Zz : ()Lburp/Zg3d;
    //   59: invokeinterface Zb : ()Lburp/Zvom;
    //   64: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   67: if_acmpeq -> 72
    //   70: iconst_0
    //   71: ireturn
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual Za : (Lburp/Zsxd;)Lburp/Zs6y;
    //   77: astore_3
    //   78: getstatic burp/Zlug.RESPONSE_ATTRIBUTES : Ljava/util/Set;
    //   81: invokeinterface iterator : ()Ljava/util/Iterator;
    //   86: astore #4
    //   88: aload #4
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 210
    //   98: aload #4
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast burp/Zlug
    //   108: astore #5
    //   110: iconst_1
    //   111: istore #6
    //   113: aload_0
    //   114: getfield ZS : Ljava/util/List;
    //   117: iconst_0
    //   118: invokeinterface get : (I)Ljava/lang/Object;
    //   123: checkcast burp/Zs6y
    //   126: aload #5
    //   128: invokevirtual Zi : (Lburp/Zlug;)I
    //   131: istore #7
    //   133: iconst_1
    //   134: istore #8
    //   136: iload #8
    //   138: aload_0
    //   139: getfield ZS : Ljava/util/List;
    //   142: invokeinterface size : ()I
    //   147: if_icmpge -> 188
    //   150: aload_0
    //   151: getfield ZS : Ljava/util/List;
    //   154: iload #8
    //   156: invokeinterface get : (I)Ljava/lang/Object;
    //   161: checkcast burp/Zs6y
    //   164: aload #5
    //   166: invokevirtual Zi : (Lburp/Zlug;)I
    //   169: iload #7
    //   171: if_icmpeq -> 181
    //   174: iconst_0
    //   175: istore #6
    //   177: aload_2
    //   178: ifnull -> 188
    //   181: iinc #8, 1
    //   184: aload_2
    //   185: ifnull -> 136
    //   188: iload #6
    //   190: ifeq -> 206
    //   193: aload_3
    //   194: aload #5
    //   196: invokevirtual Zi : (Lburp/Zlug;)I
    //   199: iload #7
    //   201: if_icmpeq -> 206
    //   204: iconst_0
    //   205: ireturn
    //   206: aload_2
    //   207: ifnull -> 88
    //   210: iconst_1
    //   211: ireturn
  }
  
  private Zs6y Za(Zsxd paramZsxd) {
    Zg3d zg3d = paramZsxd.Zz();
    Zs68 zs68 = Zbwc.Zt(zg3d.ZL().ZF(), zg3d.Ze().Za(), Zt0k.NO_HTML_ANALYSIS, this.Zx);
    return (new Zk1s()).Zx(zg3d.Ze().Za(), zs68).ZF();
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: ldc 'reG*b1d~Ulm;fuS<y;uc8dr\\bn}Q-y7KryE)+1sbH(d KsuR<d<d0U#'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zt5x.a : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #80
    //   82: goto -> 111
    //   85: bipush #105
    //   87: goto -> 111
    //   90: iconst_3
    //   91: goto -> 111
    //   94: bipush #18
    //   96: goto -> 111
    //   99: bipush #35
    //   101: goto -> 111
    //   104: bipush #78
    //   106: goto -> 111
    //   109: bipush #9
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
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
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */