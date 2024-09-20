package burp;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.MouseInputAdapter;

class Zr93 extends MouseInputAdapter implements CaretListener, ComponentListener, FocusListener, KeyListener {
  final Zxj Zx;
  
  private Zr93(Zxj paramZxj) {}
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    Object object = paramCaretEvent.getSource();
    if (object == this.Zx.Zk)
      this.Zx.ZX(); 
  }
  
  public void componentHidden(ComponentEvent paramComponentEvent) {
    ZP(paramComponentEvent);
  }
  
  public void componentMoved(ComponentEvent paramComponentEvent) {
    ZP(paramComponentEvent);
  }
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    ZP(paramComponentEvent);
  }
  
  public void componentShown(ComponentEvent paramComponentEvent) {
    ZP(paramComponentEvent);
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    Component component = paramFocusEvent.getOppositeComponent();
    boolean bool = (component instanceof Zzl2 || (component != null && SwingUtilities.getWindowAncestor(component) instanceof Zzl2)) ? true : false;
    if (!bool)
      this.Zx.ZX(); 
  }
  
  private void ZP(ComponentEvent paramComponentEvent) {
    this.Zx.ZX();
  }
  
  public void ZM(JTextArea paramJTextArea) {
    paramJTextArea.addCaretListener(this);
    paramJTextArea.addComponentListener(this);
    paramJTextArea.addFocusListener(this);
    paramJTextArea.addKeyListener(this);
    paramJTextArea.addMouseListener(this);
    paramJTextArea.addMouseMotionListener(this);
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic Zt : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getKeyCode : ()I
    //   8: bipush #27
    //   10: if_icmpne -> 24
    //   13: aload_0
    //   14: getfield Zx : Lburp/Zxj;
    //   17: invokevirtual ZX : ()V
    //   20: aload_2
    //   21: ifnonnull -> 71
    //   24: aload_1
    //   25: invokevirtual getKeyCode : ()I
    //   28: bipush #113
    //   30: if_icmpne -> 71
    //   33: aload_0
    //   34: getfield Zx : Lburp/Zxj;
    //   37: getfield ZV : Lburp/Zzl2;
    //   40: ifnull -> 71
    //   43: aload_0
    //   44: getfield Zx : Lburp/Zxj;
    //   47: getfield ZV : Lburp/Zzl2;
    //   50: invokevirtual getFocusableWindowState : ()Z
    //   53: ifne -> 71
    //   56: aload_0
    //   57: getfield Zx : Lburp/Zxj;
    //   60: getfield ZV : Lburp/Zzl2;
    //   63: aconst_null
    //   64: invokevirtual actionPerformed : (Ljava/awt/event/ActionEvent;)V
    //   67: aload_1
    //   68: invokevirtual consume : ()V
    //   71: return
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (this.Zx.ZQ == null || !this.Zx.ZQ.contains(paramMouseEvent.getPoint()))
      this.Zx.ZX(); 
  }
  
  public void ZG() {
    this.Zx.Zk.removeCaretListener(this);
    this.Zx.Zk.removeComponentListener(this);
    this.Zx.Zk.removeFocusListener(this);
    this.Zx.Zk.removeKeyListener(this);
    this.Zx.Zk.removeMouseListener(this);
    this.Zx.Zk.removeMouseMotionListener(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr93.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */