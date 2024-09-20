package net.portswigger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Zi2 {
  static Zh2 ZX(Zav paramZav, boolean paramBoolean) {
    return Zv(paramZav, 0, new HashMap<>(), paramBoolean);
  }
  
  static Zf6 Zq(Zav paramZav) {
    return ZC(paramZav, 0, new HashMap<>());
  }
  
  static Optional<Zms> ZT(Zav paramZav, List<Zf6> paramList, boolean paramBoolean) {
    return ZI(paramZav, 0, new HashMap<>(), paramList, paramBoolean);
  }
  
  private static Optional<Zms> Z_(Zav paramZav, int paramInt, Map<String, Integer> paramMap, boolean paramBoolean) {
    return ZI(paramZav, paramInt, paramMap, Collections.emptyList(), paramBoolean);
  }
  
  private static Optional<Zms> ZI(Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zf6> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iadd
    //   3: istore #5
    //   5: aload_0
    //   6: invokevirtual Zp : ()Ljava/lang/String;
    //   9: astore #6
    //   11: aload #6
    //   13: ifnull -> 46
    //   16: aload_2
    //   17: aload #6
    //   19: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
    //   24: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   29: checkcast java/lang/Integer
    //   32: invokevirtual intValue : ()I
    //   35: iconst_4
    //   36: if_icmple -> 46
    //   39: invokestatic Zf : ()Lnet/portswigger/Zz5;
    //   42: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   45: areturn
    //   46: aload_0
    //   47: invokevirtual Zc : ()Ljava/util/List;
    //   50: astore #7
    //   52: aload #7
    //   54: invokeinterface isEmpty : ()Z
    //   59: ifne -> 73
    //   62: iload #5
    //   64: aload_2
    //   65: aload #7
    //   67: iload #4
    //   69: invokestatic Zc : (ILjava/util/Map;Ljava/util/List;Z)Ljava/util/Optional;
    //   72: areturn
    //   73: aload_0
    //   74: invokevirtual ZY : ()Ljava/util/List;
    //   77: astore #8
    //   79: aload #8
    //   81: invokeinterface isEmpty : ()Z
    //   86: ifne -> 100
    //   89: iload #5
    //   91: aload_2
    //   92: aload #8
    //   94: iload #4
    //   96: invokestatic Zc : (ILjava/util/Map;Ljava/util/List;Z)Ljava/util/Optional;
    //   99: areturn
    //   100: aload_0
    //   101: invokevirtual ZP : ()Ljava/util/List;
    //   104: astore #9
    //   106: aload #9
    //   108: invokeinterface isEmpty : ()Z
    //   113: ifne -> 173
    //   116: new net/portswigger/Ziz
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: astore #10
    //   125: aload #10
    //   127: aload_3
    //   128: invokevirtual ZM : (Ljava/util/List;)Lnet/portswigger/Ziz;
    //   131: pop
    //   132: aload #9
    //   134: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   139: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   144: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   149: iload #5
    //   151: aload_2
    //   152: aload #10
    //   154: <illegal opcode> accept : (ILjava/util/Map;Lnet/portswigger/Ziz;)Ljava/util/function/Consumer;
    //   159: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   164: aload #10
    //   166: invokevirtual ZI : ()Lnet/portswigger/Zf6;
    //   169: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   172: areturn
    //   173: getstatic net/portswigger/Zlu.Zy : [I
    //   176: aload_0
    //   177: invokevirtual Zg : ()Lnet/portswigger/Ziq;
    //   180: invokevirtual ordinal : ()I
    //   183: iaload
    //   184: lookupswitch default -> 241, 1 -> 212, 2 -> 226
    //   212: aload_0
    //   213: iload #5
    //   215: aload_2
    //   216: aload_3
    //   217: invokestatic ZP : (Lnet/portswigger/Zav;ILjava/util/Map;Ljava/util/List;)Lnet/portswigger/Zf6;
    //   220: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   223: goto -> 258
    //   226: aload_0
    //   227: iload #5
    //   229: aload_2
    //   230: iload #4
    //   232: invokestatic Zv : (Lnet/portswigger/Zav;ILjava/util/Map;Z)Lnet/portswigger/Zh2;
    //   235: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   238: goto -> 258
    //   241: aload_0
    //   242: aload_0
    //   243: invokevirtual Zj : ()Ljava/util/stream/Stream;
    //   246: iload #4
    //   248: aload_0
    //   249: invokevirtual Zh : ()Ljava/lang/String;
    //   252: invokestatic ZK : (Lnet/portswigger/Zav;Ljava/util/stream/Stream;ZLjava/lang/String;)Lnet/portswigger/Zms;
    //   255: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   258: areturn
  }
  
  private static Zf6 ZC(Zav paramZav, int paramInt, Map<String, Integer> paramMap) {
    return ZP(paramZav, paramInt, paramMap, Collections.emptyList());
  }
  
  private static Zf6 ZP(Zav paramZav, int paramInt, Map<String, Integer> paramMap, List<Zf6> paramList) {
    // Byte code:
    //   0: new net/portswigger/Ziz
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: aload_3
    //   12: invokevirtual ZM : (Ljava/util/List;)Lnet/portswigger/Ziz;
    //   15: pop
    //   16: aload_0
    //   17: invokevirtual Zi : ()Ljava/util/Map;
    //   20: aload_0
    //   21: iload_1
    //   22: aload_2
    //   23: aload #4
    //   25: <illegal opcode> accept : (Lnet/portswigger/Zav;ILjava/util/Map;Lnet/portswigger/Ziz;)Ljava/util/function/BiConsumer;
    //   30: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   35: aload #4
    //   37: invokevirtual ZI : ()Lnet/portswigger/Zf6;
    //   40: areturn
  }
  
  private static Zh2 Zv(Zav paramZav, int paramInt, Map<String, Integer> paramMap, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZK : ()Ljava/util/Optional;
    //   4: astore #4
    //   6: aload_0
    //   7: invokevirtual ZO : ()Ljava/lang/Integer;
    //   10: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   13: iconst_1
    //   14: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast java/lang/Integer
    //   23: invokevirtual intValue : ()I
    //   26: istore #5
    //   28: aload #4
    //   30: iload #5
    //   32: iload_1
    //   33: aload_2
    //   34: iload_3
    //   35: <illegal opcode> apply : (IILjava/util/Map;Z)Ljava/util/function/Function;
    //   40: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   43: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   48: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   51: checkcast java/util/List
    //   54: astore #6
    //   56: new net/portswigger/Zh2
    //   59: dup
    //   60: aload #6
    //   62: aload_0
    //   63: invokevirtual Zh : ()Ljava/lang/String;
    //   66: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
    //   69: areturn
  }
  
  private static Optional<Zms> Zc(int paramInt, Map<String, Integer> paramMap, List<Zav> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: new net/portswigger/Zoa
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload_2
    //   10: iload_0
    //   11: aload_1
    //   12: iload_3
    //   13: aload #4
    //   15: <illegal opcode> accept : (ILjava/util/Map;ZLnet/portswigger/Zoa;)Ljava/util/function/Consumer;
    //   20: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   25: aload #4
    //   27: invokevirtual ZS : ()Lnet/portswigger/Zsj;
    //   30: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   33: areturn
  }
  
  private static void lambda$buildOneOfFragment$6(int paramInt, Map<String, Integer> paramMap, boolean paramBoolean, Zoa paramZoa, Zav paramZav) {
    Zms zms = Z_(paramZav, paramInt, paramMap, paramBoolean).orElse(Zrmr.ZD(true));
    paramZoa.ZX(zms);
  }
  
  private static List lambda$buildJsonArrayFragment$5(int paramInt1, int paramInt2, Map paramMap, boolean paramBoolean, Zav paramZav) {
    // Byte code:
    //   0: iconst_0
    //   1: iload_0
    //   2: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   5: aload #4
    //   7: iload_1
    //   8: aload_2
    //   9: iload_3
    //   10: <illegal opcode> apply : (Lnet/portswigger/Zav;ILjava/util/Map;Z)Ljava/util/function/IntFunction;
    //   15: invokeinterface mapToObj : (Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    //   20: invokestatic toList : ()Ljava/util/stream/Collector;
    //   23: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   28: checkcast java/util/List
    //   31: areturn
  }
  
  private static Zms lambda$buildJsonArrayFragment$4(Zav paramZav, int paramInt1, Map<String, Integer> paramMap, boolean paramBoolean, int paramInt2) {
    return Z_(paramZav, paramInt1, paramMap, paramBoolean).orElse(Zrmr.ZD(true));
  }
  
  private static void lambda$buildJsonObjectFragment$3(Zav paramZav, int paramInt, Map<? extends String, ? extends Integer> paramMap, Ziz paramZiz, String paramString, Zoc paramZoc) {
    boolean bool = (paramZav.Zm() != null && paramZav.Zm().contains(paramString)) ? true : false;
    if (paramInt < 6 || (paramInt < 12 && bool)) {
      Zms zms = Z_(paramZoc.ZF(), paramInt, new HashMap<>(paramMap), bool).orElse(Zrmr.ZD(true));
      paramZiz.ZG(paramString, zms);
    } 
  }
  
  private static void lambda$buildJsonFragment$2(int paramInt, Map<String, Integer> paramMap, Ziz paramZiz, Zav paramZav) {
    Zf6 zf6 = ZP(paramZav, paramInt, paramMap, Collections.emptyList());
    paramZiz.Zu(zf6.ZnW());
  }
  
  private static boolean lambda$buildJsonFragment$1(Zav paramZav) {
    return (paramZav.Zg() == Ziq.OBJECT);
  }
  
  private static Integer lambda$buildJsonFragment$0(String paramString, Integer paramInteger) {
    return Integer.valueOf((paramInteger == null) ? 1 : (paramInteger.intValue() + 1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zi2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */