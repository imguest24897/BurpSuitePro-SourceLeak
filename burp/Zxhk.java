package burp;

public class Zxhk extends Zxsr implements Zxo {
  protected Zxhk(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zstu ZJb(int paramInt) {
    Zrte<Zstu> zrte = ZS().get(paramInt);
    return (zrte != null) ? zrte.ZdF(0) : null;
  }
  
  public Zstu ZJQ(int paramInt) {
    Zrte<Zstu> zrte = ZS().get(paramInt);
    return (zrte != null) ? zrte.ZdF(1) : null;
  }
  
  public void Zo(Zstu paramZstu1, Zstu paramZstu2) {
    Zefg<Zrte<Zstu>> zefg = ZS();
    Zrte<Zstu> zrte = this.Za.<Zrte>Zv((Zllg)new Zguz<>(Zstu.Zc), 2);
    zrte.ZU(1, paramZstu1);
    zrte.ZU(0, paramZstu2);
    String str = Zrla.Zi();
    zefg.add(zrte);
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zeu4<? extends Zxo> ZF() {
    return ZZ;
  }
  
  private Zefg<Zrte<Zstu>> ZS() {
    return (Zefg<Zrte<Zstu>>)this.Za.ZJ(this, Zk0q.Zb);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */