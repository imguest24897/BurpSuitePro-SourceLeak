package net.portswigger.javatooling.api;

public final class Parameter extends Record {
  private final String type;
  
  private final String name;
  
  private final boolean varargs;
  
  public Parameter(String paramString1, String paramString2) {
    this(paramString1, paramString2, false);
  }
  
  public Parameter(String paramString1, String paramString2, boolean paramBoolean) {
    this.type = paramString1;
    this.name = paramString2;
    this.varargs = paramBoolean;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/Parameter;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/Parameter;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/Parameter;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String type() {
    return this.type;
  }
  
  public String name() {
    return this.name;
  }
  
  public boolean varargs() {
    return this.varargs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\Parameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */