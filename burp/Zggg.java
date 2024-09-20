package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.browser.Zc5;
import net.portswigger.browser.Zcy;
import net.portswigger.browser.Zdr;
import net.portswigger.browser.Zer;
import net.portswigger.browser.Zj0;
import net.portswigger.browser.Zj5;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.Zjv;
import net.portswigger.browser.Zjx;
import net.portswigger.browser.Zu;

public class Zggg {
  public final Zdr Zs = (new Zjv()).ZG(Zj5.Z_(Zjb.Zr())).Zl();
  
  public final Zjx ZE;
  
  private final List<Zu> ZM = new ArrayList<>();
  
  private final List<Zer> ZW = new ArrayList<>();
  
  private boolean Zo;
  
  private int Zt;
  
  public Zggg(String paramString) {
    boolean bool = Zg96.Zjw();
    this.ZE = (new Zj0()).Za(paramString).ZN();
    Zs();
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void Zs() {
    this.Zt++;
    this.ZW.clear();
    this.ZW.add(this.Zs);
    this.ZW.add(this.ZE);
  }
  
  public void Zm(Zu paramZu, List<? extends Zer> paramList) {
    this.ZM.add(paramZu);
    this.ZW.addAll(paramList);
  }
  
  public void ZM(Zer paramZer) {
    this.ZW.add(paramZer);
  }
  
  public int ZG() {
    return this.Zt;
  }
  
  public int Zw() {
    return this.ZM.size();
  }
  
  public Zc5 ZA() throws Zcy {
    return Zc5.Zu(this.ZW);
  }
  
  public List<Zu> ZI() {
    return this.ZM;
  }
  
  public boolean ZR() {
    return this.Zo;
  }
  
  public void ZX() {
    this.Zo = true;
  }
  
  public void ZC(Zu paramZu) {
    this.ZM.add(paramZu);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */