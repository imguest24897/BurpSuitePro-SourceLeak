package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Zlkd implements ActionListener {
  private final Zzdy ZK;
  
  private final Zr3z ZY;
  
  final Zrvx Zq;
  
  Zlkd(Zrvx paramZrvx, Zzdy paramZzdy, Zr3z paramZr3z) {
    this.ZK = paramZzdy;
    this.ZY = paramZr3z;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZKe : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZK : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 35
    //   14: aload_0
    //   15: getfield Zq : Lburp/Zrvx;
    //   18: getfield Zj : Ljava/util/Set;
    //   21: aload_0
    //   22: getfield ZY : Lburp/Zr3z;
    //   25: invokeinterface add : (Ljava/lang/Object;)Z
    //   30: pop
    //   31: iload_2
    //   32: ifne -> 52
    //   35: aload_0
    //   36: getfield Zq : Lburp/Zrvx;
    //   39: getfield Zj : Ljava/util/Set;
    //   42: aload_0
    //   43: getfield ZY : Lburp/Zr3z;
    //   46: invokeinterface remove : (Ljava/lang/Object;)Z
    //   51: pop
    //   52: aload_0
    //   53: getfield Zq : Lburp/Zrvx;
    //   56: getfield Zs : Lburp/Ze01;
    //   59: aload_0
    //   60: getfield Zq : Lburp/Zrvx;
    //   63: getfield Zj : Ljava/util/Set;
    //   66: invokeinterface isEmpty : ()Z
    //   71: ifne -> 78
    //   74: iconst_1
    //   75: goto -> 79
    //   78: iconst_0
    //   79: invokevirtual setEnabled : (Z)V
    //   82: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */