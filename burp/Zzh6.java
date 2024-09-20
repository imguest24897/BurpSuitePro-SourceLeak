package burp;

import java.awt.Component;
import java.util.List;

public class Zzh6<T extends Zmw9<?>> {
  private final Zr40<T> Zm;
  
  private final Ztwv Zi;
  
  private final Zzp8<T> Zp;
  
  public Zzh6(Zr40<T> paramZr40, Zzp8<T> paramZzp8, Ztwv paramZtwv) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zm : Lburp/Zr40;
    //   9: aload_0
    //   10: aload_3
    //   11: putfield Zi : Lburp/Ztwv;
    //   14: aload_0
    //   15: aload_2
    //   16: invokeinterface ZJ : ()Lburp/Zzp8;
    //   21: putfield Zp : Lburp/Zzp8;
    //   24: aload_0
    //   25: getfield Zp : Lburp/Zzp8;
    //   28: invokeinterface Zv : ()V
    //   33: aload_3
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> run : (Lburp/Zzh6;Lburp/Zr40;)Ljava/lang/Runnable;
    //   41: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   46: pop
    //   47: return
  }
  
  public Component Zl() {
    return this.Zp.ZW();
  }
  
  public List<T> Zw() {
    return this.Zp.Zy();
  }
  
  public void ZX() {
    this.Zi.Zx(this::lambda$dispose$1);
  }
  
  private void lambda$dispose$1() {
    this.Zm.Za(this.Zp.Zu());
  }
  
  private void lambda$new$0(Zr40 paramZr40) {
    paramZr40.Zc(this.Zp.Zu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */