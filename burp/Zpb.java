package burp;

import java.util.Optional;

public class Zpb extends Zni implements Zzd6 {
  @Zzvo(1)
  private boolean Zm = false;
  
  private Zmyb Zu = null;
  
  public boolean ZRB() {
    return this.Zm;
  }
  
  public void ZRI() {
    ZA(null);
  }
  
  public void Zv(Zmyb paramZmyb) {
    ZA(paramZmyb);
  }
  
  private void ZA(Zmyb paramZmyb) {
    this.Zm = true;
    this.Zu = paramZmyb;
  }
  
  @Zzvo(2)
  private int ZpT() {
    return (this.Zu == null) ? 0 : this.Zu.ZJ();
  }
  
  public Optional<Zmyb> ZRD() {
    return Optional.ofNullable(this.Zu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */