package burp;

import java.awt.Rectangle;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbwq extends Zbws {
  final Zl0r Zk;
  
  private Zbwq(Zl0r paramZl0r) {}
  
  public Rectangle getCellRect(int paramInt1, int paramInt2, boolean paramBoolean) {
    Rectangle rectangle = super.getCellRect(paramInt1, paramInt2, paramBoolean);
    try {
      int i = ((Zgp3)this.Zk.ZB.ZG.get(paramInt1)).ZV() * 10;
      rectangle.x += i;
      rectangle.width -= i;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return rectangle;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */