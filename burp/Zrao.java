package burp;

import java.util.Objects;

class Zrao implements Zg5o {
  private final Zkyt ZB;
  
  private Zbr ZD;
  
  public Zrao(Zkyt paramZkyt) {
    this.ZB = paramZkyt;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZD = new Zbr(null, Zyf.Zy(paramZr6q.ZD()), this.ZB);
  }
  
  public void ZS(Zr6h paramZr6h) {
    Zyu<Zk94> zyu = new Zyu<>(Zk94.ZR, paramZr6h.ZK().size());
    Objects.requireNonNull(zyu);
    paramZr6h.ZK().stream().map(Zrao::Zq).forEach(zyu::add);
    int i = Zbr.Zj();
    this.ZD = new Zbr(zyu, Zyf.Zy(paramZr6h.Zw()), Zkyt.HTTP2);
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private static Zk94 Zq(Ztnz paramZtnz) {
    return new Zca(Zyf.Zy(paramZtnz.Ze), Zyf.Zy(paramZtnz.ZM));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrao.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */