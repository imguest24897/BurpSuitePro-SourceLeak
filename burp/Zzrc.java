package burp;

import javax.swing.RowSorter;
import javax.swing.SortOrder;

public interface Zzrc extends Zgpi<Zzrc> {
  public static final Zk02 Zj = new Zk02();
  
  int ZeK();
  
  SortOrder Ze3();
  
  default RowSorter.SortKey Zen() {
    return new RowSorter.SortKey(ZeK(), Ze3());
  }
  
  default Zeu4<? extends Zzrc> ZF() {
    return Zj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */