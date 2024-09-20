package net.portswigger.browser;

import java.util.Arrays;
import java.util.List;

public final class Ztm extends Record implements Zd6 {
  private final List<Zc7> ZXC;
  
  public Ztm(Zc7... paramVarArgs) {
    this(Arrays.asList(paramVarArgs));
  }
  
  public Ztm(List<Zc7> paramList) {
    this.ZXC = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Ztm;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Ztm;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Ztm;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zc7> ZXC() {
    return this.ZXC;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ztm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */