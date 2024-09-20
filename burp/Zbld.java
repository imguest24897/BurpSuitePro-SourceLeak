package burp;

import java.util.ArrayList;
import java.util.List;

public abstract class Zbld implements Zkrr {
  private final Zbfi ZO;
  
  private final Zbnt ZY;
  
  protected final Ze3n ZS;
  
  private final String ZQ;
  
  private static int ZM;
  
  public Zbld(Zbfi paramZbfi, Zbnt paramZbnt, Ze3n paramZe3n, String paramString) {
    this.ZO = paramZbfi;
    this.ZS = paramZe3n;
    this.ZQ = paramString;
    this.ZY = paramZbnt;
  }
  
  protected void Zr(Zz4_ paramZz4_, Zmok paramZmok1, Zmok paramZmok2) {
    int i = Zm();
    Zslh zslh = new Zslh(this, paramZmok1, paramZmok2);
    switch (Zta7.Z_[this.ZO.ZqT().ordinal()]) {
      case 1:
      case 2:
      
      default:
        break;
    } 
    Zstu zstu = this.ZS.ZL().Za();
    Zxzf zxzf = new Zxzf(this.ZS.ZA().ZF(), zstu, zslh, this.ZY);
    if (zxzf.Ze(this.ZO.ZqM()))
      Zv(paramZz4_, zslh, zxzf.ZX().Zp()); 
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private void Zv(Zz4_ paramZz4_, Zslh paramZslh, Zkvd paramZkvd) {
    Zvow zvow1 = paramZslh.Zy(paramZkvd);
    Zvow zvow2 = paramZslh.ZQ(paramZkvd);
    paramZz4_.Zz(ZJ(zvow1, zvow2, paramZslh.ZK, paramZkvd.Zt() ? 2 : 1));
  }
  
  protected abstract Zsqx<Zrdb> ZJ(Zvow paramZvow1, Zvow paramZvow2, boolean paramBoolean, byte paramByte);
  
  private static List<Zl1r> Zz(String paramString, byte[] paramArrayOfbyte) {
    int i = Zsbj.Zc(paramArrayOfbyte);
    Zl1r zl1r = Zl8v.Zu("\n" + paramString, paramArrayOfbyte, i);
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(zl1r);
    return arrayList;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void ZH(int paramInt) {
    ZM = paramInt;
  }
  
  public static int ZD() {
    return ZM;
  }
  
  public static int Zm() {
    int i = ZD();
    return (i == 0) ? 9 : 0;
  }
  
  static {
    if (Zm() != 0)
      ZH(15); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbld.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */