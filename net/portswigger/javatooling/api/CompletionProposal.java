package net.portswigger.javatooling.api;

import burp.Zbqc;
import java.util.EnumSet;

public final class CompletionProposal extends Record {
  private final Kind kind;
  
  private final String completion;
  
  private final int relevance;
  
  private final String name;
  
  private final String declarationSignature;
  
  private final Signature signature;
  
  private final Range replacementRange;
  
  private final EnumSet<Flag> flags;
  
  public CompletionProposal(Kind paramKind, String paramString1, int paramInt, String paramString2, String paramString3, Signature paramSignature, Range paramRange, EnumSet<Flag> paramEnumSet) {
    this.kind = paramKind;
    this.completion = paramString1;
    boolean bool = CompilationResult.ZS();
    this.relevance = paramInt;
    this.name = paramString2;
    this.declarationSignature = paramString3;
    this.signature = paramSignature;
    this.replacementRange = paramRange;
    this.flags = paramEnumSet;
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/CompletionProposal;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/CompletionProposal;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/CompletionProposal;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Kind kind() {
    return this.kind;
  }
  
  public String completion() {
    return this.completion;
  }
  
  public int relevance() {
    return this.relevance;
  }
  
  public String name() {
    return this.name;
  }
  
  public String declarationSignature() {
    return this.declarationSignature;
  }
  
  public Signature signature() {
    return this.signature;
  }
  
  public Range replacementRange() {
    return this.replacementRange;
  }
  
  public EnumSet<Flag> flags() {
    return this.flags;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\CompletionProposal.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */