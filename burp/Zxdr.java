package burp;

import java.awt.Color;

public class Zxdr {
  public static Zra2 ZY(Zsmr paramZsmr, boolean paramBoolean) {
    Zmtd zmtd = Zmtd.ZC(paramZsmr.ZaP());
    if (zmtd == Zmtd.NONE)
      return new Zra2(zmtd.Zq(), null); 
    Color color = zmtd.Zt();
    if (paramBoolean)
      color = new Color(color.getRGB() - 2105376); 
    return new Zra2(zmtd.Zq(), color);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxdr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */