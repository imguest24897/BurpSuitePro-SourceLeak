package burp;

import net.portswigger.Zsy;

public class Zrg9 extends Zrgu {
  public Zrg9(Zbxv paramZbxv, Zsy paramZsy, Ze3n paramZe3n, Zxs7 paramZxs7, Zmhe paramZmhe, Zxzq paramZxzq) {
    super(paramZbxv, paramZsy, paramZe3n, paramZxs7, paramZmhe, paramZxzq);
  }
  
  public void Z_(Zz4_ paramZz4_, Zgit paramZgit) {
    if (this.ZE.Zp(this.Zz.ZP) && paramZgit.Zj.startsWith("/" + paramZgit.Zv)) {
      String str = "/" + ZR(10);
      Zgit zgit = ZM(str, ZS("/" + str));
      if (zgit != null) {
        this.ZE.Zn(this.Zz.ZP);
        this.Zz.Zc.ZM(this.Zi, zgit, paramZz4_, this.Zg.ZN(), this.Zg.Zod());
        return;
      } 
    } 
    if (this.ZE.Zp(this.Zz.Zb) && !ZQ(paramZgit)) {
      Zku6 zku6 = ZC("?" + ZR(10));
      boolean bool = Zxdf.ZP(this.Zi, this.Zz.Zc, zku6).iterator().hasNext();
      this.ZE.Zn(this.Zz.Zb);
      this.Zz.Zc.ZC(this.Zg.ZN(), this.Zg.Za(), this.Zi, paramZgit, paramZz4_, bool);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */