package burp;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Zzrh<T> implements Zkbs, Zg5b<T> {
  private final Supplier<T> Zp;
  
  private final Map<T, Zkbs> Zh = new HashMap<>();
  
  private final EnumSet<Zgu3> ZX;
  
  private final Runnable ZA;
  
  private final Consumer<Zge7> ZR;
  
  private final Zl8t Zj;
  
  private Zte0<Zoh> Ze;
  
  private Zte0<Zgi0> Zu;
  
  private Zz99 Zd;
  
  private boolean ZK;
  
  public Zzrh(Supplier<T> paramSupplier, EnumSet<Zgu3> paramEnumSet, Zl8t paramZl8t, Runnable paramRunnable, Consumer<Zge7> paramConsumer) {
    this.Zp = paramSupplier;
    this.ZX = paramEnumSet;
    this.ZA = paramRunnable;
    this.ZR = paramConsumer;
    this.Zj = paramZl8t;
  }
  
  public boolean Zd(Zgu3 paramZgu3) {
    return ZP().Zd(paramZgu3);
  }
  
  public List<? extends Zge7> Zk(Zgu3 paramZgu3) {
    return ZP().Zk(paramZgu3);
  }
  
  public void ZO(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  public void ZM(Zte0<Zoh> paramZte0) {
    if (!this.ZK) {
      this.Ze = paramZte0;
      ZP().ZM(paramZte0);
    } 
  }
  
  public void Zl(Zte0<Zgi0> paramZte0) {
    if (!this.ZK) {
      this.Zu = paramZte0;
      ZP().Zl(paramZte0);
    } 
  }
  
  public void Zj(Zz99 paramZz99) {
    if (!this.ZK) {
      this.Zd = paramZz99;
      ZP().Zj(paramZz99);
    } 
  }
  
  private Zkbs ZP() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Ljava/util/function/Supplier;
    //   4: invokeinterface get : ()Ljava/lang/Object;
    //   9: astore_1
    //   10: aload_0
    //   11: getfield Zh : Ljava/util/Map;
    //   14: aload_1
    //   15: aload_0
    //   16: aload_1
    //   17: <illegal opcode> apply : (Lburp/Zzrh;Ljava/lang/Object;)Ljava/util/function/Function;
    //   22: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   27: checkcast burp/Zkbs
    //   30: areturn
  }
  
  private void Zw(T paramT) {
    if (paramT == this.Zp.get())
      this.ZA.run(); 
  }
  
  private void Zi(T paramT, Zge7 paramZge7) {
    if (paramT == this.Zp.get())
      this.ZR.accept(paramZge7); 
  }
  
  public void ZY(T paramT) {
    this.Zh.remove(paramT);
  }
  
  private Zkbs lambda$currentExtensionPaneManager$2(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: getstatic burp/Zzie.Zh : Lburp/Zzie;
    //   3: aload_0
    //   4: getfield ZX : Ljava/util/EnumSet;
    //   7: aload_0
    //   8: getfield Zj : Lburp/Zl8t;
    //   11: aload_0
    //   12: aload_1
    //   13: <illegal opcode> run : (Lburp/Zzrh;Ljava/lang/Object;)Ljava/lang/Runnable;
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> accept : (Lburp/Zzrh;Ljava/lang/Object;)Ljava/util/function/Consumer;
    //   25: invokeinterface Zf : (Ljava/util/EnumSet;Lburp/Zl8t;Ljava/lang/Runnable;Ljava/util/function/Consumer;)Lburp/Zkbs;
    //   30: astore_3
    //   31: aload_0
    //   32: getfield Ze : Lburp/Zte0;
    //   35: ifnull -> 48
    //   38: aload_3
    //   39: aload_0
    //   40: getfield Ze : Lburp/Zte0;
    //   43: invokeinterface ZM : (Lburp/Zte0;)V
    //   48: aload_0
    //   49: getfield Zu : Lburp/Zte0;
    //   52: ifnull -> 65
    //   55: aload_3
    //   56: aload_0
    //   57: getfield Zu : Lburp/Zte0;
    //   60: invokeinterface Zl : (Lburp/Zte0;)V
    //   65: aload_0
    //   66: getfield Zd : Lburp/Zz99;
    //   69: ifnull -> 82
    //   72: aload_3
    //   73: aload_0
    //   74: getfield Zd : Lburp/Zz99;
    //   77: invokeinterface Zj : (Lburp/Zz99;)V
    //   82: aload_3
    //   83: areturn
  }
  
  private void lambda$currentExtensionPaneManager$1(Object paramObject, Zge7 paramZge7) {
    Zi((T)paramObject, paramZge7);
  }
  
  private void lambda$currentExtensionPaneManager$0(Object paramObject) {
    Zw((T)paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */