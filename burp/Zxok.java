package burp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zxok<T, U> {
  private final ExecutorService ZQ;
  
  private final long ZH;
  
  private Thread Zf;
  
  private Zxok(long paramLong) {
    this.ZH = paramLong;
    this.ZQ = Executors.newCachedThreadPool(this::lambda$new$0);
  }
  
  U Zh(Zesa<T, U> paramZesa, T paramT, long paramLong, U paramU) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 7
    //   4: aload #5
    //   6: areturn
    //   7: aload_0
    //   8: aload_0
    //   9: getfield ZQ : Ljava/util/concurrent/ExecutorService;
    //   12: aload_1
    //   13: aload_2
    //   14: lload_3
    //   15: aload #5
    //   17: <illegal opcode> call : (Lburp/Zesa;Ljava/lang/Object;JLjava/lang/Object;)Ljava/util/concurrent/Callable;
    //   22: invokeinterface submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   27: aload #5
    //   29: invokevirtual Zx : (Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: areturn
  }
  
  private U Zx(Future<U> paramFuture, U paramU) {
    try {
      return paramFuture.get(this.ZH, TimeUnit.MILLISECONDS);
    } catch (InterruptedException|java.util.concurrent.ExecutionException|java.util.concurrent.TimeoutException interruptedException) {
      Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
      this.Zf.interrupt();
      try {
        return paramFuture.get(1L, TimeUnit.SECONDS);
      } catch (InterruptedException|java.util.concurrent.ExecutionException|java.util.concurrent.TimeoutException interruptedException1) {
        Zah.Zl(interruptedException, Zk_.USER_ERROR);
        return paramU;
      } 
    } 
  }
  
  private static Object lambda$run$1(Zesa<Object, Object> paramZesa, Object paramObject1, long paramLong, Object paramObject2) throws Exception {
    return paramZesa.Zm(paramObject1, paramLong, paramObject2);
  }
  
  private Thread lambda$new$0(Runnable paramRunnable) {
    return this.Zf = Executors.defaultThreadFactory().newThread(paramRunnable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxok.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */