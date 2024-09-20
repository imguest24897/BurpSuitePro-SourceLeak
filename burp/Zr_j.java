package burp;

import java.util.Objects;
import java.util.Optional;

public class Zr_j {
  private final String Zo;
  
  private final Zzug ZK;
  
  private final String Ze;
  
  private final String Zm;
  
  private final Zstu ZT;
  
  private final Zstu ZZ;
  
  public Zr_j(String paramString1, Zzug paramZzug, String paramString2, String paramString3, Zstu paramZstu1, Zstu paramZstu2) {
    this.Zo = Objects.<String>requireNonNull(paramString1);
    this.ZK = Objects.<Zzug>requireNonNull(paramZzug);
    this.Ze = paramString2;
    this.Zm = paramString3;
    int i = Ztas.ZUQ();
    this.ZT = paramZstu1;
    this.ZZ = paramZstu2;
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static Ztx0 ZA(String paramString) {
    return new Ztx0(paramString);
  }
  
  public String Zn() {
    return this.Zo;
  }
  
  public Zzug Zp() {
    return this.ZK;
  }
  
  public Optional<String> Zc() {
    return Optional.ofNullable(this.Ze);
  }
  
  public Optional<String> ZL() {
    return Optional.ofNullable(this.Zm);
  }
  
  public Optional<Zstu> Zy() {
    return Optional.ofNullable(this.ZT);
  }
  
  public Optional<Zstu> ZS() {
    return Optional.ofNullable(this.ZZ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */