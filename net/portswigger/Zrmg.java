package net.portswigger;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapi4j.Zp9;

public class Zrmg {
  private final Ztb Zn;
  
  public Zrmg(Ztb paramZtb) {
    this.Zn = paramZtb;
  }
  
  public Stream<Zrmf> ZN() {
    try {
      List<Zp9> list1 = Optional.<List>ofNullable(this.Zn.ZM().Ze()).orElse(Collections.emptyList());
      if (!list1.isEmpty())
        return Zs(list1); 
      List<Zp9> list2 = Optional.<List>ofNullable(this.Zn.ZB().getServers()).orElse(Collections.emptyList());
      if (!list2.isEmpty())
        return Zs(list2); 
      List<Zp9> list3 = Optional.<List>ofNullable(this.Zn.Zh()).orElse(Collections.emptyList());
      return !list3.isEmpty() ? Zs(list3) : ZI(new Zp9());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Stream.empty();
    } 
  }
  
  private Stream<Zrmf> Zs(List<Zp9> paramList) {
    return paramList.stream().flatMap(this::ZI);
  }
  
  private Stream<Zrmf> ZI(Zp9 paramZp9) {
    Zrmf zrmf1 = Zy(paramZp9);
    Zrmf zrmf2 = (new Zha(this.Zn)).ZW(zrmf1);
    Zrmf zrmf3 = (new Zts(this.Zn)).ZP(zrmf2);
    Zrmf zrmf4 = (new Zth(this.Zn)).ZR(zrmf3);
    return (new Zbg(this.Zn)).ZM(zrmf4);
  }
  
  private Zrmf Zy(Zp9 paramZp9) {
    Zrmf zrmf1 = (new Zrxx(paramZp9, this.Zn.ZK())).Zp();
    Zrmf zrmf2 = (new Zcq(this.Zn)).ZO(zrmf1);
    Zrmf zrmf3 = (new Zzm(this.Zn)).Zr(zrmf2);
    return (new Zqq(this.Zn)).ZF(zrmf3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */