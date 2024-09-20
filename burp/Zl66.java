package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import net.portswigger.Zms;
import net.portswigger.Zrmf;
import net.portswigger.Zsy;
import net.portswigger.Zu9;

public class Zl66 {
  private final Zlje Zx;
  
  private final Zkl6 Zq;
  
  private final String ZK;
  
  private final Zr_4 ZF;
  
  private final Function<Ze7n, Zkg3> Zc;
  
  public Zl66(Zlje paramZlje, Zkl6 paramZkl6, String paramString, Zr_4 paramZr_4) {
    this.Zx = paramZlje;
    this.Zq = paramZkl6;
    this.ZK = paramString;
    this.ZF = paramZr_4;
    this.Zc = this::ZQ;
  }
  
  public List<Zg7g> Zw(Stream<Zrmf> paramStream, Zlit paramZlit) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zlit;)Ljava/util/function/Function;
    //   8: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   13: invokeinterface toList : ()Ljava/util/List;
    //   18: areturn
  }
  
  public Stream<Zefx> ZN(Zg7g paramZg7g, Zlit paramZlit, List<Zgi> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Lburp/Zlje;
    //   4: aload_1
    //   5: invokevirtual ZI : ()Lburp/Zmzk;
    //   8: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   11: aload_1
    //   12: invokevirtual Zg : ()Lnet/portswigger/Zrmf;
    //   15: aload_2
    //   16: invokevirtual Ze : (Ljava/util/List;Lnet/portswigger/Zrmf;Lburp/Zlit;)Ljava/util/List;
    //   19: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   24: aload_0
    //   25: aload_1
    //   26: aload_3
    //   27: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zg7g;Ljava/util/List;)Ljava/util/function/Function;
    //   32: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   37: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   42: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   47: aload_0
    //   48: <illegal opcode> apply : (Lburp/Zl66;)Ljava/util/function/Function;
    //   53: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   58: areturn
  }
  
  public Stream<Zt3i> ZL(Zg7g paramZg7g, Zlit paramZlit) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zg : ()Lnet/portswigger/Zrmf;
    //   4: invokevirtual Zw : ()Ljava/util/List;
    //   7: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   12: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   17: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   22: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   27: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   32: aload_0
    //   33: aload_1
    //   34: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zg7g;)Ljava/util/function/Function;
    //   39: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   44: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   49: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   54: astore_3
    //   55: aload_0
    //   56: getfield Zx : Lburp/Zlje;
    //   59: aload_1
    //   60: invokevirtual ZI : ()Lburp/Zmzk;
    //   63: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   66: aload_1
    //   67: invokevirtual Zg : ()Lnet/portswigger/Zrmf;
    //   70: aload_2
    //   71: invokevirtual Ze : (Ljava/util/List;Lnet/portswigger/Zrmf;Lburp/Zlit;)Ljava/util/List;
    //   74: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   79: aload_0
    //   80: aload_1
    //   81: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zg7g;)Ljava/util/function/Function;
    //   86: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   91: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   96: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   101: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   106: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   111: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   116: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   121: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   126: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   131: aload_0
    //   132: aload_1
    //   133: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zg7g;)Ljava/util/function/Function;
    //   138: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   143: astore #4
    //   145: aload #4
    //   147: aload_3
    //   148: invokestatic concat : (Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;
    //   151: areturn
  }
  
  private boolean Zd(Zg7g paramZg7g, Zlit paramZlit) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Lburp/Zlje;
    //   4: aload_1
    //   5: invokevirtual ZI : ()Lburp/Zmzk;
    //   8: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   11: aload_1
    //   12: invokevirtual Zg : ()Lnet/portswigger/Zrmf;
    //   15: aload_2
    //   16: invokevirtual Ze : (Ljava/util/List;Lnet/portswigger/Zrmf;Lburp/Zlit;)Ljava/util/List;
    //   19: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   24: aload_0
    //   25: aload_1
    //   26: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zg7g;)Ljava/util/function/Function;
    //   31: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   36: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   41: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   46: ireturn
  }
  
  private Zkg3 ZQ(Ze7n paramZe7n) {
    return Zmjh.Zf(new Zsy(this.ZK + this.ZK)).Zd(this.ZF).ZVS();
  }
  
  private static Zzav ZQ(Zz_4 paramZz_4) {
    try {
      switch (Zb6v.ZQ[paramZz_4.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zzav.HEADER;
  }
  
  private Zt3i lambda$extractParameters$10(Zg7g paramZg7g, Zs3b paramZs3b) {
    Zt3i zt3i = new Zt3i(paramZs3b.ZS(), ((Zs3b)ZQ(paramZs3b).<Zs3b>ZQ(paramZs3b)).Ze(), paramZs3b.Zs(), ZQ(paramZs3b.ZI()), paramZs3b.ZY());
    paramZg7g.Zj().add(zt3i.ZT());
    return zt3i;
  }
  
  private static Zs3b lambda$extractParameters$9(Ze7n paramZe7n) {
    return (Zs3b)paramZe7n;
  }
  
  private static Stream lambda$extractParameters$8(Zres paramZres) {
    return paramZres.Zh().stream();
  }
  
  private Zkqz lambda$extractParameters$7(Zg7g paramZg7g, Zlit paramZlit) {
    return this.Zx.ZJ(paramZg7g.Zg(), paramZlit, Collections.emptyList());
  }
  
  private Zt3i lambda$extractParameters$6(Zg7g paramZg7g, Zu9 paramZu9) {
    Zg_z zg_z = new Zg_z(paramZu9.ZZM(), this.ZK);
    paramZu9.ZZ9().ZF(zg_z);
    Zt3i zt3i = zg_z.ZP();
    try {
      if (zt3i != null)
        paramZg7g.Zj().add(zt3i.ZT()); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return zt3i;
  }
  
  private static Zu9 lambda$extractParameters$5(Zms paramZms) {
    return (Zu9)paramZms;
  }
  
  private static boolean lambda$extractParameters$4(Zms paramZms) {
    return paramZms instanceof Zu9;
  }
  
  private Zefx lambda$convert$3(Zkqz paramZkqz) {
    return paramZkqz.ZB(this.Zq, this.Zc);
  }
  
  private Zkqz lambda$convert$2(Zg7g paramZg7g, List<Zgi> paramList, Zlit paramZlit) {
    return this.Zx.ZJ(paramZg7g.Zg(), paramZlit, paramList);
  }
  
  private Stream lambda$permuteHosts$1(Zlit paramZlit, Zrmf paramZrmf) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Lburp/Zlje;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual ZF : (Lburp/Zlit;Lnet/portswigger/Zrmf;)Ljava/util/List;
    //   9: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   14: aload_0
    //   15: aload_2
    //   16: aload_1
    //   17: <illegal opcode> apply : (Lburp/Zl66;Lnet/portswigger/Zrmf;Lburp/Zlit;)Ljava/util/function/Function;
    //   22: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   27: areturn
  }
  
  private Zg7g lambda$permuteHosts$0(Zrmf paramZrmf, Zlit paramZlit, Zmzk paramZmzk) {
    Zg7g zg7g = new Zg7g(paramZmzk, paramZrmf);
    boolean bool = Zd(zg7g, paramZlit);
    zg7g.ZW(bool);
    zg7g.ZN(bool);
    return zg7g;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl66.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */