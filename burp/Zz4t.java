package burp;

import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class Zz4t {
  private static final Pattern ZB;
  
  private static final Set<Predicate<String>> ZX;
  
  private static final Zma ZE;
  
  private final Supplier<Ztwh> Zx;
  
  public Zz4t(Supplier<Ztwh> paramSupplier) {
    this.Zx = paramSupplier;
  }
  
  Zsxd ZO(Zrnd paramZrnd, Zsxd paramZsxd) throws InterruptedException {
    // Byte code:
    //   0: aload_2
    //   1: astore #4
    //   3: invokestatic Zj : ()I
    //   6: iconst_0
    //   7: istore #5
    //   9: lconst_0
    //   10: lstore #6
    //   12: istore_3
    //   13: getstatic burp/Zz4t.ZE : Lburp/Zma;
    //   16: aload_2
    //   17: invokeinterface ZG : ()Lburp/Zg3d;
    //   22: invokeinterface Ze : ()Lburp/Zb6q;
    //   27: invokevirtual ZI : (Lburp/Zb6q;)Ljava/util/Optional;
    //   30: astore #8
    //   32: aload #8
    //   34: invokevirtual isPresent : ()Z
    //   37: ifeq -> 92
    //   40: lconst_0
    //   41: aload #8
    //   43: invokevirtual get : ()Ljava/lang/Object;
    //   46: checkcast java/lang/Long
    //   49: invokevirtual longValue : ()J
    //   52: invokestatic currentTimeMillis : ()J
    //   55: lsub
    //   56: invokestatic max : (JJ)J
    //   59: invokestatic ZJ : (J)V
    //   62: aload_1
    //   63: invokevirtual Zv : ()Lburp/Zsxd;
    //   66: astore #4
    //   68: aload_0
    //   69: aload #4
    //   71: invokevirtual ZM : (Lburp/Zsxd;)Z
    //   74: ifne -> 85
    //   77: iconst_1
    //   78: goto -> 86
    //   81: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   84: athrow
    //   85: iconst_0
    //   86: istore #5
    //   88: iload_3
    //   89: ifeq -> 167
    //   92: iconst_0
    //   93: istore #9
    //   95: iload #9
    //   97: iconst_5
    //   98: if_icmpge -> 167
    //   101: iload #5
    //   103: ifne -> 167
    //   106: ldc2_w 1000
    //   109: ldc2_w 2.0
    //   112: iload #9
    //   114: i2d
    //   115: invokestatic pow : (DD)D
    //   118: d2l
    //   119: lmul
    //   120: lstore #10
    //   122: lload #6
    //   124: lload #10
    //   126: ladd
    //   127: lstore #6
    //   129: lload #10
    //   131: invokestatic ZJ : (J)V
    //   134: aload_1
    //   135: invokevirtual Zv : ()Lburp/Zsxd;
    //   138: astore #4
    //   140: aload_0
    //   141: aload #4
    //   143: invokevirtual ZM : (Lburp/Zsxd;)Z
    //   146: ifne -> 157
    //   149: iconst_1
    //   150: goto -> 158
    //   153: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   156: athrow
    //   157: iconst_0
    //   158: istore #5
    //   160: iinc #9, 1
    //   163: iload_3
    //   164: ifeq -> 95
    //   167: iload #5
    //   169: ifeq -> 191
    //   172: getstatic burp/Zv8r.NETWORK_BACK_OFF_RECOVERY_TIME : Lburp/Zv8r;
    //   175: lload #6
    //   177: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   180: iload_3
    //   181: ifeq -> 206
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   190: athrow
    //   191: getstatic burp/Zv8r.NETWORK_BACK_OFF_FAILED_RECOVERY_TIME : Lburp/Zv8r;
    //   194: lload #6
    //   196: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
    //   205: athrow
    //   206: aload #4
    //   208: areturn
    // Exception table:
    //   from	to	target	type
    //   68	81	81	java/lang/InterruptedException
    //   140	153	153	java/lang/InterruptedException
    //   167	184	187	java/lang/InterruptedException
    //   172	199	202	java/lang/InterruptedException
  }
  
  boolean ZM(Zsxd paramZsxd) {
    if (!((Ztwh)this.Zx.get()).Zc() || paramZsxd == null || paramZsxd.ZG() == null || paramZsxd.ZG().Ze() == null || ZA(paramZsxd.ZG().ZL()))
      return false; 
    short s = paramZsxd.ZG().Ze().Ze();
    return ((Ztwh)this.Zx.get()).ZR().contains(Integer.valueOf(s));
  }
  
  static boolean ZA(Zefx paramZefx) {
    String str = paramZefx.ZF().Zd1() + paramZefx.ZF().Zd1();
    return ZX.stream().anyMatch(str::lambda$excludedFromAutoThrottle$1);
  }
  
  private static boolean lambda$excludedFromAutoThrottle$1(String paramString, Predicate<String> paramPredicate) {
    return paramPredicate.test(paramString);
  }
  
  private static boolean lambda$static$0(String paramString) {
    return ZB.matcher(paramString).matches();
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: ldc 'Y l2`Q v9q\ l3[dL!+v'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 153
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 127
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #120
    //   82: goto -> 111
    //   85: bipush #9
    //   87: goto -> 111
    //   90: bipush #120
    //   92: goto -> 111
    //   95: bipush #41
    //   97: goto -> 111
    //   100: iconst_2
    //   101: goto -> 111
    //   104: bipush #9
    //   106: goto -> 111
    //   109: bipush #80
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #1, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 33
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_1
    //   131: if_icmpgt -> 30
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
    //   153: aload_0
    //   154: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   157: putstatic burp/Zz4t.ZB : Ljava/util/regex/Pattern;
    //   160: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   165: invokestatic of : (Ljava/lang/Object;)Ljava/util/Set;
    //   168: putstatic burp/Zz4t.ZX : Ljava/util/Set;
    //   171: new burp/Zma
    //   174: dup
    //   175: new burp/Zrgd
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: invokespecial <init> : (Lburp/Zrgd;)V
    //   185: putstatic burp/Zz4t.ZE : Lburp/Zma;
    //   188: return
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */