package burp;

public abstract class Zgmw implements Ztoo {
  private static int[] ZO;
  
  public void ZZ(Zgim paramZgim, Zs68 paramZs68) {
    int[] arrayOfInt = ZH();
    for (Ztu8 ztu8 : Zebz.Zf(paramZs68)) {
      Zh(paramZgim, ztu8);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  protected abstract void Zh(Zgim paramZgim, Ztu8 paramZtu8);
  
  public static void Zk(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZO;
  }
  
  static {
    if (ZH() != null)
      Zk(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */