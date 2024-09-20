package burp;

import java.util.Collections;
import java.util.function.BiConsumer;

public class Zte5 {
  private final Zbnt ZY;
  
  private final Zrjd Zn;
  
  private final Zesv ZZ;
  
  private final Zgwp Zo;
  
  private final Zkoz Z_;
  
  private final Zlk2 Zz;
  
  private final Zlba ZG;
  
  private final Zmz6 Zy;
  
  private final Ze4e ZS;
  
  private final Zkq4 ZB;
  
  private final Zbza ZD;
  
  private final Zz1i ZQ;
  
  public Zte5(Zbnt paramZbnt, Zrjd paramZrjd, Zesv paramZesv, Zgwp paramZgwp, Zkoz paramZkoz, Zlk2 paramZlk2, Zlba paramZlba, Zmz6 paramZmz6, Ze4e paramZe4e, Zkq4 paramZkq4, Zbza paramZbza, Zz1i paramZz1i) {
    this.ZY = paramZbnt;
    this.Zn = paramZrjd;
    this.ZZ = paramZesv;
    this.Zo = paramZgwp;
    this.Z_ = paramZkoz;
    this.Zz = paramZlk2;
    this.ZG = paramZlba;
    this.Zy = paramZmz6;
    this.ZS = paramZe4e;
    this.ZB = paramZkq4;
    this.ZD = paramZbza;
    this.ZQ = paramZz1i;
  }
  
  Zrbc Zc(Zb9t paramZb9t, Zm7h paramZm7h) {
    // Byte code:
    //   0: new burp/Zz31
    //   3: dup
    //   4: getstatic burp/Zt0r.S3 : Lburp/Zt0r;
    //   7: aload_0
    //   8: getfield Zy : Lburp/Zmz6;
    //   11: aload_0
    //   12: getfield ZB : Lburp/Zkq4;
    //   15: aload_0
    //   16: getfield ZQ : Lburp/Zz1i;
    //   19: aload_0
    //   20: getfield ZG : Lburp/Zlba;
    //   23: aload_0
    //   24: getfield ZD : Lburp/Zbza;
    //   27: aload_0
    //   28: getfield ZS : Lburp/Ze4e;
    //   31: aload_0
    //   32: aload_1
    //   33: aload_2
    //   34: <illegal opcode> Zn : (Lburp/Zte5;Lburp/Zb9t;Lburp/Zm7h;)Lburp/Zku7;
    //   39: aload_1
    //   40: <illegal opcode> apply : (Lburp/Zb9t;)Ljava/util/function/Function;
    //   45: <illegal opcode> Z_ : ()Lburp/Ztj_;
    //   50: aload_1
    //   51: dup
    //   52: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: pop
    //   56: <illegal opcode> get : (Lburp/Zb9t;)Ljava/util/function/Supplier;
    //   61: invokespecial <init> : (Lburp/Zl5x;Lburp/Zmz6;Lburp/Zkq4;Lburp/Zz1i;Lburp/Zlba;Lburp/Zbza;Lburp/Ze4e;Lburp/Zku7;Ljava/util/function/Function;Lburp/Ztj_;Ljava/util/function/Supplier;)V
    //   64: areturn
  }
  
  Zrbc Zs(Zb9t paramZb9t, Zm7h paramZm7h, Zrry paramZrry) {
    return new Zszp(this.ZY, paramZb9t, paramZm7h, paramZrry);
  }
  
  Zrbc ZI(Zb9t paramZb9t, Zm7h paramZm7h, Zrry paramZrry, Zlb4 paramZlb4) {
    return Zrbc.Zd(Collections.singleton(new Zenw(Zmdu.STORED, paramZm7h, paramZrry, paramZlb4, this.Z_, paramZb9t, this.Zo, this.Zy)));
  }
  
  private static void lambda$buildReconfirmStoredDomReflectionsPhase$4(Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {}
  
  private static Ze3n lambda$buildReconfirmStoredDomReflectionsPhase$3(Zb9t paramZb9t, Ztpx paramZtpx) {
    return paramZb9t.ZG();
  }
  
  private Ze5i lambda$buildReconfirmStoredDomReflectionsPhase$2(Zb9t paramZb9t, Zm7h paramZm7h, Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer paramBiConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload #7
    //   3: aload #4
    //   5: aload_1
    //   6: aload #5
    //   8: aload_2
    //   9: <illegal opcode> Zk : (Lburp/Zte5;Lburp/Zxs7;Lburp/Ztpx;Lburp/Zb9t;Lburp/Ze3n;Lburp/Zm7h;)Lburp/Ze5i;
    //   14: areturn
  }
  
  private void lambda$buildReconfirmStoredDomReflectionsPhase$1(Zxs7 paramZxs7, Ztpx paramZtpx, Zb9t paramZb9t, Ze3n paramZe3n, Zm7h paramZm7h, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic ZU : ()I
    //   3: istore #7
    //   5: aload_0
    //   6: getfield ZD : Lburp/Zbza;
    //   9: invokeinterface Zga : ()Z
    //   14: istore #8
    //   16: aload_0
    //   17: getfield ZD : Lburp/Zbza;
    //   20: invokeinterface ZgD : ()Z
    //   25: ifeq -> 194
    //   28: iload #8
    //   30: ifeq -> 56
    //   33: aload_0
    //   34: getfield ZD : Lburp/Zbza;
    //   37: invokeinterface Zgh : ()Lburp/Zkv9;
    //   42: aload_1
    //   43: invokeinterface Zl : ()Lburp/Zro0;
    //   48: invokeinterface Zz : (Lburp/Zro0;)Ljava/lang/Iterable;
    //   53: goto -> 76
    //   56: aload_0
    //   57: getfield ZD : Lburp/Zbza;
    //   60: invokeinterface Zgh : ()Lburp/Zkv9;
    //   65: aload_1
    //   66: invokeinterface Zl : ()Lburp/Zro0;
    //   71: invokeinterface ZU : (Lburp/Zro0;)Ljava/lang/Iterable;
    //   76: astore #9
    //   78: aload #9
    //   80: invokeinterface iterator : ()Ljava/util/Iterator;
    //   85: astore #10
    //   87: aload #10
    //   89: invokeinterface hasNext : ()Z
    //   94: ifeq -> 194
    //   97: aload #10
    //   99: invokeinterface next : ()Ljava/lang/Object;
    //   104: checkcast burp/Zsxt
    //   107: astore #11
    //   109: aload_0
    //   110: getfield ZG : Lburp/Zlba;
    //   113: aload #11
    //   115: getfield ZL : Ljava/lang/Integer;
    //   118: invokevirtual intValue : ()I
    //   121: invokeinterface ZW : (I)Lburp/Zbza;
    //   126: astore #12
    //   128: aload_0
    //   129: getfield Zn : Lburp/Zrjd;
    //   132: aload #12
    //   134: aload_2
    //   135: invokevirtual Zc : (Lburp/Zbza;Lburp/Ztpx;)Lburp/Ze3n;
    //   138: astore #13
    //   140: aload_3
    //   141: aload #13
    //   143: invokevirtual ZI : (Lburp/Ze3n;)V
    //   146: aload_0
    //   147: getfield ZZ : Lburp/Zesv;
    //   150: aload #4
    //   152: aload #13
    //   154: aload_1
    //   155: invokevirtual ZY : (Lburp/Ze3n;Lburp/Ze3n;Lburp/Zxs7;)Lburp/Zs_6;
    //   158: astore #14
    //   160: aload_0
    //   161: aload #5
    //   163: aload #4
    //   165: aload #13
    //   167: aload_1
    //   168: aload #14
    //   170: <illegal opcode> ZC : (Lburp/Zte5;Lburp/Zm7h;Lburp/Ze3n;Lburp/Ze3n;Lburp/Zxs7;Lburp/Zmhe;)Lburp/Zbl3;
    //   175: astore #15
    //   177: aload_0
    //   178: getfield Zz : Lburp/Zlk2;
    //   181: aload #14
    //   183: aload_1
    //   184: aload #15
    //   186: invokevirtual ZX : (Lburp/Zmhe;Lburp/Zxs7;Lburp/Zbl3;)V
    //   189: iload #7
    //   191: ifeq -> 87
    //   194: return
  }
  
  private void lambda$buildReconfirmStoredDomReflectionsPhase$0(Zm7h paramZm7h, Ze3n paramZe3n1, Ze3n paramZe3n2, Zxs7 paramZxs7, Zmhe paramZmhe, Zsjk paramZsjk, byte paramByte, Zku6 paramZku6) {
    paramZm7h.ZG(paramByte, Ztbx.ZF(this.ZY, paramZe3n1, paramZe3n2, paramZku6, paramZsjk, paramZe3n2.ZA(), paramZxs7, paramZmhe.Zx()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zte5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */