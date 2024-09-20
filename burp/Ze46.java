package burp;

public class Ze46 {
  public final Zvs ZU;
  
  public final Zr3z ZN;
  
  private Ze46(Zvs paramZvs, Zr3z paramZr3z) {
    this.ZU = paramZvs;
    this.ZN = paramZr3z;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Ze46 ze46 = (Ze46)paramObject;
    return !this.ZU.equals(ze46.ZU) ? false : ((this.ZN == ze46.ZN));
  }
  
  public int hashCode() {
    null = this.ZU.hashCode();
    return 31 * null + ((this.ZN != null) ? this.ZN.hashCode() : 0);
  }
  
  public String toString() {
    return (this.ZN == null) ? this.ZU.toString() : (this.ZU.toString() + " " + this.ZU.toString());
  }
  
  public static Ze46 ZT(Zvs paramZvs) {
    return new Ze46(paramZvs, null);
  }
  
  public static Ze46 Zo(Zvs paramZvs, Zr3z paramZr3z) {
    return new Ze46(paramZvs, paramZr3z);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze46.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */