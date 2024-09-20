package burp;

import javax.swing.table.TableColumn;

public interface Zs97<E> extends Zg7<E> {
  default TableColumn ZK(int paramInt) {
    Zr6p<E> zr6p = ZZ(paramInt);
    if (zr6p != null) {
      TableColumn tableColumn = zr6p.ZP(paramInt);
      tableColumn.setIdentifier(ZV(paramInt));
      tableColumn.setHeaderRenderer(Zt(paramInt));
      tableColumn.setCellRenderer(ZC(paramInt));
      tableColumn.setCellEditor(Zz(paramInt));
      tableColumn.setMinWidth(ZM(paramInt));
      tableColumn.setMaxWidth(ZH(paramInt));
      tableColumn.setPreferredWidth(ZJ(paramInt));
      tableColumn.setWidth(ZS(paramInt));
      tableColumn.setResizable(Ze(paramInt));
      return tableColumn;
    } 
    return super.ZK(paramInt);
  }
  
  Zr6p<E> ZZ(int paramInt);
  
  void ZR(Zmfp paramZmfp);
  
  void ZI(int paramInt);
  
  void Zh(int paramInt, Zmfp paramZmfp);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs97.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */