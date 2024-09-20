package net.portswigger;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapi4j.Zo;

public class Zi5 {
  private final Zqt ZH;
  
  private final Zo Zk;
  
  private final Zav ZD;
  
  public Zi5(Zqt paramZqt, Zo paramZo) {
    this.ZH = paramZqt;
    this.Zk = paramZo;
    this.ZD = paramZqt.Zi(paramZo.getSchema());
  }
  
  public Znv Zw() {
    return Znv.ZI(this.Zk.getIn());
  }
  
  public String ZX() {
    return this.Zk.getName();
  }
  
  public String Zx() {
    return this.Zk.getDescription();
  }
  
  public boolean ZC() {
    return this.Zk.isRequired();
  }
  
  public Zav Zj() {
    return this.ZD;
  }
  
  public String ZZ() {
    return this.Zk.getStyle();
  }
  
  public Boolean Zv() {
    return this.Zk.getExplode();
  }
  
  public Stream<Object> Zg() {
    return Zud.Zj(new Stream[] { Zud.ZK(this.Zk.getExample()), Optional.<Map>ofNullable(this.Zk.getExamples()).map(this::lambda$getExamples$0).orElseGet(Stream::empty), this.ZD.Zj() });
  }
  
  private Stream lambda$getExamples$0(Map paramMap) {
    Objects.requireNonNull(this.ZH);
    return paramMap.values().stream().map(this.ZH::ZM).filter(Objects::nonNull);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zi5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */