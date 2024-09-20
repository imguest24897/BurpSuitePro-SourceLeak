package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zt6_ implements Zmxz {
  private final Zmxz ZX;
  
  public Zt6_(Zmxz paramZmxz) {
    this.ZX = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: aconst_null
    //   5: invokespecial <init> : (Ljava/lang/Object;)V
    //   8: astore #5
    //   10: aload_2
    //   11: invokeinterface Za7 : ()Lburp/Ztub;
    //   16: astore #6
    //   18: invokestatic ZT : ()[Lburp/Zbqc;
    //   21: aload #6
    //   23: aload_1
    //   24: aload_3
    //   25: aload #5
    //   27: <illegal opcode> accept : (Lburp/Zrdb;Lburp/Zz1h;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   32: invokevirtual Zj : (Ljava/util/function/Consumer;)V
    //   35: astore #4
    //   37: aload #5
    //   39: invokevirtual get : ()Ljava/lang/Object;
    //   42: ifnull -> 105
    //   45: aload #5
    //   47: invokevirtual get : ()Ljava/lang/Object;
    //   50: getstatic burp/Zl4m.Zw : Lburp/Zl4m;
    //   53: if_acmpne -> 68
    //   56: aload_1
    //   57: aload_2
    //   58: invokeinterface Za8 : ()B
    //   63: invokeinterface Zc : (B)V
    //   68: aload_1
    //   69: invokeinterface ZaT : ()Lburp/Ztlj;
    //   74: aload_2
    //   75: invokeinterface ZaT : ()Lburp/Ztlj;
    //   80: aload_3
    //   81: invokevirtual Zd : (Lburp/Ztlj;Lburp/Zz1h;)V
    //   84: aload_1
    //   85: aload_2
    //   86: invokeinterface Zam : ()I
    //   91: invokeinterface ZVD : (I)V
    //   96: aload #5
    //   98: invokevirtual get : ()Ljava/lang/Object;
    //   101: checkcast burp/Zl4m
    //   104: areturn
    //   105: aload_0
    //   106: getfield ZX : Lburp/Zmxz;
    //   109: aload_1
    //   110: aload_2
    //   111: aload_3
    //   112: invokeinterface Zi : (Lburp/Zrdb;Lburp/Zrdb;Lburp/Zz1h;)Lburp/Zl4m;
    //   117: aload #4
    //   119: ifnonnull -> 129
    //   122: iconst_5
    //   123: anewarray burp/Zbqc
    //   126: invokestatic Zr : ([Lburp/Zbqc;)V
    //   129: areturn
  }
  
  private static void lambda$consolidate$0(Zrdb paramZrdb, Zz1h paramZz1h, AtomicReference<Zl4m> paramAtomicReference, Zgkc paramZgkc) {
    Zl4m zl4m = paramZrdb.Za7().Zd(paramZgkc, paramZz1h);
    if (zl4m != null)
      paramAtomicReference.set(zl4m); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */