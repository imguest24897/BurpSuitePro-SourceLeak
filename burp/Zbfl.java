package burp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbfl implements Ztpx, Zmgs {
  private final AtomicReference<Zsm1> ZX;
  
  private final Zgu8 Zn;
  
  private final AtomicBoolean ZJ;
  
  private final AtomicBoolean Zy;
  
  private final Object Zc;
  
  private static final String a;
  
  public Zbfl(Zsm1 paramZsm1, Zgu8 paramZgu8, Ztos<Zt13> paramZtos) {
    this.ZX = new AtomicReference<>(paramZsm1);
    this.Zn = paramZgu8;
    this.Zy = new AtomicBoolean();
    this.ZJ = new AtomicBoolean();
    this.Zc = new Object();
    paramZtos.ZE(Zt13.ZC, this::lambda$new$0);
    int i = Zgum.Zj();
    try {
      paramZtos.ZE(Zt13.ZV, this::lambda$new$1);
      if (Zbqc.Zwu() == null)
        Zgum.Zh(++i); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Zsxd ZJ(Ztaw paramZtaw) throws Zgum {
    try {
      if (this.Zy.get())
        throw new Zgum(); 
    } catch (ExecutionException executionException) {
      throw a(null);
    } 
    ZJ();
    Future<Zsxd> future = null;
    try {
      Zrnd zrnd = this.Zn.ZB(paramZtaw);
      future = ((Zsm1)this.ZX.get()).Zh(zrnd);
      return future.get();
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      Zah.Zl(executionException, Zk_.RETHROWN);
      if (throwable instanceof RuntimeException) {
        RuntimeException runtimeException = (RuntimeException)throwable;
        throw runtimeException;
      } 
      throw new RuntimeException(throwable);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.RETHROWN);
      Thread.currentThread().interrupt();
      future.cancel(false);
      throw new Zk8e();
    } 
  }
  
  private void ZJ() throws Zgum {
    int i = Zgum.Zj();
    while (this.ZJ.get() && !this.Zy.get()) {
      synchronized (this.Zc) {
        try {
          if (this.ZJ.get())
            this.Zc.wait(); 
        } catch (InterruptedException interruptedException) {
          Zah.Zl(interruptedException, Zk_.IGNORED);
          Thread.currentThread().interrupt();
          Zuh.Zb(this.Zy.get(), Zqf.Zr);
          throw new Zgum();
        } 
      } 
      if (i != 0)
        break; 
    } 
    try {
      if (this.Zy.get())
        throw new Zgum(); 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
  }
  
  public void Zl(Zz9t paramZz9t) {
    paramZz9t.ZF(a, this.Zy);
  }
  
  public void Za(Zsm1 paramZsm1) {
    try {
      if (this.Zy.get()) {
        Zuh.Zb(false, Zqf.ZC);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.ZX.set(paramZsm1);
  }
  
  public void ZR() {
    synchronized (this.Zc) {
      this.Zy.set(true);
      this.Zc.notifyAll();
    } 
  }
  
  private void Zs(Zst9 paramZst9) {
    try {
      if (this.Zy.get()) {
        Zuh.Zb(false, Zqf.ZC);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramZst9.ZB())
        this.ZJ.set(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void ZX(Ztak paramZtak) {
    try {
      if (this.Zy.get()) {
        Zuh.Zb(false, Zqf.ZC);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramZtak.ZX())
      synchronized (this.Zc) {
        this.ZJ.set(false);
        this.Zc.notifyAll();
      }  
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZX);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zs);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: ldc '! <ue'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbfl.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #6
    //   82: goto -> 112
    //   85: bipush #40
    //   87: goto -> 112
    //   90: bipush #18
    //   92: goto -> 112
    //   95: bipush #43
    //   97: goto -> 112
    //   100: bipush #116
    //   102: goto -> 112
    //   105: bipush #101
    //   107: goto -> 112
    //   110: bipush #12
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */