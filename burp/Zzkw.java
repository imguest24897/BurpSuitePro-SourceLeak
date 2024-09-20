package burp;

import java.util.Collection;
import java.util.Set;

public class Zzkw implements Zrbc {
  private final Zb0k Zp;
  
  private final Zkvg ZM;
  
  private final Zmz6 Zi;
  
  private final Zlba Zm;
  
  private final Zbza ZF;
  
  private final Zl5x Zz;
  
  private final Zz1i ZY;
  
  private final Ze4e Zj;
  
  private final Zbnt ZW;
  
  private final Zz1m<Zt1o> Zu;
  
  Zzkw(Zb0k paramZb0k, Zkvg paramZkvg, Zmz6 paramZmz6, Zlba paramZlba, Zbza paramZbza, Zl5x paramZl5x, Zz1i paramZz1i, Ze4e paramZe4e, Zbnt paramZbnt, Zz1m<Zt1o> paramZz1m) {
    this.Zp = paramZb0k;
    this.ZM = paramZkvg;
    this.Zi = paramZmz6;
    this.Zm = paramZlba;
    this.ZF = paramZbza;
    this.Zz = paramZl5x;
    this.ZY = paramZz1i;
    this.Zj = paramZe4e;
    this.ZW = paramZbnt;
    this.Zu = paramZz1m;
  }
  
  public Set<? extends Zz09> Zs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zbza;
    //   4: aload_0
    //   5: getfield ZW : Lburp/Zbnt;
    //   8: invokeinterface ZU : (Lburp/Zbnt;)Lburp/Zz1p;
    //   13: getfield Zo : Lburp/Zlit;
    //   16: astore_1
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual ZV : (Lburp/Zlit;)Z
    //   22: ifeq -> 29
    //   25: invokestatic emptySet : ()Ljava/util/Set;
    //   28: areturn
    //   29: aload_1
    //   30: invokestatic ZM : (Lburp/Zlit;)J
    //   33: lstore_2
    //   34: aload_0
    //   35: getfield ZM : Lburp/Zkvg;
    //   38: invokevirtual ZR : ()Lburp/Zg75;
    //   41: invokevirtual ZF : ()Ljava/util/Collection;
    //   44: astore #4
    //   46: aload_0
    //   47: getfield ZY : Lburp/Zz1i;
    //   50: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   55: dup
    //   56: astore #5
    //   58: monitorenter
    //   59: aload_0
    //   60: getfield ZY : Lburp/Zz1i;
    //   63: lload_2
    //   64: invokeinterface ZZ : (J)Z
    //   69: ifeq -> 88
    //   72: aload_0
    //   73: aload #4
    //   75: invokevirtual Zf : (Ljava/util/Collection;)Z
    //   78: ifne -> 88
    //   81: invokestatic emptySet : ()Ljava/util/Set;
    //   84: aload #5
    //   86: monitorexit
    //   87: areturn
    //   88: aload_0
    //   89: getfield ZY : Lburp/Zz1i;
    //   92: lload_2
    //   93: invokeinterface Zc : (J)V
    //   98: aload #5
    //   100: monitorexit
    //   101: goto -> 112
    //   104: astore #6
    //   106: aload #5
    //   108: monitorexit
    //   109: aload #6
    //   111: athrow
    //   112: aload_0
    //   113: getfield ZM : Lburp/Zkvg;
    //   116: invokevirtual ZR : ()Lburp/Zg75;
    //   119: invokevirtual ZO : ()Lburp/Ze3n;
    //   122: astore #5
    //   124: aload_0
    //   125: getfield Zp : Lburp/Zb0k;
    //   128: aload #5
    //   130: aload #4
    //   132: invokevirtual ZI : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   135: invokeinterface get : ()Ljava/lang/Object;
    //   140: checkcast java/util/List
    //   143: astore #6
    //   145: aload #6
    //   147: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   152: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   157: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   162: aload_0
    //   163: aload #5
    //   165: <illegal opcode> apply : (Lburp/Zzkw;Lburp/Ze3n;)Ljava/util/function/Function;
    //   170: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   175: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   178: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   183: checkcast java/util/Set
    //   186: areturn
    // Exception table:
    //   from	to	target	type
    //   59	87	104	finally
    //   88	101	104	finally
    //   104	109	104	finally
  }
  
  private boolean ZV(Zlit paramZlit) {
    return ((paramZlit.Zd4()).length == 1 && paramZlit.Zd4()[0] == 47);
  }
  
  private boolean Zf(Collection<Zb09> paramCollection) {
    return paramCollection.stream().anyMatch(Zzkw::lambda$hadErrorInAPUCheckInPreviousPass$2);
  }
  
  private static boolean lambda$hadErrorInAPUCheckInPreviousPass$2(Zb09 paramZb09) {
    return (paramZb09.ZY(Zt0r.A1) || (paramZb09.ZJ4() != null && paramZb09.ZJ4().ZL() == Ztst.APU));
  }
  
  private Zttc lambda$getActiveWorkItems$1(Ze3n paramZe3n, Zkrr paramZkrr) {
    // Byte code:
    //   0: new burp/Zttc
    //   3: dup
    //   4: new burp/Zxq
    //   7: dup
    //   8: aload_2
    //   9: aload_0
    //   10: getfield ZY : Lburp/Zz1i;
    //   13: aload_0
    //   14: getfield Zj : Lburp/Ze4e;
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: <illegal opcode> run : (Lburp/Zzkw;Lburp/Ze3n;Lburp/Zkrr;)Ljava/lang/Runnable;
    //   25: invokespecial <init> : (Lburp/Zkrr;Lburp/Zz1i;Lburp/Ze4e;Ljava/lang/Runnable;)V
    //   28: aload_0
    //   29: getfield Zi : Lburp/Zmz6;
    //   32: aload_0
    //   33: getfield Zm : Lburp/Zlba;
    //   36: aload_0
    //   37: getfield ZF : Lburp/Zbza;
    //   40: aload_0
    //   41: getfield ZY : Lburp/Zz1i;
    //   44: aload_0
    //   45: getfield Zz : Lburp/Zl5x;
    //   48: aload_0
    //   49: getfield Zj : Lburp/Ze4e;
    //   52: invokespecial <init> : (Lburp/Zlaz;Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)V
    //   55: areturn
  }
  
  private void lambda$getActiveWorkItems$0(Ze3n paramZe3n, Zkrr paramZkrr) {
    Zzl5.Zj(this.Zu, paramZe3n.Zm(), paramZkrr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzkw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */