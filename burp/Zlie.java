package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class Zlie {
  private final Zs98 Zj;
  
  private final AtomicInteger ZM;
  
  private final List<Zb1o> ZL = new CopyOnWriteArrayList<>();
  
  private Zlie(Zs98 paramZs98) {
    this.Zj = paramZs98;
    this.ZM = new AtomicInteger(paramZs98.ZC3());
  }
  
  public void Zt(Zez3 paramZez3) {
    this.Zj.Zzy(this.ZM.incrementAndGet());
    this.ZL.forEach(paramZez3::lambda$newResponse$0);
    Zp();
  }
  
  public void ZX(Zlit paramZlit, Zez3 paramZez3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Lburp/Zs98;
    //   4: aload_0
    //   5: getfield ZM : Ljava/util/concurrent/atomic/AtomicInteger;
    //   8: invokevirtual incrementAndGet : ()I
    //   11: invokeinterface Zzy : (I)V
    //   16: aload_0
    //   17: getfield ZL : Ljava/util/List;
    //   20: aload_1
    //   21: aload_2
    //   22: <illegal opcode> accept : (Lburp/Zlit;Lburp/Zez3;)Ljava/util/function/Consumer;
    //   27: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   32: aload_0
    //   33: invokevirtual Zp : ()V
    //   36: return
  }
  
  public void ZP(Zlit paramZlit, Zez3 paramZez3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Lburp/Zs98;
    //   4: aload_0
    //   5: getfield ZM : Ljava/util/concurrent/atomic/AtomicInteger;
    //   8: invokevirtual incrementAndGet : ()I
    //   11: invokeinterface Zzy : (I)V
    //   16: aload_0
    //   17: getfield ZL : Ljava/util/List;
    //   20: aload_1
    //   21: aload_2
    //   22: <illegal opcode> accept : (Lburp/Zlit;Lburp/Zez3;)Ljava/util/function/Consumer;
    //   27: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   32: aload_0
    //   33: invokevirtual Zp : ()V
    //   36: return
  }
  
  private void Zp() {
    this.ZL.forEach(this::lambda$updateSiteMapItemsAddedCount$3);
  }
  
  private void lambda$updateSiteMapItemsAddedCount$3(Zb1o paramZb1o) {
    paramZb1o.ZU(this.ZM.get());
  }
  
  private static void lambda$newForm$2(Zlit paramZlit, Zez3 paramZez3, Zb1o paramZb1o) {
    paramZb1o.Zd(paramZlit, paramZez3);
  }
  
  private static void lambda$newLink$1(Zlit paramZlit, Zez3 paramZez3, Zb1o paramZb1o) {
    paramZb1o.ZI(paramZlit, paramZez3);
  }
  
  private static void lambda$newResponse$0(Zez3 paramZez3, Zb1o paramZb1o) {
    paramZb1o.Zl(paramZez3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */