package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.Zen;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

public class Zbj1 {
  private static final Consumer<Zbt> ZK = Zbj1::lambda$static$0;
  
  private final Map<Integer, Zbt> Zi = new HashMap<>();
  
  private final Zeao ZZ;
  
  public Zbj1(Zeao paramZeao, Zlli<Zt11> paramZlli) {
    this.ZZ = paramZeao;
    paramZlli.ZE(Zt11.Zt, this::lambda$new$2);
  }
  
  public synchronized void Zm(int paramInt, Zlfp paramZlfp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Ljava/util/Map;
    //   4: iload_1
    //   5: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   13: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   18: checkcast burp/Zbt
    //   21: aload_2
    //   22: iload_1
    //   23: <illegal opcode> accept : (Lburp/Zlfp;I)Ljava/util/function/Consumer;
    //   28: invokevirtual ZS : (Ljava/util/function/Consumer;)Lburp/Zbt;
    //   31: pop
    //   32: return
  }
  
  private synchronized void ZC(int paramInt) {
    this.Zi.computeIfPresent(Integer.valueOf(paramInt), Zbj1::lambda$deregister$5);
  }
  
  public synchronized List<Zer0> Zb(Zen paramZen, Zes1 paramZes1) {
    Zn(this.ZZ.ZX(paramZes1));
    if (paramZen == null) {
      Zuh.Zb(false, Zqf.Zv);
      return Collections.emptyList();
    } 
    Ztt6 ztt6 = (new Zrh3(paramZen.ZO)).Zd();
    Zbt zbt = this.Zi.get(Integer.valueOf(ztt6.Zc()));
    return (zbt == null) ? Collections.emptyList() : zbt.ZS(paramZen);
  }
  
  public synchronized void Zv(Collection<Zen> paramCollection, int paramInt1, int paramInt2) {
    Zbt zbt = this.Zi.get(Integer.valueOf(paramInt1));
    if (zbt == null)
      return; 
    zbt.ZX((Set<String>)paramCollection.stream().map(Zen::toString).collect(Collectors.toSet()), paramInt2);
  }
  
  public List<Zer0> ZJ(Zen paramZen, Zes1 paramZes1) {
    return Zz(paramZen, paramZes1, true);
  }
  
  public List<Zer0> Zd(Zen paramZen, Zes1 paramZes1) {
    return Zz(paramZen, paramZes1, false);
  }
  
  private synchronized List<Zer0> Zz(Zen paramZen, Zes1 paramZes1, boolean paramBoolean) {
    ZX(this.ZZ.ZX(paramZes1), paramBoolean);
    if (paramZen == null) {
      Zuh.Zb(false, Zqf.Zv);
      return Collections.emptyList();
    } 
    Ztt6 ztt6 = (new Zrh3(paramZen.ZO)).Zd();
    Zbt zbt = this.Zi.get(Integer.valueOf(ztt6.Zc()));
    return (zbt == null) ? Collections.emptyList() : zbt.ZF(paramZen);
  }
  
  public synchronized List<Zer0> Zw(int paramInt, Ze3n paramZe3n, Zes1 paramZes1) {
    Zn(this.ZZ.ZX(paramZes1));
    Zbt zbt = this.Zi.get(Integer.valueOf(paramInt));
    return (zbt == null) ? Collections.emptyList() : zbt.Za(paramZe3n);
  }
  
  void Zn(List<Zer0> paramList) {
    ZX(paramList, true);
  }
  
  private synchronized void ZX(List<Zer0> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   11: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   16: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   21: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   26: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   31: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   36: invokestatic toList : ()Ljava/util/stream/Collector;
    //   39: invokestatic mapping : (Ljava/util/function/Function;Ljava/util/stream/Collector;)Ljava/util/stream/Collector;
    //   42: invokestatic groupingBy : (Ljava/util/function/Function;Ljava/util/stream/Collector;)Ljava/util/stream/Collector;
    //   45: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   50: checkcast java/util/Map
    //   53: astore_3
    //   54: aload_3
    //   55: aload_0
    //   56: iload_2
    //   57: <illegal opcode> accept : (Lburp/Zbj1;Z)Ljava/util/function/BiConsumer;
    //   62: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   67: return
  }
  
  static boolean ZQ(Zen paramZen, Zer0 paramZer0) {
    if (paramZen.Zb != 1 || paramZer0.ZO() != 2)
      return false; 
    Ztt6 ztt61 = (new Zrh3(paramZer0.Zi())).Zd();
    Ztt6 ztt62 = (new Zrh3(paramZen.ZO)).Zd();
    return ztt61.equals(ztt62);
  }
  
  private void lambda$updateCache$11(boolean paramBoolean, Integer paramInteger, List<Zer0> paramList) {
    Zbt zbt = this.Zi.computeIfAbsent(paramInteger, Zbj1::lambda$register$3);
    zbt.ZJ(paramList, paramBoolean);
  }
  
  private static Zer0 lambda$updateCache$9(Zto paramZto) {
    return (Zer0)paramZto.Zo;
  }
  
  private static Integer lambda$updateCache$8(Zto paramZto) {
    return Integer.valueOf(((Ztt6)paramZto.Zq).Zc());
  }
  
  private static boolean lambda$updateCache$7(Zto paramZto) {
    return (paramZto.Zq != null);
  }
  
  private static Zto lambda$updateCache$6(Zer0 paramZer0) {
    return Zto.ZM((new Zrh3(paramZer0.Zi())).Zd(), paramZer0);
  }
  
  private static Zbt lambda$deregister$5(Integer paramInteger, Zbt paramZbt) {
    return paramZbt.ZS(ZK);
  }
  
  private static void lambda$register$4(Zlfp paramZlfp, int paramInt, Zbt paramZbt) {
    paramZlfp.ZL(paramInt, paramZbt);
  }
  
  private static Zbt lambda$register$3(Integer paramInteger) {
    return new Zbt();
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$1);
  }
  
  private void lambda$new$1(Ztj1 paramZtj1) {
    ZC(paramZtj1.Zh());
  }
  
  private static void lambda$static$0(Zbt paramZbt) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbj1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */