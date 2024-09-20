package burp;

import net.portswigger.Zsy;

public class Zka {
  private final Zxs7 ZM;
  
  private final Zmhe Zj;
  
  private final Zkq4 Zk;
  
  private final Ze3n ZS;
  
  private final Zms4 Zr;
  
  private final boolean ZA;
  
  public Zka(Zkq4 paramZkq4, Ze3n paramZe3n, Zxs7 paramZxs7, Zmhe paramZmhe, Zsy paramZsy, boolean paramBoolean) {
    this.Zk = paramZkq4;
    this.ZS = paramZe3n;
    this.Zj = paramZmhe;
    this.ZA = paramBoolean;
    this.ZM = paramZxs7;
    this.Zr = new Zms4(paramZsy, paramZe3n.ZL().Za());
  }
  
  public Zl24 Zn() {
    Zsqx<Zrdb> zsqx = null;
    Zrso zrso = new Zrso(this.Zj, this.ZS, this.ZM, this.Zr);
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    if (this.Zk.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED)) {
      zsqx = (new Zesq(new Zxlu[] { new Zxx2(new Zly3(zrso), new Zesq(new Zxlu[] { new Zbwg(zrso), new Zs5q(this.Zj, this.ZS, this.ZM, this.Zr), new Zmgm(zrso), new Zz93(zrso), new Zgiw(zrso), new Zzum(zrso), new Zeio(zrso) })), new Zxx2(new Zlih(zrso), new Zesq(new Zxlu[] { new Zgdc(zrso), new Zs8a(zrso) })), new Zxx2(new Zs2e(zrso), new Zesq(new Zxlu[] { new Zmop(zrso), new Zzum(zrso) })), new Zxx2(new Zq5(zrso), new Zesq(new Zxlu[] { new Zbfc(zrso) })), new Zxx2(new Zmo0(zrso), new Zzoj(zrso)), new Zxx2(new Zx5_(zrso), new Zs5q(this.Zj, this.ZS, this.ZM, this.Zr)) })).Zr();
    } else if (this.Zk.Zr(Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION)) {
      zsqx = (new Zs5q(this.Zj, this.ZS, this.ZM, this.Zr)).Zr();
    } 
    if (zsqx != null) {
      boolean bool = (((Zx_5)zsqx).ZN() == Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION && !this.Zk.Zr(Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION)) ? true : false;
      return bool ? Zl24.Z_(zsqx) : Zl24.ZK(zsqx);
    } 
    if (this.Zk.ZS(Zzu2.SERVER_SIDE_TEMPLATE_ENGINE_INJECTION, Zr3z.SSTI_ECHO_BASED) && ((this.Zk.ZqT()).speed >= Zlk4.THOROUGH.speed || this.ZA)) {
      Zsqx<Zrdb> zsqx1 = (new Zesq(new Zxlu[] { new Zrd8(zrso), new Zsh6(zrso), new Zm61(zrso), new Zzv_(this.Zj, this.ZS, this.ZM, this.Zr), new Zxx2(new Ze8u(this.Zj, this.ZS, this.ZM, this.Zr), new Zs_z(zrso)), new Zxx2(new Zbxe(zrso), new Zgiw(zrso)) })).Zr();
      return (zsqx1 == null) ? Zl24.Zb() : Zl24.ZK(zsqx1);
    } 
    if (Zbqc.Zwu() == null)
      Zxpw.ZW(new Zbqc[3]); 
    return Zl24.Zb();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zka.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */