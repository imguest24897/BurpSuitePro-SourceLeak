package net.portswigger.javatooling.api;

import java.util.List;

public final class Signature extends Record {
  private final String type;
  
  private final List<Parameter> parameters;
  
  public Signature(String paramString, List<Parameter> paramList) {
    this.type = paramString;
    this.parameters = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/javatooling/api/Signature;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/javatooling/api/Signature;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/javatooling/api/Signature;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String type() {
    return this.type;
  }
  
  public List<Parameter> parameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\Signature.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */