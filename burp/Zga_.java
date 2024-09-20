package burp;

import java.util.ArrayList;

public class Zga_ extends Zgaj {
  protected Zga_(Zku8 paramZku8, Zkl6 paramZkl6) throws Ztr8 {
    super(paramZku8, paramZkl6);
  }
  
  public Zlbg Zw(Zlbg paramZlbg) {
    return paramZlbg;
  }
  
  public Zlbg ZZ(Zlbg paramZlbg) {
    if (!this.Zl.ZIp())
      return paramZlbg; 
    Zz1p zz1p = Zekx.Zu(null, paramZlbg.ZY(), (byte)3, this.Zh.ZB());
    ArrayList<String> arrayList = new ArrayList<>(zz1p.ZG());
    if (arrayList.isEmpty())
      return paramZlbg; 
    this.Zj.reset(arrayList.get(0));
    if (this.Zj.find()) {
      arrayList.remove(0);
      arrayList.add(0, this.Zj.replaceAll(this.ZL));
      paramZlbg.ZE(Zljl.Zw(arrayList, paramZlbg.ZY(), zz1p.ZP));
    } 
    return paramZlbg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zga_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */