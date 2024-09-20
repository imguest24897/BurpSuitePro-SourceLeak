package net.portswigger.javatooling.api;

import burp.Zbqc;

public final class Problem extends Record {
  private final String description;
  
  private final Severity severity;
  
  private final int sourceLineNumber;
  
  private final Range sourceRange;
  
  public Problem(String paramString, Severity paramSeverity, int paramInt, Range paramRange) {
    this.description = paramString;
    boolean bool = CompilationResult.Zt();
    this.severity = paramSeverity;
    this.sourceLineNumber = paramInt;
    this.sourceRange = paramRange;
    if (Zbqc.Zwu() == null)
      CompilationResult.ZP(!bool); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/Problem;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/Problem;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/Problem;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String description() {
    return this.description;
  }
  
  public Severity severity() {
    return this.severity;
  }
  
  public int sourceLineNumber() {
    return this.sourceLineNumber;
  }
  
  public Range sourceRange() {
    return this.sourceRange;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\Problem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */