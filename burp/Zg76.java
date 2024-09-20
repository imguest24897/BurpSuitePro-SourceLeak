package burp;

import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Zg76 implements DocumentListener {
  final Zxer Zt;
  
  final Zr8o ZX;
  
  Zg76(Zr8o paramZr8o, Zxer paramZxer) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zt : Lburp/Zxer;
    //   8: invokevirtual getTabLayoutPolicy : ()I
    //   11: iconst_1
    //   12: if_icmpeq -> 16
    //   15: return
    //   16: aload_0
    //   17: getfield ZX : Lburp/Zr8o;
    //   20: invokevirtual getParent : ()Ljava/awt/Container;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnull -> 44
    //   28: aload_3
    //   29: instanceof javax/swing/JViewport
    //   32: ifne -> 44
    //   35: aload_3
    //   36: invokevirtual getParent : ()Ljava/awt/Container;
    //   39: astore_3
    //   40: aload_2
    //   41: ifnull -> 24
    //   44: aload_3
    //   45: ifnull -> 71
    //   48: aload_3
    //   49: checkcast javax/swing/JViewport
    //   52: invokevirtual getView : ()Ljava/awt/Component;
    //   55: checkcast javax/swing/JComponent
    //   58: astore #4
    //   60: aload_0
    //   61: aload #4
    //   63: <illegal opcode> run : (Lburp/Zg76;Ljavax/swing/JComponent;)Ljava/lang/Runnable;
    //   68: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   71: return
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {}
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
  
  private void lambda$insertUpdate$0(JComponent paramJComponent) {
    paramJComponent.scrollRectToVisible(this.ZX.getBounds());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg76.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */