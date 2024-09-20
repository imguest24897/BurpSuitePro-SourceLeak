package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze6f implements Zkfj {
  private final Ztai Z_;
  
  Ze6f(Ztai paramZtai) {
    this.Z_ = paramZtai;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    int i = Zlf1.ZJ();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7));
    if (Zl8g.Zo(paramZer0))
      return this.Z_.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.COLLABORATOR_BASED) ? Zg58.ZM(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZbll.Zk.Zh(), Z_(paramZbll.Zk.ZG()), paramZxs7, paramZbll.ZP) : null; 
    Zt5i zt5i = new Zt5i(paramZer0, paramList);
    if (Zbqc.Zwu() == null)
      Zlf1.ZH(++i); 
    return this.Z_.ZS(zt5i.ZG(), Zr3z.COLLABORATOR_BASED) ? Zog.ZL(paramZe3n.Za(), paramZe3n.ZN(), zt5i.ZE(), zt5i.ZG(), Zxwd.NSLOOKUP_PAYLOAD, zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.ZV()) : null;
  }
  
  private static int Z_(Zlp9 paramZlp9) {
    switch (Ze_s.ZZ[paramZlp9.ordinal()]) {
      case 1:
        return 64;
      case 2:
        return 1;
      case 3:
      case 4:
        return 18;
    } 
    Zuh.Zv(false, Zqf.Zk, paramZlp9.Zz());
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */