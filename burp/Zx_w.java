package burp;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.javatooling.api.CompilationResult;
import net.portswigger.javatooling.api.CompletionProposal;
import net.portswigger.javatooling.api.JavadocNode;
import net.portswigger.javatooling.api.Problem;
import net.portswigger.javatooling.api.Signature;

public class Zx_w implements Zm51 {
  private final Zm51 ZZ;
  
  private final Zkf2 Zc;
  
  public Zx_w(Zm51 paramZm51, Zkf2 paramZkf2) {
    this.ZZ = paramZm51;
    this.Zc = paramZkf2;
  }
  
  public CompilationResult compile(String paramString1, String paramString2) {
    CompilationResult compilationResult = this.ZZ.compile(paramString1, this.Zc.ZW(paramString2));
    Set set = (Set)compilationResult.problems().stream().map(this::lambda$compile$0).collect(Collectors.toSet());
    return new CompilationResult(compilationResult.compiledClasses(), set);
  }
  
  public List<CompletionProposal> complete(String paramString, int paramInt) {
    List list = this.ZZ.complete(this.Zc.ZW(paramString), this.Zc.ZB(paramInt));
    return list.stream().map(this::lambda$complete$1).toList();
  }
  
  public JavadocNode javadoc(String paramString1, String paramString2, Signature paramSignature) {
    return this.ZZ.javadoc(paramString1, paramString2, paramSignature);
  }
  
  public void close() {}
  
  private CompletionProposal lambda$complete$1(CompletionProposal paramCompletionProposal) {
    return new CompletionProposal(paramCompletionProposal.kind(), paramCompletionProposal.completion(), paramCompletionProposal.relevance(), paramCompletionProposal.name(), paramCompletionProposal.declarationSignature(), paramCompletionProposal.signature(), this.Zc.Zw(paramCompletionProposal.replacementRange()), paramCompletionProposal.flags());
  }
  
  private Problem lambda$compile$0(Problem paramProblem) {
    return new Problem(paramProblem.description(), paramProblem.severity(), this.Zc.ZI(paramProblem.sourceLineNumber()), this.Zc.Zw(paramProblem.sourceRange()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */