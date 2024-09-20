package burp;

import java.util.Optional;

public class Zleg {
  private final Zz1i ZO;
  
  private final Zbza Zj;
  
  private final Ztpx ZW;
  
  private final Zb4u Zu;
  
  private final Zz3j Zp;
  
  private Zsc2 Zz;
  
  private Zleg(Zz1i paramZz1i, Zbza paramZbza, Ztpx paramZtpx, Zb4u paramZb4u, Zz3j paramZz3j) {
    this.ZO = paramZz1i;
    this.Zj = paramZbza;
    this.ZW = paramZtpx;
    this.Zu = paramZb4u;
    this.Zp = paramZz3j;
  }
  
  static Zleg Zn(Zz1i paramZz1i, Ze3n paramZe3n, Ztpx paramZtpx, Zb4u paramZb4u, Zz3j paramZz3j) {
    try {
    
    } catch (Zscy zscy) {
      throw a(null);
    } 
    Zbza zbza = (paramZe3n != null) ? paramZe3n.ZM() : null;
    return new Zleg(paramZz1i, zbza, paramZtpx, paramZb4u, paramZz3j);
  }
  
  public Zsxd ZM(Zefx paramZefx, Ze45 paramZe45) throws Exception {
    return Zx(paramZefx, paramZe45, null);
  }
  
  public Zsxd Zx(Zefx paramZefx, Ze45 paramZe45, String paramString) throws Exception {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZO : Lburp/Zz1i;
    //   9: invokeinterface ZHD : ()Lburp/Zefk;
    //   14: invokeinterface ZQK : ()I
    //   19: pop
    //   20: aload_0
    //   21: getfield Zj : Lburp/Zbza;
    //   24: ifnull -> 43
    //   27: aload_0
    //   28: getfield Zj : Lburp/Zbza;
    //   31: invokeinterface ZgM : ()V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   42: athrow
    //   43: aload_0
    //   44: getfield ZW : Lburp/Ztpx;
    //   47: aload_0
    //   48: getfield Zp : Lburp/Zz3j;
    //   51: aload_0
    //   52: aload_1
    //   53: aload_2
    //   54: aload_3
    //   55: <illegal opcode> get : (Lburp/Zleg;Lburp/Zefx;Lburp/Ze45;Ljava/lang/String;)Ljava/util/function/Supplier;
    //   60: aload_1
    //   61: invokevirtual Z_ : (Ljava/util/function/Supplier;Lburp/Zefx;)Lburp/Ztaw;
    //   64: invokeinterface ZJ : (Lburp/Ztaw;)Lburp/Zsxd;
    //   69: astore #5
    //   71: aload #5
    //   73: invokeinterface ZG : ()Lburp/Zg3d;
    //   78: invokeinterface Zb : ()Lburp/Zvom;
    //   83: astore #6
    //   85: getstatic burp/Zxed.Zt : [I
    //   88: aload #6
    //   90: invokevirtual ordinal : ()I
    //   93: iaload
    //   94: tableswitch default -> 339, 1 -> 136, 2 -> 136, 3 -> 171, 4 -> 209, 5 -> 244, 6 -> 279, 7 -> 314
    //   136: aload_0
    //   137: new burp/Zscy
    //   140: dup
    //   141: aload #5
    //   143: invokeinterface ZG : ()Lburp/Zg3d;
    //   148: invokeinterface Zx : ()Ljava/lang/Exception;
    //   153: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   156: putfield Zz : Lburp/Zsc2;
    //   159: iload #4
    //   161: ifeq -> 339
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   170: athrow
    //   171: aload_0
    //   172: new burp/Zsd8
    //   175: dup
    //   176: aload #5
    //   178: invokeinterface ZG : ()Lburp/Zg3d;
    //   183: invokeinterface Zx : ()Ljava/lang/Exception;
    //   188: invokevirtual getMessage : ()Ljava/lang/String;
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: putfield Zz : Lburp/Zsc2;
    //   197: iload #4
    //   199: ifeq -> 339
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   208: athrow
    //   209: aload_0
    //   210: new burp/Zsc5
    //   213: dup
    //   214: aload #5
    //   216: invokeinterface ZG : ()Lburp/Zg3d;
    //   221: invokeinterface Zx : ()Ljava/lang/Exception;
    //   226: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   229: putfield Zz : Lburp/Zsc2;
    //   232: iload #4
    //   234: ifeq -> 339
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: aload_0
    //   245: new burp/Zscr
    //   248: dup
    //   249: aload #5
    //   251: invokeinterface ZG : ()Lburp/Zg3d;
    //   256: invokeinterface Zx : ()Ljava/lang/Exception;
    //   261: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   264: putfield Zz : Lburp/Zsc2;
    //   267: iload #4
    //   269: ifeq -> 339
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   278: athrow
    //   279: aload_0
    //   280: new burp/Zsct
    //   283: dup
    //   284: aload #5
    //   286: invokeinterface ZG : ()Lburp/Zg3d;
    //   291: invokeinterface Zx : ()Ljava/lang/Exception;
    //   296: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   299: putfield Zz : Lburp/Zsc2;
    //   302: iload #4
    //   304: ifeq -> 339
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   313: athrow
    //   314: new burp/Zs2o
    //   317: dup
    //   318: invokespecial <init> : ()V
    //   321: astore #7
    //   323: aload_0
    //   324: new burp/Zsdo
    //   327: dup
    //   328: aload #7
    //   330: invokespecial <init> : (Lburp/Zs2o;)V
    //   333: putfield Zz : Lburp/Zsc2;
    //   336: aload #7
    //   338: athrow
    //   339: aload #5
    //   341: areturn
    //   342: astore #5
    //   344: aload #5
    //   346: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   349: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   352: aload_0
    //   353: getfield ZO : Lburp/Zz1i;
    //   356: invokeinterface ZHD : ()Lburp/Zefk;
    //   361: invokeinterface ZQv : ()I
    //   366: pop
    //   367: aload_0
    //   368: getfield Zj : Lburp/Zbza;
    //   371: ifnull -> 390
    //   374: aload_0
    //   375: getfield Zj : Lburp/Zbza;
    //   378: invokeinterface Zgq : ()V
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   389: athrow
    //   390: aload #5
    //   392: athrow
    // Exception table:
    //   from	to	target	type
    //   5	36	39	java/lang/Throwable
    //   5	341	342	java/lang/Throwable
    //   85	164	167	java/lang/Throwable
    //   136	202	205	java/lang/Throwable
    //   171	237	240	java/lang/Throwable
    //   209	272	275	java/lang/Throwable
    //   244	307	310	java/lang/Throwable
    //   344	383	386	java/lang/Throwable
  }
  
  public Optional<Zsc2> Za() {
    return Optional.ofNullable(this.Zz);
  }
  
  private Zsxd lambda$makeHttpRequest$0(Zefx paramZefx, Ze45 paramZe45, String paramString) {
    return this.Zu.ZB(paramZefx, paramZe45, paramString);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zleg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */