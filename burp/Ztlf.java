package burp;

import net.portswigger.Zrzt;

class Ztlf {
  private final Ze3n ZJ;
  
  private final Zeko ZB;
  
  Ztlf(Ze3n paramZe3n, Zeko paramZeko) {
    this.ZJ = paramZe3n;
    this.ZB = paramZeko;
  }
  
  Zgq<Zrdb> Zc(Zsq8 paramZsq8) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZL : ()Ljava/lang/String;
    //   11: new java/util/HashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: astore_2
    //   21: aload_1
    //   22: getfield ZZ : Lburp/Zlit;
    //   25: invokeinterface Zds : ()Z
    //   30: ifeq -> 214
    //   33: new burp/Zrq0
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: astore #5
    //   42: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   45: aload_1
    //   46: getfield ZZ : Lburp/Zlit;
    //   49: invokeinterface ZdC : ()[B
    //   54: iconst_0
    //   55: aload_1
    //   56: getfield ZZ : Lburp/Zlit;
    //   59: invokeinterface ZdC : ()[B
    //   64: arraylength
    //   65: getstatic burp/Zsba.URL_ENCODED : Lburp/Zsba;
    //   68: aconst_null
    //   69: invokestatic Zm : (Lburp/Zrdu;[BIILburp/Zsba;Ljava/lang/String;)Ljava/util/List;
    //   72: astore #6
    //   74: aload #6
    //   76: invokeinterface iterator : ()Ljava/util/Iterator;
    //   81: astore #7
    //   83: aload #7
    //   85: invokeinterface hasNext : ()Z
    //   90: ifeq -> 214
    //   93: aload #7
    //   95: invokeinterface next : ()Ljava/lang/Object;
    //   100: checkcast burp/Zt8g
    //   103: astore #8
    //   105: aload #5
    //   107: aload #5
    //   109: aload #8
    //   111: invokeinterface Zbn : ()Ljava/lang/String;
    //   116: invokestatic Zy : (Ljava/lang/String;)[B
    //   119: invokestatic ZS : ([B)[B
    //   122: invokevirtual Ze : ([B)[B
    //   125: invokestatic ZG : ([B)Ljava/lang/String;
    //   128: aload_0
    //   129: getfield ZB : Lburp/Zeko;
    //   132: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zeko;)Lburp/Zkqp;
    //   135: astore #9
    //   137: aload #9
    //   139: ifnull -> 203
    //   142: aload_0
    //   143: aload_1
    //   144: aload #8
    //   146: invokevirtual Zn : (Lburp/Zsq8;Lburp/Zt8g;)[I
    //   149: astore #10
    //   151: aload #4
    //   153: aload #8
    //   155: invokeinterface Zns : ()Ljava/lang/String;
    //   160: aload #8
    //   162: aload #9
    //   164: aload #10
    //   166: <illegal opcode> apply : (Lburp/Zt8g;Lburp/Zkqp;[I)Ljava/util/function/Function;
    //   171: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   176: checkcast burp/Zkfk
    //   179: astore #11
    //   181: aload #11
    //   183: getfield ZO : Ljava/util/Collection;
    //   186: aload #10
    //   188: iconst_0
    //   189: iaload
    //   190: aload #10
    //   192: iconst_1
    //   193: iaload
    //   194: invokestatic Zj : (II)Lburp/Zl1r;
    //   197: invokeinterface add : (Ljava/lang/Object;)Z
    //   202: pop
    //   203: aload_2
    //   204: ifnull -> 83
    //   207: iconst_2
    //   208: anewarray burp/Zbqc
    //   211: invokestatic Zr : ([Lburp/Zbqc;)V
    //   214: aload #4
    //   216: invokeinterface values : ()Ljava/util/Collection;
    //   221: invokeinterface iterator : ()Ljava/util/Iterator;
    //   226: astore #5
    //   228: aload #5
    //   230: invokeinterface hasNext : ()Z
    //   235: ifeq -> 316
    //   238: aload #5
    //   240: invokeinterface next : ()Ljava/lang/Object;
    //   245: checkcast burp/Zkfk
    //   248: astore #6
    //   250: aload_3
    //   251: aload_0
    //   252: getfield ZJ : Lburp/Ze3n;
    //   255: invokevirtual Za : ()Lburp/Zmzk;
    //   258: aload_0
    //   259: getfield ZJ : Lburp/Ze3n;
    //   262: invokevirtual ZN : ()Ljava/lang/String;
    //   265: aload #6
    //   267: getfield Ze : Lburp/Zkqp;
    //   270: invokevirtual Ze : ()B
    //   273: aload #6
    //   275: getfield Ze : Lburp/Zkqp;
    //   278: invokevirtual ZO : ()B
    //   281: aload_0
    //   282: getfield ZJ : Lburp/Ze3n;
    //   285: invokevirtual Zt : ()Lburp/Zvow;
    //   288: aload #6
    //   290: getfield ZO : Ljava/util/Collection;
    //   293: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   296: aload #6
    //   298: getfield ZW : Ljava/lang/String;
    //   301: aload #6
    //   303: getfield Z_ : I
    //   306: invokestatic ZJ : (Lburp/Zmzk;Ljava/lang/String;BBLburp/Zvow;Ljava/lang/String;I)Lburp/Zsqx;
    //   309: invokevirtual Zu : (Lburp/Zsqx;)V
    //   312: aload_2
    //   313: ifnull -> 228
    //   316: aload_3
    //   317: areturn
  }
  
  private int[] Zn(Zsq8 paramZsq8, Zt8g paramZt8g) {
    Zs5n zs5n = paramZsq8.Zn;
    int i = zs5n.ZQG().indexOf("?") + 1 + paramZt8g.Zbl();
    int[] arrayOfInt = { i, i + paramZt8g.Zbn().length() };
    String str = this.ZJ.ZL().Za().Zb(zs5n.ZQs(), zs5n.ZQc()).Zis();
    Zrzt.ZE(str, arrayOfInt);
    arrayOfInt[0] = arrayOfInt[0] + zs5n.ZQs();
    arrayOfInt[1] = arrayOfInt[1] + zs5n.ZQs();
    return arrayOfInt;
  }
  
  private static Zkfk lambda$findIssues$0(Zt8g paramZt8g, Zkqp paramZkqp, int[] paramArrayOfint, String paramString) {
    return new Zkfk(paramZt8g.Zns(), paramZkqp, paramArrayOfint[0]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztlf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */