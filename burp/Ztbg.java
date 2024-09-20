package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztbg {
  private final List<Zrdb> ZE = new ArrayList<>();
  
  private final List<Zrdb> Zh = new ArrayList<>();
  
  private final List<Zrdb> ZQ = new ArrayList<>();
  
  private final List<Zrdb> Ze = new ArrayList<>();
  
  private final List<Zrdb> ZM = new ArrayList<>();
  
  private final List<Zrdb> ZO = new ArrayList<>();
  
  private final Zz1h Za;
  
  public Ztbg(Zz1h paramZz1h) {
    this.Za = paramZz1h;
  }
  
  public void Zv(Ztbg paramZtbg) {
    this.ZE.addAll(this.Za.Zq(paramZtbg.ZE));
    this.Zh.addAll(paramZtbg.Zh);
    this.ZQ.addAll(paramZtbg.ZQ);
    this.Ze.addAll(paramZtbg.Ze);
    this.ZO.addAll(paramZtbg.ZO);
  }
  
  public void Zp(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.ZE.addAll(this.Za.Zq(Collections.singletonList(paramZrdb)));
  }
  
  void ZY(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.Zh.add(paramZrdb);
  }
  
  void ZW(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.Ze.add(paramZrdb);
  }
  
  void ZL(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.ZQ.add(paramZrdb);
  }
  
  void ZU(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.ZM.add(paramZrdb);
  }
  
  void Zs(Zrdb paramZrdb) {
    Zuh.Zb((paramZrdb != null), Zqf.Zv);
    this.ZO.add(paramZrdb);
  }
  
  public List<Zrdb> Zq() {
    return Collections.unmodifiableList(this.ZE);
  }
  
  public List<Zrdb> Zw() {
    return Collections.unmodifiableList(this.Zh);
  }
  
  public List<Zrdb> ZB() {
    return Collections.unmodifiableList(this.ZQ);
  }
  
  public List<Zrdb> Z_() {
    return Collections.unmodifiableList(this.Ze);
  }
  
  public List<Zrdb> Zz() {
    return Collections.unmodifiableList(this.ZM);
  }
  
  public List<Zrdb> ZE() {
    return Collections.unmodifiableList(this.ZO);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */