package burp;

public abstract class Zgal extends Zgaj {
  protected Zgal(Zku8 paramZku8, Zkl6 paramZkl6) throws Ztr8 {
    super(paramZku8, paramZkl6);
  }
  
  public Zlbg Zx(Zlbg paramZlbg, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zku8;
    //   8: invokeinterface ZIp : ()Z
    //   13: ifne -> 22
    //   16: aload_1
    //   17: areturn
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: iload_2
    //   23: ifeq -> 64
    //   26: aconst_null
    //   27: aload_1
    //   28: invokevirtual ZY : ()[B
    //   31: iconst_3
    //   32: aload_0
    //   33: getfield Zh : Lburp/Zkl6;
    //   36: invokeinterface ZB : ()Lburp/Zbnt;
    //   41: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   44: astore #6
    //   46: aload #6
    //   48: invokevirtual ZO : ()I
    //   51: istore #4
    //   53: aload #6
    //   55: invokevirtual ZG : ()Ljava/util/List;
    //   58: astore #5
    //   60: aload_3
    //   61: ifnull -> 100
    //   64: aconst_null
    //   65: aload_1
    //   66: invokevirtual ZY : ()[B
    //   69: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   72: aload_0
    //   73: getfield Zh : Lburp/Zkl6;
    //   76: invokeinterface ZB : ()Lburp/Zbnt;
    //   81: invokestatic ZK : (Lburp/Zz1p;[BLburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   84: astore #6
    //   86: aload #6
    //   88: getfield Zk : I
    //   91: istore #4
    //   93: aload #6
    //   95: getfield ZP : Ljava/util/List;
    //   98: astore #5
    //   100: aload_1
    //   101: invokevirtual ZY : ()[B
    //   104: arraylength
    //   105: iload #4
    //   107: isub
    //   108: ifle -> 205
    //   111: aload_1
    //   112: invokevirtual ZY : ()[B
    //   115: iload #4
    //   117: aload_1
    //   118: invokevirtual ZY : ()[B
    //   121: arraylength
    //   122: iload #4
    //   124: isub
    //   125: invokestatic Zo : ([BII)Ljava/lang/String;
    //   128: astore #6
    //   130: aload_0
    //   131: getfield Zj : Ljava/util/regex/Matcher;
    //   134: aload #6
    //   136: invokevirtual reset : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   139: pop
    //   140: aload_0
    //   141: getfield Zj : Ljava/util/regex/Matcher;
    //   144: invokevirtual find : ()Z
    //   147: ifeq -> 192
    //   150: aload_0
    //   151: getfield Zj : Ljava/util/regex/Matcher;
    //   154: aload_0
    //   155: getfield ZL : Ljava/lang/String;
    //   158: invokevirtual replaceAll : (Ljava/lang/String;)Ljava/lang/String;
    //   161: astore #6
    //   163: aload #5
    //   165: aload #6
    //   167: invokestatic Zb : (Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   170: astore #7
    //   172: aload #7
    //   174: invokestatic Zy : (Ljava/lang/String;)[B
    //   177: astore #8
    //   179: aload #8
    //   181: invokestatic ZQ : ([B)[B
    //   184: astore #8
    //   186: aload_1
    //   187: aload #8
    //   189: invokevirtual ZE : ([B)V
    //   192: goto -> 205
    //   195: astore #7
    //   197: aload #7
    //   199: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   202: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   205: aload_1
    //   206: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/lang/Exception
    //   130	192	195	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgal.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */