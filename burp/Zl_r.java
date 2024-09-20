package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.HighlightColor;

final class Zl_r extends Record implements Annotations {
  private final Zskl Zi;
  
  private final Zrzh Zy;
  
  private Zl_r(Zskl paramZskl, Zrzh paramZrzh) {
    this.Zi = paramZskl;
    this.Zy = paramZrzh;
  }
  
  public String notes() {
    return this.Zy.Zv();
  }
  
  public boolean hasNotes() {
    return (notes() != null && !notes().isEmpty());
  }
  
  public boolean hasHighlightColor() {
    return (highlightColor() != HighlightColor.NONE);
  }
  
  public void setNotes(String paramString) {
    this.Zy.ZI(paramString);
  }
  
  public HighlightColor highlightColor() {
    return Zt6v.ZO(this.Zy.ZA());
  }
  
  public void setHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    this.Zy.ZQ(zmtd);
  }
  
  public Annotations withNotes(String paramString) {
    return this.Zi.Zm(paramString, this.Zy.ZA());
  }
  
  public Annotations withHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    return this.Zi.Zm(this.Zy.Zv(), zmtd);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zl_r;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zl_r;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zl_r;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */