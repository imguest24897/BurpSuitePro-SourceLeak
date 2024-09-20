package burp;

import java.util.Map;

class Zshp implements Runnable {
  private final Map<Long, Zrot> Zu;
  
  private Zshp(Map<Long, Zrot> paramMap) {
    this.Zu = paramMap;
  }
  
  public void run() {
    this.Zu.values().forEach(Zrot::Zj);
    this.Zu.values().stream().filter(Zshp::lambda$run$0).forEach(Zrot::ZY);
  }
  
  private static boolean lambda$run$0(Zrot paramZrot) {
    return !paramZrot.ZE();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */