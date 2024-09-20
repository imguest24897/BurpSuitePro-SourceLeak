package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.HighlightColor;

final class Zsyb extends Record implements Annotations {
  private final Zskl Zw;
  
  private final Zto7 Zq;
  
  private Zsyb(Zskl paramZskl, Zto7 paramZto7) {
    this.Zw = paramZskl;
    this.Zq = paramZto7;
  }
  
  public String notes() {
    return this.Zq.ZIx();
  }
  
  public boolean hasNotes() {
    return (notes() != null && !notes().isEmpty());
  }
  
  public boolean hasHighlightColor() {
    return (highlightColor() != HighlightColor.NONE);
  }
  
  public void setNotes(String paramString) {
    this.Zq.Zxg(paramString);
  }
  
  public HighlightColor highlightColor() {
    return Zt6v.ZR(this.Zq.ZaP());
  }
  
  public void setHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    this.Zq.ZB(zmtd.index);
  }
  
  public Annotations withNotes(String paramString) {
    return this.Zw.Zm(paramString, Zmtd.ZC(this.Zq.ZaP()));
  }
  
  public Annotations withHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    return this.Zw.Zm(this.Zq.ZIx(), zmtd);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsyb;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsyb;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsyb;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */