package net.portswigger.swagger.v2;

import java.util.List;

public final class ConversionResult extends Record {
  private final String convertedDefinition;
  
  private final List<String> messages;
  
  private final boolean valid;
  
  public ConversionResult(String paramString, List<String> paramList, boolean paramBoolean) {
    this.convertedDefinition = paramString;
    this.messages = paramList;
    this.valid = paramBoolean;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/swagger/v2/ConversionResult;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/swagger/v2/ConversionResult;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/swagger/v2/ConversionResult;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String convertedDefinition() {
    return this.convertedDefinition;
  }
  
  public List<String> messages() {
    return this.messages;
  }
  
  public boolean valid() {
    return this.valid;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v2\ConversionResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */