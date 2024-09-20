package burp;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import javax.swing.JTabbedPane;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zlw0 {
  private final Zlte Zs;
  
  private final Predicate<Zl5t> ZA;
  
  private final boolean ZQ;
  
  private final PropertyChangeListener Zl;
  
  private final PropertyChangeListener Zn;
  
  private final Zkh9 ZR;
  
  private final List<Zl5t> Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zlw0(Zrxv paramZrxv, Zz9w paramZz9w, Zzdl paramZzdl, Zo0 paramZo0, Predicate<Zl5t> paramPredicate, boolean paramBoolean) {
    this.Zs = paramZrxv.Ze(new Zzn9(this)).ZE(paramZz9w).ZW();
    this.ZA = paramPredicate;
    this.ZQ = paramBoolean;
    this.Zl = new Zw(this, paramZzdl, paramZo0);
    this.Zn = new Zeuw(this, paramZzdl, paramZo0);
    this.ZR = new Zgvq(this);
    this.Zi = new CopyOnWriteArrayList<>();
  }
  
  Zl5t ZS(int paramInt) {
    Component component = this.Zs.getComponentAt(paramInt);
    if (component != null) {
      Optional<Zl5t> optional = ZD(component);
      return optional.orElse(null);
    } 
    return null;
  }
  
  public Optional<Zl5t> ZW(String paramString) {
    return (paramString == null) ? Optional.empty() : this.Zi.stream().filter(paramString::lambda$findSuiteComponentById$0).findFirst();
  }
  
  public Optional<Zl5t> ZD(Component paramComponent) {
    return (paramComponent == null) ? Optional.empty() : this.Zi.stream().filter(paramComponent::lambda$findSuiteComponentByComponent$1).findFirst();
  }
  
  void Zr(Zl5t paramZl5t) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #-15100
    //   4: sipush #-20232
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: aload_0
    //   11: getfield Zn : Ljava/beans/PropertyChangeListener;
    //   14: invokeinterface Zi : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   19: aload_1
    //   20: sipush #-15099
    //   23: sipush #11096
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: aload_0
    //   30: getfield Zl : Ljava/beans/PropertyChangeListener;
    //   33: invokeinterface Zi : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   38: aload_1
    //   39: sipush #-15100
    //   42: sipush #-20232
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: aload_0
    //   49: getfield Zn : Ljava/beans/PropertyChangeListener;
    //   52: invokeinterface ZJ : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   57: invokestatic Zb : ()Ljava/lang/String;
    //   60: aload_1
    //   61: sipush #-15099
    //   64: sipush #11096
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload_0
    //   71: getfield Zl : Ljava/beans/PropertyChangeListener;
    //   74: invokeinterface ZJ : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   79: astore_2
    //   80: aload_1
    //   81: aload_0
    //   82: getfield ZR : Lburp/Zkh9;
    //   85: invokeinterface ZB : (Lburp/Zkh9;)V
    //   90: aload_1
    //   91: aload_0
    //   92: getfield ZR : Lburp/Zkh9;
    //   95: invokeinterface ZX : (Lburp/Zkh9;)V
    //   100: aload_0
    //   101: getfield Zi : Ljava/util/List;
    //   104: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   109: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   114: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   119: aload_1
    //   120: invokeinterface Zs : ()Ljava/lang/String;
    //   125: dup
    //   126: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   135: invokeinterface noneMatch : (Ljava/util/function/Predicate;)Z
    //   140: ifeq -> 158
    //   143: aload_0
    //   144: getfield Zi : Ljava/util/List;
    //   147: aload_1
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: aload_2
    //   155: ifnonnull -> 178
    //   158: aload_0
    //   159: aload_1
    //   160: invokeinterface Zs : ()Ljava/lang/String;
    //   165: invokevirtual ZW : (Ljava/lang/String;)Ljava/util/Optional;
    //   168: aload_0
    //   169: aload_1
    //   170: <illegal opcode> accept : (Lburp/Zlw0;Lburp/Zl5t;)Ljava/util/function/Consumer;
    //   175: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   178: aload_1
    //   179: invokeinterface Zl : ()Z
    //   184: ifne -> 205
    //   187: aload_0
    //   188: getfield ZA : Ljava/util/function/Predicate;
    //   191: aload_1
    //   192: invokeinterface test : (Ljava/lang/Object;)Z
    //   197: ifeq -> 205
    //   200: aload_0
    //   201: aload_1
    //   202: invokevirtual ZN : (Lburp/Zl5t;)V
    //   205: return
  }
  
  private void ZN(Zl5t paramZl5t) {
    if (this.Zs.indexOfComponent(paramZl5t.ZZ()) >= 0) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    int i = Zy(paramZl5t);
    this.Zs.ZA(paramZl5t.Zk(), paramZl5t.ZZ(), i);
  }
  
  void Ze(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual ZD : (Ljava/awt/Component;)Ljava/util/Optional;
    //   5: astore_2
    //   6: aload_2
    //   7: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   12: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   15: aconst_null
    //   16: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast java/lang/Integer
    //   22: astore_3
    //   23: aload_0
    //   24: getfield Zs : Lburp/Zlte;
    //   27: aload_1
    //   28: invokeinterface indexOfComponent : (Ljava/awt/Component;)I
    //   33: istore #4
    //   35: iload #4
    //   37: iflt -> 51
    //   40: aload_0
    //   41: getfield Zs : Lburp/Zlte;
    //   44: iload #4
    //   46: invokeinterface remove : (I)V
    //   51: aload_2
    //   52: aload_0
    //   53: aload_3
    //   54: <illegal opcode> accept : (Lburp/Zlw0;Ljava/lang/Integer;)Ljava/util/function/Consumer;
    //   59: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   62: return
  }
  
  JTabbedPane Zc() {
    return (JTabbedPane)this.Zs.ZO();
  }
  
  void ZM(Component paramComponent) {
    this.Zs.setSelectedComponent(paramComponent);
  }
  
  void Zj(Component paramComponent, Color paramColor, boolean paramBoolean) {
    int i = this.Zs.indexOfComponent(paramComponent);
    this.Zs.Z_(i, paramColor, paramBoolean);
  }
  
  public List<Zl5t> ZF() {
    return this.Zi.stream().filter(Zlw0::ZU).toList();
  }
  
  private int Zy(Zl5t paramZl5t) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zs : ()Ljava/lang/String;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield Zi : Ljava/util/List;
    //   11: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   16: aload_0
    //   17: aload_2
    //   18: <illegal opcode> test : (Lburp/Zlw0;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   23: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   28: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   33: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   38: invokeinterface toList : ()Ljava/util/List;
    //   43: astore_3
    //   44: aload_3
    //   45: aload_2
    //   46: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   51: istore #4
    //   53: iload #4
    //   55: iconst_m1
    //   56: if_icmpne -> 71
    //   59: aload_0
    //   60: getfield Zs : Lburp/Zlte;
    //   63: invokeinterface getTabCount : ()I
    //   68: goto -> 73
    //   71: iload #4
    //   73: ireturn
  }
  
  void Zf(List<Zeyb> paramList) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_1
    //   2: invokeinterface size : ()I
    //   7: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   10: invokeinterface boxed : ()Ljava/util/stream/Stream;
    //   15: aload_1
    //   16: <illegal opcode> apply : (Ljava/util/List;)Ljava/util/function/Function;
    //   21: invokestatic identity : ()Ljava/util/function/Function;
    //   24: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
    //   27: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   32: checkcast java/util/Map
    //   35: astore_2
    //   36: iconst_0
    //   37: aload_0
    //   38: getfield Zi : Ljava/util/List;
    //   41: invokeinterface size : ()I
    //   46: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   49: invokeinterface boxed : ()Ljava/util/stream/Stream;
    //   54: aload_0
    //   55: <illegal opcode> apply : (Lburp/Zlw0;)Ljava/util/function/Function;
    //   60: aload_0
    //   61: <illegal opcode> apply : (Lburp/Zlw0;)Ljava/util/function/Function;
    //   66: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
    //   69: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   74: checkcast java/util/Map
    //   77: astore_3
    //   78: aload_1
    //   79: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   84: aload_0
    //   85: <illegal opcode> accept : (Lburp/Zlw0;)Ljava/util/function/Consumer;
    //   90: invokeinterface peek : (Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
    //   95: aload_0
    //   96: <illegal opcode> test : (Lburp/Zlw0;)Ljava/util/function/Predicate;
    //   101: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   106: aload_0
    //   107: getfield Zi : Ljava/util/List;
    //   110: dup
    //   111: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   120: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   125: aload_0
    //   126: getfield Zi : Ljava/util/List;
    //   129: aload_2
    //   130: aload_3
    //   131: <illegal opcode> apply : (Ljava/util/Map;Ljava/util/Map;)Ljava/util/function/Function;
    //   136: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   139: invokeinterface sort : (Ljava/util/Comparator;)V
    //   144: aload_0
    //   145: getfield Zs : Lburp/Zlte;
    //   148: aload_0
    //   149: aload_2
    //   150: aload_3
    //   151: <illegal opcode> apply : (Lburp/Zlw0;Ljava/util/Map;Ljava/util/Map;)Ljava/util/function/Function;
    //   156: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   159: invokeinterface Zc : (Ljava/util/Comparator;)V
    //   164: aload_0
    //   165: getfield Zi : Ljava/util/List;
    //   168: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   173: aload_2
    //   174: <illegal opcode> test : (Ljava/util/Map;)Ljava/util/function/Predicate;
    //   179: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   184: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   189: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   194: return
  }
  
  private boolean ZG(Zl5t paramZl5t) {
    return ZW(paramZl5t.Zs()).isPresent();
  }
  
  private void Zq() {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: getfield Zs : Lburp/Zlte;
    //   5: invokeinterface getTabCount : ()I
    //   10: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   13: aload_0
    //   14: getfield Zs : Lburp/Zlte;
    //   17: dup
    //   18: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: <illegal opcode> apply : (Lburp/Zlte;)Ljava/util/function/IntFunction;
    //   27: invokeinterface mapToObj : (Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    //   32: aload_0
    //   33: <illegal opcode> apply : (Lburp/Zlw0;)Ljava/util/function/Function;
    //   38: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   43: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   48: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   53: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   58: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   63: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   68: invokestatic toCollection : (Ljava/util/function/Supplier;)Ljava/util/stream/Collector;
    //   71: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   76: checkcast java/util/List
    //   79: astore_1
    //   80: iconst_0
    //   81: aload_0
    //   82: getfield Zi : Ljava/util/List;
    //   85: invokeinterface size : ()I
    //   90: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   93: aload_0
    //   94: aload_1
    //   95: <illegal opcode> test : (Lburp/Zlw0;Ljava/util/List;)Ljava/util/function/IntPredicate;
    //   100: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   105: aload_0
    //   106: aload_1
    //   107: <illegal opcode> accept : (Lburp/Zlw0;Ljava/util/List;)Ljava/util/function/IntConsumer;
    //   112: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   117: aload_0
    //   118: getfield Zi : Ljava/util/List;
    //   121: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   126: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   131: invokestatic identity : ()Ljava/util/function/Function;
    //   134: invokestatic toMap : (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
    //   137: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   142: checkcast java/util/Map
    //   145: astore_2
    //   146: aload_1
    //   147: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   152: aload_2
    //   153: dup
    //   154: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   157: pop
    //   158: <illegal opcode> apply : (Ljava/util/Map;)Ljava/util/function/Function;
    //   163: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   168: invokeinterface toList : ()Ljava/util/List;
    //   173: astore_3
    //   174: aload_0
    //   175: getfield Zi : Ljava/util/List;
    //   178: invokeinterface clear : ()V
    //   183: aload_0
    //   184: getfield Zi : Ljava/util/List;
    //   187: aload_3
    //   188: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   193: pop
    //   194: return
  }
  
  private boolean Zf(Zl5t paramZl5t) {
    return (ZU(paramZl5t) && this.ZA.test(paramZl5t) && !paramZl5t.Zl());
  }
  
  private static boolean ZU(Zl5t paramZl5t) {
    return (paramZl5t.ZZ() != null);
  }
  
  private static boolean Zd(Zl5t paramZl5t) {
    return (paramZl5t.ZZ() == null);
  }
  
  private void lambda$sortSuiteComponents$19(List<String> paramList, int paramInt) {
    paramList.add(paramInt, ((Zl5t)this.Zi.get(paramInt)).Zs());
  }
  
  private boolean lambda$sortSuiteComponents$18(List paramList, int paramInt) {
    return !paramList.contains(((Zl5t)this.Zi.get(paramInt)).Zs());
  }
  
  private static void lambda$setConfiguredSuiteComponents$17(Zl5t paramZl5t) {
    paramZl5t.ZT(false);
    paramZl5t.Zk((Integer)null);
  }
  
  private static boolean lambda$setConfiguredSuiteComponents$16(Map paramMap, Zl5t paramZl5t) {
    return !paramMap.containsKey(paramZl5t.Zs());
  }
  
  private Integer lambda$setConfiguredSuiteComponents$15(Map paramMap1, Map paramMap2, Integer paramInteger) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   19: aload_0
    //   20: aload_3
    //   21: <illegal opcode> test : (Lburp/Zlw0;Ljava/lang/Integer;)Ljava/util/function/Predicate;
    //   26: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   31: invokeinterface findFirst : ()Ljava/util/Optional;
    //   36: aload_1
    //   37: aload_2
    //   38: <illegal opcode> apply : (Ljava/util/Map;Ljava/util/Map;)Ljava/util/function/Function;
    //   43: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   46: ldc 2147483647
    //   48: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   51: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast java/lang/Integer
    //   57: areturn
  }
  
  private boolean lambda$setConfiguredSuiteComponents$13(Integer paramInteger, Zl5t paramZl5t) {
    return paramZl5t.ZZ().equals(this.Zs.getComponentAt(paramInteger.intValue()));
  }
  
  private static boolean lambda$setConfiguredSuiteComponents$12(Zl5t paramZl5t) {
    return Objects.nonNull(paramZl5t.ZZ());
  }
  
  private static Integer lambda$setConfiguredSuiteComponents$11(Map paramMap1, Map paramMap2, Zl5t paramZl5t) {
    return (Integer)paramMap1.getOrDefault(paramZl5t.Zs(), paramMap2.get(paramZl5t.Zs()));
  }
  
  private boolean lambda$setConfiguredSuiteComponents$10(Zeyb paramZeyb) {
    return !ZG(paramZeyb);
  }
  
  private void lambda$setConfiguredSuiteComponents$9(Zeyb paramZeyb) {
    ZW(paramZeyb.Zs()).ifPresent(paramZeyb::lambda$setConfiguredSuiteComponents$8);
  }
  
  private static void lambda$setConfiguredSuiteComponents$8(Zeyb paramZeyb, Zl5t paramZl5t) {
    paramZl5t.Zk(paramZeyb.Zb());
    paramZl5t.ZT(paramZeyb.Zl());
  }
  
  private Integer lambda$setConfiguredSuiteComponents$7(Integer paramInteger) {
    return Integer.valueOf(Integer.MAX_VALUE - this.Zi.size() + paramInteger.intValue());
  }
  
  private String lambda$setConfiguredSuiteComponents$6(Integer paramInteger) {
    return ((Zl5t)this.Zi.get(paramInteger.intValue())).Zs();
  }
  
  private static String lambda$setConfiguredSuiteComponents$5(List<Zeyb> paramList, Integer paramInteger) {
    return ((Zeyb)paramList.get(paramInteger.intValue())).Zs();
  }
  
  private boolean lambda$calculateTabbedPaneInsertionIndex$4(String paramString, Zl5t paramZl5t) {
    return (paramString.equals(paramZl5t.Zs()) || Zf(paramZl5t));
  }
  
  private void lambda$remove$3(Integer paramInteger, Zl5t paramZl5t) {
    paramZl5t.Zi(a(-15097, -19611), this.Zn);
    paramZl5t.Zi(a(-15098, 10753), this.Zl);
    paramZl5t.ZB(this.ZR);
    String str = Zbk_.Zb();
    if (this.ZQ) {
      this.Zi.remove(paramZl5t);
      if (str == null) {
        paramZl5t.Zk((Integer)null);
        this.Zi.set(this.Zi.indexOf(paramZl5t), new Zeyb(paramZl5t.Zs(), paramZl5t.Zl(), paramInteger));
        return;
      } 
      return;
    } 
    paramZl5t.Zk((Integer)null);
    this.Zi.set(this.Zi.indexOf(paramZl5t), new Zeyb(paramZl5t.Zs(), paramZl5t.Zl(), paramInteger));
  }
  
  private void lambda$add$2(Zl5t paramZl5t1, Zl5t paramZl5t2) {
    int i = this.Zi.indexOf(paramZl5t2);
    if (!this.ZQ)
      paramZl5t1.ZT(paramZl5t2.Zl()); 
    if (Zd(paramZl5t2))
      paramZl5t1.Zk(paramZl5t2.Zb()); 
    this.Zi.set(i, paramZl5t1);
  }
  
  private static boolean lambda$findSuiteComponentByComponent$1(Component paramComponent, Zl5t paramZl5t) {
    return paramComponent.equals(paramZl5t.ZZ());
  }
  
  private static boolean lambda$findSuiteComponentById$0(String paramString, Zl5t paramZl5t) {
    return paramString.equals(paramZl5t.Zs());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '®¬r=@ã2ç²¥ ÅôÓ9¸¬`'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #52
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'ðUáô+&#&AjJJûÌLû_|Ã'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #16
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #120
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zlw0.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zlw0.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #62
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #62
    //   234: goto -> 244
    //   237: bipush #29
    //   239: goto -> 244
    //   242: bipush #40
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC506) & 0xFFFF;
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
      char c = '½';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlw0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */