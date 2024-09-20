package burp;

import java.util.Collection;
import net.portswigger.Zkb;
import net.portswigger.Zmw;
import net.portswigger.Zsy;

abstract class Zr6t implements Zmgx {
  final Zsy Zm;
  
  private final byte[] ZM;
  
  private final Zmgx Zt;
  
  private final Collection<Zsjk> ZU;
  
  private final Collection<Zsjk> ZP;
  
  private final char Zh;
  
  private final Zs6l Zv;
  
  private final Zspd Zu;
  
  Zr6t(byte[] paramArrayOfbyte, char paramChar, Collection<Zsjk> paramCollection1, Collection<Zsjk> paramCollection2, Zmgx paramZmgx, Zsy paramZsy, Zs6l paramZs6l, Zspd paramZspd) {
    this.ZM = paramArrayOfbyte;
    this.ZP = paramCollection1;
    this.ZU = paramCollection2;
    this.Zt = paramZmgx;
    this.Zh = paramChar;
    this.Zm = paramZsy;
    this.Zv = paramZs6l;
    this.Zu = paramZspd;
  }
  
  public void ZM(byte paramByte) {
    String str1 = this.Zm.Zi().ZG().ZK(10);
    String str2 = Zt();
    byte[] arrayOfByte = Zmw.Zq(new byte[][] { Zkb.Zy(str1), this.ZM, Zkb.Zy(str2) });
    String str3 = str1 + str1 + this.Zh;
    Ztsh ztsh = this.Zv.ZO(paramByte, arrayOfByte);
    boolean bool = Zs6l.Zu();
    Zku6 zku61 = ztsh.ZQ(Zk(Zkb.Zy(str3)));
    Zsjk zsjk = Zsjk.ZU(this.ZP, paramByte);
    this.Zu.accept(zku61, zsjk);
    if (zku61.Zh())
      if (this.Zt != null) {
        this.Zt.ZM(paramByte);
        if (!bool) {
          Zbqc.Zr(new Zbqc[3]);
        } else {
          return;
        } 
      } else {
        return;
      }  
    Zku6 zku62 = ztsh.ZQ(new Zr89(str2, this.Zh, Zk(Zkb.Zy(str1)), Zk(Zkb.Zy(str2)), Zk(Zkb.Zy(str2.substring(2)))));
    this.Zu.accept(zku62, Zsjk.ZU(this.ZU, paramByte));
  }
  
  Zxar Zk(byte[] paramArrayOfbyte) {
    return Zxar.ZK(paramArrayOfbyte);
  }
  
  String Zt() {
    return this.Zm.Zi().ZG().ZK(10);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */