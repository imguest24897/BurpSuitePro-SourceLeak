package net.portswigger.browser;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Ztv {
  private final Zce ZY;
  
  private final Set<String> Zo;
  
  public Ztv(Zce paramZce, Set<String> paramSet) {
    this.ZY = paramZce;
    this.Zo = paramSet;
  }
  
  public static Ztv ZD() {
    return new Ztv(null, Collections.emptySet());
  }
  
  public boolean Zs() {
    return (this.ZY == Zce.SCRIPT);
  }
  
  public boolean ZZ(String... paramVarArgs) {
    Objects.requireNonNull(this.Zo);
    return Arrays.<String>stream(paramVarArgs).anyMatch(this.Zo::contains);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ztv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */