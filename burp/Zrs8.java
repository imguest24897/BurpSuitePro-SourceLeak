package burp;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zrs8 implements Supplier<Zefk> {
  private final Zr5h Z_;
  
  private final Zg0s Zb;
  
  private final Zefk ZQ;
  
  public Zrs8(Zr5h paramZr5h, Zg0s paramZg0s) {
    this.Z_ = paramZr5h;
    this.Zb = paramZg0s;
    this.ZQ = paramZr5h.Zdm().ZHD();
  }
  
  public Zefk ZG() {
    if (this.ZQ.ZQB())
      Zw(); 
    return this.ZQ;
  }
  
  private void Zw() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zr5h;
    //   4: invokeinterface ZPo : ()I
    //   9: istore_1
    //   10: new java/util/concurrent/atomic/AtomicInteger
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_2
    //   18: new java/util/concurrent/atomic/AtomicInteger
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore_3
    //   26: new java/util/concurrent/atomic/AtomicInteger
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore #4
    //   35: new java/util/concurrent/atomic/AtomicInteger
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #5
    //   44: aload_0
    //   45: getfield Zb : Lburp/Zg0s;
    //   48: iload_1
    //   49: aload_2
    //   50: aload_3
    //   51: aload #4
    //   53: aload #5
    //   55: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   60: invokevirtual ZN : (ILjava/util/function/Consumer;)V
    //   63: aload_0
    //   64: getfield ZQ : Lburp/Zefk;
    //   67: aload_2
    //   68: invokevirtual get : ()I
    //   71: invokeinterface ZbB : (I)V
    //   76: aload_0
    //   77: getfield ZQ : Lburp/Zefk;
    //   80: aload_3
    //   81: invokevirtual get : ()I
    //   84: invokeinterface Zbp : (I)V
    //   89: aload_0
    //   90: getfield ZQ : Lburp/Zefk;
    //   93: aload #4
    //   95: invokevirtual get : ()I
    //   98: invokeinterface Zb8 : (I)V
    //   103: aload_0
    //   104: getfield ZQ : Lburp/Zefk;
    //   107: aload #5
    //   109: invokevirtual get : ()I
    //   112: invokeinterface ZbO : (I)V
    //   117: aload_0
    //   118: getfield ZQ : Lburp/Zefk;
    //   121: aload_0
    //   122: getfield Z_ : Lburp/Zr5h;
    //   125: invokeinterface Zdm : ()Lburp/Zz1i;
    //   130: invokeinterface ZHU : ()Lburp/Zefg;
    //   135: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   140: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   145: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   150: invokeinterface sum : ()I
    //   155: invokeinterface Zbm : (I)V
    //   160: aload_0
    //   161: getfield ZQ : Lburp/Zefk;
    //   164: aload_0
    //   165: getfield Z_ : Lburp/Zr5h;
    //   168: invokeinterface Zdm : ()Lburp/Zz1i;
    //   173: invokeinterface ZHU : ()Lburp/Zefg;
    //   178: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   183: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   188: invokeinterface mapToInt : (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
    //   193: invokeinterface sum : ()I
    //   198: invokeinterface Zbb : (I)V
    //   203: return
  }
  
  private static void lambda$rescrapeCounts$0(AtomicInteger paramAtomicInteger1, AtomicInteger paramAtomicInteger2, AtomicInteger paramAtomicInteger3, AtomicInteger paramAtomicInteger4, Zb2e paramZb2e) {
    switch (paramZb2e.ZBf().ZaJ()) {
      case 4:
        paramAtomicInteger1.incrementAndGet();
      case 3:
        paramAtomicInteger2.incrementAndGet();
      case 2:
        paramAtomicInteger3.incrementAndGet();
      case 1:
        paramAtomicInteger4.incrementAndGet();
        break;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrs8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */