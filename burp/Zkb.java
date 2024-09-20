package burp;

import java.util.List;
import net.portswigger.Zsy;

public class Zkb {
  private final Ze3n ZW;
  
  private final Zsy ZL;
  
  private final Zbnt ZH;
  
  private final Zz4_ Zl;
  
  private final int Zb;
  
  public Zkb(Ze3n paramZe3n, Zsy paramZsy, Zbnt paramZbnt, Zz4_ paramZz4_, int paramInt) {
    this.ZW = paramZe3n;
    this.ZL = paramZsy;
    this.ZH = paramZbnt;
    this.Zl = paramZz4_;
    this.Zb = paramInt;
  }
  
  public void Zf() {
    String str1 = this.ZL.Zi().ZG().ZK(10);
    String str2 = this.ZL.Zi().ZG().ZK(10);
    Zbqc[] arrayOfZbqc = Zk9x.Za();
    Zt9 zt9 = (new Zsqj(this.ZW.Za(), this.ZH, str1, this.ZW.Za().ZJ1())).ZF(str2).ZX();
    Zxgd zxgd = zt9.ZU().Zz().ZV();
    Zsex zsex = new Zsex(this.ZW.Zr((new Zlv5()).Za(zxgd).ZD(false)));
    Zstu zstu = zsex.Zl();
    if (zstu.Zis().contains(str2)) {
      byte b = 0;
      while (b < this.Zb) {
        this.ZW.Zr((new Zlv5()).Za(zxgd).ZD(false));
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      Zt9 zt91 = (new Zsqj(this.ZW.Za(), this.ZH, str1, this.ZW.Za().ZJ1())).ZX();
      Zxgd zxgd1 = zt91.ZU().Zz().ZV();
      Zsex zsex1 = new Zsex(this.ZW.Zr((new Zlv5()).Za(zxgd1).ZD(false)));
      Zstu zstu1 = zsex1.Zl();
      if (zstu1.Zis().contains(str2)) {
        List<Zl1r> list1 = Zl8v.ZJ(str2, zstu.ZiD(), false);
        Zefx zefx1 = zsex.ZL();
        List<Zl1r> list2 = Zex2.ZT(zefx1, str2::lambda$doCheck$0);
        Zvow zvow1 = this.ZW.ZI().ZC(zefx1).Zu(zstu).Z_(list1).ZK(list2);
        List<Zl1r> list3 = Zl8v.ZJ(str2, zstu1.ZiD(), false);
        Zefx zefx2 = zsex1.ZL();
        List<Zl1r> list4 = Zex2.ZT(zefx2, str2::lambda$doCheck$0);
        Zvow zvow2 = this.ZW.ZI().ZC(zefx2).Zu(zstu1).Z_(list3).ZK(list4);
        this.Zl.Zz(Zmtk.ZZ(this.ZW.Za(), this.ZW.ZN(), null, zvow1, zvow2, str2, (byte)2, true));
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zk9x.ZQ(new Zbqc[2]); 
  }
  
  private static List lambda$doCheck$0(String paramString, Zr6q paramZr6q) {
    return Zl8v.ZJ(paramString, paramZr6q.ZD(), false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */