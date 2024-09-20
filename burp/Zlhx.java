package burp;

import java.awt.event.HierarchyEvent;
import java.util.Objects;
import java.util.stream.IntStream;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.portswigger.Zm2;

public class Zlhx {
  public static void ZX(HierarchyEvent paramHierarchyEvent, Zbws paramZbws, Zrrh paramZrrh) {
    if (paramZbws == null)
      return; 
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L && paramZbws.isShowing()) {
      TableColumnModel tableColumnModel = paramZbws.getColumnModel();
      Objects.requireNonNull(tableColumnModel);
      boolean bool = IntStream.range(0, tableColumnModel.getColumnCount()).mapToObj(tableColumnModel::getColumn).anyMatch(Zlhx::lambda$handleCustomColumnTableShown$0);
      if (bool)
        Zm2.ZC(paramZrrh); 
    } 
  }
  
  private static boolean lambda$handleCustomColumnTableShown$0(TableColumn paramTableColumn) {
    return paramTableColumn instanceof Zxps;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */