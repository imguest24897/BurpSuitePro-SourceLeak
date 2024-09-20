package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class Zxxq {
  private final Zmfl ZU;
  
  private final Zmls Zf;
  
  private final Zehp Zw;
  
  private final Zsvv Za;
  
  private final Zs63 ZI;
  
  private Zgr8 ZV;
  
  private static final String a;
  
  private Zxxq(Zsvv paramZsvv, Zmfl paramZmfl, Zmls paramZmls, Zehp paramZehp, Zs63 paramZs63) {
    this.Za = paramZsvv;
    this.ZU = paramZmfl;
    this.Zf = paramZmls;
    this.Zw = paramZehp;
    this.ZI = paramZs63;
  }
  
  public Zzx2 ZV() {
    this.ZV = Zzx2.ZB().Zv(this.ZU);
    this.ZV.ZU((Supplier<? extends Zty8>[])new Supplier[] { Zp(this.Zf, 0, this.Zf.ZKr(), new HashSet<>(), new HashMap<>()) });
    int[] arrayOfInt = Ztrh.Zi();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
    return this.ZV.ZT();
  }
  
  private Zkh_ Zp(Zmls paramZmls, int paramInt, String paramString, Set<Zsk1> paramSet, Map<String, Zrji> paramMap) {
    // Byte code:
    //   0: invokestatic Zi : ()[I
    //   3: astore #6
    //   5: aload_1
    //   6: invokevirtual ZKr : ()Ljava/lang/String;
    //   9: invokestatic Zf : (Ljava/lang/String;)Lburp/Zxlw;
    //   12: astore #7
    //   14: aload #5
    //   16: aload_1
    //   17: invokevirtual ZKr : ()Ljava/lang/String;
    //   20: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   25: ifeq -> 76
    //   28: aload #5
    //   30: aload_1
    //   31: invokevirtual ZKr : ()Ljava/lang/String;
    //   34: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: aload_1
    //   40: invokevirtual ZKU : ()Lburp/Zrji;
    //   43: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   46: ifne -> 76
    //   49: aload #7
    //   51: new net/portswigger/Zsy
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: bipush #10
    //   60: invokevirtual Z_ : (I)Ljava/lang/String;
    //   63: aload_1
    //   64: invokevirtual ZKr : ()Ljava/lang/String;
    //   67: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   72: invokevirtual Zc : (Ljava/lang/String;)Lburp/Zxlw;
    //   75: pop
    //   76: aload #5
    //   78: aload_1
    //   79: invokevirtual ZKr : ()Ljava/lang/String;
    //   82: aload_1
    //   83: invokevirtual ZKU : ()Lburp/Zrji;
    //   86: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: aload_1
    //   93: invokevirtual ZK5 : ()Ljava/util/List;
    //   96: invokeinterface iterator : ()Ljava/util/Iterator;
    //   101: astore #8
    //   103: aload #8
    //   105: invokeinterface hasNext : ()Z
    //   110: ifeq -> 227
    //   113: aload #8
    //   115: invokeinterface next : ()Ljava/lang/Object;
    //   120: checkcast burp/Zzqr
    //   123: astore #9
    //   125: aload #9
    //   127: invokevirtual Zxm : ()Z
    //   130: ifeq -> 147
    //   133: aload #9
    //   135: invokevirtual Zx3 : ()Lburp/Zrji;
    //   138: invokevirtual Zwt : ()Z
    //   141: ifeq -> 147
    //   144: goto -> 103
    //   147: aload_0
    //   148: aload #9
    //   150: invokevirtual Zx3 : ()Lburp/Zrji;
    //   153: aload #9
    //   155: invokevirtual ZxH : ()Ljava/lang/String;
    //   158: invokevirtual ZU : (Lburp/Zrji;Ljava/lang/String;)Ljava/lang/String;
    //   161: astore #10
    //   163: aload_0
    //   164: getfield Zw : Lburp/Zehp;
    //   167: aload_0
    //   168: getfield Za : Lburp/Zsvv;
    //   171: aload #9
    //   173: invokevirtual Zx3 : ()Lburp/Zrji;
    //   176: aload_3
    //   177: aload #9
    //   179: invokevirtual ZxH : ()Ljava/lang/String;
    //   182: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: aload #10
    //   189: invokeinterface ZG : (Lburp/Zsvv;Lburp/Zrji;Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload #7
    //   196: iconst_1
    //   197: anewarray burp/Zeoz
    //   200: dup
    //   201: iconst_0
    //   202: aload #9
    //   204: invokevirtual ZxH : ()Ljava/lang/String;
    //   207: aload #10
    //   209: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   214: invokestatic ZX : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zeoz;
    //   217: aastore
    //   218: invokevirtual Zy : ([Lburp/Zeoz;)Lburp/Zxlw;
    //   221: pop
    //   222: aload #6
    //   224: ifnull -> 103
    //   227: aload_1
    //   228: invokevirtual ZKU : ()Lburp/Zrji;
    //   231: invokevirtual Zw : ()Lburp/Zrji;
    //   234: astore #8
    //   236: aload #8
    //   238: invokevirtual ZwK : ()Z
    //   241: ifeq -> 250
    //   244: aload #7
    //   246: invokevirtual ZG : ()Lburp/Zkh_;
    //   249: areturn
    //   250: iload_2
    //   251: bipush #15
    //   253: if_icmple -> 260
    //   256: aconst_null
    //   257: goto -> 269
    //   260: aload_0
    //   261: getfield Za : Lburp/Zsvv;
    //   264: aload #8
    //   266: invokevirtual ZB : (Lburp/Zrji;)Lburp/Zsk1;
    //   269: astore #9
    //   271: aload #9
    //   273: ifnull -> 288
    //   276: aload #4
    //   278: aload #9
    //   280: invokeinterface add : (Ljava/lang/Object;)Z
    //   285: ifne -> 310
    //   288: aload #7
    //   290: iconst_1
    //   291: anewarray java/util/function/Supplier
    //   294: dup
    //   295: iconst_0
    //   296: getstatic burp/Zxxq.a : Ljava/lang/String;
    //   299: invokestatic Zf : (Ljava/lang/String;)Lburp/Zxlw;
    //   302: aastore
    //   303: invokevirtual ZQ : ([Ljava/util/function/Supplier;)Lburp/Zxlw;
    //   306: invokevirtual ZG : ()Lburp/Zkh_;
    //   309: areturn
    //   310: invokestatic emptyList : ()Ljava/util/List;
    //   313: astore #10
    //   315: aload #9
    //   317: instanceof burp/Zm6j
    //   320: ifeq -> 392
    //   323: aload #9
    //   325: checkcast burp/Zm6j
    //   328: astore #11
    //   330: aload #11
    //   332: invokevirtual ZF : ()Lburp/Zg6k;
    //   335: getstatic burp/Zg6k.INTERFACE : Lburp/Zg6k;
    //   338: if_acmpne -> 353
    //   341: aload #11
    //   343: invokevirtual ZkQ : ()Ljava/util/List;
    //   346: astore #10
    //   348: aload #6
    //   350: ifnull -> 414
    //   353: aload_0
    //   354: iload_2
    //   355: aload_3
    //   356: aload #11
    //   358: aload #4
    //   360: new java/util/HashMap
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: invokevirtual ZY : (ILjava/lang/String;Lburp/Zm6j;Ljava/util/Set;Ljava/util/Map;)Ljava/util/List;
    //   370: aload #7
    //   372: dup
    //   373: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   376: pop
    //   377: <illegal opcode> accept : (Lburp/Zxlw;)Ljava/util/function/Consumer;
    //   382: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   387: aload #6
    //   389: ifnull -> 414
    //   392: aload #9
    //   394: instanceof burp/Zm7a
    //   397: ifeq -> 414
    //   400: aload #9
    //   402: checkcast burp/Zm7a
    //   405: astore #12
    //   407: aload #12
    //   409: invokevirtual ZND : ()Ljava/util/List;
    //   412: astore #10
    //   414: aload #10
    //   416: invokeinterface isEmpty : ()Z
    //   421: ifne -> 558
    //   424: new java/util/HashMap
    //   427: dup
    //   428: invokespecial <init> : ()V
    //   431: astore #11
    //   433: aload #10
    //   435: invokeinterface iterator : ()Ljava/util/Iterator;
    //   440: astore #12
    //   442: aload #12
    //   444: invokeinterface hasNext : ()Z
    //   449: ifeq -> 558
    //   452: aload #12
    //   454: invokeinterface next : ()Ljava/lang/Object;
    //   459: checkcast burp/Zrji
    //   462: astore #13
    //   464: aload_0
    //   465: getfield Za : Lburp/Zsvv;
    //   468: aload #13
    //   470: invokevirtual Zw : ()Lburp/Zrji;
    //   473: invokevirtual ZB : (Lburp/Zrji;)Lburp/Zsk1;
    //   476: astore #14
    //   478: aload #14
    //   480: invokeinterface name : ()Ljava/lang/String;
    //   485: iconst_0
    //   486: anewarray java/util/function/Supplier
    //   489: invokestatic ZI : (Ljava/lang/String;[Ljava/util/function/Supplier;)Lburp/Zl7v;
    //   492: astore #15
    //   494: aload_0
    //   495: iload_2
    //   496: aload_3
    //   497: aload #14
    //   499: invokeinterface name : ()Ljava/lang/String;
    //   504: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   509: aload #14
    //   511: checkcast burp/Zm6j
    //   514: aload #4
    //   516: aload #11
    //   518: invokevirtual ZY : (ILjava/lang/String;Lburp/Zm6j;Ljava/util/Set;Ljava/util/Map;)Ljava/util/List;
    //   521: aload #15
    //   523: dup
    //   524: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   527: pop
    //   528: <illegal opcode> accept : (Lburp/Zl7v;)Ljava/util/function/Consumer;
    //   533: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   538: aload #7
    //   540: iconst_1
    //   541: anewarray java/util/function/Supplier
    //   544: dup
    //   545: iconst_0
    //   546: aload #15
    //   548: aastore
    //   549: invokevirtual ZQ : ([Ljava/util/function/Supplier;)Lburp/Zxlw;
    //   552: pop
    //   553: aload #6
    //   555: ifnull -> 442
    //   558: aload #7
    //   560: invokevirtual ZG : ()Lburp/Zkh_;
    //   563: areturn
  }
  
  private List<Zkh_> ZY(int paramInt, String paramString, Zm6j paramZm6j, Set<Zsk1> paramSet, Map<String, Zrji> paramMap) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual Zkr : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_0
    //   10: iload_1
    //   11: aload_2
    //   12: aload #4
    //   14: aload #5
    //   16: <illegal opcode> apply : (Lburp/Zxxq;ILjava/lang/String;Ljava/util/Set;Ljava/util/Map;)Ljava/util/function/Function;
    //   21: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   26: invokeinterface toList : ()Ljava/util/List;
    //   31: areturn
  }
  
  private String ZU(Zrji paramZrji, String paramString) {
    paramString = this.ZI.ZU(paramString);
    this.ZV.ZN(new Zgry[] { Zgry.ZL(paramString, paramZrji.toString()) });
    return paramString;
  }
  
  public static Zzx2 ZH(Zsvv paramZsvv, Zmfl paramZmfl, String paramString, Zehp paramZehp, Zs63 paramZs63) {
    Zmls zmls = paramZsvv.ZG(paramZmfl).stream().filter(paramString::lambda$createQuery$3).findFirst().orElseThrow();
    return (new Zxxq(paramZsvv, paramZmfl, zmls, paramZehp, paramZs63)).ZV();
  }
  
  public static Zzx2 ZZ(Zsvv paramZsvv, Zggo paramZggo, Zehp paramZehp, Zs63 paramZs63) {
    return (new Zxxq(paramZsvv, paramZggo.Zas(), paramZggo.Za6(), paramZehp, paramZs63)).ZV();
  }
  
  private static boolean lambda$createQuery$3(String paramString, Zmls paramZmls) {
    return paramString.equals(paramZmls.ZKr());
  }
  
  private Zkh_ lambda$getChildren$2(int paramInt, String paramString, Set<Zsk1> paramSet, Map<String, Zrji> paramMap, Zmls paramZmls) {
    return Zp(paramZmls, paramInt + 1, paramString + ">" + paramString, paramSet, paramMap);
  }
  
  private static void lambda$createFieldQuery$1(Zl7v paramZl7v, Supplier paramSupplier) {
    paramZl7v.Zk((Supplier<? extends Zty8>[])new Supplier[] { paramSupplier });
  }
  
  private static void lambda$createFieldQuery$0(Zxlw paramZxlw, Supplier paramSupplier) {
    paramZxlw.ZQ((Supplier<? extends Zty8>[])new Supplier[] { paramSupplier });
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: ldc 'af\\n_Mw'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxxq.a : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #17
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #80
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #94
    //   107: goto -> 112
    //   110: bipush #66
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */