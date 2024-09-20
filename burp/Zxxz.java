package burp;

import java.util.concurrent.Executor;

class Zxxz {
  private final Zgvu ZM;
  
  private final Zgvu ZT;
  
  private final Zgvu ZY;
  
  private static final String a;
  
  Zxxz(Zmkp paramZmkp, Executor paramExecutor1, Executor paramExecutor2, Executor paramExecutor3) {
    this.ZM = new Zgvu(paramZmkp, paramExecutor1);
    this.ZT = new Zgvu(paramZmkp, paramExecutor2);
    this.ZY = new Zgvu(paramZmkp, paramExecutor3);
  }
  
  void ZJ(Zrxp paramZrxp) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zlu3.Zy : [I
    //   7: aload_1
    //   8: invokevirtual ZFq : ()Lburp/Zehw;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 152, 1 -> 44, 2 -> 63, 3 -> 82, 4 -> 133
    //   44: aload_0
    //   45: getfield ZT : Lburp/Zgvu;
    //   48: aload_1
    //   49: invokevirtual ZL : (Lburp/Zrxp;)V
    //   52: aload_2
    //   53: ifnonnull -> 181
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   62: athrow
    //   63: aload_0
    //   64: getfield ZM : Lburp/Zgvu;
    //   67: aload_1
    //   68: invokevirtual ZL : (Lburp/Zrxp;)V
    //   71: aload_2
    //   72: ifnonnull -> 181
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   81: athrow
    //   82: invokestatic isEventDispatchThread : ()Z
    //   85: ifeq -> 114
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   94: athrow
    //   95: aload_0
    //   96: getfield ZY : Lburp/Zgvu;
    //   99: aload_1
    //   100: invokevirtual ZL : (Lburp/Zrxp;)V
    //   103: aload_2
    //   104: ifnonnull -> 181
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   113: athrow
    //   114: aload_0
    //   115: getfield ZM : Lburp/Zgvu;
    //   118: aload_1
    //   119: invokevirtual ZL : (Lburp/Zrxp;)V
    //   122: aload_2
    //   123: ifnonnull -> 181
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   132: athrow
    //   133: aload_0
    //   134: getfield ZY : Lburp/Zgvu;
    //   137: aload_1
    //   138: invokevirtual ZL : (Lburp/Zrxp;)V
    //   141: aload_2
    //   142: ifnonnull -> 181
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   151: athrow
    //   152: new java/lang/IllegalStateException
    //   155: dup
    //   156: getstatic burp/Zxxz.a : Ljava/lang/String;
    //   159: iconst_1
    //   160: anewarray java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: invokevirtual ZFq : ()Lburp/Zehw;
    //   169: aastore
    //   170: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   173: invokespecial <init> : (Ljava/lang/String;)V
    //   176: athrow
    //   177: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   180: athrow
    //   181: return
    // Exception table:
    //   from	to	target	type
    //   4	56	59	java/lang/IllegalStateException
    //   44	75	78	java/lang/IllegalStateException
    //   63	88	91	java/lang/IllegalStateException
    //   82	107	110	java/lang/IllegalStateException
    //   95	126	129	java/lang/IllegalStateException
    //   114	145	148	java/lang/IllegalStateException
    //   133	177	177	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: ldc '4prTm~AjqHgtAsv^g\0Dm'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxxz.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #40
    //   82: goto -> 112
    //   85: bipush #87
    //   87: goto -> 112
    //   90: bipush #80
    //   92: goto -> 112
    //   95: bipush #115
    //   97: goto -> 112
    //   100: bipush #75
    //   102: goto -> 112
    //   105: bipush #47
    //   107: goto -> 112
    //   110: bipush #89
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */