package burp;

import java.util.Collection;

class Zsp4 {
  private final int[][] Zq;
  
  Zsp4(Collection<Zrdb> paramCollection, Zr1x paramZr1x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_5
    //   6: iconst_3
    //   7: multianewarray[[I 2
    //   11: putfield Zq : [[I
    //   14: invokestatic Zq : ()Z
    //   17: aload_1
    //   18: invokeinterface iterator : ()Ljava/util/Iterator;
    //   23: astore #4
    //   25: istore_3
    //   26: aload #4
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 165
    //   36: aload #4
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast burp/Zrdb
    //   46: astore #5
    //   48: aload #5
    //   50: invokeinterface ZaJ : ()B
    //   55: istore #6
    //   57: aload #5
    //   59: invokeinterface Zac : ()B
    //   64: istore #7
    //   66: iload #6
    //   68: invokestatic ZJ : (I)I
    //   71: istore #8
    //   73: iload #7
    //   75: invokestatic Za : (I)I
    //   78: istore #9
    //   80: iload #8
    //   82: iconst_m1
    //   83: if_icmpeq -> 124
    //   86: iload #9
    //   88: iconst_m1
    //   89: if_icmpeq -> 124
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: getfield Zq : [[I
    //   103: iload #8
    //   105: aaload
    //   106: iload #9
    //   108: dup2
    //   109: iaload
    //   110: iconst_1
    //   111: iadd
    //   112: iastore
    //   113: iload_3
    //   114: ifeq -> 144
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: iconst_0
    //   125: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   128: iload #6
    //   130: i2l
    //   131: iload #7
    //   133: i2l
    //   134: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: goto -> 161
    //   147: astore #6
    //   149: aload #6
    //   151: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   154: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   157: aload_2
    //   158: invokevirtual ZV : ()V
    //   161: iload_3
    //   162: ifeq -> 26
    //   165: return
    // Exception table:
    //   from	to	target	type
    //   48	144	147	java/lang/Exception
    //   80	92	95	java/lang/Exception
    //   86	117	120	java/lang/Exception
    //   99	137	140	java/lang/Exception
  }
  
  public int ZD(int paramInt1, int paramInt2) {
    int i = ZJ(paramInt1);
    int j = Za(paramInt2);
    return (i != -1 && j != -1) ? this.Zq[i][j] : 0;
  }
  
  private static int ZJ(int paramInt) {
    switch (paramInt) {
      case 4:
      
      case 3:
      
      case 2:
      
      case 1:
      
      case -1:
      
    } 
    return -1;
  }
  
  private static int Za(int paramInt) {
    switch (paramInt) {
      case 3:
      
      case 2:
      
      case 1:
      
    } 
    return -1;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsp4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */