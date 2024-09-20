package burp;

import java.util.Collections;
import java.util.List;

final class Zsl4<T> extends Record {
  private final boolean ZQC;
  
  private final boolean ZQf;
  
  private final int ZQJ;
  
  private final int ZQq;
  
  private final List<T> ZQZ;
  
  private Zsl4(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<T> paramList) {
    this.ZQC = paramBoolean1;
    this.ZQf = paramBoolean2;
    this.ZQJ = paramInt1;
    this.ZQq = paramInt2;
    this.ZQZ = paramList;
  }
  
  static <T> Zsl4<T> ZT(int paramInt1, int paramInt2) {
    return new Zsl4<>(true, false, paramInt1, paramInt2, Collections.emptyList());
  }
  
  static <T> Zsl4<T> ZE(int paramInt, List<T> paramList) {
    return new Zsl4<>(false, true, paramInt, 0, paramList);
  }
  
  static <T> Zsl4<T> Zf(int paramInt1, int paramInt2, List<T> paramList) {
    return new Zsl4<>(true, true, paramInt1, paramInt2, paramList);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsl4;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsl4;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsl4;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZQC() {
    return this.ZQC;
  }
  
  public boolean ZQf() {
    return this.ZQf;
  }
  
  public int ZQJ() {
    return this.ZQJ;
  }
  
  public int ZQq() {
    return this.ZQq;
  }
  
  public List<T> ZQZ() {
    return this.ZQZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */