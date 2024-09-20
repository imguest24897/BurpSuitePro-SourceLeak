package burp;

public class Zxh6 extends Zxsr implements Zl83 {
  protected Zxh6(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zefg<Zxwh> Zr8() {
    return this.Za.<Zefg<Zxwh>>ZJ(this, Zk_t.ZQ);
  }
  
  public byte[] Zrc() {
    String str = Zbsu.ZT();
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_t.Zw);
    if (Zbqc.Zwu() == null)
      Zbsu.Zq("qL2Vjc"); 
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public void Zl(byte[] paramArrayOfbyte) {
    String str = Zbsu.ZT();
    if (paramArrayOfbyte == null) {
      this.Za.ZQ(this, Zk_t.Zw, null);
      if (str != null) {
        Zstu zstu1 = this.Za.ZZ(paramArrayOfbyte);
        this.Za.ZQ(this, Zk_t.Zw, zstu1);
        return;
      } 
      return;
    } 
    Zstu zstu = this.Za.ZZ(paramArrayOfbyte);
    this.Za.ZQ(this, Zk_t.Zw, zstu);
  }
  
  public Zeu4<? extends Zl83> ZF() {
    return Zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxh6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */