package burp;

import java.time.Duration;
import java.util.Objects;
import net.portswigger.Zfc;
import net.portswigger.Zs1;
import net.portswigger.Zt5;
import net.portswigger.Zup;

public class Zeux implements Zmnh {
  private final Zxt2 Zd;
  
  public Zeux(Zxt2 paramZxt2) {
    this.Zd = paramZxt2;
  }
  
  public void ZJ(Zg1c paramZg1c, Zup paramZup) {
    // Byte code:
    //   0: aload_2
    //   1: getfield ZU : Ljava/util/List;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifeq -> 13
    //   12: return
    //   13: invokestatic ZN : ()Z
    //   16: ifeq -> 20
    //   19: return
    //   20: aload_2
    //   21: getfield ZU : Ljava/util/List;
    //   24: iconst_0
    //   25: invokeinterface get : (I)Ljava/lang/Object;
    //   30: checkcast net/portswigger/Zfc
    //   33: astore_3
    //   34: aload_3
    //   35: getfield Zp : Ljava/util/List;
    //   38: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   43: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   48: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   53: invokeinterface findFirst : ()Ljava/util/Optional;
    //   58: aload_0
    //   59: aload_3
    //   60: aload_1
    //   61: aload_2
    //   62: <illegal opcode> accept : (Lburp/Zeux;Lnet/portswigger/Zfc;Lburp/Zg1c;Lnet/portswigger/Zup;)Ljava/util/function/Consumer;
    //   67: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   70: return
  }
  
  public void ZL() {
    this.Zd.Zf();
  }
  
  public Duration Zb() {
    return Duration.ofHours(6L);
  }
  
  public Duration Zq() {
    return Duration.ofHours(6L);
  }
  
  public Runnable Zy() {
    Objects.requireNonNull(this.Zd);
    return this.Zd::ZS;
  }
  
  private void lambda$processUpdateAvailable$1(Zfc paramZfc, Zg1c paramZg1c, Zup paramZup, Zs1 paramZs1) {
    Zga8 zga8 = this.Zd.Zb(Zge8.ZK(paramZfc, paramZs1));
    if (!zga8.ZO())
      paramZg1c.Zd(paramZup.Zv, paramZfc.Zu, String.valueOf(paramZfc.ZG), zga8.ZR(), paramZs1, Zlc8.Zy); 
    this.Zd.ZU(zga8);
  }
  
  private static boolean lambda$processUpdateAvailable$0(Zs1 paramZs1) {
    return (paramZs1.Za == Zt5.CURRENT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeux.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */