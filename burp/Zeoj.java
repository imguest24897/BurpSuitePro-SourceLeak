package burp;

import java.util.function.Supplier;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.portswigger.Zm2;

public class Zeoj {
  private final Zs97<?> Zm;
  
  private final Supplier<Zbws> Zq;
  
  Zeoj(Zs97<?> paramZs97, Supplier<Zbws> paramSupplier) {
    this.Zm = paramZs97;
    this.Zq = paramSupplier;
  }
  
  public void ZB(Zs3l paramZs3l, int paramInt) {
    Zbws zbws = this.Zq.get();
    TableColumn tableColumn = ZZ(zbws, zbws.getColumnModel(), paramInt);
    if (tableColumn != null) {
      tableColumn.setHeaderValue(paramZs3l.Zc());
      Zmfp zmfp = (Zmfp)Zrg.Zo(paramZs3l.Zu()).Zf(tableColumn.getIdentifier()).ZU(paramZs3l.Zc()).ZW();
      this.Zm.Zh(paramInt, zmfp);
      Zm2.ZB(Zec3.CUSTOM_COLUMN_EDITED, zbws.getName());
    } 
  }
  
  private static TableColumn ZZ(Zbws paramZbws, TableColumnModel paramTableColumnModel, int paramInt) {
    if (paramTableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)paramTableColumnModel;
      return zrmn.ZU(paramInt);
    } 
    int i = paramZbws.convertColumnIndexToView(paramInt);
    return (i >= 0) ? paramTableColumnModel.getColumn(i) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeoj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */