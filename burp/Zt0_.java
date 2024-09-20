package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.portswigger.Zkb;

public class Zt0_<T> extends Ztn0 {
  protected List<T> Zl;
  
  public Zt0_() {
    this(new ArrayList<>());
  }
  
  public Zt0_(List<T> paramList) {
    this.Zl = paramList;
    this.Zf = new String[] { "" };
    this.ZV = new byte[] { 0 };
    this.Zc = new int[] { 40 };
    this.Zx = true;
    int[] arrayOfInt = Zsw8.ZK();
    this.Zu = false;
    this.ZZ = 4;
    if (Zbqc.Zwu() == null)
      Zsw8.Zi(new int[2]); 
  }
  
  public int getRowCount() {
    return this.Zl.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    T t = this.Zl.get(paramInt1);
    return (t instanceof byte[]) ? Zkb.ZG((byte[])t) : ((t instanceof String) ? (Object)t : t.toString());
  }
  
  public List<T> ZL() {
    return this.Zl;
  }
  
  public void Zr(T paramT) {
    this.Zl.add(paramT);
    int i = this.Zl.size() - 1;
    fireTableRowsInserted(i, i);
  }
  
  public void ZM(List<T> paramList) {
    this.Zl = paramList;
    fireTableDataChanged();
  }
  
  public void Za(Collection<T> paramCollection) {
    this.Zl.addAll(paramCollection);
    fireTableRowsInserted(this.Zl.size() - paramCollection.size(), this.Zl.size() - 1);
  }
  
  public void Zn(int paramInt) {
    T t = this.Zl.remove(paramInt);
    int i = paramInt + 1;
    this.Zl.add(i, t);
    fireTableRowsUpdated(paramInt, i);
  }
  
  public void ZS() {
    this.Zl.clear();
    fireTableDataChanged();
  }
  
  public void Zq(int paramInt) {
    this.Zl.remove(paramInt);
    fireTableRowsDeleted(paramInt, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */