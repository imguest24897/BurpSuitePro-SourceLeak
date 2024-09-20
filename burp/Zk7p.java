package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zk7p extends MouseAdapter implements Zky2 {
  final Zg8x ZP;
  
  private Zk7p(Zg8x paramZg8x) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: invokestatic ZJx : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZP : Lburp/Zg8x;
    //   9: getfield Zs : Lburp/Zmix;
    //   12: invokevirtual getRowCount : ()I
    //   15: ifne -> 19
    //   18: return
    //   19: aload_3
    //   20: ifnull -> 119
    //   23: aload_0
    //   24: getfield ZP : Lburp/Zg8x;
    //   27: getfield Zd : Lburp/Zbws;
    //   30: aload_3
    //   31: invokevirtual rowAtPoint : (Ljava/awt/Point;)I
    //   34: istore #5
    //   36: iload #5
    //   38: iconst_m1
    //   39: if_icmpeq -> 74
    //   42: aload_0
    //   43: getfield ZP : Lburp/Zg8x;
    //   46: getfield Zs : Lburp/Zmix;
    //   49: aload_0
    //   50: getfield ZP : Lburp/Zg8x;
    //   53: getfield Zd : Lburp/Zbws;
    //   56: iload #5
    //   58: invokevirtual convertRowIndexToModel : (I)I
    //   61: invokevirtual ZW : (I)Ljava/lang/Object;
    //   64: checkcast burp/Ze65
    //   67: astore #6
    //   69: aload #4
    //   71: ifnull -> 111
    //   74: aload_0
    //   75: getfield ZP : Lburp/Zg8x;
    //   78: getfield Zs : Lburp/Zmix;
    //   81: aload_0
    //   82: getfield ZP : Lburp/Zg8x;
    //   85: getfield Zd : Lburp/Zbws;
    //   88: aload_0
    //   89: getfield ZP : Lburp/Zg8x;
    //   92: getfield Zs : Lburp/Zmix;
    //   95: invokevirtual getRowCount : ()I
    //   98: iconst_1
    //   99: isub
    //   100: invokevirtual convertRowIndexToModel : (I)I
    //   103: invokevirtual ZW : (I)Ljava/lang/Object;
    //   106: checkcast burp/Ze65
    //   109: astore #6
    //   111: aload_0
    //   112: aload #6
    //   114: aload_3
    //   115: aload_2
    //   116: invokevirtual Zp : (Lburp/Ze65;Ljava/awt/Point;Ljava/awt/Component;)V
    //   119: return
  }
  
  private void Zp(Ze65 paramZe65, Point paramPoint, Component paramComponent) {
    this.ZP.ZI.Zr(this.ZP.Zy).Zv(paramZe65, paramPoint, paramComponent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk7p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */