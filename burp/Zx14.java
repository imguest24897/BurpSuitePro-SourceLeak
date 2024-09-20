package burp;

public class Zx14 extends Zxsr implements Zgak {
  private static int[] Zb;
  
  Zx14(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  private Ztk0 Z_() {
    return this.Za.<Ztk0>ZJ(this, Zk6c.ZM);
  }
  
  private int Zc() {
    return this.Za.Zx(this, Zk6c.ZE);
  }
  
  private int Zo() {
    return this.Za.Zx(this, Zk6c.Zk);
  }
  
  private Zzwo<Zrp0, Zm6i> Zb() {
    return this.Za.<Zzwo<Zrp0, Zm6i>>ZJ(this, Zk6c.Zp);
  }
  
  public void Z_(Zt8i paramZt8i, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zl7r.Zx(paramZt8i, Zb(), Zo(), Zc(), paramZt1i, Z_(), this, this.Za, paramZz1m, paramZmv7);
  }
  
  public Zeu4<? extends Zgak> ZF() {
    return Zgak.ZV;
  }
  
  public static void Zc(int[] paramArrayOfint) {
    Zb = paramArrayOfint;
  }
  
  public static int[] Zp() {
    return Zb;
  }
  
  static {
    if (Zp() != null)
      Zc(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */