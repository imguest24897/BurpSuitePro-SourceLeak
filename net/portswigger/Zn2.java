package net.portswigger;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.openapi4j.Zpz;
import org.openapi4j.Zr;

public class Zn2 {
  private final List<Zr> ZS;
  
  public Zn2(Zqt paramZqt, Zpz paramZpz) {
    this.ZS = paramZqt.Zk(paramZpz);
  }
  
  public List<Zzq> ZR() {
    return (List<Zzq>)this.ZS.stream().map(Zzq::new).collect(Collectors.toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */