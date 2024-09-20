package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgk5 {
  private final Zt2r Zs;
  
  private final Zbsw ZH;
  
  private final Ztdi ZO;
  
  private final Ztwv ZD;
  
  private final Ztdn Zy;
  
  private final Zxz1 Zz;
  
  private final Zey9 Zi;
  
  private final Zzcq<Zez3> ZF;
  
  private final Object ZL = new Object();
  
  private int Zo;
  
  private static boolean ZG;
  
  public Zgk5(Zt2r paramZt2r, Zbsw paramZbsw, Ztdn paramZtdn, Zxz1 paramZxz1, Ztdi paramZtdi, Zefg<Zez3> paramZefg, Ztwv paramZtwv, Zey9 paramZey9) {
    this.Zs = paramZt2r;
    this.ZH = paramZbsw;
    this.Zy = paramZtdn;
    boolean bool = ZZ();
    try {
      this.Zz = paramZxz1;
      this.ZO = paramZtdi;
      this.ZD = paramZtwv;
      this.Zi = paramZey9;
      this.ZF = new Zzcq<>(paramZefg);
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Zsty zsty) {
          throw a(null);
        } 
        ZK(!bool);
      } 
    } catch (Zsty zsty) {
      throw a(null);
    } 
  }
  
  public void ZY() {
    try {
      if (this.Zy.ZP())
        try {
          if (!this.ZF.ZN())
            Zq(); 
        } catch (Zsty zsty) {
          throw a(null);
        }  
    } catch (Zsty zsty) {
      throw a(null);
    } 
  }
  
  public void ZW(Zez3 paramZez3) {
    try {
      if (Zk8c.ZX(paramZez3) && ZV(paramZez3.ZkJ())) {
        Zs73 zs73 = (new Ztgc(paramZez3)).ZE();
        try {
          if (zs73.ZTU() == 1)
            zs73.ZU((byte)0); 
        } catch (Zsty zsty) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zsty zsty) {
      throw a(null);
    } 
    ZF(paramZez3);
    synchronized (this.ZL) {
      if (this.Zy.ZP())
        Zq(); 
    } 
  }
  
  private void ZF(Zez3 paramZez3) {
    synchronized (this.ZF) {
      try {
        this.ZF.ZY(paramZez3);
        this.Zy.ZI(this.ZF.Zu());
        this.ZF.notify();
      } catch (Zsty zsty) {
        Zah.Zl(zsty, Zk_.IGNORED);
      } 
    } 
  }
  
  private void Zq() {
    boolean bool = ZZ();
    while (this.Zo < this.Zy.Zr()) {
      this.ZD.Zx(new Zldh(this));
      this.Zo++;
      if (bool)
        break; 
    } 
  }
  
  private void ZA(Zez3 paramZez3, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: invokestatic ZJ : ()Z
    //   6: new burp/Ztgc
    //   9: dup
    //   10: aload_1
    //   11: invokespecial <init> : (Lburp/Zez3;)V
    //   14: invokevirtual ZE : ()Lburp/Zs73;
    //   17: astore #6
    //   19: istore #4
    //   21: iconst_1
    //   22: aload_0
    //   23: getfield Zy : Lburp/Ztdn;
    //   26: invokeinterface ZR : ()I
    //   31: iadd
    //   32: istore #7
    //   34: iconst_0
    //   35: istore #8
    //   37: iload #8
    //   39: iload #7
    //   41: if_icmpge -> 192
    //   44: aload_0
    //   45: getfield Zz : Lburp/Zxz1;
    //   48: aload_0
    //   49: getfield Zi : Lburp/Zey9;
    //   52: aload_2
    //   53: aload_3
    //   54: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   57: invokevirtual ZV : (Lburp/Zefx;)Lburp/Zg3d;
    //   60: astore #5
    //   62: aload #5
    //   64: invokeinterface Zb : ()Lburp/Zvom;
    //   69: getstatic burp/Zvom.STREAMING_RESPONSE : Lburp/Zvom;
    //   72: if_acmpne -> 94
    //   75: aload #6
    //   77: iconst_2
    //   78: invokeinterface ZU : (B)V
    //   83: aload_0
    //   84: getfield ZO : Lburp/Ztdi;
    //   87: aload_1
    //   88: invokeinterface ZR : (Lburp/Zez3;)V
    //   93: return
    //   94: aload #5
    //   96: invokeinterface Zb : ()Lburp/Zvom;
    //   101: getstatic burp/Zvom.CONNECTION_FAILED : Lburp/Zvom;
    //   104: if_acmpeq -> 158
    //   107: aload #5
    //   109: invokeinterface Ze : ()Lburp/Zb6q;
    //   114: ifnull -> 158
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload #5
    //   126: invokeinterface Ze : ()Lburp/Zb6q;
    //   131: invokeinterface Za : ()Lburp/Zstu;
    //   136: invokeinterface Zpu : ()I
    //   141: ifle -> 158
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: goto -> 192
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_0
    //   159: getfield Zy : Lburp/Ztdn;
    //   162: invokeinterface Zs : ()I
    //   167: i2l
    //   168: invokestatic sleep : (J)V
    //   171: goto -> 184
    //   174: astore #9
    //   176: aload #9
    //   178: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   181: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   184: iinc #8, 1
    //   187: iload #4
    //   189: ifne -> 37
    //   192: goto -> 224
    //   195: astore #7
    //   197: aload #7
    //   199: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   202: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   205: aload #6
    //   207: iconst_3
    //   208: invokeinterface ZU : (B)V
    //   213: aload_0
    //   214: getfield ZO : Lburp/Ztdi;
    //   217: aload_1
    //   218: invokeinterface ZR : (Lburp/Zez3;)V
    //   223: return
    //   224: aload #5
    //   226: invokeinterface Zb : ()Lburp/Zvom;
    //   231: getstatic burp/Zvom.CONNECTION_FAILED : Lburp/Zvom;
    //   234: if_acmpeq -> 257
    //   237: aload #5
    //   239: invokeinterface Zb : ()Lburp/Zvom;
    //   244: getstatic burp/Zvom.TIMED_OUT : Lburp/Zvom;
    //   247: if_acmpne -> 272
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload #6
    //   259: iconst_3
    //   260: invokeinterface ZU : (B)V
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   271: athrow
    //   272: aload #5
    //   274: invokeinterface Ze : ()Lburp/Zb6q;
    //   279: ifnonnull -> 290
    //   282: aconst_null
    //   283: goto -> 307
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: aload #5
    //   292: invokeinterface Ze : ()Lburp/Zb6q;
    //   297: invokeinterface Za : ()Lburp/Zstu;
    //   302: invokeinterface ZiD : ()[B
    //   307: astore #7
    //   309: aload #7
    //   311: ifnull -> 327
    //   314: aload #7
    //   316: arraylength
    //   317: ifne -> 350
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   326: athrow
    //   327: aload #6
    //   329: iconst_3
    //   330: invokeinterface ZU : (B)V
    //   335: aload_0
    //   336: getfield ZO : Lburp/Ztdi;
    //   339: aload_1
    //   340: invokeinterface ZR : (Lburp/Zez3;)V
    //   345: return
    //   346: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   349: athrow
    //   350: aload_0
    //   351: getfield ZH : Lburp/Zbsw;
    //   354: aload_2
    //   355: aload #5
    //   357: invokeinterface ZR : ()Lburp/Zefx;
    //   362: invokeinterface ZD : ()[B
    //   367: invokestatic Zy : ([B)Lburp/Zyf;
    //   370: aload #7
    //   372: invokestatic Zy : ([B)Lburp/Zyf;
    //   375: aload #6
    //   377: invokeinterface ZTF : ()S
    //   382: aload_0
    //   383: getfield Zs : Lburp/Zt2r;
    //   386: invokevirtual Zt : ()Z
    //   389: invokevirtual Zm : (Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;SZ)V
    //   392: goto -> 405
    //   395: astore #8
    //   397: aload #8
    //   399: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   402: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   405: return
    // Exception table:
    //   from	to	target	type
    //   21	93	195	java/net/UnknownHostException
    //   94	117	120	java/lang/InterruptedException
    //   94	192	195	java/net/UnknownHostException
    //   107	144	147	java/lang/InterruptedException
    //   124	154	154	java/lang/InterruptedException
    //   158	171	174	java/lang/InterruptedException
    //   224	250	253	java/lang/InterruptedException
    //   237	265	268	java/lang/InterruptedException
    //   272	286	286	java/lang/InterruptedException
    //   309	320	323	java/lang/InterruptedException
    //   314	346	346	java/lang/InterruptedException
    //   350	392	395	java/lang/Exception
  }
  
  private Zez3 Zs() {
    this.Zy.Zc();
    synchronized (this.ZF) {
      while (true) {
        Zez3 zez3 = this.ZF.Zs();
        if (zez3 == null)
          try {
            this.ZF.wait();
          } catch (InterruptedException interruptedException) {
            Zah.Zl(interruptedException, Zk_.UNEXPECTED);
          }  
        if (zez3 != null) {
          this.Zy.ZM();
          return zez3;
        } 
      } 
    } 
  }
  
  private boolean ZV(Zez3 paramZez3) {
    int i = this.Zy.ZF();
    try {
      if (paramZez3 != null)
        try {
          if (i != Integer.MAX_VALUE) {
            try {
              if (paramZez3.ZkP() < i)
                return false; 
            } catch (Zsty zsty) {
              throw a(null);
            } 
            Zl9_ zl9_ = new Zl9_();
            try {
              paramZez3.ZK(zl9_);
            } catch (Zsty zsty) {
              throw a(null);
            } 
            return (zl9_.Zp >= i);
          } 
        } catch (Zsty zsty) {
          throw a(null);
        }  
    } catch (Zsty zsty) {
      throw a(null);
    } 
    return false;
  }
  
  public static void ZK(boolean paramBoolean) {
    ZG = paramBoolean;
  }
  
  public static boolean ZZ() {
    return ZG;
  }
  
  public static boolean ZJ() {
    boolean bool = ZZ();
    try {
      if (!bool)
        return true; 
    } catch (Zsty zsty) {
      throw a(null);
    } 
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZZ())
      ZK(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */