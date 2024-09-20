package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zbju {
  private final boolean Zu;
  
  private final Zbwk Zs;
  
  private final List<Zg8y> Zy = new ArrayList<>();
  
  public Zbju(boolean paramBoolean, Zbwk paramZbwk) {
    this.Zu = paramBoolean;
    this.Zs = paramZbwk;
  }
  
  public Zmkk ZM(Zg8y paramZg8y) {
    Zmkk zmkk = this.Zs.ZO(paramZg8y);
    if (!zmkk.Ze())
      this.Zy.add(paramZg8y); 
    return zmkk;
  }
  
  public List<Zg8y> ZT() {
    return this.Zy;
  }
  
  public boolean Zl(Zg8y paramZg8y) {
    Objects.requireNonNull(paramZg8y);
    return (this.Zu || this.Zy.stream().noneMatch(paramZg8y::Zp));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbju.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */