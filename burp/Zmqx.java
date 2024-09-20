package burp;

import java.text.NumberFormat;

public class Zmqx extends Zmqz {
  NumberFormat Zu;
  
  public void Zt(Object paramObject) {
    if (this.Zu == null)
      this.Zu = NumberFormat.getInstance(); 
    setText((paramObject == null) ? "" : this.Zu.format(paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */