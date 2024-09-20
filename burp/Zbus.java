package burp;

import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbus extends Zbup {
  private final Zx0x ZN = (Zx0x)getViewport().getView();
  
  private final Zsuf Zd;
  
  private AttributeSet ZM;
  
  public Zbus(Zsuf paramZsuf) {
    super(new Zx0x());
    this.ZN.setEditable(false);
    Zh(Zlkk.BACKGROUND);
    setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS()));
    Zv();
    this.Zd = paramZsuf;
    StyleContext styleContext = StyleContext.getDefaultStyleContext();
    this.ZM = styleContext.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Zlkk.TEXT_ERROR.ZS());
  }
  
  public boolean Zj() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !this.Zd.Zs();
  }
  
  public void ZO() {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zd : Lburp/Zsuf;
    //   8: invokevirtual Zs : ()Z
    //   11: ifne -> 102
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore_2
    //   22: aload_0
    //   23: getfield Zd : Lburp/Zsuf;
    //   26: invokevirtual ZT : ()Lburp/Zmj7;
    //   29: invokevirtual Zi : ()Lburp/Zrfq;
    //   32: astore_3
    //   33: aload_0
    //   34: getfield Zd : Lburp/Zsuf;
    //   37: invokevirtual Zs : ()Z
    //   40: ifne -> 80
    //   43: aload_0
    //   44: getfield Zd : Lburp/Zsuf;
    //   47: invokevirtual ZT : ()Lburp/Zmj7;
    //   50: invokevirtual Zi : ()Lburp/Zrfq;
    //   53: aload_3
    //   54: if_acmpne -> 80
    //   57: aload_0
    //   58: getfield Zd : Lburp/Zsuf;
    //   61: invokevirtual ZO : ()Lburp/Zmj7;
    //   64: astore #4
    //   66: aload_2
    //   67: aload #4
    //   69: invokevirtual Zw : ()Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_1
    //   77: ifnull -> 33
    //   80: aload_2
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: astore #4
    //   86: aload_0
    //   87: aload #4
    //   89: aload_3
    //   90: <illegal opcode> run : (Lburp/Zbus;Ljava/lang/String;Lburp/Zrfq;)Ljava/lang/Runnable;
    //   95: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   98: aload_1
    //   99: ifnull -> 4
    //   102: aload_0
    //   103: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   106: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   109: astore_2
    //   110: aload_0
    //   111: aload_2
    //   112: <illegal opcode> run : (Lburp/Zbus;Ljava/awt/Point;)Ljava/lang/Runnable;
    //   117: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   120: return
  }
  
  public void Zk() {
    this.Zd.Zz();
    SwingUtilities.invokeLater(this::ZL);
  }
  
  private void Zh(String paramString, AttributeSet paramAttributeSet) {
    try {
      StyledDocument styledDocument = this.ZN.getStyledDocument();
      styledDocument.insertString(styledDocument.getLength(), paramString, paramAttributeSet);
      int i = styledDocument.getLength() - 500000;
      try {
        if (i > 0)
          styledDocument.remove(0, i); 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZL() {
    try {
      StyledDocument styledDocument = this.ZN.getStyledDocument();
      styledDocument.remove(0, styledDocument.getLength());
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private AttributeSet Zp(Zrfq paramZrfq) {
    try {
      switch (Zg6j.Zi[paramZrfq.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZM;
  }
  
  private void Zv() {
    SwingUtilities.invokeLater(this::lambda$resetScrollToTop$2);
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      if (this.ZN != null)
        setBorder(BorderFactory.createMatteBorder(0, 10, 0, 0, Zlkk.BACKGROUND.ZS())); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    StyleContext styleContext = StyleContext.getDefaultStyleContext();
    this.ZM = styleContext.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Zlkk.TEXT_ERROR.ZS());
  }
  
  private void lambda$resetScrollToTop$2() {
    JScrollBar jScrollBar = getVerticalScrollBar();
    jScrollBar.setValue(jScrollBar.getMinimum());
  }
  
  private void lambda$updateConsoleOutputText$1(Point paramPoint) {
    getViewport().setViewPosition(paramPoint);
  }
  
  private void lambda$updateConsoleOutputText$0(String paramString, Zrfq paramZrfq) {
    Zh(paramString, Zp(paramZrfq));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */