package net.portswigger;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Zo7 {
  private final Zid ZY;
  
  public Zo7(Zid paramZid) {
    this.ZY = paramZid;
  }
  
  public Stream<Zrmf> ZY(Zrmf paramZrmf) {
    Zqa zqa = (new Zqa(paramZrmf)).ZH(this.ZY.ZZ());
    return Stream.of(Zh(zqa, this.ZY).<Zrmf>map(Zqa::ZG).orElse(zqa.ZG()));
  }
  
  Optional<Zqa> Zh(Zqa paramZqa, Zid paramZid) {
    Optional<Zms> optional = Zi2.ZT(paramZid.ZE(), Zlm.Zo(paramZid), true);
    Objects.requireNonNull(paramZqa);
    return optional.map(paramZqa::ZR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zo7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */