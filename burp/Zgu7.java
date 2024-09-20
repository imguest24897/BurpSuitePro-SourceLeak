package burp;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgu7 {
  private final Zz4b ZS;
  
  private final List<Consumer<Zxr8<Void>>> Zu;
  
  private final List<Consumer<Zxr8<Void>>> Zl;
  
  private final Map<Integer, Zgpz> Zr;
  
  public Zgu7(Zz4b paramZz4b) {
    this.ZS = paramZz4b;
    this.Zu = new CopyOnWriteArrayList<>();
    this.Zl = new CopyOnWriteArrayList<>();
    String[] arrayOfString = Zt13.ZA();
    this.Zr = new ConcurrentHashMap<>();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZZ() {
    Zbsv.Zb(this::lambda$pauseAllTasks$4);
  }
  
  public void Ze() {
    Zbsv.Zb(this::lambda$resumeAllTasks$9);
  }
  
  public void Zr(Zgna paramZgna) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgu7;Lburp/Zgna;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zf(Zgna paramZgna) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zgu7;Lburp/Zgna;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public Zgrn ZI(Consumer<Zxr8<Void>> paramConsumer, Zrij paramZrij) {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic ZY : (Lburp/Zrij;)V
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zgu7;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   11: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> ZZ : (Lburp/Zgu7;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   21: areturn
  }
  
  public Zgrn ZL(Consumer<Zxr8<Void>> paramConsumer, Zrij paramZrij) {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic ZY : (Lburp/Zrij;)V
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zgu7;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   11: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> ZZ : (Lburp/Zgu7;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   21: areturn
  }
  
  public Zgrn Zk(Zgna paramZgna, Consumer<Zxr8<Zst9>> paramConsumer, Zrij paramZrij) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic ZY : (Lburp/Zrij;)V
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> run : (Lburp/Zgu7;Lburp/Zgna;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   12: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   15: aload_0
    //   16: aload_1
    //   17: aload_2
    //   18: <illegal opcode> ZZ : (Lburp/Zgu7;Lburp/Zgna;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   23: areturn
  }
  
  public Zgrn Zi(Zgna paramZgna, Consumer<Zxr8<Ztak>> paramConsumer, Zrij paramZrij) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic ZY : (Lburp/Zrij;)V
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: <illegal opcode> run : (Lburp/Zgu7;Lburp/Zgna;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   12: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   15: aload_0
    //   16: aload_1
    //   17: aload_2
    //   18: <illegal opcode> ZZ : (Lburp/Zgu7;Lburp/Zgna;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   23: areturn
  }
  
  public void ZV(Zgna paramZgna) {
    this.Zr.remove(Integer.valueOf(paramZgna.ZPo()));
  }
  
  private Zxr8<Zst9> ZI(Zgna paramZgna) {
    return new Zxr8<>(Zt13.ZC, (new Zxzy()).Zy(paramZgna.ZPw()).ZD(this.ZS.ZV3()).Zv());
  }
  
  private Zxr8<Ztak> Zi(boolean paramBoolean) {
    return new Zxr8<>(Zt13.ZV, (new Zxku()).Zk(!this.ZS.ZV3()).Zl(paramBoolean).ZC());
  }
  
  private void Zo(List<Consumer<Zxr8<Void>>> paramList, Consumer<Zxr8<Void>> paramConsumer) {
    Zuh.Zb(paramList.remove(paramConsumer), Zqf.Zr);
  }
  
  private void Z_(List<Consumer<Zxr8<Zst9>>> paramList, Consumer<Zxr8<Zst9>> paramConsumer) {
    Zuh.Zb(paramList.remove(paramConsumer), Zqf.Zr);
  }
  
  private void ZW(List<Consumer<Zxr8<Ztak>>> paramList, Consumer<Zxr8<Ztak>> paramConsumer) {
    Zuh.Zb(paramList.remove(paramConsumer), Zqf.Zr);
  }
  
  private static void ZY(Zrij paramZrij) {
    Zuh.Zb(Zrij.Zx.equals(paramZrij), Zqf.Zk);
  }
  
  private void lambda$subscribeToTaskResumed$23(Zgna paramZgna, Consumer<Zxr8<Ztak>> paramConsumer) {
    String[] arrayOfString = Zt13.ZA();
    Zgpz zgpz = this.Zr.get(Integer.valueOf(paramZgna.ZPo()));
    if (zgpz != null) {
      ZW(zgpz.Zj, paramConsumer);
      if (arrayOfString != null) {
        Zuh.Zb(false, Zqf.Zr);
        return;
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  private void lambda$subscribeToTaskResumed$22(Zgna paramZgna, Consumer<Zxr8<Ztak>> paramConsumer) {
    Zgpz zgpz = this.Zr.computeIfAbsent(Integer.valueOf(paramZgna.ZPo()), paramZgna::lambda$subscribeToTaskPaused$18);
    zgpz.Zj.add(paramConsumer);
    if (!paramZgna.ZPw())
      paramConsumer.accept(Zi(true)); 
  }
  
  private void lambda$subscribeToTaskPaused$20(Zgna paramZgna, Consumer<Zxr8<Zst9>> paramConsumer) {
    String[] arrayOfString = Zt13.ZA();
    Zgpz zgpz = this.Zr.get(Integer.valueOf(paramZgna.ZPo()));
    if (zgpz != null) {
      Z_(zgpz.Zi, paramConsumer);
      if (arrayOfString != null) {
        Zuh.Zb(false, Zqf.Zr);
        return;
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  private void lambda$subscribeToTaskPaused$19(Zgna paramZgna, Consumer<Zxr8<Zst9>> paramConsumer) {
    Zgpz zgpz = this.Zr.computeIfAbsent(Integer.valueOf(paramZgna.ZPo()), paramZgna::lambda$subscribeToTaskPaused$18);
    zgpz.Zi.add(paramConsumer);
    if (paramZgna.ZPw() || this.ZS.ZV3())
      paramConsumer.accept(ZI(paramZgna)); 
  }
  
  private static Zgpz lambda$subscribeToTaskPaused$18(Zgna paramZgna, Integer paramInteger) {
    return new Zgpz(paramZgna);
  }
  
  private void lambda$subscribeToAllTasksResumed$17(Consumer<Zxr8<Void>> paramConsumer) {
    Zo(this.Zl, paramConsumer);
  }
  
  private void lambda$subscribeToAllTasksResumed$16(Consumer<Zxr8<Void>> paramConsumer) {
    this.Zl.add(paramConsumer);
    if (!this.ZS.ZV3())
      paramConsumer.accept(Zt11.ZG); 
  }
  
  private void lambda$subscribeToAllTasksPaused$15(Consumer<Zxr8<Void>> paramConsumer) {
    Zo(this.Zu, paramConsumer);
  }
  
  private void lambda$subscribeToAllTasksPaused$14(Consumer<Zxr8<Void>> paramConsumer) {
    this.Zu.add(paramConsumer);
    if (this.ZS.ZV3())
      paramConsumer.accept(Zt11.Za); 
  }
  
  private void lambda$resume$13(Zgna paramZgna) {
    if (paramZgna.ZPw()) {
      paramZgna.ZIx(false);
      Zgpz zgpz = this.Zr.get(Integer.valueOf(paramZgna.ZPo()));
      if (zgpz != null)
        zgpz.Zj.forEach(this::lambda$resume$12); 
    } 
  }
  
  private void lambda$resume$12(Consumer<Zxr8<Ztak>> paramConsumer) {
    paramConsumer.accept(Zi(true));
  }
  
  private void lambda$pause$11(Zgna paramZgna) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZPw : ()Z
    //   6: ifne -> 58
    //   9: aload_1
    //   10: iconst_1
    //   11: invokeinterface ZIx : (Z)V
    //   16: aload_0
    //   17: getfield Zr : Ljava/util/Map;
    //   20: aload_1
    //   21: invokeinterface ZPo : ()I
    //   26: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   29: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: checkcast burp/Zgpz
    //   37: astore_2
    //   38: aload_2
    //   39: ifnull -> 58
    //   42: aload_2
    //   43: getfield Zi : Ljava/util/List;
    //   46: aload_0
    //   47: aload_1
    //   48: <illegal opcode> accept : (Lburp/Zgu7;Lburp/Zgna;)Ljava/util/function/Consumer;
    //   53: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   58: return
  }
  
  private void lambda$pause$10(Zgna paramZgna, Consumer<Zxr8<Zst9>> paramConsumer) {
    paramConsumer.accept(ZI(paramZgna));
  }
  
  private void lambda$resumeAllTasks$9() {
    if (this.ZS.ZV3()) {
      this.ZS.ZK(false);
      this.Zl.forEach(Zgu7::lambda$resumeAllTasks$5);
      this.Zr.values().stream().filter(Zgu7::lambda$pauseAllTasks$1).forEach(this::lambda$resumeAllTasks$8);
    } 
  }
  
  private void lambda$resumeAllTasks$8(Zgpz paramZgpz) {
    paramZgpz.Zj.forEach(this::lambda$resumeAllTasks$7);
  }
  
  private void lambda$resumeAllTasks$7(Consumer<Zxr8<Ztak>> paramConsumer) {
    paramConsumer.accept(Zi(false));
  }
  
  private static void lambda$resumeAllTasks$5(Consumer<Zxr8<Void>> paramConsumer) {
    paramConsumer.accept(Zt11.ZG);
  }
  
  private void lambda$pauseAllTasks$4() {
    if (!this.ZS.ZV3()) {
      this.ZS.ZK(true);
      this.Zu.forEach(Zgu7::lambda$pauseAllTasks$0);
      this.Zr.values().stream().filter(Zgu7::lambda$pauseAllTasks$1).forEach(this::lambda$pauseAllTasks$3);
    } 
  }
  
  private void lambda$pauseAllTasks$3(Zgpz paramZgpz) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Zi : Ljava/util/List;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zgu7;Lburp/Zgpz;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  private void lambda$pauseAllTasks$2(Zgpz paramZgpz, Consumer<Zxr8<Zst9>> paramConsumer) {
    paramConsumer.accept(ZI(paramZgpz.Zd));
  }
  
  private static boolean lambda$pauseAllTasks$1(Zgpz paramZgpz) {
    return !paramZgpz.Zd.ZPw();
  }
  
  private static void lambda$pauseAllTasks$0(Consumer<Zxr8<Void>> paramConsumer) {
    paramConsumer.accept(Zt11.Za);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgu7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */