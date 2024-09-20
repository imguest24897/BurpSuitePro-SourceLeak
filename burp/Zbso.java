package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Z_j;
import net.portswigger.Zms;
import net.portswigger.Zoj;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zsj;
import net.portswigger.Zt0;
import net.portswigger.Zuo;
import net.portswigger.Zz5;
import net.portswigger.Zzz;

public class Zbso extends Z_j {
  private final String ZV;
  
  private final Zb2c ZX;
  
  private final Zz_4 ZT;
  
  private final Zg1z Zc;
  
  private final List<Zio> ZN;
  
  public Zbso(String paramString, Zb2c paramZb2c, Zz_4 paramZz_4, Zg1z paramZg1z) {
    this.ZV = paramString;
    this.ZX = paramZb2c;
    this.ZT = paramZz_4;
    this.Zc = paramZg1z;
    this.ZN = new ArrayList<>();
  }
  
  public void ZY(Zs7 paramZs7) {
    ZA((Zms)paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    ZA((Zms)paramZrmr);
  }
  
  public void Zz(Zzz paramZzz) {
    ZA((Zms)paramZzz);
  }
  
  public void Zr(Zt0 paramZt0) {
    ZA((Zms)paramZt0);
  }
  
  private void ZA(Zms paramZms) {
    Zio zio = (new Zio()).Zv(this.ZX).Zn(this.ZV);
    paramZms.ZF(new Zrcz(zio));
    paramZms.ZF(new Zrc6(zio));
    paramZms.ZF(new Zrcl(zio));
    paramZms.ZF(new Zrcf(zio));
    paramZms.ZF(new Zrcj(zio));
    this.ZN.add(zio);
  }
  
  public void ZL(Zz5 paramZz5) {}
  
  protected void Zq(String paramString) {
    this.Zc.Zc(this.ZT.ZW(), paramString);
  }
  
  public void ZY(Zsj paramZsj) {
    if (!paramZsj.ZYQ().isEmpty())
      ((Zms)paramZsj.ZYQ().get(0)).ZF((Zuo)this); 
  }
  
  public void ZI(Zoj paramZoj) {
    int[] arrayOfInt = Zrc8.Zp();
    if (paramZoj.ZQK().isEmpty())
      return; 
    byte b1 = (paramZoj.ZQe() == 0) ? 1 : paramZoj.ZQe();
    byte b2 = 0;
    while (b2 < b1) {
      ((Zms)paramZoj.ZQK().get(0)).ZF((Zuo)this);
      b2++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public List<Zio> ZW() {
    return this.ZN;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */