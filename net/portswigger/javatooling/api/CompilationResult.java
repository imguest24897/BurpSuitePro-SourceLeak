package net.portswigger.javatooling.api;

import java.util.Set;
import java.util.stream.Collectors;

public final class CompilationResult extends Record {
  private final Set<CompiledClass> compiledClasses;
  
  private final Set<Problem> problems;
  
  private static boolean ZB;
  
  public CompilationResult(Set<CompiledClass> paramSet, Set<Problem> paramSet1) {
    this.compiledClasses = paramSet;
    this.problems = paramSet1;
  }
  
  public Set<Problem> errors() {
    return (Set<Problem>)this.problems.stream().filter(CompilationResult::lambda$errors$0).collect(Collectors.toSet());
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/CompilationResult;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/CompilationResult;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/CompilationResult;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Set<CompiledClass> compiledClasses() {
    return this.compiledClasses;
  }
  
  public Set<Problem> problems() {
    return this.problems;
  }
  
  private static boolean lambda$errors$0(Problem paramProblem) {
    return (paramProblem.severity() == Severity.ERROR);
  }
  
  public static void ZP(boolean paramBoolean) {
    ZB = paramBoolean;
  }
  
  public static boolean ZS() {
    return ZB;
  }
  
  public static boolean Zt() {
    boolean bool = ZS();
    return !bool;
  }
  
  static {
    if (ZS())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\CompilationResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */