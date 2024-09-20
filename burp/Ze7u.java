package burp;

public class Ze7u {
  private final Zlfb Zj;
  
  private final Ztj1 Zs;
  
  private static int[] Zi;
  
  public Ze7u(Zlfb paramZlfb, Ztj1 paramZtj1) {
    this.Zj = paramZlfb;
    this.Zs = paramZtj1;
  }
  
  public Zbv_ ZW(Zsjd paramZsjd) {
    return new Zbv_(this.Zj, paramZsjd, this.Zs);
  }
  
  public static void ZJ(int[] paramArrayOfint) {
    Zi = paramArrayOfint;
  }
  
  public static int[] Zk() {
    return Zi;
  }
  
  static {
    if (Zk() == null)
      ZJ(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */