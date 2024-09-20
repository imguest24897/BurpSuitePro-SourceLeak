package net.portswigger;

import burp.Zbqc;
import java.util.Optional;

class Zkj implements Zd8<Zmo> {
  final Zby ZP;
  
  private Zkj(Zby paramZby) {}
  
  public Ztr<Zmo> ZZ(Zat paramZat) throws Zrml {
    Optional<Zto<Zif, Zat>> optional = this.ZP.ZX.ZR(paramZat);
    String str = Zby.Zf();
    try {
      if (!optional.isPresent())
        throw new Zrml(Zrxs.Zr()); 
    } catch (Zrml zrml) {
      throw a(null);
    } 
    Zl5 zl5 = ((Zif)((Zto)optional.get()).Zq).Zi();
    if (!this.ZP.ZF.containsKey(zl5)) {
      Zmo zmo1 = new Zmo(this.ZP, new Zrz0(this.ZP, this.ZP.Zb.apply(zl5, this.ZP.ZA)));
      try {
        this.ZP.ZF.put(zl5, zmo1);
        if (str == null) {
          Zbqc.Zr(new Zbqc[1]);
        } else {
          return new Ztr<>((Zat)((Zto)optional.get()).Zo, zmo1.ZZ((Zif)((Zto)optional.get()).Zq));
        } 
      } catch (Zrml zrml) {
        throw a(null);
      } 
    } 
    Zmo zmo = this.ZP.ZF.get(zl5);
    return new Ztr<>((Zat)((Zto)optional.get()).Zo, zmo.ZZ((Zif)((Zto)optional.get()).Zq));
  }
  
  private static Zrml a(Zrml paramZrml) {
    return paramZrml;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkj.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */