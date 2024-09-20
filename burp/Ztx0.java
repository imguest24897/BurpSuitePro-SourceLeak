package burp;

import java.util.Objects;

public class Ztx0 {
  private final String ZW;
  
  private Zzug ZV;
  
  private String ZZ;
  
  private String Zk;
  
  private Zstu Zg;
  
  private Zstu Zp;
  
  public Ztx0(String paramString) {
    this.ZW = Objects.<String>requireNonNull(paramString);
  }
  
  public Ztx0 Zw(Zzug paramZzug) {
    this.ZV = paramZzug;
    return this;
  }
  
  public Ztx0 Za(String paramString) {
    this.ZZ = paramString;
    return this;
  }
  
  public Ztx0 ZL(String paramString) {
    this.Zk = paramString;
    return this;
  }
  
  public Ztx0 ZR(Zstu paramZstu) {
    this.Zg = paramZstu;
    return this;
  }
  
  public Ztx0 Zo(Zstu paramZstu) {
    this.Zp = paramZstu;
    return this;
  }
  
  public Zr_j ZE() {
    int i = Ztas.ZU();
    if (Zbqc.Zwu() == null)
      Ztas.ZF(++i); 
    return new Zr_j(this.ZW, this.ZV, this.ZZ, this.Zk, this.Zg, this.Zp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */