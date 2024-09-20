package burp;

class Zxem {
  private final Ze3n ZH;
  
  private final Zeko ZO;
  
  Zxem(Ze3n paramZe3n, Zeko paramZeko) {
    this.ZH = paramZe3n;
    this.ZO = paramZeko;
  }
  
  Zgq<Zrdb> ZU() {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: new burp/Zrq0
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: invokestatic Zw : ()[I
    //   19: new java/util/HashMap
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #4
    //   28: astore_1
    //   29: aload_0
    //   30: getfield ZH : Lburp/Ze3n;
    //   33: invokevirtual ZA : ()Lburp/Zefx;
    //   36: invokeinterface Zc : ()Ljava/util/List;
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #5
    //   48: aload #5
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 159
    //   58: aload #5
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: checkcast burp/Zlou
    //   68: astore #6
    //   70: aload_3
    //   71: aload #6
    //   73: invokevirtual ZK : (Lburp/Zlou;)[B
    //   76: astore #7
    //   78: aload_3
    //   79: aload #7
    //   81: invokestatic ZG : ([B)Ljava/lang/String;
    //   84: aload_0
    //   85: getfield ZO : Lburp/Zeko;
    //   88: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zeko;)Lburp/Zkqp;
    //   91: astore #8
    //   93: aload #8
    //   95: ifnull -> 148
    //   98: aload #4
    //   100: aload #6
    //   102: getfield ZA : Ljava/lang/String;
    //   105: aload #6
    //   107: aload #8
    //   109: <illegal opcode> apply : (Lburp/Zlou;Lburp/Zkqp;)Ljava/util/function/Function;
    //   114: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   119: checkcast burp/Zkfk
    //   122: astore #9
    //   124: aload #9
    //   126: getfield ZO : Ljava/util/Collection;
    //   129: aload #6
    //   131: getfield ZE : I
    //   134: aload #6
    //   136: getfield ZV : I
    //   139: invokestatic Zj : (II)Lburp/Zl1r;
    //   142: invokeinterface add : (Ljava/lang/Object;)Z
    //   147: pop
    //   148: aload_1
    //   149: ifnonnull -> 48
    //   152: iconst_1
    //   153: anewarray burp/Zbqc
    //   156: invokestatic Zr : ([Lburp/Zbqc;)V
    //   159: aload #4
    //   161: invokeinterface values : ()Ljava/util/Collection;
    //   166: invokeinterface iterator : ()Ljava/util/Iterator;
    //   171: astore #5
    //   173: aload #5
    //   175: invokeinterface hasNext : ()Z
    //   180: ifeq -> 261
    //   183: aload #5
    //   185: invokeinterface next : ()Ljava/lang/Object;
    //   190: checkcast burp/Zkfk
    //   193: astore #6
    //   195: aload_2
    //   196: aload_0
    //   197: getfield ZH : Lburp/Ze3n;
    //   200: invokevirtual Za : ()Lburp/Zmzk;
    //   203: aload_0
    //   204: getfield ZH : Lburp/Ze3n;
    //   207: invokevirtual ZN : ()Ljava/lang/String;
    //   210: aload #6
    //   212: getfield Ze : Lburp/Zkqp;
    //   215: invokevirtual Ze : ()B
    //   218: aload #6
    //   220: getfield Ze : Lburp/Zkqp;
    //   223: invokevirtual ZO : ()B
    //   226: aload_0
    //   227: getfield ZH : Lburp/Ze3n;
    //   230: invokevirtual Zt : ()Lburp/Zvow;
    //   233: aload #6
    //   235: getfield ZO : Ljava/util/Collection;
    //   238: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   241: aload #6
    //   243: getfield ZW : Ljava/lang/String;
    //   246: aload #6
    //   248: getfield Z_ : I
    //   251: invokestatic ZJ : (Lburp/Zmzk;Ljava/lang/String;BBLburp/Zvow;Ljava/lang/String;I)Lburp/Zsqx;
    //   254: invokevirtual Zu : (Lburp/Zsqx;)V
    //   257: aload_1
    //   258: ifnonnull -> 173
    //   261: aload_2
    //   262: areturn
  }
  
  private static Zkfk lambda$findIssues$0(Zlou paramZlou, Zkqp paramZkqp, String paramString) {
    return new Zkfk(paramZlou.ZA, paramZkqp, paramZlou.ZP);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */