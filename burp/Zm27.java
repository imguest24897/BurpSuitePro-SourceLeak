package burp;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm27 extends Zm2i {
  private final Zbw9 Zk;
  
  public Zm27(Zbw9 paramZbw9) {
    this.Zk = paramZbw9;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zg85 zg85 = new Zg85();
    zg85.setFont(paramJTable.getFont());
    boolean bool = Zbw2.ZH();
    Highlighter highlighter = zg85.getHighlighter();
    if (paramObject == null) {
      zg85.setText("");
      highlighter.removeAllHighlights();
      if (!bool) {
        String str1 = paramObject.toString();
        zg85.setText(str1);
        Zz(str1.length(), paramInt1, highlighter);
        Zg(zg85);
        return zg85;
      } 
      Zg(zg85);
      return zg85;
    } 
    String str = paramObject.toString();
    zg85.setText(str);
    Zz(str.length(), paramInt1, highlighter);
    Zg(zg85);
    return zg85;
  }
  
  private void Zz(int paramInt1, int paramInt2, Highlighter paramHighlighter) {
    int i = this.Zk.Zl();
    int j = this.Zk.ZC();
    if (Zw(i, j) && Zn(paramInt2, i, j)) {
      int k = paramInt2 * 16;
      int m = Math.max(0, i - k);
      int n = Math.min(paramInt1, j - k);
      ZW(m, n, paramHighlighter);
    } 
  }
  
  private boolean Zn(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 / 16;
    int j = paramInt3 / 16;
    return (i <= paramInt1 && j >= paramInt1);
  }
  
  private boolean Zw(int paramInt1, int paramInt2) {
    return (paramInt1 != -1 && paramInt2 != -1);
  }
  
  private void ZW(int paramInt1, int paramInt2, Highlighter paramHighlighter) {
    DefaultHighlighter.DefaultHighlightPainter defaultHighlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Zlkk.SELECTION_BACKGROUND.ZS());
    try {
      paramHighlighter.addHighlight(paramInt1, paramInt2, defaultHighlightPainter);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zg(Zg85 paramZg85) {
    paramZg85.setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    paramZg85.setForeground(Zlkk.FOREGROUND.ZS());
    paramZg85.setBorder(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm27.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */