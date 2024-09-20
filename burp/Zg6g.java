package burp;

import burp.api.montoya.scanner.bchecks.BCheckImportResult;
import burp.api.montoya.scanner.bchecks.BChecks;

public class Zg6g implements BChecks {
  private final Zgvn ZX;
  
  public Zg6g(Zgvn paramZgvn) {
    this.ZX = paramZgvn;
  }
  
  public BCheckImportResult importBCheck(String paramString) {
    return importBCheck(paramString, false);
  }
  
  public BCheckImportResult importBCheck(String paramString, boolean paramBoolean) {
    Zryx zryx = this.ZX.ZD(paramString, paramBoolean);
    return new Ze_y(this, zryx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */