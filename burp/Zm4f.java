package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zm4f extends Zm48 {
  public Zm4f(Zmua<?> paramZmua) {
    super(paramZmua);
  }
  
  public void toggleSortOrder(int paramInt) {
    try {
      super.toggleSortOrder(paramInt);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      Zah.Zl(arrayIndexOutOfBoundsException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */