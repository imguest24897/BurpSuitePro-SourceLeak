package burp;

import javax.swing.table.TableCellRenderer;

class Zbg0 extends Zbg_ implements TableCellRenderer {
  private Zbg0() {
    super(5, Zt00.BLOB_TABLE_FONT);
  }
  
  protected void Zq(Object paramObject) {
    if (paramObject instanceof Zbza) {
      Zbza zbza = (Zbza)paramObject;
      ZC(0, zbza.ZW(Zt0r.A1));
      ZC(1, zbza.ZW(Zt0r.A2));
      ZC(2, zbza.ZW(Zt0r.A3));
      ZC(3, zbza.ZW(Zt0r.A4));
      ZC(4, zbza.ZW(Zt0r.A5));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbg0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */