package burp;

import java.util.List;

abstract class Zt4f implements Zlz5 {
  private final Zbjl ZU;
  
  private final Zesv ZQ;
  
  private final Zrbu Zx;
  
  private final Zr_4 Zy;
  
  private final Zbnt Zd;
  
  final Ze3n ZY;
  
  Zt4f(Zr_4 paramZr_4, Zbnt paramZbnt, Ze3n paramZe3n, Zbjl paramZbjl, Zesv paramZesv, Zrbu paramZrbu) {
    this.Zy = paramZr_4;
    this.Zd = paramZbnt;
    this.ZY = paramZe3n;
    this.ZU = paramZbjl;
    this.ZQ = paramZesv;
    this.Zx = paramZrbu;
  }
  
  abstract void ZO(Zsh_ paramZsh_, Zmdl paramZmdl, Zxpi paramZxpi);
  
  public void Zg(Zz4_ paramZz4_, Zmdl paramZmdl) {
    ZO(new Zsw1(this.ZY, this.ZQ, this.ZU, paramZz4_), paramZmdl, Zxpi.Zb);
  }
  
  public void ZQ(Zmz6 paramZmz6, Zly1 paramZly1, long paramLong, Zmdl paramZmdl) {
    ZO(new Zrj2(this.ZY, paramZly1, paramZmz6), paramZmdl, new Zxpi(paramLong));
  }
  
  void ZP(Zsh_ paramZsh_, Zxpi paramZxpi, List<Zer0> paramList, Zer0 paramZer0, Zxs7 paramZxs7, List<Zmaj> paramList1) {
    Ztt6 ztt6 = Zmaj.Zr(paramZer0, paramList1);
    if (ztt6 != null) {
      Zzwz zzwz = this.Zx.Zc(paramZxs7);
      long l = paramZxpi.ZX(this.ZY.ZM().Zg5(), paramZer0.Zn());
      Zgxe zgxe = new Zgxe(this.Zd, this.Zy, l);
      paramZsh_.Zk(zgxe, paramZer0, paramList, paramZxs7, zzwz, ztt6.ZN());
    } 
  }
  
  void Ze(Zsh_ paramZsh_, Zmaj paramZmaj, List<Zmaj> paramList, Zxpi paramZxpi, Zxs7 paramZxs7) {
    Zzwz zzwz = this.Zx.Zc(paramZxs7);
    long l = paramZxpi.ZX(this.ZY.ZM().Zg5(), paramZmaj.ZO.Zn());
    Zel5 zel5 = new Zel5(this.Zy, this.Zd, l);
    boolean bool = Zt4j.Zk();
    paramZsh_.Zk(zel5, paramZmaj.ZO, Zmaj.Zf(paramList), paramZxs7, zzwz, paramZmaj.Zy.ZN());
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */