package burp;

public abstract class Zgxr<T> implements Zgc<T> {
  private static int[] ZV;
  
  public void ZH() {}
  
  public void Zy(int paramInt, T paramT) {}
  
  public void Zd(int paramInt) {}
  
  public void Za() {}
  
  public static void Zn(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] Zk() {
    return ZV;
  }
  
  static {
    if (Zk() == null)
      Zn(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */