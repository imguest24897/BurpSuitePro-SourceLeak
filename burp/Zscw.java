package burp;

import java.util.Objects;

class Zscw {
  private final String Za;
  
  private final int ZP;
  
  private final boolean Zr;
  
  private Zscw(Zmzk paramZmzk) {
    this(paramZmzk.ZJ1(), paramZmzk.ZJO(), paramZmzk.ZJZ());
  }
  
  private Zscw(String paramString, int paramInt, boolean paramBoolean) {
    this.Za = paramString;
    this.ZP = paramInt;
    this.Zr = paramBoolean;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zscw zscw = (Zscw)paramObject;
    return (this.ZP == zscw.ZP && this.Zr == zscw.Zr && Objects.equals(this.Za, zscw.Za));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Za, Integer.valueOf(this.ZP), Boolean.valueOf(this.Zr) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zscw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */