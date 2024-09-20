package burp;

import java.util.Collection;
import java.util.Set;

public class Zsbn implements Zrbc {
  private final Zb0k ZZ;
  
  private final Zmz6 ZR;
  
  private final Zkvg ZM;
  
  private final Zlba ZC;
  
  private final Zbza Zy;
  
  private final Zz1i Zb;
  
  private final Znn ZF;
  
  private final Ze4e Zm;
  
  private final Zz1m<Zt1o> Zq;
  
  Zsbn(Zb0k paramZb0k, Zmz6 paramZmz6, Zkvg paramZkvg, Zlba paramZlba, Zbza paramZbza, Zz1i paramZz1i, Znn paramZnn, Ze4e paramZe4e, Zz1m<Zt1o> paramZz1m) {
    this.ZZ = paramZb0k;
    this.ZR = paramZmz6;
    this.ZM = paramZkvg;
    this.ZC = paramZlba;
    this.Zy = paramZbza;
    this.Zb = paramZz1i;
    this.ZF = paramZnn;
    this.Zm = paramZe4e;
    this.Zq = paramZz1m;
  }
  
  public Set<? extends Zz09> Zs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZM : Lburp/Zkvg;
    //   4: invokevirtual ZR : ()Lburp/Zg75;
    //   7: invokevirtual ZF : ()Ljava/util/Collection;
    //   10: astore_2
    //   11: invokestatic Zo : ()Z
    //   14: new java/util/HashSet
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore_3
    //   22: aload_0
    //   23: getfield ZM : Lburp/Zkvg;
    //   26: invokevirtual ZR : ()Lburp/Zg75;
    //   29: invokevirtual ZO : ()Lburp/Ze3n;
    //   32: astore #4
    //   34: aload_0
    //   35: getfield ZZ : Lburp/Zb0k;
    //   38: aload #4
    //   40: aload_2
    //   41: invokevirtual ZG : (Lburp/Ze3n;Ljava/util/Collection;)Lburp/Zkj6;
    //   44: invokeinterface get : ()Ljava/lang/Object;
    //   49: checkcast java/lang/Iterable
    //   52: astore #5
    //   54: istore_1
    //   55: aload #5
    //   57: invokeinterface iterator : ()Ljava/util/Iterator;
    //   62: astore #6
    //   64: aload #6
    //   66: invokeinterface hasNext : ()Z
    //   71: ifeq -> 188
    //   74: aload #6
    //   76: invokeinterface next : ()Ljava/lang/Object;
    //   81: checkcast burp/Zkrr
    //   84: astore #7
    //   86: aload #7
    //   88: ifnull -> 184
    //   91: aload_0
    //   92: getfield ZF : Lburp/Znn;
    //   95: aload #7
    //   97: aload_0
    //   98: getfield Zy : Lburp/Zbza;
    //   101: invokeinterface Zg0 : ()Lburp/Zmzk;
    //   106: invokevirtual ZO : (Lburp/Ztj;Lburp/Zmzk;)Z
    //   109: ifeq -> 120
    //   112: aload_0
    //   113: aload_2
    //   114: invokevirtual ZN : (Ljava/util/Collection;)Z
    //   117: ifeq -> 184
    //   120: aload_3
    //   121: new burp/Zttc
    //   124: dup
    //   125: new burp/Zxq
    //   128: dup
    //   129: aload #7
    //   131: aload_0
    //   132: getfield Zb : Lburp/Zz1i;
    //   135: aload_0
    //   136: getfield Zm : Lburp/Ze4e;
    //   139: aload_0
    //   140: aload #4
    //   142: aload #7
    //   144: <illegal opcode> run : (Lburp/Zsbn;Lburp/Ze3n;Lburp/Zkrr;)Ljava/lang/Runnable;
    //   149: invokespecial <init> : (Lburp/Zkrr;Lburp/Zz1i;Lburp/Ze4e;Ljava/lang/Runnable;)V
    //   152: aload_0
    //   153: getfield ZR : Lburp/Zmz6;
    //   156: aload_0
    //   157: getfield ZC : Lburp/Zlba;
    //   160: aload_0
    //   161: getfield Zy : Lburp/Zbza;
    //   164: aload_0
    //   165: getfield Zb : Lburp/Zz1i;
    //   168: getstatic burp/Zt0r.A1 : Lburp/Zt0r;
    //   171: aload_0
    //   172: getfield Zm : Lburp/Ze4e;
    //   175: invokespecial <init> : (Lburp/Zlaz;Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;Lburp/Zz1i;Lburp/Zl5x;Lburp/Ze4e;)V
    //   178: invokeinterface add : (Ljava/lang/Object;)Z
    //   183: pop
    //   184: iload_1
    //   185: ifeq -> 64
    //   188: aload_3
    //   189: areturn
  }
  
  private boolean ZN(Collection<Zb09> paramCollection) {
    return paramCollection.stream().anyMatch(Zsbn::lambda$hadErrorInAPHCheckInPreviousPass$1);
  }
  
  private static boolean lambda$hadErrorInAPHCheckInPreviousPass$1(Zb09 paramZb09) {
    return (paramZb09.ZY(Zt0r.A1) || (paramZb09.ZJ4() != null && paramZb09.ZJ4().ZL() == Ztst.APH));
  }
  
  private void lambda$getActiveWorkItems$0(Ze3n paramZe3n, Zkrr paramZkrr) {
    Zzl5.Zj(this.Zq, paramZe3n.Zm(), paramZkrr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */