package burp;

import java.lang.ref.Cleaner;
import java.util.List;
import java.util.Objects;
import net.portswigger.javatooling.api.CompilationResult;
import net.portswigger.javatooling.api.CompletionProposal;
import net.portswigger.javatooling.api.JavadocNode;
import net.portswigger.javatooling.api.ServiceLookup;
import net.portswigger.javatooling.api.Signature;

class Ze28 implements Zm51 {
  private static final Cleaner ZA = Cleaner.create();
  
  private final Cleaner.Cleanable Z_;
  
  private ServiceLookup ZY;
  
  Ze28(ServiceLookup paramServiceLookup, Runnable paramRunnable) {
    this.ZY = Objects.<ServiceLookup>requireNonNull(paramServiceLookup);
    this.Z_ = ZA.register(this, paramRunnable);
  }
  
  public synchronized void close() {
    try {
      if (this.ZY != null) {
        this.Z_.clean();
        this.ZY = null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public CompilationResult compile(String paramString1, String paramString2) {
    try {
      if (this.ZY == null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.ZY.compilationService().compile(paramString1, paramString2);
  }
  
  public List<CompletionProposal> complete(String paramString, int paramInt) {
    try {
      if (this.ZY == null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.ZY.completionService().complete(paramString, paramInt);
  }
  
  public JavadocNode javadoc(String paramString1, String paramString2, Signature paramSignature) {
    try {
      if (this.ZY == null)
        throw new IllegalStateException(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.ZY.javadocService().javadoc(paramString1, paramString2, paramSignature);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze28.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */