package burp;

class Zs1p {
  private final int ZA;
  
  Zs1p(int paramInt) {
    this.ZA = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zs1p zs1p = (Zs1p)paramObject;
    return (this.ZA == zs1p.ZA);
  }
  
  public int hashCode() {
    return this.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */