package burp;

import java.util.Iterator;
import java.util.List;

public class Ztg1 {
  private final Zxkh<Zl5n> ZT;
  
  private final Ze3n Zp;
  
  private final Zz1m<Zt1o> Zh;
  
  private final Zepf ZQ;
  
  public Ztg1(Zxkh<Zl5n> paramZxkh, Ze3n paramZe3n, Zz1m<Zt1o> paramZz1m) {
    this.ZT = paramZxkh;
    this.Zp = paramZe3n;
    this.Zh = paramZz1m;
    this.ZQ = new Zepf();
  }
  
  public Ztk8 ZO(List<Zrd9> paramList) {
    Ztk8 ztk8 = Ztk8.ZD();
    Iterator<Zrd9> iterator = paramList.iterator();
    boolean bool = Zrd9.ZD();
    while (iterator.hasNext()) {
      Zrd9 zrd9 = iterator.next();
      if (this.ZQ.ZJ(zrd9)) {
        Zl5n zl5n = this.ZT.ZI(zrd9);
        Zzl5.Zp(this.Zh, this.Zp.Zm(), zrd9);
        ztk8 = ztk8.Zh(zl5n.Z_());
        this.ZQ.Zo(zrd9);
      } 
      if (bool)
        break; 
    } 
    return ztk8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztg1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */