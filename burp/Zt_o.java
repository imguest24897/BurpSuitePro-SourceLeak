package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt_o extends Ztn0 {
  private final Ze5r<Zlil, Zmk5> ZC;
  
  public Zt_o(Ze5r<Zlil, Zmk5> paramZe5r) {
    this.ZC = paramZe5r;
    this.Zf = new String[] { "" };
    this.ZV = new byte[] { 0 };
    this.Zc = new int[] { 60 };
    this.Zu = false;
    this.Zx = true;
    this.ZZ = 4;
  }
  
  public int getRowCount() {
    try {
      return this.ZC.ZG();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return 0;
    } 
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      Zlil zlil = this.ZC.ZV(paramInt1);
      switch (paramInt2) {
        case 0:
          return zlil.Zs();
      } 
      return "";
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt_o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */