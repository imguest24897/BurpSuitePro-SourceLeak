package net.portswigger;

import java.util.Optional;
import java.util.Set;

public class Znq implements Zzi {
  private final String Zt;
  
  private final String Zp;
  
  private final Set<String> ZF;
  
  private final Set<String> ZL;
  
  public Znq(String paramString1, String paramString2, Set<String> paramSet1, Set<String> paramSet2) {
    this.Zt = paramString1;
    this.Zp = paramString2;
    this.ZF = paramSet1;
    this.ZL = paramSet2;
  }
  
  public Optional<String> ZX() {
    return Optional.ofNullable(this.Zt);
  }
  
  public Optional<String> ZB() {
    return Optional.ofNullable(this.Zp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Znq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */