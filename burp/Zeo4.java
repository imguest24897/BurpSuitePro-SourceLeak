package burp;

public class Zeo4 {
  private static int[] Zw;
  
  public Zs0y<Zgxp> Zp(Zlee paramZlee) {
    Zsa3<Zgxp> zsa3 = new Zsa3();
    Zs0y<Zgxp> zs0y = ZE(paramZlee, zsa3);
    zs0y = Zd(paramZlee, zs0y);
    zs0y = ZI(paramZlee, zs0y);
    int[] arrayOfInt = ZZ();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
    return zs0y;
  }
  
  private Zs0y<Zgxp> ZI(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    Zsa3<Zgxp> zsa3 = new Zsa3();
    Zs0y<Zgxp> zs0y = Ze(paramZlee, zsa3);
    zs0y = Zv(paramZlee, zs0y);
    zs0y = Zp(paramZlee, zs0y);
    return paramZs0y.ZW(zs0y);
  }
  
  private Zs0y<Zgxp> Zp(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    if (paramZlee.ZdB())
      paramZs0y = paramZs0y.ZJ(); 
    return paramZs0y;
  }
  
  private Zs0y<Zgxp> Zv(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    String str = paramZlee.Zdl();
    if (str != null)
      paramZs0y = paramZs0y.ZW(new Zse7(str)); 
    return paramZs0y;
  }
  
  private Zs0y<Zgxp> Ze(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    byte[] arrayOfByte = paramZlee.Zd3();
    if (arrayOfByte != null)
      paramZs0y = paramZlee.ZdK() ? paramZs0y.ZW(new Zsem(arrayOfByte)) : paramZs0y.ZW(new Zsev(arrayOfByte)); 
    return paramZs0y;
  }
  
  private Zs0y<Zgxp> Zd(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    if (paramZlee.ZdW())
      paramZs0y = paramZs0y.ZW(new Zse2()); 
    if (paramZlee.ZdU())
      paramZs0y = paramZs0y.ZW(new Zseq()); 
    return paramZs0y;
  }
  
  private Zs0y<Zgxp> ZE(Zlee paramZlee, Zs0y<Zgxp> paramZs0y) {
    Zs0y<Zgxp> zs0y = new Zseh();
    if (paramZlee.ZdS())
      zs0y = zs0y.ZB(new Zseb()); 
    if (paramZlee.Zd9())
      zs0y = zs0y.ZB(new Zsee()); 
    if (paramZlee.Zdc())
      zs0y = zs0y.ZB(new Zsea()); 
    if (paramZlee.ZdX())
      zs0y = zs0y.ZB(new Zsek()); 
    return paramZs0y.ZW(zs0y);
  }
  
  public static void ZK(int[] paramArrayOfint) {
    Zw = paramArrayOfint;
  }
  
  public static int[] ZZ() {
    return Zw;
  }
  
  static {
    if (ZZ() == null)
      ZK(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */