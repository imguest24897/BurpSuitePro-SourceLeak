package burp;

import javax.swing.table.TableCellRenderer;

class Zbgp extends Zbg_ implements TableCellRenderer {
  private Zbgp() {
    super(2, Zt00.BLOB_TABLE_FONT);
  }
  
  protected void Zq(Object paramObject) {
    if (paramObject instanceof Zbza) {
      Zbza zbza = (Zbza)paramObject;
      ZC(0, zbza.ZW(Zz86.P1));
      ZC(1, zbza.ZW(Zz86.P2));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */