package net.portswigger.devtools.client.impl.connection.local;

import java.net.URI;

final class Zy extends Record {
  private final URI ZOi;
  
  private final String ZOc;
  
  private Zy(URI paramURI, String paramString) {
    this.ZOi = paramURI;
    this.ZOc = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/impl/connection/local/Zy;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/connection/local/Zy;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/connection/local/Zy;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public URI ZOi() {
    return this.ZOi;
  }
  
  public String ZOc() {
    return this.ZOc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\Zy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */