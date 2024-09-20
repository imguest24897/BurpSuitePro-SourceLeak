package burp;

public class Zb1i {
  private final int Zv;
  
  public static Zb1i Zk(int paramInt) {
    return new Zb1i(paramInt);
  }
  
  private Zb1i(int paramInt) {
    this.Zv = paramInt;
  }
  
  public int ZN() {
    return this.Zv;
  }
  
  public String toString() {
    return "" + this.Zv;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Zb1i))
      return false; 
    Zb1i zb1i = (Zb1i)paramObject;
    return (this.Zv == zb1i.ZN());
  }
  
  public int hashCode() {
    return this.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */