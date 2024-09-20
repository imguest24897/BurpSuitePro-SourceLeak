package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Zt7h extends Zt7q {
  final Set<String> ZX = new HashSet<>();
  
  final Zg6a ZQ;
  
  Zt7h(Zg6a paramZg6a) {}
  
  public void Zg(Zz_1 paramZz_1) {
    int[] arrayOfInt = Zgxf.ZV();
    Zstu zstu = ((Zxya)paramZz_1.Z_()).Zm();
    if (zstu == null)
      return; 
    Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.ZQ.ZJ);
    List<Zsq8> list = Zm46.Zl(((Zxya)paramZz_1.Z_()).Zq(), zs68, zstu, null, this.ZQ.ZS, this.ZQ.ZJ, this.ZQ.ZL.ZU0());
    for (Zsq8 zsq8 : list) {
      this.ZX.add(zsq8.ZZ.toString());
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public void ZL() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<String> iterator = this.ZX.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      String str = iterator.next();
      stringBuilder.append(str);
      stringBuilder.append(Zlb0.Zp);
      if (arrayOfInt != null)
        break; 
    } 
    this.ZQ.Zu.ZR(stringBuilder.toString());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */