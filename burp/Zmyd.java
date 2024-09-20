package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;

class Zmyd {
  private final List<Zbin> ZZ;
  
  private boolean Ze;
  
  Zmyd(Zz1p paramZz1p) {
    String str1 = paramZz1p.ZG().isEmpty() ? "" : paramZz1p.ZG().get(0);
    this.ZZ = new ArrayList<>();
    String str2 = (paramZz1p.Zb == null) ? "" : paramZz1p.Zb;
    this.ZZ.add(Zbin.Zb(str2, 0));
    this.Ze = (str1.length() > str2.length());
    String str3 = (paramZz1p.Zo == null) ? null : Zkb.ZG(paramZz1p.Zo.Zd4());
    str3 = (str3 == null) ? "" : str3;
    int i = str3.isEmpty() ? Math.min(str2.length() + 1, str1.length()) : str1.indexOf(str3);
    this.ZZ.add(Zbin.ZN(str3, i));
  }
  
  List<Zbin> Zw() {
    return this.ZZ;
  }
  
  Zxeq Zc(int paramInt, String paramString) {
    Zbin zbin = this.ZZ.get(paramInt);
    if (zbin.Zw != -1) {
      String str = paramString;
      Zbin zbin1 = zbin.Zq(paramString);
      if (paramInt == 1 && !this.Ze) {
        zbin1 = zbin1.Za(1);
        str = " " + paramString;
        this.Ze = true;
      } 
      this.ZZ.set(paramInt, zbin1);
      Zbin zbin2 = zbin.Zq(str);
      Zm(paramInt + 1, zbin2.ZX - zbin.ZX);
      return new Zrif(zbin.Zw, zbin.ZX, Zkb.Zy(zbin2.toString()));
    } 
    return Zxeq.Zq;
  }
  
  String ZC() {
    return ((Zbin)this.ZZ.get(0)).Zf;
  }
  
  private void Zm(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zb6u.ZI();
    if (paramInt2 == 0)
      return; 
    int i = paramInt1;
    while (i < this.ZZ.size()) {
      Zbin zbin = this.ZZ.get(i);
      if (zbin.Zw != -1)
        this.ZZ.set(i, zbin.Za(paramInt2)); 
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */