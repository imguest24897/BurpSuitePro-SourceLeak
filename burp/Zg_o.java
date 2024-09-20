package burp;

import net.portswigger.browser.Zu;

public class Zg_o {
  private final Zma7 Zr;
  
  private final Ztps Zv;
  
  public Zg_o(Zk9l paramZk9l) {
    this.Zr = new Zma7(new Zbj7(), paramZk9l.Zr1(), paramZk9l.ZrY());
    Zbqc[] arrayOfZbqc = Zm9o.ZX();
    this.Zv = new Ztps(new Ztvf(), paramZk9l.Zr1(), paramZk9l.ZrY());
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Ze74<Zgxj, Zu> Zk(Zgxj paramZgxj) {
    return new Ze74<>(Zbff.ZV, paramZgxj, this.Zr, this.Zv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */