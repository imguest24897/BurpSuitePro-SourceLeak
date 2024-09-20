package net.portswigger;

import burp.Zbqc;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.openapi4j.Zf;
import org.openapi4j.Zo;
import org.openapi4j.Zpf;
import org.openapi4j.Zpz;
import org.openapi4j.Zr;
import org.openapi4j.Zu;
import org.openapi4j.Zw;
import org.openapi4j.Zx;

public class Zqt {
  private final Zpf Zm;
  
  private final Zgs<Zi5, Zo> Za;
  
  private final Zgs<Zav, Zf> ZI;
  
  private final Zgs<Zdf, Zdf> ZT;
  
  private final Zgs<Zw, Zw> Zo;
  
  private final Zgs<Zr, Zr> Zh;
  
  public Zqt(Zpf paramZpf) {
    this.Zm = paramZpf;
    Zx zx = paramZpf.getContext();
    this.Za = new Zgs<>(zx, this::lambda$new$0);
    this.ZI = new Zgs<>(zx, this::lambda$new$1);
    this.ZT = new Zgs<>(zx, Zqt::lambda$new$2);
    this.Zo = new Zgs<>(zx, Zqt::lambda$new$3);
    String[] arrayOfString = Zfe.ZG();
    this.Zh = new Zgs<>(zx, Zqt::lambda$new$4);
    if (Zbqc.Zwu() == null)
      Zfe.ZN(new String[2]); 
  }
  
  public Zi5 ZX(Zo paramZo) {
    return this.Za.Zz(paramZo);
  }
  
  public Zav Zi(Zf paramZf) {
    return this.ZI.Zz(Optional.<Zf>ofNullable(paramZf).orElseGet(Zf::new));
  }
  
  public Zw Zx(Zw paramZw) {
    return this.Zo.Zz(paramZw);
  }
  
  public Object ZM(Zu paramZu) {
    return ((Zdf)this.ZT.Zz(new Zdf(paramZu))).getValue();
  }
  
  public List<Zr> Zk(Zpz paramZpz) {
    Objects.requireNonNull(this.Zh);
    return (List<Zr>)paramZpz.getRequirements().keySet().stream().map(this::lambda$resolve$5).map(this.Zh::Zz).collect(Collectors.toList());
  }
  
  private Zr lambda$resolve$5(String paramString) {
    return ((Zr)Optional.<Zr>ofNullable((Zr)this.Zm.getComponents().getSecuritySchemes().get(paramString)).orElse(new Zr())).setReadableName(paramString);
  }
  
  private static Zr lambda$new$4(String paramString, Zr paramZr) {
    return paramZr;
  }
  
  private static Zw lambda$new$3(String paramString, Zw paramZw) {
    return paramZw;
  }
  
  private static Zdf lambda$new$2(String paramString, Zdf paramZdf) {
    return paramZdf;
  }
  
  private Zav lambda$new$1(String paramString, Zf paramZf) {
    return new Zav(this, paramString, paramZf);
  }
  
  private Zi5 lambda$new$0(String paramString, Zo paramZo) {
    return new Zi5(this, paramZo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */