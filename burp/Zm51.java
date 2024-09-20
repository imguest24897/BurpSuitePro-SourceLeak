package burp;

import net.portswigger.javatooling.api.CompilationService;
import net.portswigger.javatooling.api.CompletionService;
import net.portswigger.javatooling.api.JavadocService;

public interface Zm51 extends CompilationService, CompletionService, JavadocService, AutoCloseable {
  public static final Zm51 Zd = new Zv8();
  
  void close();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm51.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */