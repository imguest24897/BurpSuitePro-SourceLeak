package burp;

import java.util.HashMap;
import java.util.Map;

public class Ztn8 {
  private final Map<Zbza, Zl03> Zu = new HashMap<>();
  
  void Zc(Zbza paramZbza, Zl03 paramZl03) {
    this.Zu.put(paramZbza, paramZl03);
  }
  
  Zl03 Za(Zbza paramZbza) {
    return this.Zu.get(paramZbza);
  }
  
  void ZF(Zbza paramZbza) {
    this.Zu.remove(paramZbza);
  }
  
  public void Zp() {
    this.Zu.values().forEach(Ztn8::lambda$clearCache$0);
    this.Zu.clear();
  }
  
  private static void lambda$clearCache$0(Zl03 paramZl03) {
    paramZl03.setVisible(false);
    paramZl03.dispose();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztn8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */