package burp;

import java.util.HashMap;
import java.util.Map;

class Zxcz {
  private final Map<Zlr3, Zble> ZT = new HashMap<>();
  
  private final Map<Zexz, Zble> Zg = new HashMap<>();
  
  private final Map<Zbqz, Zble> ZU = new HashMap<>();
  
  void Zf(Zble paramZble) {
    Zmnm zmnm = paramZble.Zg();
    Zrp0 zrp0 = zmnm.ZOe();
    Zeu9 zeu9 = zmnm.ZOD();
    int i = Zble.ZI();
    Zszw zszw = zmnm.ZOK();
    this.ZT.putIfAbsent(new Zlr3(zrp0, zeu9, zszw), paramZble);
    this.Zg.putIfAbsent(new Zexz(zeu9, zszw), paramZble);
    this.ZU.putIfAbsent(new Zbqz(zeu9), paramZble);
    if (Zbqc.Zwu() == null)
      Zble.ZZ(++i); 
  }
  
  public Zble Za(Zrp0 paramZrp0, Zeu9 paramZeu9, Zszw paramZszw) {
    return this.ZT.get(new Zlr3(paramZrp0, paramZeu9, paramZszw));
  }
  
  public Zble Zw(Zeu9 paramZeu9, Zszw paramZszw) {
    return this.Zg.get(new Zexz(paramZeu9, paramZszw));
  }
  
  public Zble Zy(Zeu9 paramZeu9) {
    return this.ZU.get(new Zbqz(paramZeu9));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */