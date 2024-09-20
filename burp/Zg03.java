package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class Zg03 extends Zg04<Zgxp> {
  private final AtomicLong Zr = new AtomicLong(0L);
  
  public Zg03(Zkgn paramZkgn) {
    super(paramZkgn.ZvQ(), paramZkgn.Zz6());
  }
  
  public void ZP(Zgxp paramZgxp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zr : Ljava/util/concurrent/atomic/AtomicLong;
    //   4: invokevirtual incrementAndGet : ()J
    //   7: pop2
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zg03;Lburp/Zgxp;)Ljava/lang/Runnable;
    //   15: invokestatic runAsync : (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
    //   18: pop
    //   19: return
  }
  
  public void ZL(Zgxp paramZgxp) {
    add(paramZgxp);
  }
  
  public Optional<Zgxp> ZE(int paramInt) {
    synchronized (this.ZC) {
      return stream().filter(paramInt::lambda$getResultItem$1).findFirst();
    } 
  }
  
  public List<Zgxp> Zn() {
    synchronized (this.ZC) {
      return new ArrayList<>((Collection<? extends Zgxp>)this);
    } 
  }
  
  private static boolean lambda$getResultItem$1(int paramInt, Zgxp paramZgxp) {
    return (paramZgxp.Zep() == paramInt);
  }
  
  private void lambda$addLater$0(Zgxp paramZgxp) {
    add(paramZgxp);
    this.Zr.decrementAndGet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg03.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */