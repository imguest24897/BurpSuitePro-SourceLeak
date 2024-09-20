package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztnv extends Ztn0 {
  private final List<Zei9> Zg = new ArrayList<>();
  
  Ztnv() {
    int[] arrayOfInt = Zk53.Zl();
    this.Zu = false;
    this.Zx = true;
    this.ZZ = 4;
    if (Zbqc.Zwu() == null)
      Zk53.ZQ(new int[5]); 
  }
  
  void Zb(Zk53 paramZk53, String paramString) {
    this.Zg.add(new Zei9(paramZk53, paramString));
    int i = this.Zg.size();
    fireTableRowsInserted(i, i);
  }
  
  Zei9 ZY(int paramInt) {
    return this.Zg.get(paramInt);
  }
  
  public int getRowCount() {
    return this.Zg.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zei9 zei9 = ZY(paramInt1);
    switch (paramInt2) {
      case 0:
        return zei9.Zz;
      case 1:
        return Zg9j.ZL(zei9.Zd);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt2);
    return "";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */