package burp;

import java.util.List;
import net.portswigger.Zdo;
import net.portswigger.Zkb;

public class Zbs5 {
  private final String[] ZM;
  
  public Zbs5(String[] paramArrayOfString) {
    this.ZM = paramArrayOfString;
  }
  
  public Zeqj ZN() {
    return Zeqj.Zw(this::lambda$withAnyKey$1);
  }
  
  private Zx69 lambda$withAnyKey$1(Zzvx paramZzvx, String[] paramArrayOfString) {
    String str1 = Zb1d.Zj(paramArrayOfString, this.ZM);
    Zzbn zzbn = paramZzvx.Zk(str1);
    Zb6q zb6q = zzbn.Zb();
    if (zb6q.Zm().isEmpty())
      return Zmrn.ZL; 
    Zstu zstu = zb6q.Za();
    String str2 = zb6q.Zm().get(0);
    int i = Zlt_.Zr(zstu, Zkb.Zy(str2));
    return Zx69.Zl(zzbn, zstu.Zb(i, zb6q.Zs() - 4), i);
  }
  
  private Zx69 lambda$withKey$0(String paramString, Zzvx paramZzvx, String[] paramArrayOfString) {
    String str = Zb1d.Zj(paramArrayOfString, this.ZM);
    Zzbn zzbn = paramZzvx.Zk(str);
    int[] arrayOfInt = Zmgt.ZK();
    Zb6q zb6q = zzbn.Zb();
    List<String> list = zb6q.Zm();
    for (String str1 : list) {
      String[] arrayOfString = str1.split(":");
      if (arrayOfString.length > 1 && arrayOfString[0].strip().equals(paramString)) {
        int i = Zlt_.Zr(zb6q.Za(), Zkb.Zy(str1));
        int j = Zlt_.Zj(zb6q.Za(), Zdo.Zn, i, zb6q.Zs());
        Zstu zstu = zb6q.Za().Zb(i, j);
        return Zx69.Zl(zzbn, zstu, i);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return Zmrn.ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */