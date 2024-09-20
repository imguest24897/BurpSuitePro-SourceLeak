package burp;

import burp.api.montoya.collaborator.CollaboratorServer;
import java.util.function.Supplier;

class Zrb3 implements CollaboratorServer {
  private final Supplier<String> Zf;
  
  Zrb3(String paramString) {
    this(paramString::lambda$new$0);
  }
  
  Zrb3(Supplier<String> paramSupplier) {
    this.Zf = paramSupplier;
  }
  
  public String address() {
    return this.Zf.get();
  }
  
  public boolean isLiteralAddress() {
    String str = this.Zf.get();
    return (Zmab.ZC(str) || Zmab.ZE(str));
  }
  
  private static String lambda$new$0(String paramString) {
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrb3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */