package burp;

import java.util.function.Supplier;
import net.portswigger.javatooling.api.CompletionProposal;
import net.portswigger.javatooling.api.JavadocNode;

public class Zgk {
  private final Zm51 Zr;
  
  private final Supplier<Zznc> ZM;
  
  public Zgk(Zm51 paramZm51, Supplier<Zznc> paramSupplier) {
    this.Zr = paramZm51;
    this.ZM = paramSupplier;
  }
  
  public Supplier<String> Zo(CompletionProposal paramCompletionProposal) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> get : (Lburp/Zgk;Lnet/portswigger/javatooling/api/CompletionProposal;)Ljava/util/function/Supplier;
    //   7: areturn
  }
  
  private String Zp(CompletionProposal paramCompletionProposal) {
    String str1 = paramCompletionProposal.name();
    String str2 = paramCompletionProposal.declarationSignature();
    if (str2 == null)
      return null; 
    JavadocNode javadocNode = this.Zr.javadoc(str2, str1, paramCompletionProposal.signature());
    return Zew6.ZU(javadocNode, this.ZM);
  }
  
  private String lambda$createJavadocSupplier$0(CompletionProposal paramCompletionProposal) {
    return Zp(paramCompletionProposal);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */