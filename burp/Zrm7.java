package burp;

import java.util.List;

public class Zrm7 implements Zsw {
  private final Zrgd Zn;
  
  private final Zxat ZK;
  
  public Zrm7(Zrgd paramZrgd) {
    this.Zn = paramZrgd;
    this.ZK = new Zxat();
  }
  
  public void Za() {
    this.ZK.ZH();
  }
  
  Zefx Zn(Zefx paramZefx) {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: invokestatic ZD : ()Ljava/lang/String;
    //   5: aload_0
    //   6: getfield ZK : Lburp/Zxat;
    //   9: aload_3
    //   10: invokeinterface ZT : ()Lburp/Zmzk;
    //   15: aload_3
    //   16: invokeinterface ZF : ()Lburp/Zlit;
    //   21: invokeinterface Zd4 : ()[B
    //   26: invokevirtual ZW : (Lburp/Zmzk;[B)Ljava/util/List;
    //   29: astore #4
    //   31: astore_2
    //   32: aload #4
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #5
    //   41: aload #5
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 194
    //   51: aload #5
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast burp/Ztbr
    //   61: astore #6
    //   63: aload #6
    //   65: invokeinterface ZqU : ()Ljava/util/Date;
    //   70: ifnull -> 119
    //   73: aload #6
    //   75: invokeinterface ZqU : ()Ljava/util/Date;
    //   80: invokevirtual getTime : ()J
    //   83: aload_0
    //   84: getfield Zn : Lburp/Zrgd;
    //   87: invokevirtual ZX : ()J
    //   90: getstatic burp/Zs1b.ZF : J
    //   93: lsub
    //   94: lcmp
    //   95: ifge -> 119
    //   98: aload_3
    //   99: aload #6
    //   101: invokeinterface Zqy : ()Ljava/lang/String;
    //   106: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   109: invokeinterface ZX : (Ljava/lang/String;Lburp/Zrdu;)Lburp/Zefx;
    //   114: astore_3
    //   115: aload_2
    //   116: ifnonnull -> 190
    //   119: aload_3
    //   120: aload #6
    //   122: <illegal opcode> test : (Lburp/Ztbr;)Ljava/util/function/Predicate;
    //   127: invokeinterface Z_ : (Ljava/util/function/Predicate;)Z
    //   132: ifeq -> 163
    //   135: aload_3
    //   136: aload #6
    //   138: invokeinterface Zqy : ()Ljava/lang/String;
    //   143: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   146: aload #6
    //   148: invokeinterface Zq0 : ()Ljava/lang/String;
    //   153: invokeinterface ZK : (Ljava/lang/String;Lburp/Zrdu;Ljava/lang/String;)Lburp/Zefx;
    //   158: astore_3
    //   159: aload_2
    //   160: ifnonnull -> 190
    //   163: aload_3
    //   164: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   167: aload #6
    //   169: invokeinterface Zqy : ()Ljava/lang/String;
    //   174: aload #6
    //   176: invokeinterface Zq0 : ()Ljava/lang/String;
    //   181: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   184: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   189: astore_3
    //   190: aload_2
    //   191: ifnonnull -> 41
    //   194: aload_3
    //   195: areturn
  }
  
  public void ZO(Zeew paramZeew, Zefx paramZefx) {}
  
  public void Zv(Zeew paramZeew, Zmzk paramZmzk, List<String> paramList) {
    List<Ztbr> list = Zth6.Z_(paramZmzk, paramList, null);
    if (list != null && !list.isEmpty())
      this.ZK.Zf(list, paramZmzk, false); 
  }
  
  private static boolean lambda$addCookiesToRequest$0(Ztbr paramZtbr, Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.COOKIE && paramZtbr.Zqy().equals(paramZlou.ZA));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrm7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */