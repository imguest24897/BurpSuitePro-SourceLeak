package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Zltk {
  private final List<Zzqt> Ze = new CopyOnWriteArrayList<>();
  
  private volatile boolean Zi = true;
  
  void Zs() {
    this.Zi = true;
  }
  
  void ZQ() {
    this.Zi = false;
  }
  
  void ZO(Zzqt paramZzqt) {
    this.Ze.add(paramZzqt);
  }
  
  void Zk(Zble paramZble) {
    if (this.Zi)
      this.Ze.forEach(paramZble::lambda$notifyNodeSelected$0); 
  }
  
  private static void lambda$notifyNodeSelected$0(Zble paramZble, Zzqt paramZzqt) {
    paramZzqt.Zu(paramZble);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */