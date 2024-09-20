package burp;

public class Zbzh {
  private static int Zo;
  
  final int Zv;
  
  final String Zs;
  
  final byte[] ZZ;
  
  public Zbzh(Zstu paramZstu, boolean paramBoolean) {
    this.ZZ = paramZstu.ZiD();
    int i = Zrtd.Zj();
    if (paramBoolean) {
      this.Zv = ++Zo;
      int j = paramZstu.Zpu();
      if (j > 200)
        j = 200; 
      this.Zs = Zruv.ZO(paramZstu, 0, j);
      if (i != 0) {
        this.Zv = 0;
        this.Zs = null;
        return;
      } 
      return;
    } 
    this.Zv = 0;
    this.Zs = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */