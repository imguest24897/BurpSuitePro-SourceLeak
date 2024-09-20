package net.portswigger;

import java.util.Optional;
import java.util.Set;

public class Zbp implements Zzi {
  private final String ZW;
  
  private final String Zm;
  
  private final Set<String> ZE;
  
  private final Set<String> Zu;
  
  public Zbp(String paramString1, String paramString2, Set<String> paramSet1, Set<String> paramSet2) {
    this.ZW = paramString1;
    this.Zm = paramString2;
    this.ZE = paramSet1;
    this.Zu = paramSet2;
  }
  
  public Optional<String> ZX() {
    return Optional.ofNullable(this.ZW);
  }
  
  public Optional<String> ZB() {
    return Optional.ofNullable(this.Zm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zbp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */