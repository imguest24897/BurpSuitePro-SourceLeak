package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

class Ztr_ implements Zzwz {
  private final int ZH;
  
  private final int ZR;
  
  private final Zbjl Zd;
  
  private final Zxs7 ZS;
  
  private final Zeko ZK;
  
  private Zen Zg;
  
  Ztr_(int paramInt1, int paramInt2, Zbjl paramZbjl, Zxs7 paramZxs7, Zeko paramZeko) {
    this.ZH = paramInt1;
    this.ZR = paramInt2;
    this.Zd = paramZbjl;
    this.ZS = paramZxs7;
    this.ZK = paramZeko;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    Zen zen = Zx(Zlp9.EMAIL_SENDING_CAPABILITY_PAYLOAD);
    Zzi5 zzi5 = this.Zd.ZB();
    Zbqc[] arrayOfZbqc = Zk1v.ZJ();
    String str = Zkk1.Zo(zzi5, this.ZK, zen);
    if (Zbqc.Zwu() == null)
      Zk1v.ZG(new Zbqc[3]); 
    return new Zewx(zen, Zkb.Zy(str), Zlp9.EMAIL_SENDING_CAPABILITY_PAYLOAD, new Zmhr(zzi5.ZU(zen), 80, false), (byte)0, Zewx.ZP);
  }
  
  public List<Zewx> ZK() {
    return Collections.singletonList(Zt(Zlp9.NONE));
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.Zg = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Zk1v();
  }
  
  private Zen Zx(Zlp9 paramZlp9) {
    if (this.Zg != null)
      return this.Zg; 
    Ztt6 ztt6 = new Ztt6(this.ZH, this.ZR, paramZlp9, this.ZS.Zl());
    return this.Zd.ZK(1, ztt6.toString());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */