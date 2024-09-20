package burp;

import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

public class Zr_h implements Ztu3 {
  public static final int ZH;
  
  private final ExecutorService Zb;
  
  private final Collection<Zto<Zgd9, Future<?>>> Zg;
  
  private final CountDownLatch ZF;
  
  private final CountDownLatch Zi;
  
  private static boolean Zj;
  
  private static final String a;
  
  public Zr_h(Supplier<Zgd9> paramSupplier) {
    this(ZH, Executors.newFixedThreadPool(ZH, new Zrdt(a)), paramSupplier);
  }
  
  Zr_h(int paramInt, ExecutorService paramExecutorService, Supplier<Zgd9> paramSupplier) {
    this.Zb = paramExecutorService;
    this.ZF = new CountDownLatch(paramInt);
    boolean bool = Za();
    this.Zi = new CountDownLatch(paramInt);
    this.Zg = ZE(paramInt, paramSupplier);
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZI() {
    this.Zg.forEach(Zr_h::lambda$notifyWorkAvailable$0);
  }
  
  public int Zb() {
    return this.Zg.size();
  }
  
  boolean Zi(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    Zuh.Zb(this.ZF.await(paramLong, paramTimeUnit), Zqf.Zr);
    this.Zg.forEach(Zr_h::lambda$stopWorkers$1);
    return this.Zi.await(paramLong, paramTimeUnit);
  }
  
  public void ZY() {
    try {
      Zi(1L, TimeUnit.SECONDS);
      this.Zb.shutdownNow();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
  }
  
  private Collection<Zto<Zgd9, Future<?>>> ZE(int paramInt, Supplier<Zgd9> paramSupplier) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: iload_1
    //   5: invokespecial <init> : (I)V
    //   8: astore #4
    //   10: invokestatic Z_ : ()Z
    //   13: iconst_0
    //   14: istore #5
    //   16: istore_3
    //   17: iload #5
    //   19: iload_1
    //   20: if_icmpge -> 75
    //   23: aload_2
    //   24: invokeinterface get : ()Ljava/lang/Object;
    //   29: checkcast burp/Zgd9
    //   32: astore #6
    //   34: aload_0
    //   35: getfield Zb : Ljava/util/concurrent/ExecutorService;
    //   38: aload_0
    //   39: aload #6
    //   41: <illegal opcode> run : (Lburp/Zr_h;Lburp/Zgd9;)Ljava/lang/Runnable;
    //   46: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   51: astore #7
    //   53: aload #4
    //   55: aload #6
    //   57: aload #7
    //   59: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   62: invokeinterface add : (Ljava/lang/Object;)Z
    //   67: pop
    //   68: iinc #5, 1
    //   71: iload_3
    //   72: ifne -> 17
    //   75: aload #4
    //   77: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   80: areturn
  }
  
  private void lambda$startPassiveWorkers$2(Zgd9 paramZgd9) {
    this.ZF.countDown();
    try {
      paramZgd9.run();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } finally {
      this.Zi.countDown();
    } 
  }
  
  private static void lambda$stopWorkers$1(Zto paramZto) {
    ((Zgd9)paramZto.Zq).ZF();
    ((Future)paramZto.Zo).cancel(true);
  }
  
  private static void lambda$notifyWorkAvailable$0(Zto paramZto) {
    ((Zgd9)paramZto.Zq).ZX();
  }
  
  static {
    // Byte code:
    //   0: invokestatic Za : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic Z_ : (Z)V
    //   10: bipush #54
    //   12: ldc '%~Upk%xhIqi6'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zr_h.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #99
    //   94: goto -> 124
    //   97: bipush #41
    //   99: goto -> 124
    //   102: bipush #16
    //   104: goto -> 124
    //   107: bipush #53
    //   109: goto -> 124
    //   112: bipush #52
    //   114: goto -> 124
    //   117: bipush #101
    //   119: goto -> 124
    //   122: bipush #70
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   169: invokevirtual availableProcessors : ()I
    //   172: iconst_1
    //   173: isub
    //   174: iconst_1
    //   175: invokestatic max : (II)I
    //   178: putstatic burp/Zr_h.ZH : I
    //   181: return
  }
  
  public static void Z_(boolean paramBoolean) {
    Zj = paramBoolean;
  }
  
  public static boolean Za() {
    return Zj;
  }
  
  public static boolean Z_() {
    boolean bool = Za();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */