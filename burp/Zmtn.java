package burp;

public class Zmtn {
  private final Zeg1 ZV;
  
  public Zmtn(Zeg1 paramZeg1) {
    this.ZV = paramZeg1;
  }
  
  public void ZA(Ztos<Zt35> paramZtos) {
    int[] arrayOfInt = Zlrg.ZG();
    paramZtos.ZO(Zt35.Zo, this::lambda$subscribeTo$0, Zr_b.ZS.ZV(1));
    if (Zbqc.Zwu() == null)
      Zlrg.Zw(new int[3]); 
  }
  
  void ZQ(Zs_l paramZs_l) {
    this.ZV.ZX(paramZs_l.Zpt().Zsu());
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */