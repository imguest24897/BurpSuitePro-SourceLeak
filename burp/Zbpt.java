package burp;

import java.util.concurrent.Future;

public class Zbpt implements Zl1k {
  private final Zvo0 Ze;
  
  private final Zb4r Zy;
  
  private final Zmpb Zq;
  
  private final Future<?> ZM;
  
  public Zbpt(Ztwv paramZtwv, Zbnt paramZbnt, Zskh paramZskh, Zvo0 paramZvo0, Zzes paramZzes) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZP9 : ()[I
    //   7: aload_0
    //   8: aload #4
    //   10: putfield Ze : Lburp/Zvo0;
    //   13: aload_0
    //   14: new burp/Zb4r
    //   17: dup
    //   18: aload_3
    //   19: aload #5
    //   21: invokeinterface ZU : ()J
    //   26: invokespecial <init> : (Lburp/Zskh;J)V
    //   29: putfield Zy : Lburp/Zb4r;
    //   32: aload_0
    //   33: new burp/Zmpb
    //   36: dup
    //   37: aload_2
    //   38: aload_0
    //   39: getfield Zy : Lburp/Zb4r;
    //   42: dup
    //   43: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: <illegal opcode> accept : (Lburp/Zb4r;)Ljava/util/function/Consumer;
    //   52: aload #5
    //   54: invokespecial <init> : (Lburp/Zbnt;Ljava/util/function/Consumer;Lburp/Zzes;)V
    //   57: putfield Zq : Lburp/Zmpb;
    //   60: aload #5
    //   62: aload_0
    //   63: aload #5
    //   65: <illegal opcode> ZW : (Lburp/Zbpt;Lburp/Zzes;)Lburp/Zbno;
    //   70: invokeinterface Zb : (Lburp/Zbno;)V
    //   75: astore #6
    //   77: aload #4
    //   79: aload_0
    //   80: getfield Zq : Lburp/Zmpb;
    //   83: invokeinterface ZE : (Lburp/Zr97;)V
    //   88: aload_0
    //   89: aload_1
    //   90: aload_0
    //   91: getfield Zq : Lburp/Zmpb;
    //   94: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   99: putfield ZM : Ljava/util/concurrent/Future;
    //   102: invokestatic Zwu : ()[Lburp/Zbqc;
    //   105: ifnonnull -> 114
    //   108: iconst_5
    //   109: newarray int
    //   111: invokestatic Zf : ([I)V
    //   114: return
  }
  
  public void ZH() {
    this.Ze.ZX(this.Zq);
    this.Zq.ZY();
    this.ZM.cancel(true);
    this.Zy.ZT();
  }
  
  public void Zw(Zlkw paramZlkw) {
    this.Zy.Zo(paramZlkw);
  }
  
  public void Zl() {
    this.Zy.ZY();
  }
  
  public void ZQ() {
    this.Zy.ZC();
  }
  
  private void lambda$new$0(Zzes paramZzes) {
    this.Zy.ZM(paramZzes.ZU());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */