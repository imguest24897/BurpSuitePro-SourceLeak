package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.browser.Ztk;

public class Zbvx extends Zbv6 implements Zsq4 {
  private Zx0w Zy;
  
  private Zbv0 Zq;
  
  public Zbvx(Zlfb paramZlfb, Ztj1 paramZtj1) {
    super(paramZlfb, paramZtj1);
  }
  
  protected List<Component> Zc(Ztj1 paramZtj1) {
    ArrayList<Zx0w> arrayList = new ArrayList();
    this.Zy = ZO();
    arrayList.add(this.Zy);
    this.Zq = new Zbv0();
    int[] arrayOfInt = Ztk.Zn();
    arrayList.add(this.Zq);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return (List)arrayList;
  }
  
  public void ZW(String paramString) {
    this.Zy.setText(Zg(paramString));
  }
  
  public void Zf(String paramString) {
    this.Zq.Zc(paramString);
  }
  
  public void ZG(int paramInt) {
    this.Zq.Zb(paramInt);
  }
  
  public void Zj() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */