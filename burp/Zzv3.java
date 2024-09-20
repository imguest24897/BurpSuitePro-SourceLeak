package burp;

public abstract class Zzv3<M, I> {
  public abstract M Zo();
  
  public abstract int Zm();
  
  public abstract int ZW();
  
  public abstract Object ZU(int paramInt1, int paramInt2);
  
  public String Zs(int paramInt1, int paramInt2) {
    Object object = ZU(paramInt1, paramInt2);
    if (object == null)
      return ""; 
    String str = object.toString();
    return (str == null) ? "" : str;
  }
  
  public abstract I Zq(int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */