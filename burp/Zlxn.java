package burp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;

class Zlxn implements MouseListener {
  final Zr8f ZV;
  
  final Zsk9 ZF;
  
  Zlxn(Zsk9 paramZsk9, Zr8f paramZr8f) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic isLeftMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   8: ifeq -> 73
    //   11: aload_0
    //   12: getfield ZF : Lburp/Zsk9;
    //   15: getfield Za : Ljava/awt/Component;
    //   18: aload_0
    //   19: getfield ZF : Lburp/Zsk9;
    //   22: getfield Zo : Lburp/Zr8f;
    //   25: getfield Zz : Lburp/Zxer;
    //   28: invokevirtual getSelectedComponent : ()Ljava/awt/Component;
    //   31: if_acmpeq -> 61
    //   34: aload_0
    //   35: getfield ZF : Lburp/Zsk9;
    //   38: iconst_1
    //   39: putfield Zx : Z
    //   42: aload_0
    //   43: getfield ZF : Lburp/Zsk9;
    //   46: getfield Zo : Lburp/Zr8f;
    //   49: aload_1
    //   50: aload_0
    //   51: getfield ZF : Lburp/Zsk9;
    //   54: invokevirtual Z_ : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;)V
    //   57: aload_2
    //   58: ifnull -> 88
    //   61: aload_0
    //   62: getfield ZF : Lburp/Zsk9;
    //   65: iconst_0
    //   66: putfield Zx : Z
    //   69: aload_2
    //   70: ifnull -> 88
    //   73: aload_0
    //   74: getfield ZF : Lburp/Zsk9;
    //   77: getfield Zo : Lburp/Zr8f;
    //   80: aload_1
    //   81: aload_0
    //   82: getfield ZF : Lburp/Zsk9;
    //   85: invokevirtual Z_ : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;)V
    //   88: return
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (!SwingUtilities.isLeftMouseButton(paramMouseEvent) || this.ZF.Za != this.ZF.Zo.Zz.getSelectedComponent())
      this.ZF.Zo.Z_(paramMouseEvent, this.ZF); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic isLeftMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   8: ifne -> 27
    //   11: aload_0
    //   12: getfield ZF : Lburp/Zsk9;
    //   15: getfield Zo : Lburp/Zr8f;
    //   18: aload_1
    //   19: aload_0
    //   20: getfield ZF : Lburp/Zsk9;
    //   23: invokevirtual Z_ : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;)V
    //   26: return
    //   27: aload_0
    //   28: getfield ZF : Lburp/Zsk9;
    //   31: getfield Zo : Lburp/Zr8f;
    //   34: getfield Zz : Lburp/Zxer;
    //   37: invokevirtual getSelectedIndex : ()I
    //   40: istore_3
    //   41: aload_0
    //   42: getfield ZF : Lburp/Zsk9;
    //   45: getfield Zx : Z
    //   48: ifne -> 142
    //   51: iload_3
    //   52: iconst_m1
    //   53: if_icmpeq -> 142
    //   56: iload_3
    //   57: aload_0
    //   58: getfield ZF : Lburp/Zsk9;
    //   61: getfield Zo : Lburp/Zr8f;
    //   64: getfield Zz : Lburp/Zxer;
    //   67: aload_0
    //   68: getfield ZF : Lburp/Zsk9;
    //   71: getfield Za : Ljava/awt/Component;
    //   74: invokevirtual indexOfComponent : (Ljava/awt/Component;)I
    //   77: if_icmpne -> 142
    //   80: aload_0
    //   81: getfield ZF : Lburp/Zsk9;
    //   84: getfield Zo : Lburp/Zr8f;
    //   87: getfield ZN : Lburp/Ztca;
    //   90: invokeinterface ZK : ()V
    //   95: aload_0
    //   96: getfield ZF : Lburp/Zsk9;
    //   99: getfield Zo : Lburp/Zr8f;
    //   102: getfield Zz : Lburp/Zxer;
    //   105: iload_3
    //   106: invokevirtual removeTabAt : (I)V
    //   109: aload_0
    //   110: getfield ZF : Lburp/Zsk9;
    //   113: getfield Zo : Lburp/Zr8f;
    //   116: getfield Zz : Lburp/Zxer;
    //   119: invokevirtual getTabCount : ()I
    //   122: ifne -> 157
    //   125: aload_0
    //   126: getfield ZF : Lburp/Zsk9;
    //   129: getfield Zo : Lburp/Zr8f;
    //   132: getfield Zz : Lburp/Zxer;
    //   135: invokevirtual ZF : ()V
    //   138: aload_2
    //   139: ifnull -> 157
    //   142: aload_0
    //   143: getfield ZF : Lburp/Zsk9;
    //   146: getfield Zo : Lburp/Zr8f;
    //   149: aload_1
    //   150: aload_0
    //   151: getfield ZF : Lburp/Zsk9;
    //   154: invokevirtual Z_ : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;)V
    //   157: aload_0
    //   158: getfield ZF : Lburp/Zsk9;
    //   161: iconst_0
    //   162: putfield Zx : Z
    //   165: aload_0
    //   166: getfield ZF : Lburp/Zsk9;
    //   169: invokevirtual repaint : ()V
    //   172: return
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.ZF.Zu = true;
    this.ZF.repaint();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZF.Zu = false;
    this.ZF.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */