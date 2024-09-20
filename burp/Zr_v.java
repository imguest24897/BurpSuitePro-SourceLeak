package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.HighlightColor;

final class Zr_v extends Record implements Annotations, Proxyable {
  private final IHttpRequestResponse Zj;
  
  private Zr_v(IHttpRequestResponse paramIHttpRequestResponse) {
    this.Zj = paramIHttpRequestResponse;
  }
  
  public String notes() {
    return this.Zj.getComment();
  }
  
  public boolean hasNotes() {
    return false;
  }
  
  public boolean hasHighlightColor() {
    return false;
  }
  
  public void setNotes(String paramString) {
    this.Zj.setComment(paramString);
  }
  
  public HighlightColor highlightColor() {
    return Zt6v.ZO(Zmtd.ZL(this.Zj.getHighlight()));
  }
  
  public void setHighlightColor(HighlightColor paramHighlightColor) {
    this.Zj.setHighlight((Zblx.ZA(paramHighlightColor)).name);
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
    //   1: <illegal opcode> toString : (Lburp/Zr_v;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zr_v;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zr_v;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */