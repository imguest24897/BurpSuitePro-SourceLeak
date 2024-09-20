package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zsy;

public class Zk9x {
  private final Ze3n ZU;
  
  private final Zsy ZT;
  
  private final Zbnt ZG;
  
  private final Zz4_ Za;
  
  private final int ZC;
  
  private final int ZW;
  
  private static Zbqc[] ZX;
  
  public Zk9x(Ze3n paramZe3n, Zsy paramZsy, Zbnt paramZbnt, Zz4_ paramZz4_, int paramInt1, int paramInt2) {
    this.ZU = paramZe3n;
    this.ZT = paramZsy;
    this.ZG = paramZbnt;
    this.Za = paramZz4_;
    this.ZC = paramInt1;
    this.ZW = paramInt2;
  }
  
  public void ZA() {
    String str = this.ZT.Zi().ZG().ZK(10);
    Zt9 zt9 = (new Zsqj(this.ZU.Za(), this.ZG, str, this.ZU.Za().ZJ1())).ZD(this.ZW).ZX();
    Zxgd zxgd = zt9.ZU().Zz().ZV();
    ZE(str, zt9, zxgd);
  }
  
  private void ZE(String paramString, Zt9 paramZt9, Zxgd paramZxgd) {
    Zsex zsex1;
    Zstu zstu1;
    Zbqc[] arrayOfZbqc = Za();
    String str = Integer.toString(this.ZW);
    try {
      zsex1 = new Zsex(this.ZU.Zr((new Zlv5()).Za(paramZxgd).ZD(false)));
      zstu1 = zsex1.Zl();
      if (!zstu1.Zis().contains(str))
        return; 
      byte b = 0;
      while (b < this.ZC) {
        this.ZU.Zr((new Zlv5()).Za(paramZxgd).ZD(false));
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
    } catch (Zscd zscd) {
      Zah.Zl(zscd, Zk_.IGNORED);
      return;
    } 
    Zt9 zt9 = (new Zsqj(this.ZU.Za(), this.ZG, paramString, this.ZU.Za().ZJ1())).ZX();
    Zxgd zxgd = zt9.ZU().Zz().ZV();
    Zsex zsex2 = new Zsex(this.ZU.Zr((new Zlv5()).Za(zxgd).ZD(false)));
    Zstu zstu2 = zsex2.Zl();
    try {
      if (!zstu2.Zis().contains(str))
        return; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    List<Zl1r> list1 = Zl8v.ZJ(str, zstu1.ZiD(), false);
    Zefx zefx1 = zsex1.ZL();
    List<Zl1r> list2 = Zex2.ZT(zefx1, str::lambda$issueCheckRequests$0);
    Zvow zvow1 = this.ZU.Zt().ZC(zefx1).Zu(zstu1).Z_(list1).ZK(list2);
    List<Zl1r> list3 = Zl8v.ZJ(str, zstu2.ZiD(), false);
    Zefx zefx2 = zsex2.ZL();
    List<Zl1r> list4 = Zex2.ZT(zefx2, str::lambda$issueCheckRequests$0);
    Zvow zvow2 = this.ZU.Zt().ZC(zefx2).Zu(zstu2).Z_(list3).ZK(list4);
    this.Za.Zz(Zmtk.ZZ(this.ZU.Za(), this.ZU.ZN(), null, zvow1, zvow2, paramZt9.ZB(), (byte)5, false));
  }
  
  private static List lambda$issueCheckRequests$0(String paramString, Zr6q paramZr6q) {
    return Zl8v.ZJ(paramString, paramZr6q.ZD(), false);
  }
  
  public static void ZQ(Zbqc[] paramArrayOfZbqc) {
    ZX = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return ZX;
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  static {
    if (Za() != null)
      ZQ(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */