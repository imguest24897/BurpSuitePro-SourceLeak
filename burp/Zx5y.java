package burp;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Zx5y {
  private final Consumer<Duration> Zk;
  
  private final Zvo2 ZD;
  
  private final Zmnh ZJ;
  
  private final Ztl_ Zo;
  
  private final Zl6j ZK;
  
  private final AtomicBoolean ZX;
  
  public Zx5y(Consumer<Duration> paramConsumer, Zvo2 paramZvo2, Zmnh paramZmnh, Ztl_ paramZtl_, Zl6j paramZl6j) {
    this.Zk = paramConsumer;
    this.ZD = paramZvo2;
    this.ZJ = paramZmnh;
    this.Zo = paramZtl_;
    this.ZK = paramZl6j;
    this.ZX = new AtomicBoolean();
  }
  
  public void Zf() {
    Zbqc[] arrayOfZbqc = Zkf1.ZA();
    this.ZX.set(true);
    while (this.ZX.get() && ZM(this.ZD.ZW(), this.ZK.ZM()) && ZM(this.ZD.ZY(), this.ZK.Zh())) {
      this.Zk.accept(Duration.ofSeconds(60L));
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public void ZN() {
    this.ZX.set(false);
  }
  
  private boolean ZM(Zg1c paramZg1c, Zmdz paramZmdz) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual Zn : ()Lnet/portswigger/Zup;
    //   8: astore #4
    //   10: aload #4
    //   12: ifnonnull -> 17
    //   15: iconst_1
    //   16: ireturn
    //   17: aload #4
    //   19: getfield Zo : Ljava/lang/String;
    //   22: ifnull -> 59
    //   25: aload #4
    //   27: getfield Zo : Ljava/lang/String;
    //   30: invokevirtual isEmpty : ()Z
    //   33: ifne -> 59
    //   36: aload_2
    //   37: aload #4
    //   39: getfield Zo : Ljava/lang/String;
    //   42: invokevirtual Zf : (Ljava/lang/String;)Z
    //   45: istore #5
    //   47: iload #5
    //   49: ifeq -> 59
    //   52: aload_0
    //   53: aload_1
    //   54: aload_2
    //   55: invokevirtual ZM : (Lburp/Zg1c;Lburp/Zmdz;)Z
    //   58: ireturn
    //   59: aload #4
    //   61: getfield ZS : Lnet/portswigger/Za8;
    //   64: getstatic net/portswigger/Za8.UPDATE_AVAILABLE : Lnet/portswigger/Za8;
    //   67: if_acmpne -> 86
    //   70: aload_0
    //   71: getfield ZJ : Lburp/Zmnh;
    //   74: aload_1
    //   75: aload #4
    //   77: invokeinterface ZJ : (Lburp/Zg1c;Lnet/portswigger/Zup;)V
    //   82: aload_3
    //   83: ifnull -> 95
    //   86: aload_0
    //   87: getfield ZJ : Lburp/Zmnh;
    //   90: invokeinterface ZL : ()V
    //   95: aload #4
    //   97: getfield Zs : Lnet/portswigger/Zq5;
    //   100: ifnull -> 120
    //   103: aload_0
    //   104: getfield Zo : Lburp/Ztl_;
    //   107: aload #4
    //   109: getfield Zs : Lnet/portswigger/Zq5;
    //   112: invokestatic Zt : (Lnet/portswigger/Zq5;)Lburp/Zglo;
    //   115: invokeinterface ZN : (Lburp/Zglo;)V
    //   120: iconst_0
    //   121: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */