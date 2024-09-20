package burp;

import javax.swing.RowFilter;
import javax.swing.table.TableModel;

public class Zky5 extends RowFilter<TableModel, Integer> {
  public boolean include(RowFilter.Entry<? extends TableModel, ? extends Integer> paramEntry) {
    Zlm8 zlm8 = (Zlm8)paramEntry.getModel();
    if (zlm8 instanceof Zlm8) {
      Zlm8 zlm81 = zlm8;
      return zlm81.Zh(((Integer)paramEntry.getIdentifier()).intValue());
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */