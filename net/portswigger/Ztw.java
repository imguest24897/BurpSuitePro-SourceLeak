package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ztw {
  private static final Zg3 Zg;
  
  private static final Map<Class<? extends Zld>, List<Zir>> Zj;
  
  private static final String a;
  
  @SafeVarargs
  private static void Zy(Zf4 paramZf4, Class<? extends Zld>... paramVarArgs) {
    ZD(paramZf4, Ztw::lambda$registerFormatter$13, paramVarArgs);
  }
  
  @SafeVarargs
  private static void ZD(Zf4 paramZf4, Predicate<Zld> paramPredicate, Class<? extends Zld>... paramVarArgs) {
    Zir zir = paramZf4.Zj(paramPredicate);
    for (Class<? extends Zld> clazz : paramVarArgs)
      ((List<Zir>)Zj.computeIfAbsent(clazz, Ztw::lambda$registerFormatter$14)).add(zir); 
  }
  
  private static List<Zir> ZY(Zld paramZld) {
    return ((List<Zir>)Zj.getOrDefault(paramZld.getClass(), List.of(Zir.ZU))).stream().filter(paramZld::lambda$formattersFor$15).toList();
  }
  
  public String ZY(Zhz paramZhz) {
    StringBuilder stringBuilder = new StringBuilder();
    ZN(stringBuilder, paramZhz, 0);
    int[] arrayOfInt = Zf_.ZH();
    if (Zbqc.Zwu() == null)
      Zf_.ZU(new int[4]); 
    return (String)Arrays.stream(stringBuilder.toString().split(System.lineSeparator())).map(Ztw::lambda$format$16).collect(Collectors.joining(System.lineSeparator())) + (String)Arrays.stream(stringBuilder.toString().split(System.lineSeparator())).map(Ztw::lambda$format$16).collect(Collectors.joining(System.lineSeparator()));
  }
  
  private void ZN(StringBuilder paramStringBuilder, Zld paramZld, int paramInt) {
    // Byte code:
    //   0: invokestatic ZH : ()[I
    //   3: aload_2
    //   4: invokeinterface ZK : ()Ljava/util/List;
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore #5
    //   16: astore #4
    //   18: aload #5
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 189
    //   28: aload #5
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/portswigger/Zld
    //   38: astore #6
    //   40: aload #6
    //   42: invokeinterface Ze : ()Lnet/portswigger/Zkd;
    //   47: getstatic net/portswigger/Zkd.EOF : Lnet/portswigger/Zkd;
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
    //   68: invokevirtual ZH : (Ljava/lang/StringBuilder;Lnet/portswigger/Zld;Lnet/portswigger/Zld;Ljava/lang/String;)V
    //   71: return
    //   72: aload #6
    //   74: invokestatic ZY : (Lnet/portswigger/Zld;)Ljava/util/List;
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
    //   110: invokestatic Zr : (I)Ljava/lang/String;
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
    //   137: invokevirtual ZH : (Ljava/lang/StringBuilder;Lnet/portswigger/Zld;Lnet/portswigger/Zld;Ljava/lang/String;)V
    //   140: aload #6
    //   142: instanceof net/portswigger/Ze7
    //   145: ifeq -> 160
    //   148: aload_1
    //   149: aload #6
    //   151: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload #4
    //   157: ifnonnull -> 169
    //   160: aload_0
    //   161: aload_1
    //   162: aload #6
    //   164: iload #8
    //   166: invokevirtual ZN : (Ljava/lang/StringBuilder;Lnet/portswigger/Zld;I)V
    //   169: aload #7
    //   171: aload_1
    //   172: aload #9
    //   174: <illegal opcode> accept : (Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   179: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   184: aload #4
    //   186: ifnonnull -> 18
    //   189: return
  }
  
  private void ZH(StringBuilder paramStringBuilder, Zld paramZld1, Zld paramZld2, String paramString) {
    Zld zld = paramZld2.Zc();
    if (zld == null)
      return; 
    String str = paramZld1.ZE().ZH(zld.Zu(), paramZld2.Zg()).strip();
    if (!str.isBlank()) {
      if (!paramStringBuilder.isEmpty() && !Character.isWhitespace(paramStringBuilder.charAt(paramStringBuilder.length() - 1)))
        paramStringBuilder.append(" "); 
      paramStringBuilder.append(str);
      paramStringBuilder.append(System.lineSeparator()).append(paramString);
    } 
  }
  
  private static String Zr(int paramInt) {
    return " ".repeat(4 * paramInt);
  }
  
  @SafeVarargs
  private static Predicate<Zld> ZC(Class<? extends Zld>... paramVarArgs) {
    return paramVarArgs::lambda$hasNodeInAncestors$19;
  }
  
  private static Predicate<Zld> ZD(Class<? extends Zld> paramClass) {
    return paramClass::lambda$hasParent$20;
  }
  
  private static Predicate<Zld> ZF(Class<? extends Zld> paramClass, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> test : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   7: areturn
  }
  
  private static Predicate<Zld> Zr(Class<? extends Zld> paramClass) {
    return paramClass::lambda$hasPreviousSibling$22;
  }
  
  private static boolean lambda$hasPreviousSibling$22(Class paramClass, Zld paramZld) {
    Zld zld = paramZld.Zc();
    return (zld != null && zld.getClass().equals(paramClass));
  }
  
  private static boolean lambda$hasAncestorOverLength$21(Class<Object> paramClass, int paramInt, Zld paramZld) {
    Zld zld = (Zld)paramZld.ZU(paramClass);
    return (zld == null) ? false : ((zld.toString().length() > paramInt));
  }
  
  private static boolean lambda$hasParent$20(Class paramClass, Zld paramZld) {
    Zld zld = paramZld.Zo();
    return (zld != null && zld.getClass().equals(paramClass));
  }
  
  private static boolean lambda$hasNodeInAncestors$19(Class[] paramArrayOfClass, Zld paramZld) {
    Set<Class<?>> set = Set.of((Class<?>[][])paramArrayOfClass);
    if (set.isEmpty())
      return true; 
    while ((paramZld = paramZld.Zo()) != null) {
      if (set.contains(paramZld.getClass()))
        return true; 
    } 
    return false;
  }
  
  private static void lambda$formatNode$18(StringBuilder paramStringBuilder, String paramString, Zir paramZir) {
    paramStringBuilder.append(paramZir.Zj4().ZL(paramString));
  }
  
  private static void lambda$formatNode$17(StringBuilder paramStringBuilder, String paramString, Zir paramZir) {
    paramStringBuilder.append(paramZir.Zjr().ZL(paramString));
  }
  
  private static String lambda$format$16(String paramString) {
    return paramString.replaceAll(a, "");
  }
  
  private static boolean lambda$formattersFor$15(Zld paramZld, Zir paramZir) {
    return paramZir.ZJ.test(paramZld);
  }
  
  private static List lambda$registerFormatter$14(Class paramClass) {
    return new ArrayList();
  }
  
  private static boolean lambda$registerFormatter$13(Zld paramZld) {
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
  
  private static boolean lambda$static$7(Zld paramZld) {
    return (paramZld.Zc() != null && paramZld.Zc().getClass().equals(Zpm.class));
  }
  
  private static boolean lambda$static$6(Zld paramZld) {
    return (paramZld.Zc() != null && !paramZld.Zc().getClass().equals(Zpm.class));
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
    //   0: bipush #110
    //   2: ldc '$9_'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Ztw.a : Ljava/lang/String;
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
    //   80: bipush #22
    //   82: goto -> 112
    //   85: bipush #36
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #83
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #49
    //   107: goto -> 112
    //   110: bipush #102
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
    //   154: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   159: putstatic net/portswigger/Ztw.Zg : Lnet/portswigger/Zg3;
    //   162: new java/util/HashMap
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: putstatic net/portswigger/Ztw.Zj : Ljava/util/Map;
    //   172: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   175: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   180: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   183: iconst_3
    //   184: anewarray java/lang/Class
    //   187: dup
    //   188: iconst_0
    //   189: ldc net/portswigger/Zxf
    //   191: aastore
    //   192: dup
    //   193: iconst_1
    //   194: ldc net/portswigger/Zbf
    //   196: aastore
    //   197: dup
    //   198: iconst_2
    //   199: ldc net/portswigger/Zxj
    //   201: aastore
    //   202: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   205: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   208: invokestatic lineSeparator : ()Ljava/lang/String;
    //   211: invokevirtual Zs : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   214: ldc net/portswigger/Zpp
    //   216: invokestatic Zr : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   219: iconst_2
    //   220: anewarray java/lang/Class
    //   223: dup
    //   224: iconst_0
    //   225: ldc net/portswigger/Zwa
    //   227: aastore
    //   228: dup
    //   229: iconst_1
    //   230: ldc net/portswigger/Zxh
    //   232: aastore
    //   233: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   236: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   239: invokestatic lineSeparator : ()Ljava/lang/String;
    //   242: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   245: iconst_1
    //   246: anewarray java/lang/Class
    //   249: dup
    //   250: iconst_0
    //   251: ldc net/portswigger/Zxv
    //   253: aastore
    //   254: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   257: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   260: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   263: iconst_5
    //   264: anewarray java/lang/Class
    //   267: dup
    //   268: iconst_0
    //   269: ldc net/portswigger/Zxv
    //   271: aastore
    //   272: dup
    //   273: iconst_1
    //   274: ldc net/portswigger/Zxg
    //   276: aastore
    //   277: dup
    //   278: iconst_2
    //   279: ldc net/portswigger/Zxd
    //   281: aastore
    //   282: dup
    //   283: iconst_3
    //   284: ldc net/portswigger/Zxq
    //   286: aastore
    //   287: dup
    //   288: iconst_4
    //   289: ldc net/portswigger/Zx2
    //   291: aastore
    //   292: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   295: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   298: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   303: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   306: iconst_5
    //   307: anewarray java/lang/Class
    //   310: dup
    //   311: iconst_0
    //   312: ldc net/portswigger/Zxe
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: ldc net/portswigger/Zxo
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: ldc net/portswigger/Zb5
    //   324: aastore
    //   325: dup
    //   326: iconst_3
    //   327: ldc net/portswigger/Zhu
    //   329: aastore
    //   330: dup
    //   331: iconst_4
    //   332: ldc net/portswigger/Zbw
    //   334: aastore
    //   335: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   338: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   341: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   346: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   349: iconst_1
    //   350: anewarray java/lang/Class
    //   353: dup
    //   354: iconst_0
    //   355: ldc net/portswigger/Zx4
    //   357: aastore
    //   358: invokestatic ZC : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   361: iconst_1
    //   362: anewarray java/lang/Class
    //   365: dup
    //   366: iconst_0
    //   367: ldc net/portswigger/Zx0
    //   369: aastore
    //   370: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   373: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   376: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   381: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   384: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   387: bipush #13
    //   389: anewarray java/lang/Class
    //   392: dup
    //   393: iconst_0
    //   394: ldc net/portswigger/Zx7
    //   396: aastore
    //   397: dup
    //   398: iconst_1
    //   399: ldc net/portswigger/Zwa
    //   401: aastore
    //   402: dup
    //   403: iconst_2
    //   404: ldc net/portswigger/Zxi
    //   406: aastore
    //   407: dup
    //   408: iconst_3
    //   409: ldc net/portswigger/Zbt
    //   411: aastore
    //   412: dup
    //   413: iconst_4
    //   414: ldc net/portswigger/Zxl
    //   416: aastore
    //   417: dup
    //   418: iconst_5
    //   419: ldc net/portswigger/Zxr
    //   421: aastore
    //   422: dup
    //   423: bipush #6
    //   425: ldc net/portswigger/Zp4
    //   427: aastore
    //   428: dup
    //   429: bipush #7
    //   431: ldc net/portswigger/Zwk
    //   433: aastore
    //   434: dup
    //   435: bipush #8
    //   437: ldc net/portswigger/Zei
    //   439: aastore
    //   440: dup
    //   441: bipush #9
    //   443: ldc net/portswigger/Zef
    //   445: aastore
    //   446: dup
    //   447: bipush #10
    //   449: ldc net/portswigger/Zwc
    //   451: aastore
    //   452: dup
    //   453: bipush #11
    //   455: ldc net/portswigger/Zpp
    //   457: aastore
    //   458: dup
    //   459: bipush #12
    //   461: ldc net/portswigger/Zxt
    //   463: aastore
    //   464: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   467: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   470: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   475: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   478: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   481: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   486: iconst_1
    //   487: anewarray java/lang/Class
    //   490: dup
    //   491: iconst_0
    //   492: ldc net/portswigger/Zxh
    //   494: aastore
    //   495: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   498: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   501: ldc ' '
    //   503: invokevirtual Zs : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   506: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   511: iconst_1
    //   512: anewarray java/lang/Class
    //   515: dup
    //   516: iconst_0
    //   517: ldc net/portswigger/Zxh
    //   519: aastore
    //   520: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   523: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   526: ldc ' '
    //   528: invokevirtual Zs : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   531: bipush #15
    //   533: anewarray java/lang/Class
    //   536: dup
    //   537: iconst_0
    //   538: ldc net/portswigger/Zpx
    //   540: aastore
    //   541: dup
    //   542: iconst_1
    //   543: ldc net/portswigger/Zek
    //   545: aastore
    //   546: dup
    //   547: iconst_2
    //   548: ldc net/portswigger/Zwe
    //   550: aastore
    //   551: dup
    //   552: iconst_3
    //   553: ldc net/portswigger/Zpc
    //   555: aastore
    //   556: dup
    //   557: iconst_4
    //   558: ldc net/portswigger/Zp0
    //   560: aastore
    //   561: dup
    //   562: iconst_5
    //   563: ldc net/portswigger/Zwy
    //   565: aastore
    //   566: dup
    //   567: bipush #6
    //   569: ldc net/portswigger/Zw9
    //   571: aastore
    //   572: dup
    //   573: bipush #7
    //   575: ldc net/portswigger/Zwx
    //   577: aastore
    //   578: dup
    //   579: bipush #8
    //   581: ldc net/portswigger/Zwi
    //   583: aastore
    //   584: dup
    //   585: bipush #9
    //   587: ldc net/portswigger/Zpy
    //   589: aastore
    //   590: dup
    //   591: bipush #10
    //   593: ldc net/portswigger/Zpo
    //   595: aastore
    //   596: dup
    //   597: bipush #11
    //   599: ldc net/portswigger/Zpr
    //   601: aastore
    //   602: dup
    //   603: bipush #12
    //   605: ldc net/portswigger/Zew
    //   607: aastore
    //   608: dup
    //   609: bipush #13
    //   611: ldc net/portswigger/Ze9
    //   613: aastore
    //   614: dup
    //   615: bipush #14
    //   617: ldc net/portswigger/Zb2
    //   619: aastore
    //   620: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   623: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   626: ldc ' '
    //   628: invokevirtual Zs : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   631: ldc net/portswigger/Zxj
    //   633: invokestatic ZD : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   636: iconst_5
    //   637: anewarray java/lang/Class
    //   640: dup
    //   641: iconst_0
    //   642: ldc net/portswigger/Ze0
    //   644: aastore
    //   645: dup
    //   646: iconst_1
    //   647: ldc net/portswigger/Zp_
    //   649: aastore
    //   650: dup
    //   651: iconst_2
    //   652: ldc net/portswigger/Zwh
    //   654: aastore
    //   655: dup
    //   656: iconst_3
    //   657: ldc net/portswigger/Zeq
    //   659: aastore
    //   660: dup
    //   661: iconst_4
    //   662: ldc net/portswigger/Ze4
    //   664: aastore
    //   665: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   668: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   671: ldc ' '
    //   673: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   676: bipush #13
    //   678: anewarray java/lang/Class
    //   681: dup
    //   682: iconst_0
    //   683: ldc net/portswigger/Zpx
    //   685: aastore
    //   686: dup
    //   687: iconst_1
    //   688: ldc net/portswigger/Zp7
    //   690: aastore
    //   691: dup
    //   692: iconst_2
    //   693: ldc net/portswigger/Zw3
    //   695: aastore
    //   696: dup
    //   697: iconst_3
    //   698: ldc net/portswigger/Zpy
    //   700: aastore
    //   701: dup
    //   702: iconst_4
    //   703: ldc net/portswigger/Zpo
    //   705: aastore
    //   706: dup
    //   707: iconst_5
    //   708: ldc net/portswigger/Zpr
    //   710: aastore
    //   711: dup
    //   712: bipush #6
    //   714: ldc net/portswigger/Zew
    //   716: aastore
    //   717: dup
    //   718: bipush #7
    //   720: ldc net/portswigger/Zwa
    //   722: aastore
    //   723: dup
    //   724: bipush #8
    //   726: ldc net/portswigger/Zee
    //   728: aastore
    //   729: dup
    //   730: bipush #9
    //   732: ldc net/portswigger/Zeb
    //   734: aastore
    //   735: dup
    //   736: bipush #10
    //   738: ldc net/portswigger/Zp3
    //   740: aastore
    //   741: dup
    //   742: bipush #11
    //   744: ldc net/portswigger/Zw8
    //   746: aastore
    //   747: dup
    //   748: bipush #12
    //   750: ldc net/portswigger/Zb2
    //   752: aastore
    //   753: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   756: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   759: ldc ' '
    //   761: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   764: iconst_3
    //   765: anewarray java/lang/Class
    //   768: dup
    //   769: iconst_0
    //   770: ldc net/portswigger/Zxm
    //   772: aastore
    //   773: dup
    //   774: iconst_1
    //   775: ldc net/portswigger/Zx7
    //   777: aastore
    //   778: dup
    //   779: iconst_2
    //   780: ldc net/portswigger/Zhu
    //   782: aastore
    //   783: invokestatic ZC : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   786: iconst_1
    //   787: anewarray java/lang/Class
    //   790: dup
    //   791: iconst_0
    //   792: ldc net/portswigger/Zel
    //   794: aastore
    //   795: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   798: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   801: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   806: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   809: iconst_1
    //   810: anewarray java/lang/Class
    //   813: dup
    //   814: iconst_0
    //   815: ldc net/portswigger/Zxz
    //   817: aastore
    //   818: invokestatic Zy : (Lnet/portswigger/Zf4;[Ljava/lang/Class;)V
    //   821: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   824: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   829: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   832: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   835: ldc net/portswigger/Zx7
    //   837: bipush #80
    //   839: invokestatic ZF : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   842: iconst_1
    //   843: anewarray java/lang/Class
    //   846: dup
    //   847: iconst_0
    //   848: ldc net/portswigger/Zx9
    //   850: aastore
    //   851: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   854: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   857: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   862: invokevirtual ZJ : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   865: ldc net/portswigger/Zx7
    //   867: bipush #80
    //   869: invokestatic ZF : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   872: iconst_1
    //   873: anewarray java/lang/Class
    //   876: dup
    //   877: iconst_0
    //   878: ldc net/portswigger/Zel
    //   880: aastore
    //   881: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   884: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   887: ldc ' '
    //   889: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   892: bipush #15
    //   894: anewarray java/lang/Class
    //   897: dup
    //   898: iconst_0
    //   899: ldc net/portswigger/Zxe
    //   901: aastore
    //   902: dup
    //   903: iconst_1
    //   904: ldc net/portswigger/Zxo
    //   906: aastore
    //   907: dup
    //   908: iconst_2
    //   909: ldc net/portswigger/Zb5
    //   911: aastore
    //   912: dup
    //   913: iconst_3
    //   914: ldc net/portswigger/Zhu
    //   916: aastore
    //   917: dup
    //   918: iconst_4
    //   919: ldc net/portswigger/Zbw
    //   921: aastore
    //   922: dup
    //   923: iconst_5
    //   924: ldc net/portswigger/Zxc
    //   926: aastore
    //   927: dup
    //   928: bipush #6
    //   930: ldc net/portswigger/Zxp
    //   932: aastore
    //   933: dup
    //   934: bipush #7
    //   936: ldc net/portswigger/Zxs
    //   938: aastore
    //   939: dup
    //   940: bipush #8
    //   942: ldc net/portswigger/Zxn
    //   944: aastore
    //   945: dup
    //   946: bipush #9
    //   948: ldc net/portswigger/Zx3
    //   950: aastore
    //   951: dup
    //   952: bipush #10
    //   954: ldc net/portswigger/Zx6
    //   956: aastore
    //   957: dup
    //   958: bipush #11
    //   960: ldc net/portswigger/Zxy
    //   962: aastore
    //   963: dup
    //   964: bipush #12
    //   966: ldc net/portswigger/Zx0
    //   968: aastore
    //   969: dup
    //   970: bipush #13
    //   972: ldc net/portswigger/Zbt
    //   974: aastore
    //   975: dup
    //   976: bipush #14
    //   978: ldc net/portswigger/Zxl
    //   980: aastore
    //   981: invokestatic ZC : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   984: iconst_1
    //   985: anewarray java/lang/Class
    //   988: dup
    //   989: iconst_0
    //   990: ldc net/portswigger/Ze8
    //   992: aastore
    //   993: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   996: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   999: ldc ' '
    //   1001: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   1004: iconst_1
    //   1005: anewarray java/lang/Class
    //   1008: dup
    //   1009: iconst_0
    //   1010: ldc net/portswigger/Zxk
    //   1012: aastore
    //   1013: invokestatic ZC : ([Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   1016: iconst_3
    //   1017: anewarray java/lang/Class
    //   1020: dup
    //   1021: iconst_0
    //   1022: ldc net/portswigger/Zw3
    //   1024: aastore
    //   1025: dup
    //   1026: iconst_1
    //   1027: ldc net/portswigger/Ze1
    //   1029: aastore
    //   1030: dup
    //   1031: iconst_2
    //   1032: ldc net/portswigger/Zwp
    //   1034: aastore
    //   1035: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1038: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   1041: ldc ' '
    //   1043: invokevirtual Zs : (Ljava/lang/String;)Lnet/portswigger/Zf4;
    //   1046: ldc net/portswigger/Zxj
    //   1048: invokestatic ZD : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   1051: iconst_1
    //   1052: anewarray java/lang/Class
    //   1055: dup
    //   1056: iconst_0
    //   1057: ldc net/portswigger/Zea
    //   1059: aastore
    //   1060: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1063: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   1066: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   1071: invokevirtual ZJ : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   1074: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   1077: ldc net/portswigger/Zxh
    //   1079: bipush #80
    //   1081: invokestatic ZF : (Ljava/lang/Class;I)Ljava/util/function/Predicate;
    //   1084: iconst_1
    //   1085: anewarray java/lang/Class
    //   1088: dup
    //   1089: iconst_0
    //   1090: ldc net/portswigger/Zb2
    //   1092: aastore
    //   1093: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1096: invokestatic ZW : ()Lnet/portswigger/Zf4;
    //   1099: <illegal opcode> ZL : ()Lnet/portswigger/Zg3;
    //   1104: invokevirtual ZX : (Lnet/portswigger/Zg3;)Lnet/portswigger/Zf4;
    //   1107: invokevirtual Ze : ()Lnet/portswigger/Zf4;
    //   1110: ldc net/portswigger/Zxk
    //   1112: invokestatic ZD : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   1115: iconst_1
    //   1116: anewarray java/lang/Class
    //   1119: dup
    //   1120: iconst_0
    //   1121: ldc net/portswigger/Zhm
    //   1123: aastore
    //   1124: invokestatic ZD : (Lnet/portswigger/Zf4;Ljava/util/function/Predicate;[Ljava/lang/Class;)V
    //   1127: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */