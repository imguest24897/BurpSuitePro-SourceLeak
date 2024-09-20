package net.portswigger.javatooling.api;

public final class Range extends Record {
  private final int startIndex;
  
  private final int endIndex;
  
  public Range(int paramInt1, int paramInt2) {
    this.startIndex = paramInt1;
    this.endIndex = paramInt2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/Range;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/Range;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/Range;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startIndex() {
    return this.startIndex;
  }
  
  public int endIndex() {
    return this.endIndex;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\Range.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */