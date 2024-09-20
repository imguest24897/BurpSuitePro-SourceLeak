package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsog implements Zt3k {
  private final boolean Zx;
  
  private final boolean ZO;
  
  private final boolean ZD;
  
  private final boolean ZC;
  
  private final boolean Ze;
  
  private final boolean Zu;
  
  private final boolean Zm;
  
  private final boolean Z_;
  
  public Zsog(Zg9c paramZg9c) {
    this.Zx = !paramZg9c.Z_e();
    this.ZO = !paramZg9c.Z_q();
    this.ZD = !paramZg9c.Z_r();
    this.ZC = !paramZg9c.Z_Y();
    this.Ze = !paramZg9c.Z_w();
    this.Zu = !paramZg9c.Z_S();
    this.Zm = !paramZg9c.Z_J();
    this.Z_ = !paramZg9c.Z_t();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public boolean Zo(Zto7 paramZto7) {
    short s = paramZto7.ZEb();
    switch (s) {
      case 256:
        return this.Zx;
      case 259:
      case 260:
        return this.ZO;
      case 262:
        return this.ZD;
      case 258:
        return this.ZC;
      case 257:
      case 261:
      case 263:
        return this.Ze;
      case 512:
      case 513:
      case 514:
      case 515:
      case 516:
      case 517:
      case 518:
        return this.Zu;
      case 1026:
      case 1280:
        return this.Zm;
      case 1:
      case 768:
      case 769:
      case 1025:
      case 1536:
      case 1537:
        return this.Z_;
      case 0:
      case 2:
        return false;
    } 
    Zuh.Zv(false, Zqf.Zk, s);
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsog.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */