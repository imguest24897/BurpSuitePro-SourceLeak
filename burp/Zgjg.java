package burp;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public final class Zgjg<E> implements Zmjx<E>, Zgni<E> {
  private final List<Zmk7<E>> ZB;
  
  private final List<Zmk7<E>> Zg;
  
  private final List<Zqq> ZM;
  
  private final List<Zgni<E>> Zx;
  
  private List<Zmk7<E>> Zo;
  
  private Zgjg(List<Zmk7<E>> paramList1, List<Zmk7<E>> paramList2) {
    this.ZB = paramList1;
    this.Zg = paramList2;
    this.ZM = new ArrayList<>();
    this.Zo = paramList1;
    this.Zx = new CopyOnWriteArrayList<>();
  }
  
  @SafeVarargs
  public Zgjg(Zmk7<E>... paramVarArgs) {
    this(List.of(paramVarArgs));
  }
  
  public Zgjg(List<Zmk7<E>> paramList) {
    this(Collections.unmodifiableList(paramList), new ArrayList<>());
  }
  
  public List<Zmk7<E>> Zf() {
    return this.Zo;
  }
  
  public void Zn(Zmk7<E> paramZmk7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Lburp/Zmk7;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zd(int paramInt, Zmk7<E> paramZmk7) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_2
    //   3: <illegal opcode> run : (Lburp/Zgjg;ILburp/Zmk7;)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZD(Collection<Zmk7<E>> paramCollection) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Ljava/util/Collection;)Ljava/lang/Runnable;
    //   7: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zj(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Zo.size())
      return; 
    Zmk7<E> zmk7 = this.Zo.get(paramInt);
    if (zmk7 != null)
      Z_(zmk7); 
  }
  
  public void Z_(Zmk7<E> paramZmk7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Lburp/Zmk7;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZC(Collection<Zmk7<E>> paramCollection) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Ljava/util/Collection;)Ljava/lang/Runnable;
    //   7: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZP(Zqq paramZqq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Lburp/Zqq;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zw(Zqq paramZqq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgjg;Lburp/Zqq;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZE(Zgni<E> paramZgni) {
    this.Zx.add(paramZgni);
  }
  
  public void ZL(Zgni<E> paramZgni) {
    this.Zx.remove(paramZgni);
  }
  
  public int Za() {
    return this.ZB.size();
  }
  
  public void ZW(int paramInt, E paramE) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Ljava/util/List;
    //   4: iload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (ILjava/lang/Object;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void ZT(int paramInt, E paramE) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Ljava/util/List;
    //   4: iload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (ILjava/lang/Object;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void Zo(int paramInt, E paramE) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Ljava/util/List;
    //   4: iload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (ILjava/lang/Object;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  private void ZF() {
    String str = Zg2b.ZC();
    if (EventQueue.isDispatchThread()) {
      this.ZM.forEach(Zqq::Zg);
      if (str == null) {
        EventQueue.invokeLater(this::lambda$fireColumnsChanged$10);
        return;
      } 
      return;
    } 
    EventQueue.invokeLater(this::lambda$fireColumnsChanged$10);
  }
  
  public void Zl(int paramInt, E paramE) {
    ZW(paramInt, paramE);
  }
  
  public void Zc(int paramInt, E paramE) {
    ZT(paramInt, paramE);
  }
  
  public void ZO(int paramInt, E paramE) {
    Zo(paramInt, paramE);
  }
  
  private void lambda$fireColumnsChanged$10() {
    this.ZM.forEach(Zqq::Zg);
  }
  
  private static void lambda$fireElementUpdated$9(int paramInt, Object paramObject, Zgni<Object> paramZgni) {
    paramZgni.ZO(paramInt, paramObject);
  }
  
  private static void lambda$fireElementDeleted$8(int paramInt, Object paramObject, Zgni<Object> paramZgni) {
    paramZgni.Zc(paramInt, paramObject);
  }
  
  private static void lambda$fireElementInserted$7(int paramInt, Object paramObject, Zgni<Object> paramZgni) {
    paramZgni.Zl(paramInt, paramObject);
  }
  
  private void lambda$removeListener$6(Zqq paramZqq) {
    this.ZM.remove(paramZqq);
  }
  
  private void lambda$addListener$5(Zqq paramZqq) {
    this.ZM.add(paramZqq);
  }
  
  private void lambda$removeAll$4(Collection<?> paramCollection) {
    if (this.Zg.removeAll(paramCollection)) {
      this.Zo = Stream.<Zmk7<E>>concat(this.ZB.stream(), this.Zg.stream()).toList();
      this.ZM.forEach(Zqq::Zg);
    } 
  }
  
  private void lambda$remove$3(Zmk7 paramZmk7) {
    if (this.Zg.remove(paramZmk7)) {
      this.Zo = Stream.<Zmk7<E>>concat(this.ZB.stream(), this.Zg.stream()).toList();
      ZF();
    } 
  }
  
  private void lambda$addAll$2(Collection<? extends Zmk7<E>> paramCollection) {
    this.Zg.addAll(paramCollection);
    this.Zo = Stream.<Zmk7<E>>concat(this.ZB.stream(), this.Zg.stream()).toList();
    this.ZM.forEach(Zqq::Zg);
  }
  
  private void lambda$set$1(int paramInt, Zmk7<E> paramZmk7) {
    this.Zg.set(this.Zg.indexOf(this.Zo.get(paramInt)), paramZmk7);
    this.Zo = Stream.<Zmk7<E>>concat(this.ZB.stream(), this.Zg.stream()).toList();
    ZF();
  }
  
  private void lambda$add$0(Zmk7<E> paramZmk7) {
    this.Zg.add(paramZmk7);
    this.Zo = Stream.<Zmk7<E>>concat(this.ZB.stream(), this.Zg.stream()).toList();
    ZF();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */