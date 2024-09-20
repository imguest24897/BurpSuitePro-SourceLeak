package burp;

import burp.api.montoya.scanner.CrawlConfiguration;
import java.util.List;

public class Zgk2 implements CrawlConfiguration {
  private final List<String> Zw;
  
  public Zgk2(String... paramVarArgs) {
    this.Zw = List.of(paramVarArgs);
  }
  
  public static CrawlConfiguration ZY(String... paramVarArgs) {
    return new Zgk2(paramVarArgs);
  }
  
  public List<String> seedUrls() {
    return this.Zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */