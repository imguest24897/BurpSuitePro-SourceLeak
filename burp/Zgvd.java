package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zdo;

public class Zgvd {
  private final Ztyg ZS;
  
  private final Zgq7 Za;
  
  private final Zey9 Zx;
  
  private final List<Zgop> Zv;
  
  private final List<Zgop> ZM;
  
  private int ZX;
  
  private int Zk;
  
  public Zgvd(Ztyg paramZtyg, Zgq7 paramZgq7, Zey9 paramZey9) {
    this.ZS = paramZtyg;
    this.Za = paramZgq7;
    this.Zx = paramZey9;
    this.Zv = new ArrayList<>();
    this.ZM = new ArrayList<>();
  }
  
  synchronized Component Zv(Zbr paramZbr, Zzi8 paramZzi8, Zefg<Zrrc> paramZefg) {
    Zgop zgop = ZN();
    zgop.ZF(paramZbr.ZP(paramZzi8.Zod(), this.Zx), paramZzi8, paramZefg);
    return zgop.ZH();
  }
  
  synchronized Component Zh(Zstu paramZstu, Zzi8 paramZzi8, Zefg<Zrrc> paramZefg) {
    Zgop zgop = Zy();
    zgop.ZE(paramZstu, paramZzi8, paramZefg);
    return zgop.ZH();
  }
  
  synchronized void ZH() {
    this.ZX = 0;
    this.Zk = 0;
  }
  
  private Zgop ZN() {
    if (this.ZX >= this.Zv.size())
      this.Zv.add(Zh(Zgu3.HTTP_REQUEST)); 
    return this.Zv.get(this.ZX++);
  }
  
  private Zgop Zy() {
    if (this.Zk >= this.ZM.size())
      this.ZM.add(Zh(Zgu3.HTTP_RESPONSE)); 
    return this.ZM.get(this.Zk++);
  }
  
  private Zgop Zh(Zgu3 paramZgu3) {
    Zr96 zr96 = new Zr96();
    Zbdf zbdf = this.ZS.Zz(zr96, Zeew.SCANNER, false, Zbdf.ZR, Zb9b.Zx);
    zbdf.ZN(Zdo.ZQ, paramZgu3);
    Zbdx zbdx = this.Za.ZP(Zxff.ISSUE_EVIDENCE).Zc(zbdf).Zz().Zo().Zl();
    return new Zgop(zbdf, zbdx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */