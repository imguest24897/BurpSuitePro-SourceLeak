package burp;

import java.util.List;
import java.util.function.Supplier;

public class Zbwc {
  private static final Supplier<Boolean> Zi;
  
  private static int[] ZO;
  
  private static final String a;
  
  public static Zs68 ZS(Zz1p paramZz1p, Zstu paramZstu, Zt0k paramZt0k, Zbnt paramZbnt) {
    int i = Zs68.Zn();
    if (Zbqc.Zwu() == null)
      Zs68.Zc(++i); 
    return Zt((paramZz1p == null) ? null : paramZz1p.Zo, paramZstu, paramZt0k, paramZbnt);
  }
  
  public static Zs68 Zt(Zlit paramZlit, Zstu paramZstu, Zt0k paramZt0k, Zbnt paramZbnt) {
    return Zr(paramZlit, paramZstu, paramZt0k, false, false, paramZbnt, Zi);
  }
  
  public static Zs68 Zr(Zlit paramZlit, Zstu paramZstu, Zt0k paramZt0k, boolean paramBoolean1, boolean paramBoolean2, Zbnt paramZbnt, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore #7
    //   5: invokestatic ZG : ()Lburp/Zgv9;
    //   8: aload_1
    //   9: invokeinterface Zpu : ()I
    //   14: invokevirtual Zw : (I)Lburp/Zgv9;
    //   17: astore #8
    //   19: aload #6
    //   21: invokeinterface get : ()Ljava/lang/Object;
    //   26: checkcast java/lang/Boolean
    //   29: invokevirtual booleanValue : ()Z
    //   32: ifeq -> 41
    //   35: aconst_null
    //   36: areturn
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_1
    //   42: iconst_0
    //   43: invokestatic Zm : (Lburp/Zstu;I)I
    //   46: istore #9
    //   48: iload #9
    //   50: iconst_m1
    //   51: if_icmpne -> 62
    //   54: aload_1
    //   55: invokeinterface Zpu : ()I
    //   60: istore #9
    //   62: new java/util/ArrayList
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #10
    //   71: aload_1
    //   72: iconst_0
    //   73: iload #9
    //   75: aload #10
    //   77: iload #4
    //   79: aload #6
    //   81: invokestatic ZX : (Lburp/Zstu;IILjava/util/List;ZLjava/util/function/Supplier;)Ljava/util/List;
    //   84: astore #11
    //   86: aload #8
    //   88: aload #11
    //   90: invokevirtual Zl : (Ljava/util/List;)Lburp/Zgv9;
    //   93: pop
    //   94: aload #6
    //   96: invokeinterface get : ()Ljava/lang/Object;
    //   101: checkcast java/lang/Boolean
    //   104: invokevirtual booleanValue : ()Z
    //   107: ifeq -> 116
    //   110: aconst_null
    //   111: areturn
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: iload_3
    //   117: ifeq -> 135
    //   120: aload #8
    //   122: aload #10
    //   124: invokevirtual Zz : (Ljava/util/List;)Lburp/Zgv9;
    //   127: pop
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload_1
    //   136: iload #9
    //   138: iconst_2
    //   139: isub
    //   140: invokestatic ZW : (Lburp/Zstu;I)I
    //   143: istore #12
    //   145: iload #12
    //   147: iconst_m1
    //   148: if_icmpne -> 159
    //   151: aload_1
    //   152: invokeinterface Zpu : ()I
    //   157: istore #12
    //   159: aload #6
    //   161: invokeinterface get : ()Ljava/lang/Object;
    //   166: checkcast java/lang/Boolean
    //   169: invokevirtual booleanValue : ()Z
    //   172: ifeq -> 181
    //   175: aconst_null
    //   176: areturn
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: aload #11
    //   183: ifnull -> 319
    //   186: aload #11
    //   188: invokeinterface size : ()I
    //   193: ifle -> 319
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload #11
    //   205: iconst_0
    //   206: invokeinterface get : (I)Ljava/lang/Object;
    //   211: checkcast java/lang/String
    //   214: ldc ' '
    //   216: iconst_3
    //   217: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   220: astore #13
    //   222: aload #13
    //   224: arraylength
    //   225: iconst_2
    //   226: if_icmplt -> 306
    //   229: aload #13
    //   231: iconst_0
    //   232: aaload
    //   233: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   236: getstatic burp/Zbwc.a : Ljava/lang/String;
    //   239: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   242: ifeq -> 306
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload #8
    //   254: aload #13
    //   256: iconst_0
    //   257: aaload
    //   258: invokevirtual Zp : (Ljava/lang/String;)Lburp/Zgv9;
    //   261: pop
    //   262: aload #8
    //   264: aload #13
    //   266: iconst_1
    //   267: aaload
    //   268: invokestatic parseShort : (Ljava/lang/String;)S
    //   271: invokevirtual Zf : (S)Lburp/Zgv9;
    //   274: pop
    //   275: aload #13
    //   277: arraylength
    //   278: iconst_3
    //   279: if_icmpne -> 306
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   288: athrow
    //   289: aload #8
    //   291: aload #13
    //   293: iconst_2
    //   294: aaload
    //   295: invokevirtual ZG : (Ljava/lang/String;)Lburp/Zgv9;
    //   298: pop
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   305: athrow
    //   306: goto -> 319
    //   309: astore #13
    //   311: aload #13
    //   313: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   316: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   319: aload #6
    //   321: invokeinterface get : ()Ljava/lang/Object;
    //   326: checkcast java/lang/Boolean
    //   329: invokevirtual booleanValue : ()Z
    //   332: ifeq -> 341
    //   335: aconst_null
    //   336: areturn
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: aload_1
    //   342: iload #12
    //   344: aload #11
    //   346: invokestatic ZJ : (Lburp/Zstu;ILjava/util/List;)Lburp/Zk8m;
    //   349: astore #13
    //   351: aload #8
    //   353: aload #13
    //   355: invokevirtual ZG : (Lburp/Zk8m;)Lburp/Zgv9;
    //   358: iload #12
    //   360: invokevirtual ZL : (I)Lburp/Zgv9;
    //   363: pop
    //   364: aload_2
    //   365: getfield Zq : Lburp/Zkgo;
    //   368: getstatic burp/Zkgo.NONE : Lburp/Zkgo;
    //   371: if_acmpeq -> 433
    //   374: aload #13
    //   376: getfield ZJ : S
    //   379: sipush #256
    //   382: if_icmpeq -> 410
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   391: athrow
    //   392: aload #13
    //   394: getfield Zj : S
    //   397: sipush #256
    //   400: if_icmpne -> 433
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: aload_2
    //   411: aload #8
    //   413: aload_0
    //   414: aload_1
    //   415: aload #5
    //   417: iload #12
    //   419: aload #13
    //   421: aload #6
    //   423: invokestatic ZB : (Lburp/Zt0k;Lburp/Zgv9;Lburp/Zlit;Lburp/Zstu;Lburp/Zbnt;ILburp/Zk8m;Ljava/util/function/Supplier;)V
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   432: athrow
    //   433: aload #6
    //   435: invokeinterface get : ()Ljava/lang/Object;
    //   440: checkcast java/lang/Boolean
    //   443: invokevirtual booleanValue : ()Z
    //   446: ifeq -> 455
    //   449: aconst_null
    //   450: areturn
    //   451: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   454: athrow
    //   455: aload_0
    //   456: ifnonnull -> 467
    //   459: aconst_null
    //   460: goto -> 473
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: aload_0
    //   468: invokeinterface Zdz : ()Lburp/Zmzk;
    //   473: astore #14
    //   475: aload #14
    //   477: aload #11
    //   479: aload #10
    //   481: invokestatic Z_ : (Lburp/Zmzk;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    //   484: astore #15
    //   486: aload #8
    //   488: aload #15
    //   490: invokevirtual Za : (Ljava/util/List;)Lburp/Zgv9;
    //   493: invokevirtual Zl : ()Lburp/Zs68;
    //   496: iload #7
    //   498: ifne -> 515
    //   501: iconst_5
    //   502: anewarray burp/Zbqc
    //   505: invokestatic Zr : ([Lburp/Zbqc;)V
    //   508: goto -> 515
    //   511: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   514: athrow
    //   515: areturn
    // Exception table:
    //   from	to	target	type
    //   19	37	37	java/lang/Exception
    //   86	112	112	java/lang/Exception
    //   116	128	131	java/lang/Exception
    //   159	177	177	java/lang/Exception
    //   181	196	199	java/lang/Exception
    //   203	306	309	java/lang/Exception
    //   222	245	248	java/lang/Exception
    //   229	282	285	java/lang/Exception
    //   252	299	302	java/lang/Exception
    //   319	337	337	java/lang/Exception
    //   351	385	388	java/lang/Exception
    //   374	403	406	java/lang/Exception
    //   392	426	429	java/lang/Exception
    //   433	451	451	java/lang/Exception
    //   455	463	463	java/lang/Exception
    //   486	508	511	java/lang/Exception
  }
  
  public static List<Ztu8> ZO(int paramInt, Zstu paramZstu, Zk8m paramZk8m) {
    return ZS(paramInt, paramZstu, Zkgo.FULL, paramZk8m);
  }
  
  private static List<Ztu8> ZS(int paramInt, Zstu paramZstu, Zkgo paramZkgo, Zk8m paramZk8m) {
    return Zsz8.Zs(paramZstu, paramInt, paramZstu.Zpu(), (byte)0, paramZkgo, Zi, Zg12.ZY(paramZk8m));
  }
  
  private static void ZB(Zt0k paramZt0k, Zgv9 paramZgv9, Zlit paramZlit, Zstu paramZstu, Zbnt paramZbnt, int paramInt, Zk8m paramZk8m, Supplier<Boolean> paramSupplier) {
    List<Ztu8> list = ZS(paramInt, paramZstu, paramZt0k.Zq, paramZk8m);
    Zk8m zk8m = Zt1t.Zi(paramZk8m, list, paramSupplier);
    List<Zx8_> list1 = Zrl7.ZS(paramZlit, list, paramZbnt, paramSupplier);
    Zzjh zzjh = paramZt0k.Zb ? Zzia.ZO(list1) : null;
    paramZgv9.Zp(list).ZG(zk8m).ZP(list1).Zx(zzjh);
  }
  
  private static Boolean lambda$static$0() {
    return Boolean.valueOf(false);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zi : ()[I
    //   3: ifnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic Zl : ([I)V
    //   12: bipush #72
    //   14: ldc '@A`3'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zbwc.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #96
    //   94: goto -> 124
    //   97: bipush #125
    //   99: goto -> 124
    //   102: bipush #92
    //   104: goto -> 124
    //   107: bipush #11
    //   109: goto -> 124
    //   112: bipush #49
    //   114: goto -> 124
    //   117: bipush #51
    //   119: goto -> 124
    //   122: bipush #82
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   171: putstatic burp/Zbwc.Zi : Ljava/util/function/Supplier;
    //   174: return
  }
  
  public static void Zl(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] Zi() {
    return ZO;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */