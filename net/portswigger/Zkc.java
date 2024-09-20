package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Zkc {
  private static final Zfz ZL;
  
  private static final Map<Class<? extends Zot>, List<Zux>> ZT;
  
  private static final String a;
  
  @SafeVarargs
  private static void Zv(Z_c paramZ_c, Class<? extends Zot>... paramVarArgs) {
    Zx(paramZ_c, Zkc::lambda$registerFormatter$13, paramVarArgs);
  }
  
  @SafeVarargs
  private static void Zx(Z_c paramZ_c, Predicate<Zot> paramPredicate, Class<? extends Zot>... paramVarArgs) {
    Zux zux = paramZ_c.ZJ(paramPredicate);
    for (Class<? extends Zot> clazz : paramVarArgs)
      ((List<Zux>)ZT.computeIfAbsent(clazz, Zkc::lambda$registerFormatter$14)).add(zux); 
  }
  
  private static List<Zux> Zc(Zot paramZot) {
    return ((List<Zux>)ZT.getOrDefault(paramZot.getClass(), List.of(Zux.ZA))).stream().filter(paramZot::lambda$formattersFor$15).toList();
  }
  
  public String Zw(Zyq paramZyq) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = Zb6.Zr();
    ZB(stringBuilder, paramZyq, 0);
    if (Zbqc.Zwu() == null)
      Zb6.Zc(!bool); 
    return (String)Arrays.stream(stringBuilder.toString().split(System.lineSeparator())).map(Zkc::lambda$format$16).collect(Collectors.joining(System.lineSeparator())) + (String)Arrays.stream(stringBuilder.toString().split(System.lineSeparator())).map(Zkc::lambda$format$16).collect(Collectors.joining(System.lineSeparator()));
  }
  
  private void ZB(StringBuilder paramStringBuilder, Zot paramZot, int paramInt) {
    // Byte code:
    //   0: invokestatic Zs : ()Z
    //   3: aload_2
    //   4: invokeinterface ZU : ()Ljava/util/List;
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore #5
    //   16: istore #4
    //   18: aload #5
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 189
    //   28: aload #5
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/portswigger/Zot
    //   38: astore #6
    //   40: aload #6
    //   42: invokeinterface Ze : ()Lnet/portswigger/Zfh;
    //   47: getstatic net/portswigger/Zfh.EOF : Lnet/portswigger/Zfh;
    //   50: if_acmpne -> 72
    //   53: aload_1
    //   54: invokestatic lineSeparator : ()Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_0
    //   62: aload_1
    //   63: aload_2
    //   64: aload #6
    //   66: ldc ''
    //   68: invokevirtual ZS : (Ljava/lang/StringBuilder;Lnet/portswigger/Zot;Lnet/portswigger/Zot;Ljava/lang/String;)V
    //   71: return
    //   72: aload #6
    //   74: invokestatic Zc : (Lnet/portswigger/Zot;)Ljava/util/List;
    //   77: astore #7
    //   79: iload_3
    //   80: aload #7
    //   82: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   87: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   92: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   97: ifeq -> 104
    //   100: iconst_1
    //   101: goto -> 105
    //   104: iconst_0
    //   105: iadd
    //   106: istore #8
    //   108: iload #8
    //   110: invokestatic ZD : (I)Ljava/lang/String;
    //   113: astore #9
    //   115: aload #7
    //   117: aload_1
    //   118: aload #9
    //   120: <illegal opcode> accept : (Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   125: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   130: aload_0
    //   131: aload_1
    //   132: aload_2
    //   133: aload #6
    //   135: aload #9
    //   137: invokevirtual ZS : (Ljava/lang/StringBuilder;Lnet/portswigger/Zot;Lnet/portswigger/Zot;Ljava/lang/String;)V
    //   140: aload #6
    //   142: instanceof net/portswigger/Zz
    //   145: ifeq -> 160
    //   148: aload_1
    //   149: aload #6
    //   151: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: iload #4
    //   157: ifeq -> 169
    //   160: aload_0
    //   161: aload_1
    //   162: aload #6
    //   164: iload #8
    //   166: invokevirtual ZB : (Ljava/lang/StringBuilder;Lnet/portswigger/Zot;I)V
    //   169: aload #7
    //   171: aload_1
    //   172: aload #9
    //   174: <illegal opcode> accept : (Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   179: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   184: iload #4
    //   186: ifeq -> 18
    //   189: return
  }
  
  private void ZS(StringBuilder paramStringBuilder, Zot paramZot1, Zot paramZot2, String paramString) {
    Zot zot = paramZot2.ZJ();
    if (zot == null)
      return; 
    String str = paramZot1.ZL().Zo(zot.Z_(), paramZot2.ZZ()).strip();
    if (!str.isBlank()) {
      if (!paramStringBuilder.isEmpty() && !Character.isWhitespace(paramStringBuilder.charAt(paramStringBuilder.length() - 1)))
        paramStringBuilder.append(" "); 
      paramStringBuilder.append(str);
      paramStringBuilder.append(System.lineSeparator()).append(paramString);
    } 
  }
  
  private static String ZD(int paramInt) {
    return " ".repeat(4 * paramInt);
  }
  
  @SafeVarargs
  private static Predicate<Zot> ZY(Class<? extends Zot>... paramVarArgs) {
    return paramVarArgs::lambda$hasNodeInAncestors$19;
  }
  
  private static Predicate<Zot> ZC(Class<? extends Zot> paramClass) {
    return paramClass::lambda$hasParent$20;
  }
  
  private static Predicate<Zot> ZH(Class<? extends Zot> paramClass, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> test : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   7: areturn
  }
  
  private static Predicate<Zot> Zs(Class<? extends Zot> paramClass) {
    return paramClass::lambda$hasPreviousSibling$22;
  }
  
  private static boolean lambda$hasPreviousSibling$22(Class paramClass, Zot paramZot) {
    Zot zot = paramZot.ZJ();
    return (zot != null && zot.getClass().equals(paramClass));
  }
  
  private static boolean lambda$hasAncestorOverLength$21(Class<Object> paramClass, int paramInt, Zot paramZot) {
    Zot zot = (Zot)paramZot.ZL(paramClass);
    return (zot == null) ? false : ((zot.toString().length() > paramInt));
  }
  
  private static boolean lambda$hasParent$20(Class paramClass, Zot paramZot) {
    Zot zot = paramZot.Zi();
    return (zot != null && zot.getClass().equals(paramClass));
  }
  
  private static boolean lambda$hasNodeInAncestors$19(Class[] paramArrayOfClass, Zot paramZot) {
    Set<Class<?>> set = Set.of((Class<?>[][])paramArrayOfClass);
    if (set.isEmpty())
      return true; 
    while ((paramZot = paramZot.Zi()) != null) {
      if (set.contains(paramZot.getClass()))
        return true; 
    } 
    return false;
  }
  
  private static void lambda$formatNode$18(StringBuilder paramStringBuilder, String paramString, Zux paramZux) {
    paramStringBuilder.append(paramZux.Zlu().Zw(paramString));
  }
  
  private static void lambda$formatNode$17(StringBuilder paramStringBuilder, String paramString, Zux paramZux) {
    paramStringBuilder.append(paramZux.ZlM().Zw(paramString));
  }
  
  private static String lambda$format$16(String paramString) {
    return paramString.replaceAll(a, "");
  }
  
  private static boolean lambda$formattersFor$15(Zot paramZot, Zux paramZux) {
    return paramZux.Zv.test(paramZot);
  }
  
  private static List lambda$registerFormatter$14(Class paramClass) {
    return new ArrayList();
  }
  
  private static boolean lambda$registerFormatter$13(Zot paramZot) {
    return true;
  }
  
  private static String lambda$static$12(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$11(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$10(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$9(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$8(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static boolean lambda$static$7(Zot paramZot) {
    return (paramZot.ZJ() != null && paramZot.ZJ().getClass().equals(Zr_.class));
  }
  
  private static boolean lambda$static$6(Zot paramZot) {
    return (paramZot.ZJ() != null && !paramZot.ZJ().getClass().equals(Zr_.class));
  }
  
  private static String lambda$static$5(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$4(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$3(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$2(String paramString) {
    return System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$1(String paramString) {
    return System.lineSeparator() + System.lineSeparator() + System.lineSeparator();
  }
  
  private static String lambda$static$0(String paramString) {
    return "";
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc '@e5C'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zkc.a : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #40
    //   87: goto -> 112
    //   90: bipush #33
    //   92: goto -> 112
    //   95: bipush #89
    //   97: goto -> 112
    //   100: bipush #57
    //   102: goto -> 112
    //   105: bipush #72
    //   107: goto -> 112
    //   110: bipush #28
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
    //   154: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   159: putstatic net/portswigger/Zkc.ZL : Lnet/portswigger/Zfz;
    //   162: new java/util/HashMap
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: putstatic net/portswigger/Zkc.ZT : Ljava/util/Map;
    //   172: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   175: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   180: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   183: iconst_3
    //   184: anewarray java/lang/Class
    //   187: dup
    //   188: iconst_0
    //   189: ldc net/portswigger/Zyl
    //   191: aastore
    //   192: dup
    //   193: iconst_1
    //   194: ldc net/portswigger/Z_r
    //   196: aastore
    //   197: dup
    //   198: iconst_2
    //   199: ldc net/portswigger/Z_w
    //   201: aastore
    //   202: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   205: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   208: invokestatic lineSeparator : ()Ljava/lang/String;
    //   211: invokevirtual ZF : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   214: ldc net/portswigger/Zr1
    //   216: invokestatic Zs : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   219: iconst_2
    //   220: anewarray java/lang/Class
    //   223: dup
    //   224: iconst_0
    //   225: ldc net/portswigger/Zjt
    //   227: aastore
    //   228: dup
    //   229: iconst_1
    //   230: ldc net/portswigger/Zyz
    //   232: aastore
    //   233: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   236: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   239: invokestatic lineSeparator : ()Ljava/lang/String;
    //   242: invokevirtual Zn : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   245: iconst_1
    //   246: anewarray java/lang/Class
    //   249: dup
    //   250: iconst_0
    //   251: ldc net/portswigger/Zy1
    //   253: aastore
    //   254: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   257: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   260: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   263: iconst_5
    //   264: anewarray java/lang/Class
    //   267: dup
    //   268: iconst_0
    //   269: ldc net/portswigger/Zy1
    //   271: aastore
    //   272: dup
    //   273: iconst_1
    //   274: ldc net/portswigger/Zyp
    //   276: aastore
    //   277: dup
    //   278: iconst_2
    //   279: ldc net/portswigger/Zy5
    //   281: aastore
    //   282: dup
    //   283: iconst_3
    //   284: ldc net/portswigger/Zyt
    //   286: aastore
    //   287: dup
    //   288: iconst_4
    //   289: ldc net/portswigger/Zy8
    //   291: aastore
    //   292: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   295: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   298: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   303: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   306: iconst_5
    //   307: anewarray java/lang/Class
    //   310: dup
    //   311: iconst_0
    //   312: ldc net/portswigger/Zyc
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: ldc net/portswigger/Zye
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: ldc net/portswigger/Z_o
    //   324: aastore
    //   325: dup
    //   326: iconst_3
    //   327: ldc net/portswigger/Zyw
    //   329: aastore
    //   330: dup
    //   331: iconst_4
    //   332: ldc net/portswigger/Z_i
    //   334: aastore
    //   335: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   338: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   341: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   346: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   349: iconst_1
    //   350: anewarray java/lang/Class
    //   353: dup
    //   354: iconst_0
    //   355: ldc net/portswigger/Zy0
    //   357: aastore
    //   358: invokestatic ZY : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   361: iconst_1
    //   362: anewarray java/lang/Class
    //   365: dup
    //   366: iconst_0
    //   367: ldc net/portswigger/Zyn
    //   369: aastore
    //   370: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   373: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   376: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   381: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   384: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   387: bipush #12
    //   389: anewarray java/lang/Class
    //   392: dup
    //   393: iconst_0
    //   394: ldc net/portswigger/Zy_
    //   396: aastore
    //   397: dup
    //   398: iconst_1
    //   399: ldc net/portswigger/Zjt
    //   401: aastore
    //   402: dup
    //   403: iconst_2
    //   404: ldc net/portswigger/Zyk
    //   406: aastore
    //   407: dup
    //   408: iconst_3
    //   409: ldc net/portswigger/Z_4
    //   411: aastore
    //   412: dup
    //   413: iconst_4
    //   414: ldc net/portswigger/Zyv
    //   416: aastore
    //   417: dup
    //   418: iconst_5
    //   419: ldc net/portswigger/Zya
    //   421: aastore
    //   422: dup
    //   423: bipush #6
    //   425: ldc net/portswigger/Zj5
    //   427: aastore
    //   428: dup
    //   429: bipush #7
    //   431: ldc net/portswigger/Zk
    //   433: aastore
    //   434: dup
    //   435: bipush #8
    //   437: ldc net/portswigger/Zrx
    //   439: aastore
    //   440: dup
    //   441: bipush #9
    //   443: ldc net/portswigger/Zjp
    //   445: aastore
    //   446: dup
    //   447: bipush #10
    //   449: ldc net/portswigger/Zr1
    //   451: aastore
    //   452: dup
    //   453: bipush #11
    //   455: ldc net/portswigger/Zyy
    //   457: aastore
    //   458: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   461: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   464: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   469: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   472: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   475: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   480: iconst_1
    //   481: anewarray java/lang/Class
    //   484: dup
    //   485: iconst_0
    //   486: ldc net/portswigger/Zyz
    //   488: aastore
    //   489: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   492: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   495: ldc ' '
    //   497: invokevirtual ZF : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   500: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   505: iconst_1
    //   506: anewarray java/lang/Class
    //   509: dup
    //   510: iconst_0
    //   511: ldc net/portswigger/Zyz
    //   513: aastore
    //   514: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   517: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   520: ldc ' '
    //   522: invokevirtual ZF : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   525: bipush #13
    //   527: anewarray java/lang/Class
    //   530: dup
    //   531: iconst_0
    //   532: ldc net/portswigger/Zrs
    //   534: aastore
    //   535: dup
    //   536: iconst_1
    //   537: ldc net/portswigger/Zw
    //   539: aastore
    //   540: dup
    //   541: iconst_2
    //   542: ldc net/portswigger/Zjg
    //   544: aastore
    //   545: dup
    //   546: iconst_3
    //   547: ldc net/portswigger/Zr0
    //   549: aastore
    //   550: dup
    //   551: iconst_4
    //   552: ldc net/portswigger/Zry
    //   554: aastore
    //   555: dup
    //   556: iconst_5
    //   557: ldc net/portswigger/Zjo
    //   559: aastore
    //   560: dup
    //   561: bipush #6
    //   563: ldc net/portswigger/Zje
    //   565: aastore
    //   566: dup
    //   567: bipush #7
    //   569: ldc net/portswigger/Zjd
    //   571: aastore
    //   572: dup
    //   573: bipush #8
    //   575: ldc net/portswigger/Zrk
    //   577: aastore
    //   578: dup
    //   579: bipush #9
    //   581: ldc net/portswigger/Zrt
    //   583: aastore
    //   584: dup
    //   585: bipush #10
    //   587: ldc net/portswigger/Zr2
    //   589: aastore
    //   590: dup
    //   591: bipush #11
    //   593: ldc net/portswigger/Zrj
    //   595: aastore
    //   596: dup
    //   597: bipush #12
    //   599: ldc net/portswigger/Z_l
    //   601: aastore
    //   602: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   605: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   608: ldc ' '
    //   610: invokevirtual ZF : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   613: ldc net/portswigger/Z_w
    //   615: invokestatic ZC : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   618: iconst_5
    //   619: anewarray java/lang/Class
    //   622: dup
    //   623: iconst_0
    //   624: ldc net/portswigger/Zd
    //   626: aastore
    //   627: dup
    //   628: iconst_1
    //   629: ldc net/portswigger/Zrp
    //   631: aastore
    //   632: dup
    //   633: iconst_2
    //   634: ldc net/portswigger/Zjn
    //   636: aastore
    //   637: dup
    //   638: iconst_3
    //   639: ldc net/portswigger/Zi
    //   641: aastore
    //   642: dup
    //   643: iconst_4
    //   644: ldc net/portswigger/Zx
    //   646: aastore
    //   647: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   650: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   653: ldc ' '
    //   655: invokevirtual Zn : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   658: bipush #13
    //   660: anewarray java/lang/Class
    //   663: dup
    //   664: iconst_0
    //   665: ldc net/portswigger/Zrs
    //   667: aastore
    //   668: dup
    //   669: iconst_1
    //   670: ldc net/portswigger/Zrg
    //   672: aastore
    //   673: dup
    //   674: iconst_2
    //   675: ldc net/portswigger/Zj7
    //   677: aastore
    //   678: dup
    //   679: iconst_3
    //   680: ldc net/portswigger/Zrk
    //   682: aastore
    //   683: dup
    //   684: iconst_4
    //   685: ldc net/portswigger/Zrt
    //   687: aastore
    //   688: dup
    //   689: iconst_5
    //   690: ldc net/portswigger/Zr2
    //   692: aastore
    //   693: dup
    //   694: bipush #6
    //   696: ldc net/portswigger/Zrj
    //   698: aastore
    //   699: dup
    //   700: bipush #7
    //   702: ldc net/portswigger/Zjt
    //   704: aastore
    //   705: dup
    //   706: bipush #8
    //   708: ldc net/portswigger/Zf
    //   710: aastore
    //   711: dup
    //   712: bipush #9
    //   714: ldc net/portswigger/Zru
    //   716: aastore
    //   717: dup
    //   718: bipush #10
    //   720: ldc net/portswigger/Zre
    //   722: aastore
    //   723: dup
    //   724: bipush #11
    //   726: ldc net/portswigger/Zjr
    //   728: aastore
    //   729: dup
    //   730: bipush #12
    //   732: ldc net/portswigger/Z_l
    //   734: aastore
    //   735: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   738: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   741: ldc ' '
    //   743: invokevirtual Zn : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   746: iconst_3
    //   747: anewarray java/lang/Class
    //   750: dup
    //   751: iconst_0
    //   752: ldc net/portswigger/Z_2
    //   754: aastore
    //   755: dup
    //   756: iconst_1
    //   757: ldc net/portswigger/Zy_
    //   759: aastore
    //   760: dup
    //   761: iconst_2
    //   762: ldc net/portswigger/Zyw
    //   764: aastore
    //   765: invokestatic ZY : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   768: iconst_1
    //   769: anewarray java/lang/Class
    //   772: dup
    //   773: iconst_0
    //   774: ldc net/portswigger/Zs
    //   776: aastore
    //   777: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   780: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   783: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   788: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   791: iconst_1
    //   792: anewarray java/lang/Class
    //   795: dup
    //   796: iconst_0
    //   797: ldc net/portswigger/Z_d
    //   799: aastore
    //   800: invokestatic Zv : (Lnet/portswigger/Z_c;[Ljava/lang/Class;)V
    //   803: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   806: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   811: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   814: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   817: ldc net/portswigger/Zy_
    //   819: bipush #80
    //   821: invokestatic ZH : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   824: iconst_1
    //   825: anewarray java/lang/Class
    //   828: dup
    //   829: iconst_0
    //   830: ldc net/portswigger/Zys
    //   832: aastore
    //   833: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   836: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   839: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   844: invokevirtual Zy : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   847: ldc net/portswigger/Zy_
    //   849: bipush #80
    //   851: invokestatic ZH : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   854: iconst_1
    //   855: anewarray java/lang/Class
    //   858: dup
    //   859: iconst_0
    //   860: ldc net/portswigger/Zs
    //   862: aastore
    //   863: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   866: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   869: ldc ' '
    //   871: invokevirtual Zn : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   874: bipush #14
    //   876: anewarray java/lang/Class
    //   879: dup
    //   880: iconst_0
    //   881: ldc net/portswigger/Zyc
    //   883: aastore
    //   884: dup
    //   885: iconst_1
    //   886: ldc net/portswigger/Zye
    //   888: aastore
    //   889: dup
    //   890: iconst_2
    //   891: ldc net/portswigger/Z_o
    //   893: aastore
    //   894: dup
    //   895: iconst_3
    //   896: ldc net/portswigger/Zyw
    //   898: aastore
    //   899: dup
    //   900: iconst_4
    //   901: ldc net/portswigger/Z_i
    //   903: aastore
    //   904: dup
    //   905: iconst_5
    //   906: ldc net/portswigger/Zyh
    //   908: aastore
    //   909: dup
    //   910: bipush #6
    //   912: ldc net/portswigger/Zyx
    //   914: aastore
    //   915: dup
    //   916: bipush #7
    //   918: ldc net/portswigger/Zyj
    //   920: aastore
    //   921: dup
    //   922: bipush #8
    //   924: ldc net/portswigger/Zyu
    //   926: aastore
    //   927: dup
    //   928: bipush #9
    //   930: ldc net/portswigger/Zy7
    //   932: aastore
    //   933: dup
    //   934: bipush #10
    //   936: ldc net/portswigger/Zy9
    //   938: aastore
    //   939: dup
    //   940: bipush #11
    //   942: ldc net/portswigger/Zyn
    //   944: aastore
    //   945: dup
    //   946: bipush #12
    //   948: ldc net/portswigger/Z_4
    //   950: aastore
    //   951: dup
    //   952: bipush #13
    //   954: ldc net/portswigger/Zyv
    //   956: aastore
    //   957: invokestatic ZY : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   960: iconst_1
    //   961: anewarray java/lang/Class
    //   964: dup
    //   965: iconst_0
    //   966: ldc net/portswigger/Zm
    //   968: aastore
    //   969: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   972: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   975: ldc ' '
    //   977: invokevirtual Zn : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   980: iconst_1
    //   981: anewarray java/lang/Class
    //   984: dup
    //   985: iconst_0
    //   986: ldc net/portswigger/Zy6
    //   988: aastore
    //   989: invokestatic ZY : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   992: iconst_3
    //   993: anewarray java/lang/Class
    //   996: dup
    //   997: iconst_0
    //   998: ldc net/portswigger/Zj7
    //   1000: aastore
    //   1001: dup
    //   1002: iconst_1
    //   1003: ldc net/portswigger/Zv
    //   1005: aastore
    //   1006: dup
    //   1007: iconst_2
    //   1008: ldc net/portswigger/Zj9
    //   1010: aastore
    //   1011: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1014: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   1017: ldc ' '
    //   1019: invokevirtual ZF : (Ljava/lang/String;)Lnet/portswigger/Z_c;
    //   1022: ldc net/portswigger/Z_w
    //   1024: invokestatic ZC : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   1027: iconst_1
    //   1028: anewarray java/lang/Class
    //   1031: dup
    //   1032: iconst_0
    //   1033: ldc net/portswigger/Zp
    //   1035: aastore
    //   1036: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1039: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   1042: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   1047: invokevirtual Zy : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   1050: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   1053: ldc net/portswigger/Zyz
    //   1055: bipush #80
    //   1057: invokestatic ZH : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   1060: iconst_1
    //   1061: anewarray java/lang/Class
    //   1064: dup
    //   1065: iconst_0
    //   1066: ldc net/portswigger/Z_l
    //   1068: aastore
    //   1069: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1072: invokestatic Zs : ()Lnet/portswigger/Z_c;
    //   1075: <illegal opcode> Zw : ()Lnet/portswigger/Zfz;
    //   1080: invokevirtual Z_ : (Lnet/portswigger/Zfz;)Lnet/portswigger/Z_c;
    //   1083: invokevirtual ZK : ()Lnet/portswigger/Z_c;
    //   1086: ldc net/portswigger/Zy6
    //   1088: invokestatic ZC : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   1091: iconst_1
    //   1092: anewarray java/lang/Class
    //   1095: dup
    //   1096: iconst_0
    //   1097: ldc net/portswigger/Zyd
    //   1099: aastore
    //   1100: invokestatic Zx : (Lnet/portswigger/Z_c;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1103: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */