package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Zxj_ {
  private final Zl7h ZF;
  
  private final Zr69 Zl;
  
  public Zxj_(Zl7h paramZl7h, Zr69 paramZr69) {
    this.ZF = paramZl7h;
    this.Zl = paramZr69;
  }
  
  public List<Zt5r> ZH() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zl7h;
    //   4: invokeinterface ZVP : ()Lburp/Zt1i;
    //   9: astore_2
    //   10: invokestatic ZD : ()[Ljava/lang/String;
    //   13: aload_0
    //   14: getfield ZF : Lburp/Zl7h;
    //   17: invokeinterface ZV4 : ()Lburp/Zlka;
    //   22: astore_3
    //   23: astore_1
    //   24: new burp/Zst
    //   27: dup
    //   28: aload_0
    //   29: getfield ZF : Lburp/Zl7h;
    //   32: invokeinterface ZVz : ()Lburp/Zg4y;
    //   37: aload_3
    //   38: invokestatic emptySet : ()Ljava/util/Set;
    //   41: aload_0
    //   42: getfield ZF : Lburp/Zl7h;
    //   45: invokeinterface ZVv : ()Lburp/Zsiv;
    //   50: invokestatic Zs : (Lburp/Zsiv;)Lburp/Zgj4;
    //   53: aload_0
    //   54: getfield ZF : Lburp/Zl7h;
    //   57: invokeinterface ZVe : ()Lburp/Zxjt;
    //   62: aload_0
    //   63: getfield Zl : Lburp/Zr69;
    //   66: invokeinterface ZD : ()Lburp/Zmv7;
    //   71: invokespecial <init> : (Lburp/Zg4y;Lburp/Zlka;Ljava/util/Collection;Lburp/Zr47;Lburp/Zxjt;Lburp/Zmv7;)V
    //   74: astore #4
    //   76: aload #4
    //   78: invokestatic ZM8 : ()Lburp/Ztsv;
    //   81: getstatic burp/Zm8l.Zi : Lburp/Zm8l;
    //   84: aload_0
    //   85: getfield Zl : Lburp/Zr69;
    //   88: invokeinterface Ze : ()I
    //   93: invokevirtual ZM : (Lburp/Ztsv;Lburp/Zm8l;I)Ljava/util/List;
    //   96: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   101: aload_2
    //   102: aload_3
    //   103: <illegal opcode> apply : (Lburp/Zt1i;Lburp/Zlka;)Ljava/util/function/Function;
    //   108: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   113: invokeinterface toList : ()Ljava/util/List;
    //   118: aload_1
    //   119: ifnonnull -> 129
    //   122: iconst_2
    //   123: anewarray burp/Zbqc
    //   126: invokestatic Zr : ([Lburp/Zbqc;)V
    //   129: areturn
  }
  
  private static Stream lambda$findReachableDestinations$3(Zt1i paramZt1i, Zlka paramZlka, Ztc6 paramZtc6) {
    Zxs9 zxs9 = paramZtc6.ZV();
    return ((Collection)zxs9.ZXL().Znr().getOrDefault(zxs9.ZXA(), Collections.emptyList())).stream().filter(paramZt1i::lambda$findReachableDestinations$0).filter(paramZlka::lambda$findReachableDestinations$1).map(paramZtc6::lambda$findReachableDestinations$2);
  }
  
  private static Zt5r lambda$findReachableDestinations$2(Ztc6 paramZtc6, Zt8i paramZt8i) {
    return new Zt5r(paramZt8i, paramZtc6.Zr());
  }
  
  private static boolean lambda$findReachableDestinations$1(Zlka paramZlka, Zt8i paramZt8i) {
    return paramZlka.Zx(paramZt8i.ZsD());
  }
  
  private static boolean lambda$findReachableDestinations$0(Zt1i paramZt1i, Zt8i paramZt8i) {
    return (paramZt8i.Zsu() instanceof Zgd4 || paramZt1i.ZB(paramZt8i.Zsu()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxj_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */