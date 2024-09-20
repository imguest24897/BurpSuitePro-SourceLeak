package burp;

public abstract class Ze1f extends Ze3y {
  protected boolean ZJ;
  
  private static int[] ZP;
  
  protected void Zs(Ztyn paramZtyn, Zgcq paramZgcq, Zr4p paramZr4p) {
    paramZgcq.Zg(paramZr4p);
    paramZr4p.Zi(paramZtyn, paramZgcq);
  }
  
  public boolean ZR() {
    return this.ZJ;
  }
  
  public static void ZL(int[] paramArrayOfint) {
    ZP = paramArrayOfint;
  }
  
  public static int[] Zr() {
    return ZP;
  }
  
  static {
    if (Zr() == null)
      ZL(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */