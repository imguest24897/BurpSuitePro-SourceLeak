package burp;

public abstract class Zr07<T> implements Zzbv<T> {
  private static String[] ZY;
  
  public T ZS(Zs6o paramZs6o) {
    return Zo(paramZs6o);
  }
  
  public T Zd(Zm5e paramZm5e) {
    return Zo(paramZm5e);
  }
  
  public T Zv(Zs9a paramZs9a) {
    return Zo(paramZs9a);
  }
  
  public T ZD(Zbio paramZbio) {
    return Zo(paramZbio);
  }
  
  public T ZO(Zso5 paramZso5) {
    return Zo(paramZso5);
  }
  
  public abstract T Zo(Zxss paramZxss);
  
  public static void ZJ(String[] paramArrayOfString) {
    ZY = paramArrayOfString;
  }
  
  public static String[] ZS() {
    return ZY;
  }
  
  static {
    if (ZS() != null)
      ZJ(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr07.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */