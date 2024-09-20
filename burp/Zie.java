package burp;

import java.awt.Window;
import java.util.List;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zie {
  private final Zrq8 Zl;
  
  private final Zxts ZG;
  
  private final Zl0 ZN;
  
  private List<String> Zi;
  
  private List<String> ZL;
  
  private List<String> ZF;
  
  private List<String> Zy;
  
  private List<String> ZP;
  
  private List<String> ZZ;
  
  private List<String> Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zie(Zrq8 paramZrq8, Zxts paramZxts, Zl0 paramZl0) {
    this.Zl = paramZrq8;
    this.ZG = paramZxts;
    this.ZN = paramZl0;
  }
  
  boolean ZO(Window paramWindow) {
    // Byte code:
    //   0: invokestatic Za : ()[I
    //   3: astore_2
    //   4: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   7: aload_1
    //   8: sipush #-10272
    //   11: sipush #-394
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: new burp/Zkmf
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: invokestatic ZL : (Lburp/Zg1m;Ljava/awt/Component;Ljava/lang/String;Ljavax/swing/filechooser/FileFilter;)[Ljava/io/File;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnonnull -> 38
    //   32: iconst_0
    //   33: ireturn
    //   34: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   37: athrow
    //   38: aload_3
    //   39: arraylength
    //   40: iconst_1
    //   41: if_icmple -> 52
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   51: athrow
    //   52: iconst_0
    //   53: istore #4
    //   55: aload_0
    //   56: new java/util/ArrayList
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: putfield Zi : Ljava/util/List;
    //   66: aload_0
    //   67: new java/util/ArrayList
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: putfield ZL : Ljava/util/List;
    //   77: aload_0
    //   78: new java/util/ArrayList
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: putfield ZF : Ljava/util/List;
    //   88: aload_0
    //   89: new java/util/ArrayList
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: putfield Zy : Ljava/util/List;
    //   99: aload_0
    //   100: new java/util/ArrayList
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: putfield ZP : Ljava/util/List;
    //   110: aload_0
    //   111: new java/util/ArrayList
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: putfield ZZ : Ljava/util/List;
    //   121: aload_0
    //   122: new java/util/ArrayList
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: putfield Za : Ljava/util/List;
    //   132: aload_3
    //   133: astore #5
    //   135: aload #5
    //   137: arraylength
    //   138: istore #6
    //   140: iconst_0
    //   141: istore #7
    //   143: iload #7
    //   145: iload #6
    //   147: if_icmpge -> 405
    //   150: aload #5
    //   152: iload #7
    //   154: aaload
    //   155: astore #8
    //   157: aload #8
    //   159: invokevirtual getName : ()Ljava/lang/String;
    //   162: astore #9
    //   164: aload_0
    //   165: aload #9
    //   167: invokevirtual Zg : (Ljava/lang/String;)Ljava/lang/String;
    //   170: astore #10
    //   172: aload #8
    //   174: aload_0
    //   175: getfield ZN : Lnet/portswigger/Zl0;
    //   178: getstatic net/portswigger/Zae.Z_ : Ljava/nio/charset/Charset;
    //   181: invokestatic Zr : (Ljava/io/File;Lnet/portswigger/Zl0;Ljava/nio/charset/Charset;)Ljava/lang/String;
    //   184: astore #11
    //   186: new burp/Zz0e
    //   189: dup
    //   190: aload #11
    //   192: invokespecial <init> : (Ljava/lang/String;)V
    //   195: invokevirtual ZO : ()Lburp/Zzkm;
    //   198: astore #12
    //   200: aload #12
    //   202: invokestatic Zo : (Lburp/Zmf_;)Ljava/util/Set;
    //   205: astore #13
    //   207: aload #13
    //   209: invokeinterface isEmpty : ()Z
    //   214: ifeq -> 240
    //   217: aload_0
    //   218: getfield ZF : Ljava/util/List;
    //   221: aload #9
    //   223: invokeinterface add : (Ljava/lang/Object;)Z
    //   228: pop
    //   229: aload_2
    //   230: ifnull -> 270
    //   233: goto -> 240
    //   236: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   239: athrow
    //   240: aload_0
    //   241: getfield ZG : Lburp/Zxts;
    //   244: aload #10
    //   246: aload #12
    //   248: invokevirtual ZB : (Ljava/lang/String;Lburp/Zmf_;)V
    //   251: aload_0
    //   252: getfield Za : Ljava/util/List;
    //   255: aload #10
    //   257: invokeinterface add : (Ljava/lang/Object;)Z
    //   262: pop
    //   263: goto -> 270
    //   266: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   269: athrow
    //   270: goto -> 398
    //   273: astore #11
    //   275: aload #11
    //   277: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   280: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   283: aload_0
    //   284: getfield Zy : Ljava/util/List;
    //   287: aload #9
    //   289: invokeinterface add : (Ljava/lang/Object;)Z
    //   294: pop
    //   295: goto -> 398
    //   298: astore #11
    //   300: aload #11
    //   302: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: aload #11
    //   310: getfield ZK : Z
    //   313: ifeq -> 339
    //   316: aload_0
    //   317: getfield Zi : Ljava/util/List;
    //   320: aload #10
    //   322: invokeinterface add : (Ljava/lang/Object;)Z
    //   327: pop
    //   328: aload_2
    //   329: ifnull -> 358
    //   332: goto -> 339
    //   335: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   338: athrow
    //   339: aload_0
    //   340: getfield ZL : Ljava/util/List;
    //   343: aload #10
    //   345: invokeinterface add : (Ljava/lang/Object;)Z
    //   350: pop
    //   351: goto -> 358
    //   354: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   357: athrow
    //   358: goto -> 398
    //   361: astore #11
    //   363: aload #11
    //   365: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   368: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   371: aload_0
    //   372: getfield ZP : Ljava/util/List;
    //   375: aload #9
    //   377: invokeinterface add : (Ljava/lang/Object;)Z
    //   382: pop
    //   383: aload_0
    //   384: getfield ZZ : Ljava/util/List;
    //   387: aload #11
    //   389: invokevirtual getMessage : ()Ljava/lang/String;
    //   392: invokeinterface add : (Ljava/lang/Object;)Z
    //   397: pop
    //   398: iinc #7, 1
    //   401: aload_2
    //   402: ifnull -> 143
    //   405: aload_0
    //   406: getfield Zi : Ljava/util/List;
    //   409: invokeinterface isEmpty : ()Z
    //   414: ifeq -> 493
    //   417: aload_0
    //   418: getfield ZL : Ljava/util/List;
    //   421: invokeinterface isEmpty : ()Z
    //   426: ifeq -> 493
    //   429: goto -> 436
    //   432: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   435: athrow
    //   436: aload_0
    //   437: getfield ZF : Ljava/util/List;
    //   440: invokeinterface isEmpty : ()Z
    //   445: ifeq -> 493
    //   448: goto -> 455
    //   451: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   454: athrow
    //   455: aload_0
    //   456: getfield ZP : Ljava/util/List;
    //   459: invokeinterface isEmpty : ()Z
    //   464: ifeq -> 493
    //   467: goto -> 474
    //   470: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   473: athrow
    //   474: aload_0
    //   475: getfield Zy : Ljava/util/List;
    //   478: invokeinterface isEmpty : ()Z
    //   483: ifne -> 571
    //   486: goto -> 493
    //   489: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   492: athrow
    //   493: iload #4
    //   495: ifeq -> 548
    //   498: goto -> 505
    //   501: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   504: athrow
    //   505: aload_0
    //   506: getfield Zl : Lburp/Zrq8;
    //   509: aload_1
    //   510: sipush #-10255
    //   513: sipush #-14770
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: sipush #-10262
    //   522: sipush #-9104
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: aload_0
    //   529: invokevirtual Zs : ()Ljava/lang/String;
    //   532: invokeinterface ZT : (Ljava/awt/Window;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   537: aload_2
    //   538: ifnull -> 619
    //   541: goto -> 548
    //   544: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   547: athrow
    //   548: aload_1
    //   549: sipush #-10255
    //   552: sipush #-14770
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aload_0
    //   559: invokevirtual ZO : ()Ljava/lang/String;
    //   562: invokestatic Zv : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   565: iconst_0
    //   566: ireturn
    //   567: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   570: athrow
    //   571: aload_1
    //   572: sipush #-10255
    //   575: sipush #-14770
    //   578: invokestatic a : (II)Ljava/lang/String;
    //   581: sipush #-10264
    //   584: sipush #-10572
    //   587: invokestatic a : (II)Ljava/lang/String;
    //   590: iconst_1
    //   591: anewarray java/lang/Object
    //   594: dup
    //   595: iconst_0
    //   596: iload #4
    //   598: ifeq -> 610
    //   601: ldc 's'
    //   603: goto -> 612
    //   606: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   609: athrow
    //   610: ldc ''
    //   612: aastore
    //   613: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   616: invokestatic Zf : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;)V
    //   619: iconst_1
    //   620: ireturn
    // Exception table:
    //   from	to	target	type
    //   28	34	34	burp/Ze0d
    //   38	48	48	burp/Ze0d
    //   172	270	273	burp/Ze0d
    //   172	270	298	burp/Zz6j
    //   172	270	361	java/io/IOException
    //   207	233	236	burp/Ze0d
    //   217	263	266	burp/Ze0d
    //   300	332	335	burp/Ze0d
    //   316	351	354	burp/Ze0d
    //   405	429	432	burp/Ze0d
    //   417	448	451	burp/Ze0d
    //   436	467	470	burp/Ze0d
    //   455	486	489	burp/Ze0d
    //   474	498	501	burp/Ze0d
    //   493	541	544	burp/Ze0d
    //   505	567	567	burp/Ze0d
    //   571	606	606	burp/Ze0d
  }
  
  private String Zs() {
    int[] arrayOfInt = Zmln.Za();
    StringBuilder stringBuilder = new StringBuilder();
    if (!this.Zi.isEmpty()) {
      stringBuilder.append(a(-10261, 8857));
      for (String str : this.Zi) {
        stringBuilder.append(a(-10263, 3219)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.ZL.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-10266, -560)); 
      stringBuilder.append(a(-10256, 19147));
      for (String str : this.ZL) {
        stringBuilder.append(a(-10271, -23745)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.ZF.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-10253, -1731)); 
      stringBuilder.append(a(-10265, 11003));
      for (String str : this.ZF) {
        stringBuilder.append(a(-10271, -23745)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.Zy.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-10253, -1731)); 
      stringBuilder.append(a(-10267, -9642));
      for (String str : this.Zy) {
        stringBuilder.append(a(-10271, -23745)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.ZP.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-10253, -1731)); 
      stringBuilder.append(a(-10269, -7488));
      byte b = 0;
      while (b < this.ZP.size()) {
        stringBuilder.append(a(-10271, -23745)).append(this.ZP.get(b)).append(a(-10260, -2099)).append(this.ZZ.get(b)).append("\n");
        b++;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    if (!this.Za.isEmpty()) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(-10253, -1731)); 
      stringBuilder.append(a(-10258, -25930));
      for (String str : this.Za) {
        stringBuilder.append(a(-10271, -23745)).append(str).append("\n");
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return stringBuilder.toString();
  }
  
  private String ZO() {
    if (!this.Zi.isEmpty())
      return a(-10252, -31017) + a(-10252, -31017) + (String)this.Zi.get(0); 
    if (!this.ZL.isEmpty())
      return a(-10268, 14674) + a(-10268, 14674) + (String)this.ZL.get(0); 
    if (!this.ZF.isEmpty())
      return a(-10251, -24164); 
    if (!this.Zy.isEmpty())
      return a(-10257, 13821); 
    if (!this.ZZ.isEmpty())
      return a(-10259, -16560) + a(-10259, -16560); 
    Zuh.Zb(false, Zqf.Zr);
    return "";
  }
  
  private String Zg(String paramString) {
    int i = paramString.lastIndexOf('.');
    return (i != -1) ? paramString.substring(0, i) : paramString;
  }
  
  private static Ze0d a(Ze0d paramZe0d) {
    return paramZe0d;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ùU°4õþo)¼EOý¨þæNãöéÿ[@Ú0\\f\4{:J-<ªh0A^t5õ$KHBg\\fÏ2¦`}·\lÔòýz"M÷6ÞFb<ûåLê×ÿ¬¸J×®¯cø)ã?f¤ÆÿKÐCãØ&6H¾$©\\t?Õ¹l1[UÅvûC½`#ò5>~"ó{A©PÉq9Þ"ææ©ñkc[>ÇºloqðÝ-ì[àÜãwºNýØÇ7Ç;¬#3O¾6·)7eÛ3b¤ªö·GÞz8ád,xd½ß4Q$}Ï¶5ÞaüÒö|Öú÷£Ä\\fÉ}$\·Ü\\bæ¶#:¢çþí§ºp5%~{¯4P»GL#xÊz\\r}CAjT¹¼`ÈÀcÑvøp·ÄÌ½jëbÒÀº¹@&R}Ï»¬6Ô5^ð£D»té4UÈ\\b<]¶ïÌý\\bxÞ¼yLg¤;+Ö/EÍ¨Iu³¹zprúâ¬Íª®ÃÄHÙÂE+¿´¹;+<i{)UsYLocÈk&ífë¹PiW\\r3¼s÷¶«4Ýv@î®_X2ÿ"KÏ\\fµÙêÅ&:1ÉçýR¡@«U¤ÀÊÖÖu2Í×ýÓÖTKòR®óèê1Oe,I}¦dÆ\\nü$­é7¶v[êÛ<%dGå'zaMcËDÑÂ¶ º èU:(ðî¥&·é¨`#ë4Í\èëÅ(ùDÌ¦A¸¹íi»$©m°®ÉÒLwâÄqz5\\fU\\n=+8rÂ¾HdúeìFhõÊõW©øýáÂ§2ìsåBOi³Ó½úÜ?t&ÎùF&\\n"#¨X¡ÄuÆ\\fôüÀÂ.¿Gh¹mïø¼^dZ³tãµû[âÝá»©¬è×óZãöWo5@{)rvñ+e5\\bjðÑ7¯Ç^+è{ö1wÐ;ÅáñÆjsWÈ\\ta ÚÂ;2QÙq$,K©îJ;Qù÷}Oöð¶ýQ`Hê|m9¤WÏºSD'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'äÿ#qRå¡ÜåJI¨û-ËîËì£pêÝ)!Ì5/õçaþÄÍ{Ü /ÀPt<¿\\töpÿ¶àö\?8ï{JýSg9õP'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #115
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zie.a : [Ljava/lang/String;
    //   132: bipush #22
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zie.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #11
    //   214: goto -> 243
    //   217: bipush #11
    //   219: goto -> 243
    //   222: bipush #41
    //   224: goto -> 243
    //   227: bipush #39
    //   229: goto -> 243
    //   232: bipush #124
    //   234: goto -> 243
    //   237: iconst_2
    //   238: goto -> 243
    //   241: bipush #24
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD7E0) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */