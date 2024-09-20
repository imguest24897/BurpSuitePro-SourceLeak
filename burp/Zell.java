package burp;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.portswigger.Zrzg;
import net.portswigger.Zto;

public class Zell implements Zemk, Zm3g {
  private final Zkf5 Zs;
  
  private final Object Zw;
  
  private final List<Zryx> ZT;
  
  private final List<Zmcp> ZK;
  
  private final AtomicInteger Zp;
  
  private final BiConsumer<Zkqn, String> ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zell(Zrzg paramZrzg, Ztq1 paramZtq1, BiConsumer<Zkqn, String> paramBiConsumer, Supplier<String> paramSupplier) {
    this.ZU = paramBiConsumer;
    this.Zs = Zkf5.ZG(paramZrzg, paramSupplier);
    this.Zw = new Object();
    this.Zp = new AtomicInteger();
    this.ZT = new ArrayList<>();
    this.ZK = new CopyOnWriteArrayList<>();
    Zj(paramZtq1);
  }
  
  private void Zj(Ztq1 paramZtq1) {
    this.ZT.addAll(this.Zs.ZL(paramZtq1).stream().map(this::lambda$loadScriptsAndAssignIds$0).toList());
  }
  
  public int Zc() {
    synchronized (this.Zw) {
      return this.ZT.size();
    } 
  }
  
  public List<Zryx> ZV() {
    synchronized (this.Zw) {
      return List.copyOf(this.ZT);
    } 
  }
  
  public Zryx Zm(int paramInt) {
    synchronized (this.Zw) {
      return this.ZT.get(paramInt);
    } 
  }
  
  public Zryx Ze(String paramString) {
    synchronized (this.Zw) {
      return this.ZT.stream().filter(paramString::lambda$scriptByName$1).findFirst().orElse(null);
    } 
  }
  
  public Zryx Zd(int paramInt) {
    synchronized (this.Zw) {
      return this.ZT.stream().filter(paramInt::lambda$script$2).findFirst().orElse(null);
    } 
  }
  
  public void Za(Collection<Zryx> paramCollection) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Ljava/lang/Object;
    //   4: dup
    //   5: astore_3
    //   6: monitorenter
    //   7: aload_1
    //   8: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   13: aload_0
    //   14: <illegal opcode> apply : (Lburp/Zell;)Ljava/util/function/Function;
    //   19: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   24: invokeinterface toList : ()Ljava/util/List;
    //   29: astore_2
    //   30: aload_3
    //   31: monitorexit
    //   32: goto -> 42
    //   35: astore #4
    //   37: aload_3
    //   38: monitorexit
    //   39: aload #4
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZK : Ljava/util/List;
    //   46: aload_0
    //   47: aload_2
    //   48: <illegal opcode> accept : (Lburp/Zell;Ljava/util/List;)Ljava/util/function/Consumer;
    //   53: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   58: return
    // Exception table:
    //   from	to	target	type
    //   7	32	35	finally
    //   35	39	35	finally
  }
  
  public Zryx Zw(Zryx paramZryx) {
    Zmz9 zmz9;
    Zto<Zryx, Zmz9> zto;
    synchronized (this.Zw) {
      zto = ZB(paramZryx);
      zmz9 = (Zmz9)zto.Zo;
    } 
    this.ZK.forEach(zmz9::lambda$save$5);
    return (Zryx)zto.Zq;
  }
  
  public void ZN(Collection<Zryx> paramCollection) {
    synchronized (this.Zw) {
      List<Integer> list = paramCollection.stream().map(this::ZK).filter(Zell::lambda$remove$6).sorted(Comparator.reverseOrder()).toList();
      ZE(list);
    } 
  }
  
  private void ZE(List<Integer> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZZ : ()I
    //   11: iconst_0
    //   12: istore #4
    //   14: istore_2
    //   15: iload #4
    //   17: aload_1
    //   18: invokeinterface size : ()I
    //   23: if_icmpge -> 120
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface get : (I)Ljava/lang/Object;
    //   34: checkcast java/lang/Integer
    //   37: invokevirtual intValue : ()I
    //   40: istore #5
    //   42: aload_3
    //   43: aload_0
    //   44: iload #5
    //   46: invokevirtual ZC : (I)Lburp/Zmz9;
    //   49: invokeinterface add : (Ljava/lang/Object;)Z
    //   54: pop
    //   55: iload #4
    //   57: aload_1
    //   58: invokeinterface size : ()I
    //   63: iconst_1
    //   64: isub
    //   65: if_icmpeq -> 91
    //   68: aload_1
    //   69: iload #4
    //   71: iconst_1
    //   72: iadd
    //   73: invokeinterface get : (I)Ljava/lang/Object;
    //   78: checkcast java/lang/Integer
    //   81: invokevirtual intValue : ()I
    //   84: iload #5
    //   86: iconst_1
    //   87: isub
    //   88: if_icmpeq -> 113
    //   91: aload_0
    //   92: getfield ZK : Ljava/util/List;
    //   95: aload_0
    //   96: aload_3
    //   97: <illegal opcode> accept : (Lburp/Zell;Ljava/util/List;)Ljava/util/function/Consumer;
    //   102: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   107: aload_3
    //   108: invokeinterface clear : ()V
    //   113: iinc #4, 1
    //   116: iload_2
    //   117: ifeq -> 15
    //   120: return
  }
  
  private int ZK(Zryx paramZryx) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: getfield ZT : Ljava/util/List;
    //   5: invokeinterface size : ()I
    //   10: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> test : (Lburp/Zell;Lburp/Zryx;)Ljava/util/function/IntPredicate;
    //   20: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   25: invokeinterface findFirst : ()Ljava/util/OptionalInt;
    //   30: iconst_m1
    //   31: invokevirtual orElse : (I)I
    //   34: ireturn
  }
  
  public void ZF(Zmcp paramZmcp) {
    this.ZK.add(paramZmcp);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #-15340
    //   4: sipush #-31433
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: aload_0
    //   11: <illegal opcode> Zu : (Lburp/Zell;)Lburp/Zsh4;
    //   16: invokeinterface Zs : (Ljava/lang/String;Lburp/Zsh4;)Ljava/util/List;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnonnull -> 27
    //   26: return
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_3
    //   35: new java/util/ArrayList
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #4
    //   44: aload_0
    //   45: getfield ZT : Ljava/util/List;
    //   48: dup
    //   49: astore #5
    //   51: monitorenter
    //   52: iconst_0
    //   53: aload_2
    //   54: invokeinterface size : ()I
    //   59: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   62: aload_0
    //   63: aload_2
    //   64: aload_3
    //   65: aload #4
    //   67: <illegal opcode> accept : (Lburp/Zell;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/function/IntConsumer;
    //   72: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   77: aload #5
    //   79: monitorexit
    //   80: goto -> 91
    //   83: astore #6
    //   85: aload #5
    //   87: monitorexit
    //   88: aload #6
    //   90: athrow
    //   91: aload_3
    //   92: aload #4
    //   94: aload_0
    //   95: getfield ZU : Ljava/util/function/BiConsumer;
    //   98: invokestatic ZF : (Ljava/util/List;Ljava/util/List;Ljava/util/function/BiConsumer;)V
    //   101: return
    // Exception table:
    //   from	to	target	type
    //   52	80	83	finally
    //   83	88	83	finally
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zzqw zzqw = paramZg4j.ZP(a(-15330, -18677));
    Iterator<Zryx> iterator = ZV().iterator();
    int i = Zryx.ZZ();
    while (iterator.hasNext()) {
      Zryx zryx = iterator.next();
      Zzqp zzqp = zzqw.Zc();
      zzqp.Zj(a(-15332, -24846), zryx.ZT());
      zzqp.Zm(a(-15331, 19767), zryx.Ze().toString());
      if (i != 0)
        break; 
    } 
  }
  
  private Zto<Zryx, Zmz9> ZB(Zryx paramZryx) {
    Zryx zryx = Zv(paramZryx);
    Path path = paramZryx.Ze();
    zryx = ZE(zryx);
    return Zto.ZM(zryx, ZG(zryx, path));
  }
  
  private Zryx Zv(Zryx paramZryx) {
    Zr1o zr1o = paramZryx.ZF();
    if (paramZryx.ZA() == 0)
      zr1o.ZW(this.Zp.incrementAndGet()); 
    if (paramZryx.Zm() == null)
      zr1o.Zf(""); 
    return zr1o.Zr();
  }
  
  private Zryx ZE(Zryx paramZryx) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Ze : ()Ljava/nio/file/Path;
    //   4: astore_3
    //   5: invokestatic ZZ : ()I
    //   8: aload_1
    //   9: invokevirtual Zm : ()Ljava/lang/String;
    //   12: invokestatic ZQ : (Ljava/lang/String;)Ljava/lang/String;
    //   15: astore #4
    //   17: istore_2
    //   18: aload_0
    //   19: aload #4
    //   21: aload_1
    //   22: invokevirtual ZA : ()I
    //   25: invokevirtual ZM : (Ljava/lang/String;I)Z
    //   28: ifeq -> 52
    //   31: aload_0
    //   32: getfield Zs : Lburp/Zkf5;
    //   35: aload_1
    //   36: invokevirtual Ze : ()Ljava/nio/file/Path;
    //   39: aload_1
    //   40: invokevirtual Zs : ()Ljava/lang/String;
    //   43: invokevirtual ZB : (Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;
    //   46: astore #5
    //   48: iload_2
    //   49: ifeq -> 99
    //   52: aload_0
    //   53: aload #4
    //   55: aload_1
    //   56: invokevirtual ZA : ()I
    //   59: invokevirtual ZB : (Ljava/lang/String;I)Z
    //   62: ifeq -> 84
    //   65: aload_0
    //   66: getfield Zs : Lburp/Zkf5;
    //   69: aload #4
    //   71: aload_1
    //   72: invokevirtual Zs : ()Ljava/lang/String;
    //   75: invokevirtual ZZ : (Ljava/lang/String;Ljava/lang/String;)Ljava/nio/file/Path;
    //   78: astore #5
    //   80: iload_2
    //   81: ifeq -> 99
    //   84: aload_0
    //   85: getfield Zs : Lburp/Zkf5;
    //   88: aload #4
    //   90: aload_1
    //   91: invokevirtual Zs : ()Ljava/lang/String;
    //   94: invokevirtual Zp : (Ljava/lang/String;Ljava/lang/String;)Ljava/nio/file/Path;
    //   97: astore #5
    //   99: aload_1
    //   100: invokevirtual ZF : ()Lburp/Zr1o;
    //   103: aload #5
    //   105: invokevirtual Zl : (Ljava/nio/file/Path;)Lburp/Zr1o;
    //   108: invokevirtual Zr : ()Lburp/Zryx;
    //   111: astore_1
    //   112: aload_0
    //   113: aload #5
    //   115: aload_3
    //   116: invokevirtual Zc : (Ljava/nio/file/Path;Ljava/nio/file/Path;)Z
    //   119: ifeq -> 130
    //   122: aload_0
    //   123: getfield Zs : Lburp/Zkf5;
    //   126: aload_3
    //   127: invokevirtual Zg : (Ljava/nio/file/Path;)V
    //   130: aload_1
    //   131: areturn
  }
  
  private static String ZQ(String paramString) {
    return paramString.replaceAll(a(-15333, 20185), "");
  }
  
  private void Zb(List<String> paramList, int paramInt, Zl6f paramZl6f, Zryx paramZryx) {
    if (paramZl6f.Zx && !paramZryx.Zb())
      paramList.add(paramZryx.Zm()); 
    this.ZT.remove(paramZryx);
    this.ZT.add(paramInt, paramZryx.ZF().Zd((paramZryx.Zb() && paramZl6f.Zx)).Zr());
  }
  
  private static void ZJ(List<String> paramList, Zl6f paramZl6f) {
    if (paramZl6f.Zx)
      paramList.add(paramZl6f.ZN); 
  }
  
  private static void ZF(List<String> paramList1, List<String> paramList2, BiConsumer<Zkqn, String> paramBiConsumer) {
    if (paramList1.size() > 0)
      ZK(paramList1, paramBiConsumer, a(-15335, -30704)); 
    if (paramList2.size() > 0)
      ZK(paramList2, paramBiConsumer, a(-15339, -27328)); 
  }
  
  private static void ZK(List<String> paramList, BiConsumer<Zkqn, String> paramBiConsumer, String paramString) {
    StringBuilder stringBuilder = new StringBuilder(paramString.formatted(new Object[] { Integer.valueOf(paramList.size()) }));
    paramList.forEach(stringBuilder::lambda$writeToEventLog$12);
    paramBiConsumer.accept(Zkqn.ERROR, stringBuilder.toString().trim());
  }
  
  private boolean ZM(String paramString, int paramInt) {
    return ZB(paramString).anyMatch(paramInt::lambda$script$2);
  }
  
  private boolean ZB(String paramString, int paramInt) {
    return (!Zsw8.ZP(paramString) && ZK(paramString).anyMatch(paramInt::lambda$differentScriptExistsWithSameFileName$14));
  }
  
  private Zmz9 ZG(Zryx paramZryx, Path paramPath) {
    Integer integer = ZT(paramPath);
    if (integer == null) {
      this.ZT.add(paramZryx);
      return new Zmz9(Zkgw.INSERTION, this.ZT.size() - 1);
    } 
    this.ZT.set(integer.intValue(), paramZryx);
    return new Zmz9(Zkgw.UPDATE, integer.intValue());
  }
  
  private Stream<Zryx> ZK(String paramString) {
    return this.ZT.stream().filter(paramString::lambda$findByFileName$15);
  }
  
  private Stream<Zryx> ZB(String paramString) {
    return this.ZT.stream().filter(paramString::lambda$findBySanitisedName$16);
  }
  
  private Optional<Zryx> ZO(String paramString) {
    return this.ZT.stream().filter(paramString::lambda$findByPathString$17).findFirst();
  }
  
  private Integer ZT(Path paramPath) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: getfield ZT : Ljava/util/List;
    //   5: invokeinterface size : ()I
    //   10: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> test : (Lburp/Zell;Ljava/nio/file/Path;)Ljava/util/function/IntPredicate;
    //   20: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   25: invokeinterface boxed : ()Ljava/util/stream/Stream;
    //   30: invokeinterface findFirst : ()Ljava/util/Optional;
    //   35: aconst_null
    //   36: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast java/lang/Integer
    //   42: areturn
  }
  
  private Zmz9 ZC(int paramInt) {
    Zryx zryx = this.ZT.remove(paramInt);
    this.Zs.Zg(zryx.Ze());
    return new Zmz9(Zkgw.REMOVAL, paramInt);
  }
  
  private Zl6f ZB(Zvt paramZvt) throws Zzam {
    boolean bool = paramZvt.Z_(a(-15334, 3389));
    String str = paramZvt.ZC(a(-15336, 25870));
    return new Zl6f(bool, str);
  }
  
  private List<Zmz9> Zw(List<Zmz9> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    paramList.forEach(hashMap::lambda$compactEvents$20);
    ArrayList<Zmz9> arrayList = new ArrayList();
    arrayList.addAll(Z_(Zkgw.REMOVAL, (List<Zmz9>)hashMap.getOrDefault(Zkgw.REMOVAL, Collections.emptyList())));
    arrayList.addAll(Z_(Zkgw.UPDATE, (List<Zmz9>)hashMap.getOrDefault(Zkgw.UPDATE, Collections.emptyList())));
    arrayList.addAll(Z_(Zkgw.INSERTION, (List<Zmz9>)hashMap.getOrDefault(Zkgw.INSERTION, Collections.emptyList())));
    return arrayList;
  }
  
  private List<Zmz9> Z_(Zkgw paramZkgw, List<Zmz9> paramList) {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifeq -> 15
    //   13: aload_2
    //   14: areturn
    //   15: new java/util/LinkedList
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #4
    //   24: aload_2
    //   25: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   30: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   35: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   38: invokeinterface reversed : ()Ljava/util/Comparator;
    //   43: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   48: invokeinterface toList : ()Ljava/util/List;
    //   53: astore #5
    //   55: aconst_null
    //   56: astore #6
    //   58: aload #5
    //   60: invokeinterface iterator : ()Ljava/util/Iterator;
    //   65: astore #7
    //   67: aload #7
    //   69: invokeinterface hasNext : ()Z
    //   74: ifeq -> 156
    //   77: aload #7
    //   79: invokeinterface next : ()Ljava/lang/Object;
    //   84: checkcast burp/Zmz9
    //   87: astore #8
    //   89: aload #6
    //   91: ifnull -> 133
    //   94: aload #6
    //   96: invokevirtual ZGl : ()I
    //   99: iconst_1
    //   100: isub
    //   101: aload #8
    //   103: invokevirtual ZGl : ()I
    //   106: if_icmpne -> 133
    //   109: new burp/Zmz9
    //   112: dup
    //   113: aload_1
    //   114: aload #8
    //   116: invokevirtual ZGl : ()I
    //   119: aload #6
    //   121: invokevirtual ZGQ : ()I
    //   124: invokespecial <init> : (Lburp/Zkgw;II)V
    //   127: astore #6
    //   129: iload_3
    //   130: ifeq -> 152
    //   133: aload #6
    //   135: ifnull -> 148
    //   138: aload #4
    //   140: aload #6
    //   142: invokeinterface add : (Ljava/lang/Object;)Z
    //   147: pop
    //   148: aload #8
    //   150: astore #6
    //   152: iload_3
    //   153: ifeq -> 67
    //   156: aload #6
    //   158: ifnull -> 171
    //   161: aload #4
    //   163: aload #6
    //   165: invokeinterface add : (Ljava/lang/Object;)Z
    //   170: pop
    //   171: aload #4
    //   173: areturn
  }
  
  private boolean Zc(Path paramPath1, Path paramPath2) {
    return (ZD(paramPath2) && !paramPath2.equals(paramPath1));
  }
  
  private boolean ZD(Path paramPath) {
    return this.Zs.Zq(paramPath);
  }
  
  private static void lambda$compactEvents$20(Map paramMap, Zmz9 paramZmz9) {
    paramMap.compute(paramZmz9.ZG9(), paramZmz9::lambda$compactEvents$19);
  }
  
  private static List lambda$compactEvents$19(Zmz9 paramZmz9, Zkgw paramZkgw, List<?> paramList) {
    return (paramList == null) ? List.<Zmz9>of(paramZmz9) : Stream.concat(Stream.of(paramZmz9), paramList.stream()).toList();
  }
  
  private boolean lambda$findIndexByPath$18(Path paramPath, int paramInt) {
    return Objects.equals(paramPath, ((Zryx)this.ZT.get(paramInt)).Ze());
  }
  
  private static boolean lambda$findByPathString$17(String paramString, Zryx paramZryx) {
    return paramZryx.Ze().toString().equals(paramString);
  }
  
  private static boolean lambda$findBySanitisedName$16(String paramString, Zryx paramZryx) {
    return ZQ(paramZryx.Zm()).equals(paramString);
  }
  
  private static boolean lambda$findByFileName$15(String paramString, Zryx paramZryx) {
    return paramZryx.Ze().getFileName().toString().equals(paramString + paramString);
  }
  
  private static boolean lambda$differentScriptExistsWithSameFileName$14(int paramInt, Zryx paramZryx) {
    return (paramZryx.ZA() != paramInt);
  }
  
  private static void lambda$writeToEventLog$12(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append("\"").append(paramString).append("\"").append("\n");
  }
  
  private void lambda$loadBurpConfiguration$11(List<Zl6f> paramList1, List paramList2, List paramList3, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: iload #4
    //   3: invokeinterface get : (I)Ljava/lang/Object;
    //   8: checkcast burp/Zl6f
    //   11: astore #5
    //   13: aload_0
    //   14: aload #5
    //   16: getfield ZN : Ljava/lang/String;
    //   19: invokevirtual ZO : (Ljava/lang/String;)Ljava/util/Optional;
    //   22: aload_0
    //   23: aload_2
    //   24: iload #4
    //   26: aload #5
    //   28: <illegal opcode> accept : (Lburp/Zell;Ljava/util/List;ILburp/Zl6f;)Ljava/util/function/Consumer;
    //   33: aload_3
    //   34: aload #5
    //   36: <illegal opcode> run : (Ljava/util/List;Lburp/Zl6f;)Ljava/lang/Runnable;
    //   41: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   44: return
  }
  
  private static void lambda$loadBurpConfiguration$10(List<String> paramList, Zl6f paramZl6f) {
    ZJ(paramList, paramZl6f);
  }
  
  private void lambda$loadBurpConfiguration$9(List<String> paramList, int paramInt, Zl6f paramZl6f, Zryx paramZryx) {
    Zb(paramList, paramInt, paramZl6f, paramZryx);
  }
  
  private boolean lambda$indexOf$8(Zryx paramZryx, int paramInt) {
    return Zm(paramInt).Ze().equals(paramZryx.Ze());
  }
  
  private static boolean lambda$remove$6(Integer paramInteger) {
    return (paramInteger.intValue() > -1);
  }
  
  private static void lambda$save$5(Zmz9 paramZmz9, Zmcp paramZmcp) {
    paramZmcp.ZC(List.of(paramZmz9));
  }
  
  private void lambda$save$4(List<Zmz9> paramList, Zmcp paramZmcp) {
    paramZmcp.ZC(Zw(paramList));
  }
  
  private Zmz9 lambda$save$3(Zryx paramZryx) {
    return (Zmz9)(ZB(paramZryx)).Zo;
  }
  
  private static boolean lambda$script$2(int paramInt, Zryx paramZryx) {
    return (paramZryx.ZA() == paramInt);
  }
  
  private static boolean lambda$scriptByName$1(String paramString, Zryx paramZryx) {
    return paramZryx.Zm().equals(paramString);
  }
  
  private Zryx lambda$loadScriptsAndAssignIds$0(Zryx paramZryx) {
    return paramZryx.ZF().ZW(this.Zp.incrementAndGet()).Zr();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' 4ívî§i¤%ÐDUñ=¿·.ü,÷Q_¶&~N nÿuÚ\\fã³E'µGÛ­)bêêé\\rXµx¶}nuj\\b_,Õ\QNÚM+o@ºªÖú\\tRÀxø¡G,¶¥ù#:¹j¢¶JCÒâ¥Þ@\\fÓ õ ¬µÅ2êÞ]Iìtd\\rOÂ÷rU=táåL\\bìÓ\\nZÓFm=SÁ\\t)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
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
    //   68: ldc 'OjªUB¯(à¢¬e/¡áxÍÜ:¼V1+Zª¸5Ükß÷¦"WºÖäZæÈø°Â?ð#bj·xË-vulPzE«æ­%åÓå¶Ua¡_ïFsJ¸T:Ã³×7üÔk{uÝµïy¢«¢*ëKó\\tHBSØÙ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #37
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
    //   129: putstatic burp/Zell.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zell.b : [Ljava/lang/String;
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
    //   212: bipush #49
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #68
    //   239: goto -> 244
    //   242: bipush #77
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
    int i = (paramInt1 ^ 0xFFFFC41C) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zell.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */