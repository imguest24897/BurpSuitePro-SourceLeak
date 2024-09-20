package burp;

class Zkgi {
  final Zll9 Zj;
  
  final Zstu ZL;
  
  final Zz1p ZK;
  
  final int Zi;
  
  final int Zx;
  
  final Zs68 ZP;
  
  Zkgi(Zbrm paramZbrm, Zll9 paramZll9, Zbnt paramZbnt) throws Zlrq {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zy : ()I
    //   7: aload_0
    //   8: aload_2
    //   9: putfield Zj : Lburp/Zll9;
    //   12: istore #4
    //   14: aload_2
    //   15: invokeinterface Zos : ()Lburp/Zstu;
    //   20: ifnonnull -> 129
    //   23: aload_2
    //   24: invokeinterface ZlL : ()Lburp/Zlit;
    //   29: astore #5
    //   31: aload #5
    //   33: ifnonnull -> 48
    //   36: new burp/Zlrq
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: athrow
    //   44: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   47: athrow
    //   48: aload_1
    //   49: getfield Zf : Lburp/Zkl6;
    //   52: invokeinterface ZM : ()Lburp/Ztbb;
    //   57: aload #5
    //   59: invokeinterface Zdz : ()Lburp/Zmzk;
    //   64: invokevirtual ZP : (Lburp/Zmzk;)Lburp/Zxk3;
    //   67: astore #6
    //   69: aload_0
    //   70: aload_1
    //   71: getfield Zf : Lburp/Zkl6;
    //   74: invokeinterface Zs : ()Lburp/Zm6e;
    //   79: invokeinterface ZO : ()Lburp/Ztom;
    //   84: aload #5
    //   86: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   89: aload #6
    //   91: invokevirtual ZK : (Lburp/Zxk3;)Lburp/Ztom;
    //   94: invokevirtual Zr : ()Lburp/Zstu;
    //   97: putfield ZL : Lburp/Zstu;
    //   100: aload_0
    //   101: aload_2
    //   102: invokeinterface ZlL : ()Lburp/Zlit;
    //   107: invokeinterface Zdz : ()Lburp/Zmzk;
    //   112: aload_0
    //   113: getfield ZL : Lburp/Zstu;
    //   116: iconst_3
    //   117: aload_3
    //   118: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   121: putfield ZK : Lburp/Zz1p;
    //   124: iload #4
    //   126: ifne -> 170
    //   129: aload_0
    //   130: aload_2
    //   131: invokeinterface Zos : ()Lburp/Zstu;
    //   136: putfield ZL : Lburp/Zstu;
    //   139: aload_0
    //   140: aload_2
    //   141: invokeinterface ZlL : ()Lburp/Zlit;
    //   146: invokeinterface Zdz : ()Lburp/Zmzk;
    //   151: aload_0
    //   152: getfield ZL : Lburp/Zstu;
    //   155: iconst_3
    //   156: aload_3
    //   157: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   160: putfield ZK : Lburp/Zz1p;
    //   163: goto -> 170
    //   166: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   169: athrow
    //   170: iconst_0
    //   171: istore #5
    //   173: iconst_0
    //   174: istore #6
    //   176: aload_0
    //   177: getfield ZK : Lburp/Zz1p;
    //   180: getfield ZV : Ljava/util/List;
    //   183: invokeinterface iterator : ()Ljava/util/Iterator;
    //   188: astore #7
    //   190: aload #7
    //   192: invokeinterface hasNext : ()Z
    //   197: ifeq -> 339
    //   200: aload #7
    //   202: invokeinterface next : ()Ljava/lang/Object;
    //   207: checkcast burp/Zt8g
    //   210: astore #8
    //   212: getstatic burp/Zbk.ZO : [I
    //   215: aload #8
    //   217: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   222: invokevirtual ordinal : ()I
    //   225: iaload
    //   226: tableswitch default -> 310, 1 -> 280, 2 -> 295, 3 -> 295, 4 -> 295, 5 -> 295, 6 -> 295, 7 -> 295, 8 -> 295, 9 -> 295, 10 -> 295
    //   280: iinc #5, 1
    //   283: iload #4
    //   285: ifne -> 334
    //   288: goto -> 295
    //   291: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   294: athrow
    //   295: iinc #6, 1
    //   298: iload #4
    //   300: ifne -> 334
    //   303: goto -> 310
    //   306: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   309: athrow
    //   310: iconst_0
    //   311: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   314: aload #8
    //   316: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   321: invokevirtual toString : ()Ljava/lang/String;
    //   324: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   327: goto -> 334
    //   330: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   333: athrow
    //   334: iload #4
    //   336: ifne -> 190
    //   339: aload_0
    //   340: iload #5
    //   342: putfield Zi : I
    //   345: aload_0
    //   346: iload #6
    //   348: putfield Zx : I
    //   351: aload_2
    //   352: invokeinterface ZoO : ()Lburp/Zstu;
    //   357: ifnonnull -> 377
    //   360: aload_0
    //   361: aconst_null
    //   362: putfield ZP : Lburp/Zs68;
    //   365: iload #4
    //   367: ifne -> 405
    //   370: goto -> 377
    //   373: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   376: athrow
    //   377: aload_0
    //   378: aload_0
    //   379: getfield ZK : Lburp/Zz1p;
    //   382: aload_2
    //   383: invokeinterface ZoO : ()Lburp/Zstu;
    //   388: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   391: aload_3
    //   392: invokestatic ZS : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   395: putfield ZP : Lburp/Zs68;
    //   398: goto -> 405
    //   401: invokestatic a : (Lburp/Zlrq;)Lburp/Zlrq;
    //   404: athrow
    //   405: return
    // Exception table:
    //   from	to	target	type
    //   31	44	44	burp/Zlrq
    //   69	163	166	burp/Zlrq
    //   212	288	291	burp/Zlrq
    //   280	303	306	burp/Zlrq
    //   295	327	330	burp/Zlrq
    //   339	370	373	burp/Zlrq
    //   360	398	401	burp/Zlrq
  }
  
  private static Zlrq a(Zlrq paramZlrq) {
    return paramZlrq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */