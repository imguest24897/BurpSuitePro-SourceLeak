package burp;

import burp.api.montoya.scanner.bchecks.BCheckImportResult;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zrz4;
import net.portswigger.Zuh;

class Ze_y implements BCheckImportResult {
  final Zmo3 Zw;
  
  Ze_y(Zg6g paramZg6g, Zmo3 paramZmo3) {}
  
  public BCheckImportResult.Status status() {
    try {
    
    } catch (Zrz4 zrz4) {
      throw a(null);
    } 
    return this.Zw.Zt().isEmpty() ? BCheckImportResult.Status.LOADED_WITHOUT_ERRORS : BCheckImportResult.Status.LOADED_WITH_ERRORS;
  }
  
  public List<String> importErrors() {
    return this.Zw.Zt().stream().map(Ze_y::lambda$importErrors$0).toList();
  }
  
  private static String lambda$importErrors$0(Exception paramException) {
    if (paramException instanceof Zrz4) {
      Zrz4 zrz4 = (Zrz4)paramException;
      return zrz4.ZJ();
    } 
    Zuh.ZT(false, Zqf.Zr, paramException.getClass().getName());
    return paramException.getMessage();
  }
  
  private static Zrz4 a(Zrz4 paramZrz4) {
    return paramZrz4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */