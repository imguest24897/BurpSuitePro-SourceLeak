package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.function.BooleanSupplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zt4h extends Zt4q {
  Zt4h(Zl7h paramZl7h, Zr69 paramZr69, Zr_4 paramZr_4, Zkl6 paramZkl6, Zz1m<Zt18> paramZz1m, Ztos<Zt35> paramZtos) {
    super(paramZl7h, paramZr69, paramZz1m, paramZr_4, paramZkl6, paramZtos);
  }
  
  protected void Ze(Queue<Zez7> paramQueue) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zl7h;
    //   4: invokeinterface ZVf : ()Lburp/Ztfk;
    //   9: invokeinterface ZV : ()Ljava/util/Optional;
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> accept : (Lburp/Zt4h;Ljava/util/Queue;)Ljava/util/function/Consumer;
    //   21: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   24: aload_0
    //   25: getfield ZR : Lburp/Zl7h;
    //   28: invokeinterface ZVf : ()Lburp/Ztfk;
    //   33: invokeinterface Zh : ()Ljava/util/Optional;
    //   38: aload_0
    //   39: aload_1
    //   40: <illegal opcode> accept : (Lburp/Zt4h;Ljava/util/Queue;)Ljava/util/function/Consumer;
    //   45: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   48: return
  }
  
  protected List<Zez7> ZZ(Zko4 paramZko4) {
    LinkedList<Zez7> linkedList = new LinkedList();
    linkedList.addAll(ZC(new Zezb(Zj(), this.Zv, this.ZR, this.Zd, paramZko4)));
    linkedList.addAll(ZC(new Zex8(Zj(), this.Zv, this.ZR, this.Zd, null, paramZko4, paramZko4.ZP())));
    return linkedList;
  }
  
  protected List<Zez7> ZQ(Zb9v paramZb9v, String paramString, BooleanSupplier paramBooleanSupplier) {
    LinkedList<Zez7> linkedList = new LinkedList();
    linkedList.addAll(ZC(new Zezm(Zj(), this.Zv, this.ZR, this.Zd, paramZb9v, paramString, paramBooleanSupplier)));
    int[] arrayOfInt = Zt4q.Zh();
    linkedList.addAll(ZC(new Zex8(Zj(), this.Zv, this.ZR, this.Zd, paramZb9v, null, paramString)));
    if (Zbqc.Zwu() == null)
      Zt4q.Zg(new int[3]); 
    return linkedList;
  }
  
  private void lambda$addAllUserConfiguredCredentialsScenes$3(Queue paramQueue, Zsaa paramZsaa) {
    Optional<Ztfa> optional = this.ZR.ZVf().ZV();
    Zuh.Zb((optional.isEmpty() || ((Ztfa)optional.get()).Zdv().isEmpty()), Zqf.Zr);
    Objects.requireNonNull(paramQueue);
    paramZsaa.ZHM().stream().map(this::lambda$addAllUserConfiguredCredentialsScenes$2).forEach(paramQueue::addAll);
  }
  
  private List lambda$addAllUserConfiguredCredentialsScenes$2(Ztvz paramZtvz) {
    return ZQ(this.Zu.<Zb9v>ZH(new Zk9y(paramZtvz)), paramZtvz.ZiO(), Zt4h::lambda$addAllUserConfiguredCredentialsScenes$1);
  }
  
  private static boolean lambda$addAllUserConfiguredCredentialsScenes$1() {
    return true;
  }
  
  private void lambda$addAllUserConfiguredCredentialsScenes$0(Queue paramQueue, Ztfa paramZtfa) {
    Optional<Zsaa> optional = this.ZR.ZVf().Zh();
    Zuh.Zb((optional.isEmpty() || ((Zsaa)optional.get()).ZHM().isEmpty()), Zqf.Zr);
    Objects.requireNonNull(paramQueue);
    paramZtfa.Zdv().stream().map(this::ZZ).forEach(paramQueue::addAll);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */