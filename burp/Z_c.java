package burp;

public class Z_c extends Zni implements Zxo {
  @Zzvo(1)
  private final Zefg<Zrte<Zstu>> Zh;
  
  public Z_c(Zefg<Zrte<Zstu>> paramZefg) {
    this.Zh = paramZefg;
  }
  
  public Zstu ZJb(int paramInt) {
    Zrte<Zstu> zrte = this.Zh.get(paramInt);
    return (zrte != null) ? zrte.ZdF(0) : null;
  }
  
  public Zstu ZJQ(int paramInt) {
    Zrte<Zstu> zrte = this.Zh.get(paramInt);
    return (zrte != null) ? zrte.ZdF(1) : null;
  }
  
  public void Zo(Zstu paramZstu1, Zstu paramZstu2) {
    Zyp<Zstu> zyp = new Zyp<>(Zstu.Zc, 2);
    zyp.ZU(1, paramZstu1);
    zyp.ZU(0, paramZstu2);
    String str = Zrla.Zi();
    this.Zh.add(zyp);
    if (Zbqc.Zwu() == null)
      Zrla.ZP("M4mnoc"); 
  }
  
  public Zeu4<? extends Zxo> ZF() {
    return ZZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */