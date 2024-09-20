package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Highlighter;

public interface Zkv5 {
  int startOffset();
  
  int endOffset();
  
  Zlkk ZOU();
  
  default boolean ZO7() {
    return false;
  }
  
  default int ZOl() {
    return 1;
  }
  
  default Highlighter.HighlightPainter ZOJ() {
    return new Zz6k(ZOU(), false);
  }
  
  Zkv5 Zg(int paramInt1, int paramInt2);
  
  static List<Zkv5> ZR(List<? extends Zkv5> paramList) {
    return new ArrayList<>(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */