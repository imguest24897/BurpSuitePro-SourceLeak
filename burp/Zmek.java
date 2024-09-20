package burp;

import java.util.EnumSet;
import java.util.function.Consumer;

public class Zmek extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmek() {
    super(EnumSet.of(Zzqz.VARIANT, Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic ZI : ()Ljava/lang/String;
    //   12: aload #5
    //   14: invokevirtual Zx : ()Lburp/Zrp9;
    //   17: aload #12
    //   19: aload #6
    //   21: aload #4
    //   23: iload_2
    //   24: iload_3
    //   25: aload_1
    //   26: <illegal opcode> accept : (Ljava/lang/StringBuilder;Lburp/Zefg;Lburp/Ztlj;BILburp/Zvs;)Ljava/util/function/Consumer;
    //   31: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   36: pop
    //   37: astore #11
    //   39: aload #5
    //   41: invokevirtual Zr : ()Lburp/Zzq1;
    //   44: aload_0
    //   45: iload_2
    //   46: aload #5
    //   48: aload #6
    //   50: aload #12
    //   52: invokevirtual Zs : (BLburp/Ztub;Lburp/Zefg;Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   55: invokeinterface ZI : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   60: pop
    //   61: aload #12
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: aload #11
    //   68: ifnonnull -> 78
    //   71: iconst_2
    //   72: anewarray burp/Zbqc
    //   75: invokestatic Zr : ([Lburp/Zbqc;)V
    //   78: areturn
  }
  
  private Consumer<Zzq1> Zs(byte paramByte, Ztub paramZtub, Zefg<Zxtl> paramZefg, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #18
    //   3: if_icmpeq -> 12
    //   6: iload_1
    //   7: bipush #19
    //   9: if_icmpne -> 53
    //   12: iload_1
    //   13: bipush #18
    //   15: if_icmpne -> 30
    //   18: sipush #6500
    //   21: sipush #-11365
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: goto -> 39
    //   30: sipush #6517
    //   33: sipush #-2989
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: astore #5
    //   41: aload_2
    //   42: aload #5
    //   44: aload #4
    //   46: aload_3
    //   47: <illegal opcode> accept : (Lburp/Ztub;Ljava/lang/String;Ljava/lang/StringBuilder;Lburp/Zefg;)Ljava/util/function/Consumer;
    //   52: areturn
    //   53: aload_2
    //   54: aload_3
    //   55: aload #4
    //   57: <illegal opcode> accept : (Lburp/Ztub;Lburp/Zefg;Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   62: areturn
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    if (!paramZtlj.Zn(Ztz3.LOCATION))
      return null; 
    Zr2s zr2s = new Zr2s(paramZtlj, paramZefg, paramInt, Zmey.ZS(paramZefg));
    paramZtub.ZT(zr2s);
    return zr2s.Zn;
  }
  
  private static void ZL(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, Zmzk paramZmzk1, Zmzk paramZmzk2, String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZI : ()Ljava/lang/String;
    //   3: astore #12
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq -> 14
    //   10: iconst_1
    //   11: goto -> 15
    //   14: iconst_0
    //   15: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   18: lconst_1
    //   19: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   22: aload_0
    //   23: sipush #6498
    //   26: sipush #20660
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_0
    //   37: aload_1
    //   38: iconst_1
    //   39: iconst_1
    //   40: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_0
    //   48: sipush #6477
    //   51: sipush #-4332
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload #8
    //   63: aload #9
    //   65: invokeinterface equals : (Ljava/lang/Object;)Z
    //   70: ifne -> 107
    //   73: aload_0
    //   74: sipush #6475
    //   77: sipush #-16474
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload #8
    //   88: invokestatic Zh : (Lburp/Zmzk;)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: sipush #6520
    //   97: sipush #27412
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_0
    //   108: aload #6
    //   110: invokestatic ZG : ([B)Ljava/lang/String;
    //   113: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   116: aload_0
    //   117: sipush #6525
    //   120: sipush #15880
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_0
    //   131: iload_2
    //   132: iload_3
    //   133: invokestatic ZH : (BB)Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload_0
    //   141: sipush #6503
    //   144: sipush #22609
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload #8
    //   156: aload #9
    //   158: invokeinterface equals : (Ljava/lang/Object;)Z
    //   163: ifne -> 200
    //   166: aload_0
    //   167: sipush #6513
    //   170: sipush #-12020
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: aload #9
    //   181: invokestatic Zh : (Lburp/Zmzk;)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: sipush #6520
    //   190: sipush #27412
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload_0
    //   201: aload #7
    //   203: invokestatic ZG : ([B)Ljava/lang/String;
    //   206: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   209: aload_0
    //   210: sipush #6514
    //   213: sipush #-13897
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload #4
    //   225: invokestatic ZG : ([B)Ljava/lang/String;
    //   228: astore #13
    //   230: aload_0
    //   231: aload #13
    //   233: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   236: aload_0
    //   237: sipush #6502
    //   240: sipush #-7558
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: aload_0
    //   251: aload_1
    //   252: iconst_1
    //   253: iconst_0
    //   254: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload_0
    //   262: sipush #6497
    //   265: sipush #5192
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload #5
    //   277: invokestatic ZG : ([B)Ljava/lang/String;
    //   280: astore #14
    //   282: aload #13
    //   284: aload #14
    //   286: invokevirtual equals : (Ljava/lang/Object;)Z
    //   289: ifeq -> 311
    //   292: aload_0
    //   293: sipush #6476
    //   296: sipush #27491
    //   299: invokestatic a : (II)Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload #12
    //   308: ifnonnull -> 345
    //   311: aload_0
    //   312: sipush #6499
    //   315: sipush #25003
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload_0
    //   326: aload #14
    //   328: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   331: aload_0
    //   332: sipush #6520
    //   335: sipush #27412
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: iload_3
    //   346: bipush #14
    //   348: if_icmpne -> 419
    //   351: aload_0
    //   352: sipush #6501
    //   355: sipush #-24778
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: aload #11
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: sipush #6479
    //   372: sipush #11551
    //   375: invokestatic a : (II)Ljava/lang/String;
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: aload #10
    //   383: invokestatic Zu : (Ljava/lang/String;)Ljava/lang/String;
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: sipush #6510
    //   392: sipush #25174
    //   395: invokestatic a : (II)Ljava/lang/String;
    //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: aload #10
    //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: sipush #6518
    //   409: sipush #3302
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload_0
    //   420: sipush #6504
    //   423: sipush #-6000
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: pop
    //   433: aload #8
    //   435: aload #9
    //   437: invokeinterface equals : (Ljava/lang/Object;)Z
    //   442: ifne -> 479
    //   445: aload_0
    //   446: sipush #6513
    //   449: sipush #-12020
    //   452: invokestatic a : (II)Ljava/lang/String;
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: aload #9
    //   460: invokestatic Zh : (Lburp/Zmzk;)Ljava/lang/String;
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: sipush #6520
    //   469: sipush #27412
    //   472: invokestatic a : (II)Ljava/lang/String;
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: aload_0
    //   480: aload #7
    //   482: invokestatic ZG : ([B)Ljava/lang/String;
    //   485: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   488: aload_0
    //   489: ldc '.'
    //   491: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: pop
    //   495: return
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return Zy(paramZrdb1, paramZrdb2, new Zrbk(), paramZz1h);
  }
  
  private static void ZC(Ztub paramZtub, Zefg<Zxtl> paramZefg, StringBuilder paramStringBuilder, Zzq1 paramZzq1) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zx : ()Lburp/Zrp9;
    //   4: aload_2
    //   5: <illegal opcode> accept : (Ljava/lang/StringBuilder;)Ljava/util/function/Consumer;
    //   10: invokeinterface Zd : (Ljava/util/function/Consumer;)Lburp/Zr1s;
    //   15: aload_2
    //   16: <illegal opcode> ZC : (Ljava/lang/StringBuilder;)Lburp/Ztkz;
    //   21: invokeinterface ZH : (Lburp/Ztkz;)V
    //   26: invokestatic ZI : ()Ljava/lang/String;
    //   29: aload_2
    //   30: sipush #6505
    //   33: sipush #22236
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: astore #4
    //   45: aload_2
    //   46: aload_3
    //   47: invokeinterface Zub : ()Lburp/Zll7;
    //   52: invokeinterface Zsf : ()Lburp/Zstu;
    //   57: invokeinterface Zis : ()Ljava/lang/String;
    //   62: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   65: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   68: aload_2
    //   69: sipush #6526
    //   72: sipush #16686
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_1
    //   82: iconst_1
    //   83: iconst_1
    //   84: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: sipush #6516
    //   93: sipush #-21919
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_3
    //   104: invokeinterface ZRs : ()Lburp/Zsnv;
    //   109: astore #5
    //   111: aload #5
    //   113: ifnull -> 135
    //   116: aload_2
    //   117: sipush #6511
    //   120: sipush #8652
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload #4
    //   132: ifnonnull -> 149
    //   135: aload_2
    //   136: sipush #6496
    //   139: sipush #10097
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_2
    //   150: sipush #6474
    //   153: sipush #8133
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_3
    //   164: invokeinterface ZRH : ()Ljava/util/List;
    //   169: invokestatic ZS : (Ljava/util/Collection;)J
    //   172: lstore #6
    //   174: lload #6
    //   176: lconst_0
    //   177: lcmp
    //   178: ifle -> 220
    //   181: aload_2
    //   182: sipush #6523
    //   185: sipush #-13974
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: lload #6
    //   196: invokestatic ZE : (J)Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: sipush #6515
    //   205: sipush #-5348
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload #4
    //   217: ifnonnull -> 234
    //   220: aload_2
    //   221: sipush #6507
    //   224: sipush #-22443
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload #5
    //   236: ifnull -> 324
    //   239: aload #5
    //   241: invokeinterface Zs : ()Lburp/Zzi8;
    //   246: invokeinterface Zos : ()Lburp/Zstu;
    //   251: astore #8
    //   253: aload #8
    //   255: sipush #6527
    //   258: sipush #30077
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: iconst_0
    //   265: invokestatic ZV : (Lburp/Zstu;Ljava/lang/String;Z)Ljava/lang/String;
    //   268: astore #9
    //   270: aload #9
    //   272: ifnull -> 324
    //   275: aload_2
    //   276: sipush #6524
    //   279: sipush #-30732
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload #9
    //   291: bipush #8
    //   293: invokevirtual substring : (I)Ljava/lang/String;
    //   296: invokevirtual trim : ()Ljava/lang/String;
    //   299: astore #10
    //   301: aload_2
    //   302: aload #10
    //   304: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   307: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   310: aload_2
    //   311: sipush #6478
    //   314: sipush #1288
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: return
  }
  
  private static void lambda$describeCoreIssueDeferred$4(StringBuilder paramStringBuilder) {
    paramStringBuilder.append(a(6521, 12702));
  }
  
  private static void lambda$describeCoreIssueDeferred$3(StringBuilder paramStringBuilder, Zrp9 paramZrp9) {
    paramStringBuilder.append(a(6508, -2755));
  }
  
  private static void lambda$findOutBandBehaviour$2(Ztub paramZtub, Zefg<Zxtl> paramZefg, StringBuilder paramStringBuilder, Zzq1 paramZzq1) {
    ZC(paramZtub, paramZefg, paramStringBuilder, paramZzq1);
  }
  
  private static void lambda$findOutBandBehaviour$1(Ztub paramZtub, String paramString, StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, Zzq1 paramZzq1) {
    String str = (paramZtub.Zr().ZRs() == null) ? String.format(a(6519, -27434), new Object[] { paramString }) : String.format(a(6522, -2037), new Object[] { paramString });
    paramStringBuilder.append(a(6473, 13718)).append(Zg2x.Zt(paramZefg, true, true)).append(".").append(a(6509, 29662)).append(a(6506, 18124)).append(a(6512, -4744)).append(str).append(a(6472, -23505));
    Ztsn.ZV(paramZtub, paramStringBuilder);
  }
  
  private static void lambda$buildIssueDetail$0(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, Ztlj paramZtlj, byte paramByte, int paramInt, Zvs paramZvs, Zrp9 paramZrp9) {
    ZL(paramStringBuilder, paramZefg, paramZtlj.Zq(Ztz3.LOCATION), paramByte, paramZrp9.Zub().Zsf().ZiD(), paramZtlj.Zm(Ztz3.MATCH), paramZrp9.Zvs(), paramZrp9.ZvM(), paramZrp9.Zvh().Zod(), paramZrp9.ZvU().Zod(), paramZtlj.ZJ(Ztz3.HTML_TAG), paramZtlj.ZJ(Ztz3.HTML_ATTRIBUTE));
    Zmea.Zi(paramStringBuilder, paramInt, paramByte, Zmey.ZS(paramZefg));
    Zmea.Zb(paramStringBuilder, paramZvs, paramInt, paramZtlj.ZR(Ztz3.STATUS_CODE), ((Zxtl)paramZefg.get(0)).ZTr());
    Zx_r.Zs(paramStringBuilder, paramZrp9.ZvM(), paramInt, paramZtlj);
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\t³µRô­4º;/5ÿé98×ÄpªÉ 3ÞÁAjæþ'1l/ædñw¸=C §;k_ôSïÃ5Ø>^ÇîãªyîuÖ¥,Ë{râ\\n\\f]Z-Có8EöCQQD#¾ÑÈY)0Ã#í§2°åÄàôä®f¥ÆÄÐÏùU4RéØ÷ÁQe3`<cgåÄ®#O·¶yCÐ¡éÙ"[ñºÖO'>ÒDrvhÉ+èÔàó­ÞRF£Z{|³ö\\b¶QO½1.»Z5æ4{ÏSk\\tÍi&SäE+dXq¹4mOWY·áu2´oÞ^\\tðCÖåêEîÒâ'õ`ò¯Ïã_Ù\\f{ö¼Í¨\{ÓÄèCH!ÛdÛ)ÔÈmDFY$MXw¶ØF¸M·â#¼e¶¯\\nJLNTlZ/}B©ìBgêò"[è9\\nÍÓU_ÆJÉßD\\rÂ.Ig9"ÑØ¨\\bp·¾áÜÆAk`Gê@6Çºs×p6£å²Ë>Â5S½e\\tmjº­,:Öhõ»QúKµ9»-SÛòþõ¾ÆÄÜÁ=Ödxnú´Q¼\\t¿H oñNRËÝ».´~8®ÞÓåà§$á\\rÝJÓcìßA\\f\\b«¯0giÚbNHÿ%°$·¢xÑ$yð[»»½¬ºï««\\nZ\%i¸Ê§4ê\\f²Jyt5§£<év¶9çJ;tn29"S0Äú¼Ü0Fð\\rº1ñ¡ôº²ðèÌ'½¢'y©VPip*N#6@ý£ç\\n¬FèÏI÷-¾wãð£ÍüîÕðH È«µ/Ç%>ë`\\tâ?â/ÚÊ©,s\\tj:Zøz\\b«ÑÄÔó`¿Ö£èÂ çºÅÒ«#F ¼ÜÍLE­+¸´LJ5okð¤µÛ}Ð5L(Ê]Û8§=}òFê½®WË&÷CºI"¹û"Ùº²©]Hq©¶pÌ':3B;R±B>BVÞÝÎ?$\\rþÀ\\t¬PPk`oÒ±)îñgYpîëSt½HªúJD§ãh§Têôq;fRÂ\\t\\b»n+c²ºª7Ë½oJõ=¹±*æo:û³z³ÙÁ)Á"3¦qRó¼ÂLwW|CépzxÐ&\Mä:ú§Õ¾pE\\r]r6aêÚ«§fÃ&«B 6]H_¾'êï9§<Ì¥;¤à¬¢éþ2Ð*¸éq:w|(õ4\çÅäÌnÃnÇÉ£U³JP-)\ÆUËhe¾d¡~y>Ù·Ú¸yÍ-\\f`,³È6 /þ`ôÞ²ÈMxJäÙ®YØÜ#BDk&Ã ßô¨Tn¹}Ï©þ\\rÇuC2'&úFk8úSQnj`òà=qÜQÅXÎÊu-)/è,uÓMÑ@Wþèuì(D¬2KäR¢KR/ÎÌ53bÝC1Ù_9¹®6Ìá)×®4Ê·ø$Ûê±I=PÛñ¼nhX'Ü*"ÁíCÁ¶gÞô¯ü"Uer`ÆöÏ«ëç¼£`e\\rlmYÓ­}}þ:7èjBÄRy³ôâ2ç\\nEë¡Ý2v¯àÜýL¨yáÍÊ¡k³°Ì+tþùªz#G|¼1^\\nºÜ\\nVòÅÙÝUYJ±îïÆÇÓ)rÎÞçî|ÃDð°mÛÉ»ñ¶rÌcÈU|¤£{õ<tü½/l:F¼fý^Î%2yiREGJJµfã&Ë?ÔâºÃÃmPõÀIu¼ú'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #50
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
    //   68: ldc 'eÐU.ó°X¯ê]{t\Êv"·ÁÚr|®\\nI÷þAgú½[SÑ,X¢ïù¦Öï\\npî·aÕ/íþqE£oÌÄz]<¡bØºÃRYX)6©Ü\\t l\\tÚüêýi#h®ØÅ<'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #31
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #113
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
    //   129: putstatic burp/Zmek.a : [Ljava/lang/String;
    //   132: bipush #40
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmek.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #105
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #27
    //   229: goto -> 244
    //   232: bipush #68
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #74
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x196F) & 0xFFFF;
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
      char c = '«';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmek.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */