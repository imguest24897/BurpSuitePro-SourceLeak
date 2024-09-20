package net.portswigger;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Zoe {
  private final Ztb ZI;
  
  private final Zid ZX;
  
  public Zoe(Ztb paramZtb, Zid paramZid) {
    this.ZI = paramZtb;
    this.ZX = paramZid;
  }
  
  public Stream<Zrmf> ZX(Zrmf paramZrmf) {
    Zqa zqa = (new Zqa(paramZrmf)).ZH(this.ZX.ZZ());
    return Stream.of(ZX(zqa, this.ZX).<Zrmf>map(Zqa::ZG).orElse(zqa.ZG()));
  }
  
  Optional<Zqa> ZX(Zqa paramZqa, Zid paramZid) {
    Zav zav = paramZid.ZE();
    String str = zav.Zp();
    Optional<Zms> optional = Zt9.ZP(str, zav, new HashMap<>(), Zs2.ZL(paramZid), true);
    Objects.requireNonNull(paramZqa);
    return optional.map(paramZqa::ZR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zoe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */