package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.javatooling.api.CompilationResult;
import net.portswigger.javatooling.api.CompletionProposal;
import net.portswigger.javatooling.api.JavadocNode;
import net.portswigger.javatooling.api.Signature;

public class Zv8 implements Zm51 {
  public void close() {}
  
  public CompilationResult compile(String paramString1, String paramString2) {
    return new CompilationResult(Collections.emptySet(), Collections.emptySet());
  }
  
  public List<CompletionProposal> complete(String paramString, int paramInt) {
    return Collections.emptyList();
  }
  
  public JavadocNode javadoc(String paramString1, String paramString2, Signature paramSignature) {
    return new JavadocNode("");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */