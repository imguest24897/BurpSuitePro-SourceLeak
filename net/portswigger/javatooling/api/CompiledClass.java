package net.portswigger.javatooling.api;

public final class CompiledClass extends Record {
  private final String name;
  
  private final byte[] bytes;
  
  public CompiledClass(String paramString, byte[] paramArrayOfbyte) {
    this.name = paramString;
    this.bytes = paramArrayOfbyte;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/CompiledClass;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/CompiledClass;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/CompiledClass;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String name() {
    return this.name;
  }
  
  public byte[] bytes() {
    return this.bytes;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\CompiledClass.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */