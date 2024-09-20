package burp;

public class Zvp implements Zrwi {
  private static final int[] ZV = new int[] { 4, 3, 1 };
  
  private final Zz49 ZG;
  
  private final Zee7 ZI;
  
  Zvp(Zz49 paramZz49, Zee7 paramZee7) {
    this.ZG = paramZz49;
    this.ZI = paramZee7;
  }
  
  public boolean ZS() {
    return (this.ZI.Zx() <= 0.5D);
  }
  
  public long Zt() {
    Zldy zldy = new Zldy();
    int[] arrayOfInt1 = Zee7.Zb();
    int[] arrayOfInt2 = ZV;
    int i = arrayOfInt2.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt2[b];
      long l = this.ZI.ZX() - ZQ(j);
      this.ZG.Zb(new Zrz9(this, l, zldy));
      if (this.ZI.Zx() < 0.75D || arrayOfInt1 != null) {
        b++;
        if (arrayOfInt1 != null)
          break; 
      } 
    } 
    return zldy.ZB;
  }
  
  private int ZQ(int paramInt) {
    return paramInt * 24 * 60 * 60 * 1000;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */