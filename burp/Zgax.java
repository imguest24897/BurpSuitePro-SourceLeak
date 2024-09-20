package burp;

public abstract class Zgax extends Zgaj {
  protected Zgax(Zku8 paramZku8, Zkl6 paramZkl6) throws Ztr8 {
    super(paramZku8, paramZkl6);
  }
  
  public Zlbg ZO(Zlbg paramZlbg, boolean paramBoolean) {
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
    //   22: iconst_0
    //   23: istore #4
    //   25: iload_2
    //   26: ifeq -> 74
    //   29: aconst_null
    //   30: aload_1
    //   31: invokevirtual ZY : ()[B
    //   34: iconst_3
    //   35: aload_0
    //   36: getfield Zh : Lburp/Zkl6;
    //   39: invokeinterface ZB : ()Lburp/Zbnt;
    //   44: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   47: astore #7
    //   49: aload #7
    //   51: getfield ZP : I
    //   54: istore #5
    //   56: new java/util/ArrayList
    //   59: dup
    //   60: aload #7
    //   62: invokevirtual ZG : ()Ljava/util/List;
    //   65: invokespecial <init> : (Ljava/util/Collection;)V
    //   68: astore #6
    //   70: aload_3
    //   71: ifnull -> 119
    //   74: aconst_null
    //   75: aload_1
    //   76: invokevirtual ZY : ()[B
    //   79: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   82: aload_0
    //   83: getfield Zh : Lburp/Zkl6;
    //   86: invokeinterface ZB : ()Lburp/Zbnt;
    //   91: invokestatic ZK : (Lburp/Zz1p;[BLburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   94: astore #7
    //   96: aload #7
    //   98: getfield Zk : I
    //   101: iconst_2
    //   102: isub
    //   103: istore #5
    //   105: new java/util/ArrayList
    //   108: dup
    //   109: aload #7
    //   111: getfield ZP : Ljava/util/List;
    //   114: invokespecial <init> : (Ljava/util/Collection;)V
    //   117: astore #6
    //   119: aload_0
    //   120: getfield Zj : Ljava/util/regex/Matcher;
    //   123: ifnonnull -> 150
    //   126: aload #6
    //   128: aload_0
    //   129: getfield Zl : Lburp/Zku8;
    //   132: invokeinterface ZIX : ()Ljava/lang/String;
    //   137: invokeinterface add : (Ljava/lang/Object;)Z
    //   142: pop
    //   143: iconst_1
    //   144: istore #4
    //   146: aload_3
    //   147: ifnull -> 285
    //   150: iconst_0
    //   151: istore #7
    //   153: iload #7
    //   155: aload #6
    //   157: invokeinterface size : ()I
    //   162: if_icmpge -> 272
    //   165: aload #6
    //   167: iload #7
    //   169: invokeinterface get : (I)Ljava/lang/Object;
    //   174: checkcast java/lang/String
    //   177: astore #8
    //   179: aload_0
    //   180: getfield Zj : Ljava/util/regex/Matcher;
    //   183: aload #8
    //   185: invokevirtual reset : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   188: pop
    //   189: aload_0
    //   190: getfield Zj : Ljava/util/regex/Matcher;
    //   193: invokevirtual find : ()Z
    //   196: ifeq -> 265
    //   199: aload_0
    //   200: getfield Zj : Ljava/util/regex/Matcher;
    //   203: aload_0
    //   204: getfield ZL : Ljava/lang/String;
    //   207: invokevirtual replaceAll : (Ljava/lang/String;)Ljava/lang/String;
    //   210: astore #8
    //   212: aload #6
    //   214: iload #7
    //   216: invokeinterface remove : (I)Ljava/lang/Object;
    //   221: pop
    //   222: aload #8
    //   224: invokevirtual isEmpty : ()Z
    //   227: ifeq -> 244
    //   230: iinc #7, -1
    //   233: aload_3
    //   234: ifnull -> 262
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   243: athrow
    //   244: aload #6
    //   246: iload #7
    //   248: aload #8
    //   250: invokeinterface add : (ILjava/lang/Object;)V
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: iconst_1
    //   263: istore #4
    //   265: iinc #7, 1
    //   268: aload_3
    //   269: ifnull -> 153
    //   272: goto -> 285
    //   275: astore #7
    //   277: aload #7
    //   279: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   282: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   285: iload #4
    //   287: ifeq -> 312
    //   290: aload_1
    //   291: aload #6
    //   293: aload_1
    //   294: invokevirtual ZY : ()[B
    //   297: iload #5
    //   299: invokestatic Zw : (Ljava/util/List;[BI)[B
    //   302: invokevirtual ZE : ([B)V
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: aload_1
    //   313: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/lang/Exception
    //   150	272	275	java/lang/Exception
    //   212	237	240	java/lang/Exception
    //   230	255	258	java/lang/Exception
    //   285	305	308	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */