package net.portswigger;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Zrz7 implements Zzj {
  private final String ZP;
  
  private final Zrx7 Z_;
  
  private final Ztj ZY;
  
  private final Zs5 ZT;
  
  private final Zs5 Zo;
  
  private final Zmc Zy;
  
  private final List<Zu8> ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrz7(String paramString, Zrx7 paramZrx7, Ztj paramZtj) {
    this.ZP = paramString;
    this.Z_ = paramZrx7;
    this.ZE = new ArrayList<>();
    this.ZY = paramZtj;
    this.Zy = new Zmc(paramZtj);
    this.ZT = new Zs8(this, this);
    this.Zo = new Zsl(this, this);
  }
  
  String ZO(Zo3 paramZo3) {
    try {
      (new Object[3])[0] = this.ZP;
      (new Object[3])[1] = paramZo3.Za;
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return String.format(a(-7721, -24494), new Object[] { null, null, (paramZo3.ZY.ZZ == null) ? "" : String.format(a(-7688, 23405), new Object[] { paramZo3.ZY.ZZ.ZF }) });
  }
  
  private String ZZ(Type paramType) {
    try {
      if (Zht.class.equals(paramType))
        return a(-7738, -19254); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (Zc1.class.equals(paramType))
        return a(-7716, -14873); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (void.class.equals(paramType))
        return a(-7741, -23627); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return a(-7719, -9218) + a(-7719, -9218);
  }
  
  String ZO(List<Zo3> paramList) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifeq -> 34
    //   13: new java/lang/UnsupportedOperationException
    //   16: dup
    //   17: sipush #-7739
    //   20: sipush #6762
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: invokespecial <init> : (Ljava/lang/String;)V
    //   29: athrow
    //   30: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   33: athrow
    //   34: aload_1
    //   35: aload_1
    //   36: invokeinterface size : ()I
    //   41: iconst_1
    //   42: isub
    //   43: invokeinterface get : (I)Ljava/lang/Object;
    //   48: checkcast net/portswigger/Zo3
    //   51: astore_3
    //   52: new java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #4
    //   61: aload #4
    //   63: bipush #123
    //   65: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   68: sipush #-7713
    //   71: sipush #29335
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: bipush #34
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: aload_3
    //   86: getfield ZK : Lnet/portswigger/Zz0;
    //   89: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   92: sipush #-7729
    //   95: sipush #24366
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: sipush #-7723
    //   107: sipush #20968
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload_0
    //   118: getfield ZP : Ljava/lang/String;
    //   121: ldc '/'
    //   123: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   126: astore #5
    //   128: aload #5
    //   130: astore #6
    //   132: aload #6
    //   134: arraylength
    //   135: istore #7
    //   137: iconst_0
    //   138: istore #8
    //   140: iload #8
    //   142: iload #7
    //   144: if_icmpge -> 209
    //   147: aload #6
    //   149: iload #8
    //   151: aaload
    //   152: astore #9
    //   154: aload #9
    //   156: invokevirtual isEmpty : ()Z
    //   159: ifeq -> 173
    //   162: aload_2
    //   163: ifnonnull -> 202
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   172: athrow
    //   173: aload_0
    //   174: aload #4
    //   176: aload #9
    //   178: aconst_null
    //   179: invokevirtual ZP : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   182: aload #4
    //   184: sipush #-7733
    //   187: iconst_2
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   201: athrow
    //   202: iinc #8, 1
    //   205: aload_2
    //   206: ifnonnull -> 140
    //   209: iconst_0
    //   210: istore #6
    //   212: iload #6
    //   214: aload_1
    //   215: invokeinterface size : ()I
    //   220: if_icmpge -> 572
    //   223: aload_1
    //   224: iload #6
    //   226: invokeinterface get : (I)Ljava/lang/Object;
    //   231: checkcast net/portswigger/Zo3
    //   234: astore #7
    //   236: aload_0
    //   237: aload #4
    //   239: aload #7
    //   241: getfield Za : Ljava/lang/String;
    //   244: aload #7
    //   246: getfield ZU : Ljava/lang/String;
    //   249: invokevirtual ZP : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   252: aload #7
    //   254: getfield ZY : Lnet/portswigger/Zrx_;
    //   257: getfield ZZ : Lnet/portswigger/Zm7;
    //   260: ifnull -> 379
    //   263: aload #4
    //   265: sipush #-7714
    //   268: sipush #-21839
    //   271: invokestatic a : (II)Ljava/lang/String;
    //   274: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: bipush #123
    //   279: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   282: sipush #-7731
    //   285: sipush #-6934
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: sipush #-7686
    //   297: sipush #-6791
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: sipush #-7724
    //   309: sipush #18839
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: pop
    //   319: aload_0
    //   320: getfield ZY : Lnet/portswigger/Ztj;
    //   323: aload #4
    //   325: aload #7
    //   327: getfield ZY : Lnet/portswigger/Zrx_;
    //   330: getfield ZZ : Lnet/portswigger/Zm7;
    //   333: getfield ZF : Ljava/lang/String;
    //   336: aload #7
    //   338: getfield ZY : Lnet/portswigger/Zrx_;
    //   341: getfield ZZ : Lnet/portswigger/Zm7;
    //   344: getfield Zq : Ljava/lang/reflect/Type;
    //   347: aload #7
    //   349: getfield ZY : Lnet/portswigger/Zrx_;
    //   352: getfield ZZ : Lnet/portswigger/Zm7;
    //   355: getfield Zn : Ljava/lang/String;
    //   358: aload #7
    //   360: getfield ZY : Lnet/portswigger/Zrx_;
    //   363: getfield ZZ : Lnet/portswigger/Zm7;
    //   366: getfield ZN : Ljava/lang/String;
    //   369: invokestatic ZD : (Lnet/portswigger/Ztj;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/String;)V
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   378: athrow
    //   379: aload #7
    //   381: getfield ZY : Lnet/portswigger/Zrx_;
    //   384: invokevirtual ZE : ()I
    //   387: ifle -> 503
    //   390: aload #4
    //   392: bipush #44
    //   394: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   397: sipush #-7715
    //   400: sipush #-8349
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: pop
    //   410: aload #7
    //   412: getfield ZY : Lnet/portswigger/Zrx_;
    //   415: invokevirtual iterator : ()Ljava/util/Iterator;
    //   418: astore #8
    //   420: aload #8
    //   422: invokeinterface hasNext : ()Z
    //   427: ifeq -> 483
    //   430: aload #8
    //   432: invokeinterface next : ()Ljava/lang/Object;
    //   437: checkcast net/portswigger/Zm7
    //   440: astore #9
    //   442: aload_0
    //   443: getfield ZY : Lnet/portswigger/Ztj;
    //   446: aload #4
    //   448: aload #9
    //   450: getfield ZF : Ljava/lang/String;
    //   453: aload #9
    //   455: getfield Zq : Ljava/lang/reflect/Type;
    //   458: aload #9
    //   460: getfield Zn : Ljava/lang/String;
    //   463: aload #9
    //   465: getfield ZN : Ljava/lang/String;
    //   468: invokestatic ZD : (Lnet/portswigger/Ztj;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/String;)V
    //   471: aload #4
    //   473: bipush #44
    //   475: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: aload_2
    //   480: ifnonnull -> 420
    //   483: aload #4
    //   485: aload #4
    //   487: invokevirtual length : ()I
    //   490: iconst_1
    //   491: isub
    //   492: invokevirtual setLength : (I)V
    //   495: aload #4
    //   497: bipush #93
    //   499: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   502: pop
    //   503: iload #6
    //   505: aload_1
    //   506: invokeinterface size : ()I
    //   511: iconst_1
    //   512: isub
    //   513: if_icmpne -> 550
    //   516: aload #4
    //   518: sipush #-7728
    //   521: sipush #-852
    //   524: invokestatic a : (II)Ljava/lang/String;
    //   527: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: aload_0
    //   531: aload #7
    //   533: getfield Zg : Ljava/lang/reflect/Type;
    //   536: invokevirtual ZN : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: pop
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   549: athrow
    //   550: aload #4
    //   552: sipush #-7714
    //   555: sipush #-21839
    //   558: invokestatic a : (II)Ljava/lang/String;
    //   561: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: pop
    //   565: iinc #6, 1
    //   568: aload_2
    //   569: ifnonnull -> 212
    //   572: aload #4
    //   574: aload #4
    //   576: invokevirtual length : ()I
    //   579: iconst_1
    //   580: isub
    //   581: invokevirtual setLength : (I)V
    //   584: aload #4
    //   586: sipush #-7726
    //   589: sipush #20539
    //   592: invokestatic a : (II)Ljava/lang/String;
    //   595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: pop
    //   599: aload #4
    //   601: invokevirtual toString : ()Ljava/lang/String;
    //   604: invokestatic Zwu : ()[Lburp/Zbqc;
    //   607: ifnonnull -> 622
    //   610: ldc 'EwTNl'
    //   612: invokestatic ZN : (Ljava/lang/String;)V
    //   615: goto -> 622
    //   618: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   621: athrow
    //   622: areturn
    // Exception table:
    //   from	to	target	type
    //   4	30	30	java/lang/UnsupportedOperationException
    //   154	166	169	java/lang/UnsupportedOperationException
    //   162	195	198	java/lang/UnsupportedOperationException
    //   236	372	375	java/lang/UnsupportedOperationException
    //   503	543	546	java/lang/UnsupportedOperationException
    //   572	615	618	java/lang/UnsupportedOperationException
  }
  
  private String ZN(Type paramType) {
    try {
      if (Zht.class.equals(paramType))
        return a(-7718, -32175); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (Zc1.class.equals(paramType))
        return a(-7687, -4097); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (void.class.equals(paramType))
        return a(-7722, 5084); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return a(-7740, -10934) + a(-7740, -10934) + this.ZY.Zz(paramType);
  }
  
  private String ZI(Zrx_ paramZrx_) {
    String str = Ziv.Zw();
    try {
      if (paramZrx_.ZE() == 0)
        return ""; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramZrx_.ZE() == 1)
        return (paramZrx_.Ze(0)).ZF + (paramZrx_.Ze(0)).ZF + a(-7725, 12354); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(a(-7727, 29514));
    for (Zm7 zm7 : paramZrx_) {
      stringBuilder.append(String.format(a(-7736, -16056), new Object[] { zm7.ZF, this.ZY.ZQ(zm7.Zq, Ziv.Zm(this.ZY, a(-7717, 29226))) }));
      if (str == null)
        break; 
    } 
    stringBuilder.setLength(stringBuilder.length() - 2);
    return stringBuilder.append(a(-7730, -26133)).toString();
  }
  
  private void ZP(StringBuilder paramStringBuilder, String paramString1, String paramString2) {
    try {
      paramStringBuilder.append('{').append(a(-7737, 4072)).append(a(-7743, 31990)).append(a(-7734, -16379)).append('"').append(Zv3.Zj(paramString1)).append('"');
      if (paramString2 != null)
        paramStringBuilder.append(',').append(a(-7685, -11486)).append('"').append(Zv3.Zj(paramString2)).append('"'); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private static void ZD(Ztj paramZtj, StringBuilder paramStringBuilder, String paramString1, Type paramType, String paramString2, String paramString3) {
    try {
      paramStringBuilder.append('{').append(a(-7744, -12233)).append('"').append(Zv3.Zj(paramString1)).append('"').append(',').append(a(-7731, -6934));
      paramStringBuilder.append(Ziv.Zo(paramZtj, paramType));
      if (paramString2 != null)
        paramStringBuilder.append(',').append(a(-7735, 31735)).append('"').append(Zv3.Zj(paramString2)).append('"'); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramString3 != null)
        paramStringBuilder.append(',').append(a(-7742, 23480)).append(paramString3); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    paramStringBuilder.append('}');
  }
  
  public void Zy(Zu8 paramZu8) {
    this.ZE.add(paramZu8);
  }
  
  public Zf7 ZY() {
    return new Zn_(new Ziv(this.Z_, this.ZE, this.ZY, this.ZT, this.Zy, this.Zo));
  }
  
  public void ZF(List<Zo3> paramList) {
    this.Zo.ZF(paramList);
    this.ZT.ZF(paramList);
  }
  
  public void ZJ(Zkr paramZkr) {
    this.Zy.ZJ(paramZkr);
  }
  
  public void ZT(Zrmx paramZrmx) {
    this.Zy.ZT(paramZrmx);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÔáñDñ(Rd¸ü±Q¡ö+>fÊ\\bª9Þh/©Å55~ÕR\\r!á~ß_b£Þ}<kj0öÞÄëçý:/5·qûêOF²F<§ØÐ¼iä°ºQ[ªyñ\\nP½PÐëÃ¥þµHÝì\\fýà\\n_ªð(æÊ0$¥@ll'a¼ëåá´bÜ­è1\\fËÆ ým§Ái²K£ >\\bÞÛÀÞôÁµT\\r±ª>p}\\t<-Ô\\fi"\\b9<Õk Fx0D\\nõV·Û*³ÝWkDüY$}g¿Õ¦¹/Ð';\\nÜìçÜ«©1êô çOr¦ºpw&ÊRÿÏ·¾úWMN§m¨Ê=ÒÏ$ j¯M}i£Aû?dXpw/¼i¬m¾?{¸-ÓVhV-Q\\nªeÃ\\n 2`v NmgÃ!e¤d\\bNýÞÉup¢\\fÆÖ\\fI~#?oÐGÖlz±í5FA\\n\\tÈ?rñ&=¥öº\\r×ÕîÓªòÊ.B½Æö1É¸Ô2h\\tiÄ©¨ï8nß^Ø,%¶Bv]4ß-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '=òð\\flf@yTØ"'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #119
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/Zrz7.a : [Ljava/lang/String;
    //   131: bipush #36
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zrz7.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #38
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #68
    //   239: goto -> 244
    //   242: bipush #8
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE1DA) & 0xFFFF;
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
      byte b1 = 11;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrz7.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */