package burp;

import java.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Zsyh {
  private static final Duration ZI = Duration.ofSeconds(15L);
  
  private final Zgna ZC;
  
  private final ScheduledExecutorService Zk;
  
  private final AtomicReference<Zkhq> Zq;
  
  private final Zzom ZE;
  
  private ScheduledFuture<?> Zv;
  
  private static int[] ZW;
  
  protected Zsyh(Zgna paramZgna, ScheduledExecutorService paramScheduledExecutorService, Zzom paramZzom) {
    this.ZC = paramZgna;
    this.Zk = paramScheduledExecutorService;
    this.Zq = new AtomicReference<>(Zkhq.NOT_STARTED);
    this.ZE = paramZzom;
  }
  
  protected void ZU(Zlli<Zt13> paramZlli) {
    paramZlli.ZE(Zt13.ZC, this::lambda$subscribeTo$0);
    paramZlli.ZE(Zt13.ZV, this::lambda$subscribeTo$1);
    paramZlli.ZE(Zt13.Zd, this::lambda$subscribeTo$2);
  }
  
  private void Zh() {
    int[] arrayOfInt = ZR();
    if (this.ZC.ZPw())
      return; 
    if (this.Zv == null || this.Zv.isDone()) {
      this.Zv = this.Zk.scheduleWithFixedDelay(this::ZD, 0L, ZI.toSeconds(), TimeUnit.SECONDS);
      if (arrayOfInt == null) {
        ZD();
        return;
      } 
      return;
    } 
    ZD();
  }
  
  private void ZA() {
    if (this.Zv != null) {
      this.Zv.cancel(false);
      this.Zv = null;
    } 
  }
  
  protected void ZD() {
    // Byte code:
    //   0: invokestatic ZR : ()[I
    //   3: astore_1
    //   4: new burp/Zx_3
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield ZC : Lburp/Zgna;
    //   16: invokeinterface ZPw : ()Z
    //   21: ifne -> 37
    //   24: aload_0
    //   25: getfield Zq : Ljava/util/concurrent/atomic/AtomicReference;
    //   28: invokevirtual get : ()Ljava/lang/Object;
    //   31: getstatic burp/Zkhq.NOT_STARTED : Lburp/Zkhq;
    //   34: if_acmpne -> 38
    //   37: return
    //   38: aload_0
    //   39: getfield Zq : Ljava/util/concurrent/atomic/AtomicReference;
    //   42: invokevirtual get : ()Ljava/lang/Object;
    //   45: getstatic burp/Zkhq.FINISHED : Lburp/Zkhq;
    //   48: if_acmpne -> 62
    //   51: aload_2
    //   52: bipush #100
    //   54: invokevirtual ZJ : (I)Lburp/Zx_3;
    //   57: pop
    //   58: aload_1
    //   59: ifnonnull -> 130
    //   62: aload_0
    //   63: getfield Zq : Ljava/util/concurrent/atomic/AtomicReference;
    //   66: invokevirtual get : ()Ljava/lang/Object;
    //   69: getstatic burp/Zkhq.RUNNING : Lburp/Zkhq;
    //   72: if_acmpne -> 130
    //   75: aload_0
    //   76: getfield ZE : Lburp/Zzom;
    //   79: invokevirtual Zb : ()Lburp/Zxp4;
    //   82: astore_3
    //   83: aload_2
    //   84: aload_0
    //   85: invokevirtual Zk : ()Ljava/lang/String;
    //   88: invokevirtual Zb : (Ljava/lang/String;)Lburp/Zx_3;
    //   91: pop
    //   92: aload_3
    //   93: aload_0
    //   94: getfield ZC : Lburp/Zgna;
    //   97: invokeinterface ZPB : ()Ljava/time/Duration;
    //   102: invokevirtual ZO : (Ljava/time/Duration;)Ljava/util/Optional;
    //   105: aload_2
    //   106: dup
    //   107: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   110: pop
    //   111: <illegal opcode> accept : (Lburp/Zx_3;)Ljava/util/function/Consumer;
    //   116: aload_2
    //   117: dup
    //   118: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   121: pop
    //   122: <illegal opcode> run : (Lburp/Zx_3;)Ljava/lang/Runnable;
    //   127: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   130: aload_2
    //   131: invokevirtual Zl : ()Lburp/Zlj9;
    //   134: astore_3
    //   135: aload_0
    //   136: aload_3
    //   137: invokevirtual ZD : (Lburp/Zlj9;)V
    //   140: return
  }
  
  protected void Zn() {
    this.Zq.set(Zkhq.RUNNING);
    Zh();
  }
  
  protected void Zm() {
    this.Zq.set(Zkhq.FINISHED);
    ZA();
  }
  
  private void Zi() {
    if (this.Zq.get() != Zkhq.FINISHED)
      ZA(); 
  }
  
  private void Zj(Ztak paramZtak) {
    if (this.Zq.get() != Zkhq.FINISHED && paramZtak.ZO())
      Zh(); 
  }
  
  protected void ZA(int paramInt) {
    this.ZE.Zh(paramInt);
  }
  
  protected abstract String Zk();
  
  protected abstract void ZD(Zlj9 paramZlj9);
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    ZA();
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zj);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zi();
  }
  
  public static void Za(int[] paramArrayOfint) {
    ZW = paramArrayOfint;
  }
  
  public static int[] ZR() {
    return ZW;
  }
  
  static {
    if (ZR() == null)
      Za(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */