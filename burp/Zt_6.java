package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zt_6 extends Ztn0 {
  private List<Zgp3> ZU = new ArrayList<>();
  
  public int getRowCount() {
    return this.ZU.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      return (paramInt1 >= this.ZU.size()) ? "" : ((Zgp3)this.ZU.get(paramInt1)).Zv();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  Zgp3 ZL(int paramInt) {
    try {
      try {
        if (paramInt < 0 || paramInt >= this.ZU.size())
          return null; 
      } catch (Exception exception) {
        throw a(null);
      } 
      return this.ZU.get(paramInt);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  void ZK(List<Zgp3> paramList) {
    this.ZU = paramList;
    fireTableDataChanged();
  }
  
  void Zy() {
    fireTableDataChanged();
  }
  
  void ZO() {
    this.ZU = new ArrayList<>();
    fireTableDataChanged();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt_6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */