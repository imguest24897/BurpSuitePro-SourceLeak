package burp;

import java.util.Iterator;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmz0 extends Zmzn {
  private final JTextComponent Zj;
  
  private final Runnable Ze;
  
  public Zmz0(JTextComponent paramJTextComponent, Runnable paramRunnable) {
    this.Zj = paramJTextComponent;
    this.Ze = paramRunnable;
  }
  
  protected String Ze() {
    return this.Zj.getText();
  }
  
  protected int Zn() {
    return this.Zj.getDocument().getLength();
  }
  
  protected List<Zbjz> ZI() {
    return this.Zh;
  }
  
  protected void ZJ() {
    Highlighter highlighter = this.Zj.getHighlighter();
    highlighter.removeAllHighlights();
    int i = this.Zj.getDocument().getLength();
    Iterator<Zbjz> iterator = this.Zh.iterator();
    String str = Zmzn.ZB();
    while (iterator.hasNext()) {
      Zkv5 zkv5 = iterator.next();
      try {
        if (zkv5.startOffset() >= 0)
          try {
            if (zkv5.endOffset() <= i && zkv5.startOffset() < zkv5.endOffset())
              try {
                highlighter.addHighlight(zkv5.startOffset(), zkv5.endOffset(), zkv5.ZOJ());
              } catch (BadLocationException badLocationException) {
                Zah.Zl(badLocationException, Zk_.UNEXPECTED);
              }  
          } catch (BadLocationException badLocationException) {
            throw a(null);
          }  
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      if (str == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    this.Ze.run();
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */