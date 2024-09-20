package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.HighlightColor;

final class Zb0u extends Record implements Annotations, Proxyable {
  private final Zmfj ZD;
  
  private Zb0u(Zmfj paramZmfj) {
    this.ZD = paramZmfj;
  }
  
  public String notes() {
    return this.ZD.ZV();
  }
  
  public boolean hasNotes() {
    return (notes() != null && !notes().isEmpty());
  }
  
  public boolean hasHighlightColor() {
    return (highlightColor() != HighlightColor.NONE);
  }
  
  public void setNotes(String paramString) {
    this.ZD.ZP(paramString);
  }
  
  public HighlightColor highlightColor() {
    return Zt6v.ZO(Zmtd.ZL(this.ZD.ZN()));
  }
  
  public void setHighlightColor(HighlightColor paramHighlightColor) {
    this.ZD.ZB((Zblx.ZA(paramHighlightColor)).name);
  }
  
  public Annotations withNotes(String paramString) {
    return Zs9n.ZJ(paramString, highlightColor());
  }
  
  public Annotations withHighlightColor(HighlightColor paramHighlightColor) {
    return Zs9n.ZJ(notes(), paramHighlightColor);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zb0u;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zb0u;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zb0u;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */