package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.HighlightColor;

final class Zz6u extends Record implements Annotations {
  private final Zskl ZS;
  
  private final Zlv8 ZH;
  
  private Zz6u(Zskl paramZskl, Zlv8 paramZlv8) {
    this.ZS = paramZskl;
    this.ZH = paramZlv8;
  }
  
  public String notes() {
    return this.ZH.ZE();
  }
  
  public boolean hasNotes() {
    return (notes() != null && !notes().isEmpty());
  }
  
  public boolean hasHighlightColor() {
    return (highlightColor() != HighlightColor.NONE);
  }
  
  public void setNotes(String paramString) {
    this.ZH.Zx(paramString);
  }
  
  public HighlightColor highlightColor() {
    return Zt6v.ZR(this.ZH.Zq());
  }
  
  public void setHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    this.ZH.Zj(zmtd.index);
  }
  
  public Annotations withNotes(String paramString) {
    Zmtd zmtd = Zmtd.ZC(this.ZH.Zq());
    return this.ZS.Zm(paramString, zmtd);
  }
  
  public Annotations withHighlightColor(HighlightColor paramHighlightColor) {
    Zmtd zmtd = Zblx.ZA(paramHighlightColor);
    return this.ZS.Zm(this.ZH.ZE(), zmtd);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zz6u;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zz6u;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zz6u;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */