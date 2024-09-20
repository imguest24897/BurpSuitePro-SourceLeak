package burp;

import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.BuiltInAuditConfiguration;

public class Zkme implements AuditConfiguration, Proxyable {
  private final BuiltInAuditConfiguration ZM;
  
  public Zkme(BuiltInAuditConfiguration paramBuiltInAuditConfiguration) {
    this.ZM = paramBuiltInAuditConfiguration;
  }
  
  public BuiltInAuditConfiguration ZU() {
    return this.ZM;
  }
  
  public static AuditConfiguration ZR(BuiltInAuditConfiguration paramBuiltInAuditConfiguration) {
    return new Zkme(paramBuiltInAuditConfiguration);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */