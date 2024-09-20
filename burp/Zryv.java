package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zdo;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zryv {
  private final String[] Z_;
  
  public Zryv(String[] paramArrayOfString) {
    this.Z_ = paramArrayOfString;
  }
  
  public Zeqj ZX() {
    return Zeqj.Zw(this::lambda$withAnyKey$1);
  }
  
  private Zx69 lambda$withAnyKey$1(Zzvx paramZzvx, String[] paramArrayOfString) {
    String str1 = Zb1d.Zj(paramArrayOfString, this.Z_);
    Zefx zefx = Zb1d.ZH(str1, paramZzvx);
    if (zefx == null || zefx.ZG().isEmpty())
      return Zmrn.ZL; 
    String str2 = zefx.ZG().get(0);
    int i = Zli.ZR(zefx.ZD(), Zkb.Zy(str2));
    int j = zefx.ZR() - 4;
    return Zx69.Zp(Zyf.Zy(zefx.ZD()).Zb(i, j));
  }
  
  private Zx69 lambda$withKey$0(String paramString, Zzvx paramZzvx, String[] paramArrayOfString) {
    String str = Zb1d.Zj(paramArrayOfString, this.Z_);
    Zefx zefx = Zb1d.ZH(str, paramZzvx);
    List<String> list = zefx.ZG();
    Iterator<String> iterator = list.iterator();
    int[] arrayOfInt = Zmgt.ZK();
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      String[] arrayOfString = str1.split(":");
      if (arrayOfString.length > 1 && arrayOfString[0].strip().equals(paramString)) {
        int i = Zli.ZR(zefx.ZD(), Zkb.Zy(str1));
        int j = Zli.Zw(zefx.ZD(), Zdo.Zn, i, zefx.ZR());
        Zstu zstu = Zyf.Zy(zefx.ZD()).Zb(i, j);
        return Zx69.Zp(zstu);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return Zmrn.ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zryv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */