package burp;

import java.util.ArrayList;
import net.portswigger.Zsy;

public class Zso9 {
  private final Ze3n ZD;
  
  private final Zmhe Za;
  
  private final Zxs7 Zz;
  
  private final Zbnt ZR;
  
  private final Zz4_ Zk;
  
  private final int ZA;
  
  private final Zsy Ze;
  
  Zso9(Ze3n paramZe3n, Zmhe paramZmhe, Zxs7 paramZxs7, Zbnt paramZbnt, Zz4_ paramZz4_, int paramInt, Zsy paramZsy) {
    this.ZD = paramZe3n;
    this.Za = paramZmhe;
    this.Zz = paramZxs7;
    this.ZR = paramZbnt;
    this.Zk = paramZz4_;
    this.ZA = paramInt;
    this.Ze = paramZsy;
  }
  
  void ZM() {
    String str1 = this.Ze.Zi().ZG().ZK(10);
    String str2 = this.Ze.Zi().ZG().ZK(10);
    Zt9 zt9 = (new Zsqj(this.ZD.Za(), this.ZR, str1, this.ZD.Za().ZJ1())).ZX();
    Zxgd zxgd = zt9.ZU();
    String[] arrayOfString = Ztaa.Zg();
    Zrrb zrrb = new Zrrb(str2.getBytes(), (byte)0);
    Zlvf zlvf = this.Za.ZK(Zri7.ZJ(zrrb), Zlp5.Zc().Zw(zxgd).Zd(false));
    Zzud zzud = zlvf.ZM();
    Zstu zstu = zzud.Zl();
    if (zstu.Zis().contains(str2)) {
      byte b = 0;
      while (b < this.ZA) {
        this.Za.ZK(Zri7.ZJ(zrrb), Zlp5.Zc().Zw(zxgd).Zd(false));
        b++;
        if (arrayOfString != null)
          break; 
      } 
      Zlvf zlvf1 = this.Za.ZZ(Zlp5.Zc().Zw(zxgd).Zd(false));
      Zzud zzud1 = zlvf1.ZM();
      Zstu zstu1 = zzud1.Zl();
      if (zstu1.Zis().contains(str2)) {
        Zmzk zmzk = this.ZD.Za();
        ArrayList<Zl1r> arrayList1 = new ArrayList();
        Zl8v.ZB(str2, zstu.ZiD(), arrayList1, false);
        ArrayList<Zl1r> arrayList2 = new ArrayList();
        Zl8v.ZB(str2, zlvf.ZY().ZE(), arrayList2, false);
        Zvow zvow1 = this.ZD.ZI().Zp(zlvf.ZY().ZE()).Zu(zstu).Z_(arrayList1).ZK(arrayList2);
        ArrayList<Zl1r> arrayList3 = new ArrayList();
        Zl8v.ZB(str2, zstu1.ZiD(), arrayList3, false);
        ArrayList<Zl1r> arrayList4 = new ArrayList();
        Zl8v.ZB(str2, zlvf1.ZY().ZE(), arrayList4, false);
        Zvow zvow2 = this.ZD.ZI().Zp(zlvf1.ZY().ZE()).Zu(zstu1).Z_(arrayList3).ZK(arrayList4);
        this.Zk.Zz(Zmtk.ZZ(zmzk, this.ZD.ZN(), this.Zz, zvow1, zvow2, str2, (byte)2, false));
      } 
    } 
    if (Zbqc.Zwu() == null)
      Ztaa.ZQ(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */