package burp;

import java.util.Collection;
import java.util.Set;
import java.util.zip.CRC32;
import net.portswigger.Zkb;

public class Zmxp implements Zrbc {
  private final Zb0k Zw;
  
  private final Zkvg Zz;
  
  private final Zmz6 Zb;
  
  private final Zlba ZW;
  
  private final Zbza Za;
  
  private final Zl5x Zr;
  
  private final Zz1i Zj;
  
  private final Ze4e ZQ;
  
  private final Zbnt ZU;
  
  private final Zz1m<Zt1o> Zc;
  
  Zmxp(Zb0k paramZb0k, Zkvg paramZkvg, Zmz6 paramZmz6, Zlba paramZlba, Zbza paramZbza, Zl5x paramZl5x, Zz1i paramZz1i, Ze4e paramZe4e, Zbnt paramZbnt, Zz1m<Zt1o> paramZz1m) {
    this.Zw = paramZb0k;
    this.Zz = paramZkvg;
    this.Zb = paramZmz6;
    this.ZW = paramZlba;
    this.Za = paramZbza;
    this.Zr = paramZl5x;
    this.Zj = paramZz1i;
    this.ZQ = paramZe4e;
    this.ZU = paramZbnt;
    this.Zc = paramZz1m;
  }
  
  public Set<? extends Zz09> Zs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lburp/Zbza;
    //   4: aload_0
    //   5: getfield ZU : Lburp/Zbnt;
    //   8: invokeinterface ZU : (Lburp/Zbnt;)Lburp/Zz1p;
    //   13: getfield Zo : Lburp/Zlit;
    //   16: astore_1
    //   17: aload_1
    //   18: invokeinterface Zdz : ()Lburp/Zmzk;
    //   23: invokeinterface toString : ()Ljava/lang/String;
    //   28: aload_1
    //   29: invokeinterface Zd4 : ()[B
    //   34: invokestatic ZG : ([B)Ljava/lang/String;
    //   37: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: invokestatic Zk : (Ljava/lang/String;)J
    //   45: lstore_2
    //   46: aload_0
    //   47: getfield Zz : Lburp/Zkvg;
    //   50: invokevirtual ZR : ()Lburp/Zg75;
    //   53: invokevirtual ZF : ()Ljava/util/Collection;
    //   56: astore #4
    //   58: aload_0
    //   59: getfield Zj : Lburp/Zz1i;
    //   62: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   67: dup
    //   68: astore #5
    //   70: monitorenter
    //   71: aload_0
    //   72: getfield Zj : Lburp/Zz1i;
    //   75: lload_2
    //   76: invokeinterface ZH : (J)Z
    //   81: ifeq -> 100
    //   84: aload_0
    //   85: aload #4
    //   87: invokevirtual ZZ : (Ljava/util/Collection;)Z
    //   90: ifne -> 100
    //   93: invokestatic emptySet : ()Ljava/util/Set;
    //   96: aload #5
    //   98: monitorexit
    //   99: areturn
    //   100: aload_0
    //   101: getfield Zj : Lburp/Zz1i;
    //   104: lload_2
    //   105: invokeinterface Zf : (J)V
    //   110: aload #5
    //   112: monitorexit
    //   113: goto -> 124
    //   116: astore #6
    //   118: aload #5
    //   120: monitorexit
    //   121: aload #6
    //   123: athrow
    //   124: aload_0
    //   125: getfield Zz : Lburp/Zkvg;
    //   128: invokevirtual ZR : ()Lburp/Zg75;
    //   131: invokevirtual ZO : ()Lburp/Ze3n;
    //   134: astore #5
    //   136: aload_0
    //   137: getfield Zw : Lburp/Zb0k;
    //   140: aload #5
    //   142: aload #4
    //   144: invokevirtual Zj : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   147: invokeinterface get : ()Ljava/lang/Object;
    //   152: checkcast java/util/List
    //   155: astore #6
    //   157: aload #6
    //   159: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   164: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   169: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   174: aload_0
    //   175: aload #5
    //   177: <illegal opcode> apply : (Lburp/Zmxp;Lburp/Ze3n;)Ljava/util/function/Function;
    //   182: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   187: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   190: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   195: checkcast java/util/Set
    //   198: areturn
    // Exception table:
    //   from	to	target	type
    //   71	99	116	finally
    //   100	113	116	finally
    //   116	121	116	finally
  }
  
  private boolean ZZ(Collection<Zb09> paramCollection) {
    return paramCollection.stream().anyMatch(Zmxp::lambda$hadErrorInAPPCheckInPreviousPass$2);
  }
  
  private static long Zk(String paramString) {
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zkb.Zy(paramString));
    return cRC32.getValue();
  }
  
  private static boolean lambda$hadErrorInAPPCheckInPreviousPass$2(Zb09 paramZb09) {
    return (paramZb09.ZY(Zt0r.A1) || (paramZb09.ZJ4() != null && paramZb09.ZJ4().ZL() == Ztst.APP));
  }
  
  private Zttc lambda$getActiveWorkItems$1(Ze3n paramZe3n, Zkrr paramZkrr) {
    // Byte code:
    //   0: new burp/Zttc
    //   3: dup
    //   4: new burp/Zxq
    //   7: dup
    //   8: aload_2
    //   9: aload_0
    //   10: getfield Zj : Lburp/Zz1i;
    //   13: aload_0
    //   14: getfield ZQ : Lburp/Ze4e;
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: <illegal opcode> run : (Lburp/Zmxp;Lburp/Ze3n;Lburp/Zkrr;)Ljava/lang/Runnable;
    //   25: invokespecial <init> : (Lburp/Zkrr;Lburp/Zz1i;Lburp/Ze4e;Ljava/lang/Runnable;)V
    //   28: aload_0
    //   29: getfield Zb : Lburp/Zmz6;
    //   32: aload_0
    //   33: getfield ZW : Lburp/Zlba;
    //   36: aload_0
    //   37: getfield Za : Lburp/Zbza;
    //   40: aload_0
    //   41: getfield Zj : Lburp/Zz1i;
    //   44: aload_0
    //   45: getfield Zr : Lburp/Zl5x;
    //   48: aload_0
    //   49: getfield ZQ : Lburp/Ze4e;
    //   52: invokespecial <init> : (Lburp/Zlaz;Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)V
    //   55: areturn
  }
  
  private void lambda$getActiveWorkItems$0(Ze3n paramZe3n, Zkrr paramZkrr) {
    Zzl5.Zj(this.Zc, paramZe3n.Zm(), paramZkrr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */