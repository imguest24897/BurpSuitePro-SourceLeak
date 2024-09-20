package burp;

import java.util.Set;

public class Zuc extends Zni implements Zmj1 {
  private final Set<Zzgy> Zt;
  
  private final Zt58 Zm;
  
  public Zuc(Set<Zzgy> paramSet, Zt58 paramZt58) {
    this.Zt = paramSet;
    this.Zm = paramZt58;
  }
  
  public Zeu4<? extends Zmj1> ZF() {
    return Zmj1.ZS;
  }
  
  public Set<Zzgy> Z_N() {
    return this.Zt;
  }
  
  @Zzvo(1)
  public byte[] ZoT() {
    return Zruv.ZU(this.Zt, Zzgy::ZI);
  }
  
  @Zzvo(2)
  public byte ZoZ() {
    return this.Zm.Zg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */