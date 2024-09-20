package burp;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.swing.border.EmptyBorder;

public class Zb3j {
  private static final Map<Zmjk, Function<Zg3q, Boolean>> Zc = Map.of(Zmjk.REQUEST_ATTRIBUTES, Zg3q::ZF, Zmjk.REQUEST_QUERY_PARAMETERS, Zg3q::ZR, Zmjk.REQUEST_BODY_PARAMETERS, Zg3q::Zg, Zmjk.REQUEST_COOKIES, Zg3q::Zb, Zmjk.REQUEST_HEADERS, Zg3q::ZH, Zmjk.RESPONSE_HEADERS, Zg3q::ZL);
  
  private final Ztz9 Zl;
  
  private final Ztp8 Zp;
  
  private final Ztmb Zw;
  
  private final Zb0h ZU;
  
  private final Supplier<Boolean> ZX;
  
  private final Zliz ZM;
  
  private final Zb86 Zr;
  
  public Zb3j(Ztz9 paramZtz9, Ztp8 paramZtp8, Ztmb paramZtmb, Zb0h paramZb0h, Supplier<Boolean> paramSupplier, Zliz paramZliz, Zb86 paramZb86) {
    this.Zl = paramZtz9;
    this.Zp = paramZtp8;
    this.Zw = paramZtmb;
    this.ZU = paramZb0h;
    this.ZX = paramSupplier;
    this.ZM = paramZliz;
    this.Zr = paramZb86;
  }
  
  public Zmk3 Zw(Zbps paramZbps) {
    Zbdd zbdd = new Zbdd(this.Zp, paramZbps, Zk(this.Zl, Zmjk.REQUEST_ATTRIBUTES));
    return ZP(Zmjk.REQUEST_ATTRIBUTES, zbdd);
  }
  
  public Zt37 Zs(Zbps paramZbps) {
    // Byte code:
    //   0: new burp/Zbdk
    //   3: dup
    //   4: aload_0
    //   5: getfield Zp : Lburp/Ztp8;
    //   8: aload_0
    //   9: getfield ZU : Lburp/Zb0h;
    //   12: aload_0
    //   13: getfield ZX : Ljava/util/function/Supplier;
    //   16: aload_0
    //   17: getfield Zw : Lburp/Ztmb;
    //   20: aload_0
    //   21: getfield Zl : Lburp/Ztz9;
    //   24: dup
    //   25: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   28: pop
    //   29: <illegal opcode> run : (Lburp/Ztz9;)Ljava/lang/Runnable;
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> apply : (Lburp/Zb3j;Lburp/Zbps;)Ljava/util/function/Function;
    //   41: invokespecial <init> : (Lburp/Ztp8;Lburp/Zb0h;Ljava/util/function/Supplier;Lburp/Ztmb;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   44: astore_2
    //   45: aload_0
    //   46: getstatic burp/Zmjk.REQUEST_ATTRIBUTES : Lburp/Zmjk;
    //   49: aload_2
    //   50: getstatic burp/Zmwh.ATTRIBUTES : Lburp/Zmwh;
    //   53: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   56: areturn
  }
  
  public Zmk3 Zw(Zmjk paramZmjk) {
    Zbd7 zbd7 = Zk(this.Zl, paramZmjk);
    return ZP(paramZmjk, zbd7);
  }
  
  public Zt37 ZT(Zmjk paramZmjk) {
    // Byte code:
    //   0: new burp/Zbdc
    //   3: dup
    //   4: aload_0
    //   5: getfield Zp : Lburp/Ztp8;
    //   8: aload_0
    //   9: getfield ZU : Lburp/Zb0h;
    //   12: aload_0
    //   13: getfield ZX : Ljava/util/function/Supplier;
    //   16: aload_0
    //   17: getfield Zw : Lburp/Ztmb;
    //   20: aload_0
    //   21: getfield Zl : Lburp/Ztz9;
    //   24: dup
    //   25: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   28: pop
    //   29: <illegal opcode> run : (Lburp/Ztz9;)Ljava/lang/Runnable;
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> apply : (Lburp/Zb3j;Lburp/Zmjk;)Ljava/util/function/Function;
    //   41: invokespecial <init> : (Lburp/Ztp8;Lburp/Zb0h;Ljava/util/function/Supplier;Lburp/Ztmb;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   44: astore_2
    //   45: new burp/Zz6p
    //   48: dup
    //   49: aload_2
    //   50: aload_0
    //   51: getfield ZU : Lburp/Zb0h;
    //   54: invokespecial <init> : (Lburp/Zl5p;Lburp/Zb0h;)V
    //   57: astore_3
    //   58: getstatic burp/Zl33.Zm : [I
    //   61: aload_1
    //   62: invokevirtual ordinal : ()I
    //   65: iaload
    //   66: tableswitch default -> 168, 1 -> 104, 2 -> 118, 3 -> 128, 4 -> 138, 5 -> 148, 6 -> 158
    //   104: aload_0
    //   105: aload_1
    //   106: aload_3
    //   107: getstatic burp/Zmwh.ATTRIBUTES : Lburp/Zmwh;
    //   110: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   113: areturn
    //   114: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   117: athrow
    //   118: aload_0
    //   119: aload_1
    //   120: aload_3
    //   121: getstatic burp/Zmwh.BODY_PARAMETERS : Lburp/Zmwh;
    //   124: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   127: areturn
    //   128: aload_0
    //   129: aload_1
    //   130: aload_3
    //   131: getstatic burp/Zmwh.COOKIES : Lburp/Zmwh;
    //   134: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   137: areturn
    //   138: aload_0
    //   139: aload_1
    //   140: aload_3
    //   141: getstatic burp/Zmwh.HEADERS : Lburp/Zmwh;
    //   144: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   147: areturn
    //   148: aload_0
    //   149: aload_1
    //   150: aload_3
    //   151: getstatic burp/Zmwh.QUERY_PARAMETERS : Lburp/Zmwh;
    //   154: invokevirtual Zq : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zmwh;)Lburp/Zt37;
    //   157: areturn
    //   158: aload_0
    //   159: aload_1
    //   160: aload_3
    //   161: getstatic burp/Zzbe.HEADERS : Lburp/Zzbe;
    //   164: invokevirtual ZY : (Lburp/Zmjk;Lburp/Zl2p;Lburp/Zzbe;)Lburp/Zt37;
    //   167: areturn
    //   168: iconst_0
    //   169: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   172: aload_1
    //   173: invokevirtual toString : ()Ljava/lang/String;
    //   176: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   179: new java/lang/IllegalStateException
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: athrow
    // Exception table:
    //   from	to	target	type
    //   58	114	114	java/lang/IllegalStateException
  }
  
  public Zmk3 ZP(Zmjk paramZmjk, Zl2p paramZl2p) {
    return new Zmk3(this.ZM.Zx(paramZmjk), paramZmjk.displayName, paramZl2p, ZO(paramZmjk));
  }
  
  public Zt37 Zq(Zmjk paramZmjk, Zl2p paramZl2p, Zmwh paramZmwh) {
    Zsmc zsmc = this.Zr.Zc().ZO(paramZmwh);
    Zo4 zo4 = new Zo4(paramZmjk, zsmc.ZZ(), true, zsmc.Zc());
    return new Zt37(zo4, paramZmwh.messageEditorViewType, paramZl2p, ZO(paramZmjk));
  }
  
  public Zt37 ZY(Zmjk paramZmjk, Zl2p paramZl2p, Zzbe paramZzbe) {
    Ztjo ztjo = this.Zr.Zq().Zz(paramZzbe);
    Zo4 zo4 = new Zo4(paramZmjk, ztjo.ZZ(), true, ztjo.Zc());
    return new Zt37(zo4, paramZzbe.messageEditorViewType, paramZl2p, ZO(paramZmjk));
  }
  
  private Zbd7 Zk(Ztz9 paramZtz9, Zmjk paramZmjk) {
    return Zxad.ZG(paramZmjk).Zr(paramZtz9, this.Zp, this.Zw, this.ZU);
  }
  
  private Supplier<Boolean> ZO(Zmjk paramZmjk) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> get : (Lburp/Zb3j;Lburp/Zmjk;)Ljava/util/function/Supplier;
    //   7: areturn
  }
  
  private Boolean lambda$shouldBeShowing$3(Zmjk paramZmjk) {
    return ((Function<Zg3q, Boolean>)Zc.getOrDefault(paramZmjk, Zb3j::lambda$shouldBeShowing$2)).apply(this.Zp.get());
  }
  
  private static Boolean lambda$shouldBeShowing$2(Zg3q paramZg3q) {
    return Boolean.valueOf(true);
  }
  
  private Zl5p lambda$tableWidgetTab$1(Zmjk paramZmjk, Ztz9 paramZtz9) {
    Zbd7 zbd7 = Zk(paramZtz9, paramZmjk);
    zbd7.setBorder(new EmptyBorder(10, 10, 10, 10));
    zbd7.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    return zbd7;
  }
  
  private Zl2p lambda$requestAttributesTab$0(Zbps paramZbps, Ztz9 paramZtz9) {
    Zbdd zbdd = new Zbdd(this.Zp, paramZbps, Zk(paramZtz9, Zmjk.REQUEST_ATTRIBUTES));
    zbdd.setBorder(new EmptyBorder(10, 10, 10, 10));
    zbdd.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    return zbdd;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */