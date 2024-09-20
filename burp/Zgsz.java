package burp;

public class Zgsz {
  private final Zkf3 Zv;
  
  private final boolean Zi;
  
  public Zgsz(Zkf3 paramZkf3) {
    this.Zv = paramZkf3;
    this.Zi = paramZkf3.ZK();
  }
  
  public void Zv(Zlli<Zt13> paramZlli, Zlli<Zt1o> paramZlli1) {
    if (this.Zi) {
      Zgrn zgrn = paramZlli1.ZE(Zt1o.ZZ, this::lambda$subscribeTo$0);
      Zts2.Zr().Zz(paramZlli, Zt13.Zd, zgrn::lambda$subscribeTo$1);
    } 
  }
  
  private void ZT(Zeaa paramZeaa) {
    this.Zv.Zf(paramZeaa);
  }
  
  private static void lambda$subscribeTo$1(Zgrn paramZgrn, Zxr8 paramZxr8) {
    paramZgrn.ZZ();
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */