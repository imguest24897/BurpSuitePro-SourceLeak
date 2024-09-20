package burp;

import net.portswigger.Zsy;

public class Zs5e implements Zkrr {
  private final Zsy Zf;
  
  private final Ze3n ZF;
  
  private final Zbnt ZZ;
  
  private final Zesv Zk;
  
  private static int[] ZX;
  
  public Zs5e(Zsy paramZsy, Zesv paramZesv, Ze3n paramZe3n, Zbnt paramZbnt) {
    this.Zf = paramZsy;
    this.ZF = paramZe3n;
    this.ZZ = paramZbnt;
    int[] arrayOfInt = Zs();
    this.Zk = paramZesv;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_XmlEntityExpansion;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.ZF.ZA().Zv() != Zsba.XML)
      return; 
    Zxs7 zxs7 = this.ZF.ZS().Zo();
    if (zxs7 != null)
      (new Zxk0(this.Zf, this.Zk.Za(this.ZF, zxs7), this.ZF, zxs7, this.ZZ)).Zv(paramZz4_); 
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void Zf(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zs() {
    return ZX;
  }
  
  static {
    if (Zs() != null)
      Zf(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */