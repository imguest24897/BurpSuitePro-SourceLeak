package net.portswigger;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiFunction;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public abstract class Zrz5 implements Zrmq {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrmq ZP() {
    return this;
  }
  
  public Zrmq Zi(String paramString) {
    Zn(a(1470, 9622));
    return null;
  }
  
  public String ZW() {
    Zn(a(1447, -13932));
    return null;
  }
  
  public String ZV(String paramString) {
    return paramString;
  }
  
  public Number Zk() {
    Zn(a(1457, -24010));
    return Double.valueOf(-1.0D);
  }
  
  public Number Zw(Number paramNumber) {
    return paramNumber;
  }
  
  public boolean ZG() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    return number instanceof Byte;
  }
  
  public byte ZF() {
    Number number = Zk();
    try {
      if (ZG())
        return number.byteValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1442, 3565), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean Zd() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    try {
      if (!ZG()) {
        try {
          if (number instanceof Short);
        } catch (Znd znd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public short ZC() {
    Number number = Zk();
    try {
      if (Zd())
        return number.shortValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1462, 9264), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean ZE() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    try {
      if (!Zd()) {
        try {
          if (number instanceof Integer);
        } catch (Znd znd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public int ZR() {
    Number number = Zk();
    try {
      if (ZE())
        return number.intValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1466, -27560), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean Zf() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    try {
      if (!ZE()) {
        try {
          if (number instanceof Long);
        } catch (Znd znd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public long Zz() {
    Number number = Zk();
    try {
      if (Zf())
        return number.longValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1469, -323), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean Zt() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    try {
      if (!ZE()) {
        try {
          if (number instanceof Float);
        } catch (Znd znd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public float ZS() {
    Number number = Zk();
    try {
      if (Zt())
        return number.floatValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1443, -11389), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean ZB() {
    Number number = Zw(null);
    try {
      if (number == null)
        return false; 
    } catch (Znd znd) {
      throw a(null);
    } 
    try {
      if (!ZE())
        try {
          if (!(number instanceof Float)) {
            try {
              if (number instanceof Double);
            } catch (Znd znd) {
              throw a(null);
            } 
            return false;
          } 
        } catch (Znd znd) {
          throw a(null);
        }  
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public double Zn() {
    Number number = Zk();
    try {
      if (ZB())
        return number.doubleValue(); 
    } catch (Znd znd) {
      throw a(null);
    } 
    throw new Znd(String.format(a(1440, 27557), new Object[] { number.getClass().getSimpleName().toLowerCase() }));
  }
  
  public boolean Zm() {
    Zn(a(1461, 8837));
    return false;
  }
  
  public boolean ZJ(boolean paramBoolean) {
    return paramBoolean;
  }
  
  public Zrmq ZG(int paramInt) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zrmq ZY(int paramInt, Zd4 paramZd4) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zrmq Zh(Zd4 paramZd4) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zrmq ZR(String paramString) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zrmq ZH(Number paramNumber) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public final Zrmq Zk(double paramDouble) {
    return ZH(Double.valueOf(paramDouble));
  }
  
  public Zrmq Zm(boolean paramBoolean) {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zrmq Zo(String paramString) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Optional<Zrmq> Zq(String paramString) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public boolean Zm(String paramString) {
    Zn(a(1456, -20822));
    return false;
  }
  
  public Zrmq ZN(String paramString, Zd4 paramZd4) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Zrmq Zg(String paramString1, String paramString2) {
    Zn(a(1471, -4468));
    return null;
  }
  
  public Zrmq ZK(String paramString, Number paramNumber) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public final Zrmq Zy(String paramString, int paramInt) {
    return ZK(paramString, Integer.valueOf(paramInt));
  }
  
  public Zrmq ZI(String paramString, boolean paramBoolean) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Zrmq ZQ(String paramString) {
    Zn(a(1456, -20822));
    return null;
  }
  
  public int Zi() {
    Zn(a(1459, -16949));
    return -1;
  }
  
  public Zrmq ZK(String paramString) {
    Zn(a(1460, 29289));
    return null;
  }
  
  public Zrmq Zj(String paramString) {
    Zn(a(1460, 29289));
    return null;
  }
  
  public String ZM() {
    Zn(a(1460, 29289));
    return null;
  }
  
  public String ZJ() {
    Zn(a(1460, 29289));
    return null;
  }
  
  public boolean ZZ() {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return (Zi() == 0);
  }
  
  public Iterator<Zrmq> Zs() {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Iterator<Map.Entry<String, Zrmq>> ZL() {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Iterable<Zrmq> ZO() {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Iterable<Map.Entry<String, Zrmq>> ZX() {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Stream<Zrmq> Zc() {
    Zn(a(1458, -23948));
    return null;
  }
  
  public Stream<Map.Entry<String, Zrmq>> Zx() {
    Zn(a(1456, -20822));
    return null;
  }
  
  public Spliterator<Zrmq> Zv() {
    Zn(a(1441, -5636));
    return null;
  }
  
  public boolean Zr() {
    return false;
  }
  
  public boolean Zb() {
    return false;
  }
  
  public boolean Zh() {
    return false;
  }
  
  public boolean Zy() {
    return false;
  }
  
  public boolean Zw() {
    return false;
  }
  
  public boolean Za() {
    return false;
  }
  
  public boolean ZK() {
    return false;
  }
  
  public Zhq ZN() {
    Zn(a(1444, -6889));
    return null;
  }
  
  public Zzo ZV() {
    Zn(a(1463, 11431));
    return null;
  }
  
  public Zfb ZT() {
    Zn(a(1441, -5636));
    return null;
  }
  
  public Zi7 Zu() {
    Zn(a(1456, -20822));
    return null;
  }
  
  abstract void ZC(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Za1 paramZa1);
  
  static void Zi(int paramInt, Za1 paramZa1) {
    try {
      if (paramInt > 0)
        paramZa1.Zz('\n'); 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  static void Zj(int paramInt, Za1 paramZa1) {
    try {
      if (paramInt > 0)
        paramZa1.Zz(' '); 
    } catch (Znd znd) {
      throw a(null);
    } 
  }
  
  public final Zsq Zo() {
    return new Zd5(this);
  }
  
  protected static void Zt(Za1 paramZa1, boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZP : ()Z
    //   3: istore #7
    //   5: iload #4
    //   7: ifeq -> 260
    //   10: aload_2
    //   11: ifnull -> 260
    //   14: goto -> 21
    //   17: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   20: athrow
    //   21: iload_1
    //   22: ifeq -> 53
    //   25: goto -> 32
    //   28: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   31: athrow
    //   32: iload #6
    //   34: iload #5
    //   36: imul
    //   37: aload_0
    //   38: invokestatic ZW : (ILnet/portswigger/Za1;)V
    //   41: iload #7
    //   43: ifeq -> 92
    //   46: goto -> 53
    //   49: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   52: athrow
    //   53: iload #5
    //   55: ifle -> 92
    //   58: goto -> 65
    //   61: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   64: athrow
    //   65: iload_3
    //   66: ifne -> 92
    //   69: goto -> 76
    //   72: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   75: athrow
    //   76: aload_0
    //   77: bipush #32
    //   79: invokeinterface Zz : (C)Lnet/portswigger/Za1;
    //   84: pop
    //   85: goto -> 92
    //   88: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   91: athrow
    //   92: iload #5
    //   94: ifle -> 175
    //   97: aload_2
    //   98: bipush #10
    //   100: invokevirtual indexOf : (I)I
    //   103: iconst_m1
    //   104: if_icmpne -> 175
    //   107: goto -> 114
    //   110: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   113: athrow
    //   114: iload_3
    //   115: ifeq -> 148
    //   118: goto -> 125
    //   121: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   124: athrow
    //   125: aload_0
    //   126: sipush #1445
    //   129: sipush #23072
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   140: pop
    //   141: goto -> 148
    //   144: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   147: athrow
    //   148: aload_0
    //   149: sipush #1446
    //   152: sipush #-24389
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   163: aload_2
    //   164: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   169: pop
    //   170: iload #7
    //   172: ifeq -> 238
    //   175: aload_0
    //   176: sipush #1465
    //   179: sipush #-16736
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   190: aload_2
    //   191: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   196: sipush #1454
    //   199: sipush #-19367
    //   202: invokestatic a : (II)Ljava/lang/String;
    //   205: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   210: pop
    //   211: iload_3
    //   212: ifeq -> 238
    //   215: goto -> 222
    //   218: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   221: athrow
    //   222: aload_0
    //   223: bipush #44
    //   225: invokeinterface Zz : (C)Lnet/portswigger/Za1;
    //   230: pop
    //   231: goto -> 238
    //   234: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   237: athrow
    //   238: iload_1
    //   239: ifeq -> 287
    //   242: iload #5
    //   244: aload_0
    //   245: invokestatic Zi : (ILnet/portswigger/Za1;)V
    //   248: iload #7
    //   250: ifeq -> 287
    //   253: goto -> 260
    //   256: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   259: athrow
    //   260: iload_3
    //   261: ifeq -> 287
    //   264: goto -> 271
    //   267: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   270: athrow
    //   271: aload_0
    //   272: bipush #44
    //   274: invokeinterface Zz : (C)Lnet/portswigger/Za1;
    //   279: pop
    //   280: goto -> 287
    //   283: invokestatic a : (Lnet/portswigger/Znd;)Lnet/portswigger/Znd;
    //   286: athrow
    //   287: return
    // Exception table:
    //   from	to	target	type
    //   5	14	17	net/portswigger/Znd
    //   10	25	28	net/portswigger/Znd
    //   21	46	49	net/portswigger/Znd
    //   32	58	61	net/portswigger/Znd
    //   53	69	72	net/portswigger/Znd
    //   65	85	88	net/portswigger/Znd
    //   92	107	110	net/portswigger/Znd
    //   97	118	121	net/portswigger/Znd
    //   114	141	144	net/portswigger/Znd
    //   148	215	218	net/portswigger/Znd
    //   175	231	234	net/portswigger/Znd
    //   238	253	256	net/portswigger/Znd
    //   242	264	267	net/portswigger/Znd
    //   260	280	283	net/portswigger/Znd
  }
  
  public final String Zj() {
    return Zo().ZM(2).toString();
  }
  
  public final byte[] ZU() {
    return Zny.Zv(toString());
  }
  
  public final String toString() {
    return Zo().toString();
  }
  
  protected abstract String Zg();
  
  private void Zn(String paramString) {
    throw new Znd(Zg() + Zg() + a(1464, -24141));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$7(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf((paramZrmq1.Zk().doubleValue() > paramZrmq2.Zk().doubleValue()));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$6(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf((paramZrmq1.Zk().doubleValue() >= paramZrmq2.Zk().doubleValue()));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$5(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf((paramZrmq1.Zk().doubleValue() < paramZrmq2.Zk().doubleValue()));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$4(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf((paramZrmq1.Zk().doubleValue() <= paramZrmq2.Zk().doubleValue()));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$3(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf(!Pattern.compile(paramZrmq2.ZW()).matcher(paramZrmq1.ZW()).find());
  }
  
  private static Boolean lambda$parseBiPredicateOperator$2(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    try {
    
    } catch (Znd znd) {
      throw a(null);
    } 
    return Boolean.valueOf(!paramZrmq1.equals(paramZrmq2));
  }
  
  private static Boolean lambda$parseBiPredicateOperator$1(Zrmq paramZrmq1, Zrmq paramZrmq2) {
    return Boolean.valueOf(Pattern.compile(paramZrmq2.ZW()).matcher(paramZrmq1.ZW()).find());
  }
  
  private static Boolean lambda$wrap$0(Zii paramZii, String paramString, BiFunction<Zrmq, Zrmq, Boolean> paramBiFunction, Zrmq paramZrmq1, Zrmq paramZrmq2) {
    String str1 = ((Zrz5)paramZrmq1).Zg();
    String str2 = ((Zrz5)paramZrmq2).Zg();
    try {
      if (!str1.equals(str2))
        throw new Zlh(a(1467, -30013), paramZii, String.format(a(1468, 30804), new Object[] { str1, str2 }), new Zmu(null, paramString, null)); 
    } catch (Znd znd) {
      throw a(null);
    } 
    return paramBiFunction.apply(paramZrmq1, paramZrmq2);
  }
  
  private static Znd a(Znd paramZnd) {
    return paramZnd;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '²Ì7ÆYý¶ÊHíu+ú]wÁ2ßuq\\b\\fÞöm~;ëÙXöÍA|^áDèB\\tþpÔ9¨;iw\\bJ3 Ø%Öb\uÂ}Ïi,ÕÂ³n¡\\f\\t$XTß¢\\bt©H¯Å-7¢Ñêg6¹>Æ%\\tDú8jw(à¡CMH ×Rtp >1om\\n4'XI¤87+·A¥ÏnEjiÌÆýÈ¶ÇtÊ%íØúëw\\b5g%ëÅ"aÙ%åê0­$ÉF¼Ý¯¨7ÒXýÝ¡O*[Q8½³my¢\\bË´\\nAhd?ÁÊöQä\\b|^ç® \\bÐk AIJ&HøÒ~p7¹8yöÚj'aä´ù[ð|¡[U4£}­á9å\\bíÃ8m?hC©âp¼oÈR<s°*øñcüéyÝô³Z½s'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #122
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
    //   68: ldc 'öÄÈyc½õ=.éµ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #11
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
    //   129: putstatic net/portswigger/Zrz5.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zrz5.b : [Ljava/lang/String;
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
    //   212: bipush #72
    //   214: goto -> 244
    //   217: bipush #96
    //   219: goto -> 244
    //   222: bipush #24
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #69
    //   234: goto -> 244
    //   237: bipush #111
    //   239: goto -> 244
    //   242: bipush #6
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
    int i = (paramInt1 ^ 0x5B6) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrz5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */