package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Zbv_ extends Zbv6 implements Zsq4 {
  private final Zsjd Za;
  
  private Zx0w ZO;
  
  private Zbvo Zi;
  
  public Zbv_(Zlfb paramZlfb, Zsjd paramZsjd, Ztj1 paramZtj1) {
    super(paramZlfb, paramZtj1);
    this.Za = paramZsjd;
  }
  
  protected List<Component> Zc(Ztj1 paramZtj1) {
    ArrayList<Zx0w> arrayList = new ArrayList();
    this.ZO = ZO();
    arrayList.add(this.ZO);
    this.Zi = new Zbvo(((Ze9i)paramZtj1.ZG()).ZPp(), this::ZS);
    arrayList.add(this.Zi);
    int[] arrayOfInt = Ze7u.Zk();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (List)arrayList;
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zi.Zc(paramBoolean);
  }
  
  public void Zy(String paramString) {
    this.ZO.setText(Zg(paramString));
  }
  
  private void ZS() {
    this.Za.ZD();
  }
  
  public void Zj() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbv_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */