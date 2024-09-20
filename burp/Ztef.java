package burp;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ztef {
  private final Ze00 ZD;
  
  private final Zg4s Zx;
  
  private final Set<Zz84> ZF;
  
  private String Zq;
  
  public Ztef(Ze00 paramZe00, Zg4s paramZg4s) {
    this.ZD = paramZe00;
    this.Zx = paramZg4s;
    this.ZF = new HashSet<>();
  }
  
  void ZN(Zz84 paramZz84) {
    ZX(paramZz84, true);
  }
  
  void ZF(Zz84 paramZz84) {
    ZX(paramZz84, false);
  }
  
  void Zn(String paramString) {
    ZS(paramString);
  }
  
  private void ZX(Zz84 paramZz84, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_3
    //   4: iload_2
    //   5: ifeq -> 23
    //   8: aload_0
    //   9: getfield ZF : Ljava/util/Set;
    //   12: aload_1
    //   13: invokeinterface add : (Ljava/lang/Object;)Z
    //   18: pop
    //   19: iload_3
    //   20: ifne -> 34
    //   23: aload_0
    //   24: getfield ZF : Ljava/util/Set;
    //   27: aload_1
    //   28: invokeinterface remove : (Ljava/lang/Object;)Z
    //   33: pop
    //   34: aload_0
    //   35: invokevirtual ZG : ()V
    //   38: return
  }
  
  private void ZS(String paramString) {
    this.Zq = paramString;
    ZG();
  }
  
  public void ZG() {
    Map map = (Map)this.ZF.stream().collect(Collectors.groupingBy(Zz84::ZF, Collectors.toList()));
    Predicate<Zkyq> predicate = map::lambda$applyFilter$2;
    Predicate<? super Zkyq> predicate1 = this::lambda$applyFilter$3;
    Zg4s zg4s = (this.ZF.isEmpty() && (this.Zq == null || this.Zq.isEmpty())) ? this.Zx : this.Zx.ZM(predicate.and(predicate1));
    this.ZD.Zq(zg4s);
  }
  
  private boolean lambda$applyFilter$3(Zkyq paramZkyq) {
    return paramZkyq.Zm(this.Zq);
  }
  
  private static boolean lambda$applyFilter$2(Map paramMap, Zkyq paramZkyq) {
    return paramMap.entrySet().stream().allMatch(paramZkyq::lambda$applyFilter$1);
  }
  
  private static boolean lambda$applyFilter$1(Zkyq paramZkyq, Map.Entry paramEntry) {
    return ((List)paramEntry.getValue()).stream().anyMatch(paramZkyq::lambda$applyFilter$0);
  }
  
  private static boolean lambda$applyFilter$0(Zkyq paramZkyq, Zz84 paramZz84) {
    return paramZz84.ZQ(paramZkyq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztef.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */