package net.portswigger;

import java.util.Optional;

public final class Zke extends Record implements Zrm9 {
  private final String Ze;
  
  private final Optional<String> Zd;
  
  public Zke(String paramString1, String paramString2) {
    this(paramString1, Optional.ofNullable(paramString2));
  }
  
  public Zke(String paramString, Optional<String> paramOptional) {
    this.Ze = paramString;
    this.Zd = paramOptional;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zke;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zke;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zke;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zke.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */