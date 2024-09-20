package burp;

import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class Zsi8 implements Zx_o {
  private static final Set<Zlju> ZK = EnumSet.of(Zlju.JAVASCRIPT, Zlju.META_REFRESH_NOSCRIPT);
  
  private final Zbnt Zo;
  
  private final Zes1 Zd;
  
  private final AtomicBoolean Zn;
  
  private final AtomicReference<Zlit> ZU;
  
  public Zsi8(Zbnt paramZbnt, Zes1 paramZes1) {
    this(paramZbnt, paramZes1, new AtomicBoolean(), new AtomicReference<>());
  }
  
  public Zsi8(Zbnt paramZbnt, Zes1 paramZes1, AtomicBoolean paramAtomicBoolean, AtomicReference<Zlit> paramAtomicReference) {
    this.Zo = paramZbnt;
    this.Zd = paramZes1;
    this.Zn = paramAtomicBoolean;
    Zbqc[] arrayOfZbqc = Zg4n.Zt();
    this.ZU = paramAtomicReference;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Zswo ZE(Zz28 paramZz28, Zs9z paramZs9z) {
    // Byte code:
    //   0: invokestatic Zt : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: getfield Zi : I
    //   8: bipush #19
    //   10: if_icmplt -> 25
    //   13: aload_0
    //   14: getfield Zn : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   17: iconst_1
    //   18: invokevirtual set : (Z)V
    //   21: getstatic burp/Zswo.STOP : Lburp/Zswo;
    //   24: areturn
    //   25: aload_2
    //   26: getfield Ze : Lburp/Zs0d;
    //   29: invokevirtual ZM : ()Lburp/Zlit;
    //   32: astore #4
    //   34: aload_0
    //   35: getfield Zd : Lburp/Zes1;
    //   38: ifnull -> 71
    //   41: aload_0
    //   42: getfield Zd : Lburp/Zes1;
    //   45: aload #4
    //   47: invokeinterface Zd1 : ()Ljava/lang/String;
    //   52: invokevirtual ZM : (Ljava/lang/String;)Z
    //   55: ifeq -> 71
    //   58: aload_0
    //   59: getfield ZU : Ljava/util/concurrent/atomic/AtomicReference;
    //   62: aload #4
    //   64: invokevirtual set : (Ljava/lang/Object;)V
    //   67: getstatic burp/Zswo.STOP : Lburp/Zswo;
    //   70: areturn
    //   71: getstatic burp/Zsi8.ZK : Ljava/util/Set;
    //   74: aload_2
    //   75: getfield Ze : Lburp/Zs0d;
    //   78: invokevirtual Z_ : ()Lburp/Zlju;
    //   81: invokeinterface contains : (Ljava/lang/Object;)Z
    //   86: ifne -> 99
    //   89: aload_2
    //   90: getfield Ze : Lburp/Zs0d;
    //   93: invokevirtual Zl : ()I
    //   96: ifle -> 103
    //   99: getstatic burp/Zswo.STOP : Lburp/Zswo;
    //   102: areturn
    //   103: aload_2
    //   104: getfield Zw : Lburp/Zmzk;
    //   107: aload_2
    //   108: getfield Zd : [B
    //   111: iconst_1
    //   112: aload_0
    //   113: getfield Zo : Lburp/Zbnt;
    //   116: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   119: getfield Zo : Lburp/Zlit;
    //   122: astore #5
    //   124: aload_1
    //   125: aload #5
    //   127: invokeinterface ZG : (Lburp/Zlit;)Z
    //   132: ifeq -> 159
    //   135: aload_1
    //   136: aload #4
    //   138: invokeinterface ZG : (Lburp/Zlit;)Z
    //   143: ifne -> 207
    //   146: aload_0
    //   147: getfield ZU : Ljava/util/concurrent/atomic/AtomicReference;
    //   150: aload #4
    //   152: invokevirtual set : (Ljava/lang/Object;)V
    //   155: aload_3
    //   156: ifnonnull -> 207
    //   159: aload #4
    //   161: invokeinterface Zdz : ()Lburp/Zmzk;
    //   166: aload_2
    //   167: getfield Zg : Lburp/Zmzk;
    //   170: invokeinterface equals : (Ljava/lang/Object;)Z
    //   175: ifne -> 187
    //   178: aload_0
    //   179: getfield ZU : Ljava/util/concurrent/atomic/AtomicReference;
    //   182: aload #4
    //   184: invokevirtual set : (Ljava/lang/Object;)V
    //   187: aload_1
    //   188: aload #4
    //   190: invokeinterface ZH : (Lburp/Zlit;)Z
    //   195: ifeq -> 207
    //   198: aload_0
    //   199: getfield ZU : Ljava/util/concurrent/atomic/AtomicReference;
    //   202: aload #4
    //   204: invokevirtual set : (Ljava/lang/Object;)V
    //   207: aload_0
    //   208: getfield ZU : Ljava/util/concurrent/atomic/AtomicReference;
    //   211: invokevirtual get : ()Ljava/lang/Object;
    //   214: ifnonnull -> 223
    //   217: getstatic burp/Zswo.FOLLOW : Lburp/Zswo;
    //   220: goto -> 226
    //   223: getstatic burp/Zswo.STOP : Lburp/Zswo;
    //   226: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */