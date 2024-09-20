package burp;

import java.util.Collections;
import java.util.Set;

public class Zmk6 implements Zrbc, Zlaz {
  private final Zl5x ZE;
  
  private final Zmz6 Zh;
  
  private final Zkvg Zi;
  
  private final Zlba ZQ;
  
  private final Ztai Zu;
  
  private final Zbza ZP;
  
  private final Zz1i ZS;
  
  private final Zly1 Z_;
  
  private final Ze4e ZT;
  
  Zmk6(Zl5x paramZl5x, Zmz6 paramZmz6, Zkvg paramZkvg, Zlba paramZlba, Ztai paramZtai, Zbza paramZbza, Zz1i paramZz1i, Zly1 paramZly1, Ze4e paramZe4e) {
    this.ZE = paramZl5x;
    this.Zh = paramZmz6;
    this.Zi = paramZkvg;
    this.ZQ = paramZlba;
    this.Zu = paramZtai;
    this.ZP = paramZbza;
    this.ZS = paramZz1i;
    this.Z_ = paramZly1;
    this.ZT = paramZe4e;
  }
  
  public Set<? extends Zz09> Zs() {
    return this.Zu.Zse() ? Collections.singleton(new Zttc(this, this.Zh, this.ZQ, this.ZP, this.ZS, Zt0r.A1, this.ZT)) : Collections.emptySet();
  }
  
  public void Zf(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Zkvg;
    //   4: invokevirtual ZR : ()Lburp/Zg75;
    //   7: astore #5
    //   9: aload #5
    //   11: invokevirtual ZO : ()Lburp/Ze3n;
    //   14: astore #6
    //   16: aload #4
    //   18: invokeinterface ZP : ()Z
    //   23: ifeq -> 34
    //   26: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   31: goto -> 40
    //   34: aload_0
    //   35: <illegal opcode> test : (Lburp/Zmk6;)Ljava/util/function/Predicate;
    //   40: astore #7
    //   42: aload #6
    //   44: invokevirtual Zo : ()Ljava/util/List;
    //   47: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   52: aload #7
    //   54: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   59: aload_0
    //   60: aload #6
    //   62: aload #5
    //   64: <illegal opcode> accept : (Lburp/Zmk6;Lburp/Ze3n;Lburp/Zg75;)Ljava/util/function/Consumer;
    //   69: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   74: return
  }
  
  private boolean ZT(Zxs7 paramZxs7) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lburp/Zbza;
    //   4: invokeinterface ZgA : ()Ljava/util/Collection;
    //   9: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> test : (Lburp/Zmk6;Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   21: invokeinterface noneMatch : (Ljava/util/function/Predicate;)Z
    //   26: ireturn
  }
  
  private boolean lambda$shouldReportToInsertionPointScanCounts$2(Zxs7 paramZxs7, Zb09 paramZb09) {
    return (paramZb09.ZY(this.ZE) || paramZxs7.Zl().equals(paramZb09.ZJ2()));
  }
  
  private void lambda$execute$1(Ze3n paramZe3n, Zg75 paramZg75, Zxs7 paramZxs7) {
    this.Z_.Z_(paramZxs7, Zz76.Zf(paramZe3n, paramZxs7), this.ZP.Zg0(), paramZe3n.ZA().Zr(), (paramZe3n.Zp()).ZH.ZJ, paramZg75.ZY(paramZxs7));
  }
  
  private static boolean lambda$execute$0(Zxs7 paramZxs7) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */