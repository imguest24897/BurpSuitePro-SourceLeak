package burp;

import javax.swing.table.TableCellRenderer;

class Zbg4 extends Zbg_ implements TableCellRenderer {
  private Zbg4() {
    super(3, Zt00.BLOB_TABLE_FONT);
    setAlignmentX(0.0F);
  }
  
  protected void Zq(Object paramObject) {
    if (paramObject instanceof Zbza) {
      Zbza zbza = (Zbza)paramObject;
      ZC(0, zbza.ZW(Zz86.S1));
      ZC(1, zbza.ZW(Zt0r.S2));
      ZC(2, zbza.ZW(Zt0r.S3));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */