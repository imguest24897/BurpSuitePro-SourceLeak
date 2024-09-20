package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Zktu implements Ztzq {
  private final List<Zeu1> ZC = new ArrayList<>();
  
  public List<Zeu1> ZT(Predicate<Zeu1> paramPredicate) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zktu;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/function/Predicate;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: aload_2
    //   20: invokevirtual get : ()Ljava/lang/Object;
    //   23: checkcast java/util/List
    //   26: areturn
  }
  
  public Zeu1 ZG(Predicate<Zeu1> paramPredicate) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zktu;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/function/Predicate;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: aload_2
    //   20: invokevirtual get : ()Ljava/lang/Object;
    //   23: checkcast burp/Zeu1
    //   26: areturn
  }
  
  public int Zl() {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicInteger
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zktu;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/lang/Runnable;
    //   15: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   18: aload_1
    //   19: invokevirtual get : ()I
    //   22: ireturn
  }
  
  public void ZQ(Consumer<Zeu1> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zktu;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zm(Consumer<Zeu1> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zktu;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  void Zi(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zktu;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  void ZD(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zktu;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  int Zg(Zeu1 paramZeu1) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicInteger
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zktu;Ljava/util/concurrent/atomic/AtomicInteger;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   16: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   19: aload_2
    //   20: invokevirtual get : ()I
    //   23: ireturn
  }
  
  void ZM(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: <illegal opcode> run : (Lburp/Zktu;II)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  void Zj() {
    Objects.requireNonNull(this.ZC);
    Zbsv.Zb(this.ZC::clear);
  }
  
  private void lambda$swap$8(int paramInt1, int paramInt2) {
    Zeu1 zeu1 = this.ZC.get(paramInt1);
    this.ZC.set(paramInt1, this.ZC.get(paramInt2));
    this.ZC.set(paramInt2, zeu1);
  }
  
  private void lambda$indexOf$7(AtomicInteger paramAtomicInteger, Zeu1 paramZeu1) {
    paramAtomicInteger.set(this.ZC.indexOf(paramZeu1));
  }
  
  private void lambda$remove$6(Zeu1 paramZeu1) {
    this.ZC.remove(paramZeu1);
  }
  
  private void lambda$add$5(Zeu1 paramZeu1) {
    this.ZC.add(paramZeu1);
  }
  
  private void lambda$applyToLoaded$4(Consumer paramConsumer) {
    this.ZC.stream().filter(Zeu1::ZP).forEach(paramConsumer);
  }
  
  private void lambda$applyToAll$3(Consumer<? super Zeu1> paramConsumer) {
    this.ZC.forEach(paramConsumer);
  }
  
  private void lambda$count$2(AtomicInteger paramAtomicInteger) {
    paramAtomicInteger.set(this.ZC.size());
  }
  
  private void lambda$findFirst$1(AtomicReference<Zeu1> paramAtomicReference, Predicate<? super Zeu1> paramPredicate) {
    paramAtomicReference.set(this.ZC.stream().filter(paramPredicate).findFirst().orElse(null));
  }
  
  private void lambda$filter$0(AtomicReference<List> paramAtomicReference, Predicate paramPredicate) {
    paramAtomicReference.set((List)this.ZC.stream().filter(paramPredicate).collect(Collectors.toList()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */