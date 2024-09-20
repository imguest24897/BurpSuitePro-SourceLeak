package burp;

import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.plaf.basic.BasicTextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zxrf extends BasicTextUI.BasicHighlighter {
  private final List<Zgp> Zy = new ArrayList<>();
  
  private Zmgw Zb;
  
  public void ZK(List<? extends Zkv5> paramList) {
    Objects.requireNonNull(this.Zy);
    paramList.stream().map(this::Zp).filter(Objects::nonNull).forEach(this.Zy::add);
    this.Zb.repaint();
  }
  
  public void Zl() {
    this.Zy.clear();
  }
  
  public void install(JTextComponent paramJTextComponent) {
    super.install(paramJTextComponent);
    this.Zb = (Zmgw)paramJTextComponent;
  }
  
  public void deinstall(JTextComponent paramJTextComponent) {
    this.Zb = null;
    this.Zy.clear();
  }
  
  public void paintLayeredHighlights(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    super.paintLayeredHighlights(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView);
    int j = this.Zy.size() - 1;
    int i = Zz85.Zm();
    while (j >= 0) {
      Zgp zgp = this.Zy.get(j);
      int k = zgp.Zp();
      int m = zgp.Zl();
      if ((paramInt1 < k && paramInt2 > k) || (paramInt1 >= k && paramInt1 < m))
        zgp.Ze(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView); 
      j--;
      if (i != 0)
        break; 
    } 
  }
  
  private Zgp Zp(Zkv5 paramZkv5) {
    Document document = this.Zb.getDocument();
    try {
      return new Zgp(document.createPosition(paramZkv5.startOffset()), document.createPosition(paramZkv5.endOffset()), paramZkv5.ZOJ());
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.IGNORED);
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxrf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */