package net.portswigger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.openapi4j.Zp9;
import org.openapi4j.Zpe;
import org.openapi4j.Zpf;
import org.openapi4j.Zpz;

public class Zmf {
  private final Zpf Zv;
  
  private final Zqt Zn;
  
  private final Zpe ZE;
  
  private final Znl ZX;
  
  public Zmf(Zpf paramZpf, Zqt paramZqt, Zpe paramZpe) {
    this.Zv = paramZpf;
    this.Zn = paramZqt;
    this.ZE = paramZpe;
    this.ZX = new Znl(paramZqt, paramZpe.getRequestBody());
  }
  
  public List<Zp9> Ze() {
    return this.ZE.getServers();
  }
  
  public List<Zn2> ZH() {
    return (List<Zn2>)((List)Optional.<List>ofNullable(this.ZE.getSecurityRequirements()).or(this::lambda$getSecurity$0).orElse(new ArrayList())).stream().map(this::lambda$getSecurity$1).collect(Collectors.toList());
  }
  
  public Znl ZO() {
    return this.ZX;
  }
  
  private Zn2 lambda$getSecurity$1(Zpz paramZpz) {
    return new Zn2(this.Zn, paramZpz);
  }
  
  private Optional lambda$getSecurity$0() {
    return Optional.ofNullable(this.Zv.getSecurityRequirements());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */