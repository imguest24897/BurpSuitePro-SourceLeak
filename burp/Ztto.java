package burp;

import java.util.Collections;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztto implements Zrbc {
  private final Zz5u Z_;
  
  private final Zkm8 ZS;
  
  private final Zbza ZN;
  
  private final Zz1i Zu;
  
  private final Zl5x Zd;
  
  private final Zg56 Zs;
  
  private final Iterable<Zz_q> ZC;
  
  Ztto(Zz5u paramZz5u, Zkm8 paramZkm8, Zbza paramZbza, Zz1i paramZz1i, Zl5x paramZl5x, Zg56 paramZg56, Zz_q paramZz_q) {
    this(paramZz5u, paramZkm8, paramZbza, paramZz1i, paramZl5x, paramZg56, Collections.singletonList(paramZz_q));
  }
  
  Ztto(Zz5u paramZz5u, Zkm8 paramZkm8, Zbza paramZbza, Zz1i paramZz1i, Zl5x paramZl5x, Zg56 paramZg56, Iterable<Zz_q> paramIterable) {
    this.Z_ = paramZz5u;
    this.ZS = paramZkm8;
    this.ZN = paramZbza;
    this.Zu = paramZz1i;
    this.Zd = paramZl5x;
    this.Zs = paramZg56;
    this.ZC = paramIterable;
  }
  
  public Set<? extends Zz09> Zs() {
    // Byte code:
    //   0: invokestatic ZU : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zz5u;
    //   8: invokeinterface ZEE : ()Z
    //   13: ifne -> 20
    //   16: invokestatic emptySet : ()Ljava/util/Set;
    //   19: areturn
    //   20: new java/util/HashSet
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_2
    //   28: aload_0
    //   29: getfield ZC : Ljava/lang/Iterable;
    //   32: invokeinterface iterator : ()Ljava/util/Iterator;
    //   37: astore_3
    //   38: aload_3
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 101
    //   47: aload_3
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast burp/Zz_q
    //   56: astore #4
    //   58: aload #4
    //   60: invokevirtual ZM : ()Ljava/util/Collection;
    //   63: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   68: aload_0
    //   69: aload #4
    //   71: <illegal opcode> apply : (Lburp/Ztto;Lburp/Zz_q;)Ljava/util/function/Function;
    //   76: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   81: aload_2
    //   82: dup
    //   83: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   92: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   97: iload_1
    //   98: ifeq -> 38
    //   101: aload_2
    //   102: areturn
  }
  
  private Zz09 lambda$getActiveWorkItems$1(Zz_q paramZz_q, Zeqc paramZeqc) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> ZC : (Lburp/Ztto;Lburp/Zz_q;Lburp/Zeqc;)Lburp/Zz09;
    //   8: areturn
  }
  
  private void lambda$getActiveWorkItems$0(Zz_q paramZz_q, Zeqc paramZeqc, Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    try {
      paramZz_q.Zo(paramZeqc, this.ZS.Zu(paramZtpx, paramZeqc, this.ZN));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zs.ZB(Zb09.Zh(this.Zd, this.Zu.Zd(this.Zd), Zblb.ZB(throwable)).Zm().Zn(), throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */