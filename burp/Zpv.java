package burp;

public class Zpv extends Zni implements Zdx {
  private final Zr_4 ZF;
  
  @Zzvo(0)
  private final Zefg<Ze87> Zy = new Zyu<>(Ze87.ZX, 10);
  
  @Zzvo(2)
  private final String ZL;
  
  Zpv(String paramString, Zr_4 paramZr_4) {
    this.ZL = paramString;
    this.ZF = paramZr_4;
  }
  
  public int Zuu() {
    return this.Zy.size();
  }
  
  public Ze87 ZAM(int paramInt) {
    return this.Zy.get(paramInt);
  }
  
  public void ZB(int paramInt, Ztn0 paramZtn0) {
    Zm6f.ZD(paramInt, paramZtn0, this.Zy);
  }
  
  public void Zf(Ze87 paramZe87, Ztn0 paramZtn0) {
    Zm6f.Zi(paramZe87, paramZtn0, this.Zy);
  }
  
  public void ZS(int paramInt, Ze87 paramZe87, Ztn0 paramZtn0) {
    Zm6f.ZF(paramInt, paramZe87, paramZtn0, this.Zy);
  }
  
  public boolean ZB(Zs66 paramZs66, String paramString1, String paramString2, Ztgr paramZtgr) {
    return Zm6f.ZV(paramZs66, paramString1, paramString2, this.Zy, paramZtgr);
  }
  
  public void ZC(Zmf_ paramZmf_) {
    Zm6f.ZQ(paramZmf_, this.Zy, this.ZL, this.ZF);
  }
  
  public void ZP(Zmf_ paramZmf_, Ztn0 paramZtn0) {
    Zm6f.ZF(paramZmf_, paramZtn0, this.Zy, this.ZL, this.ZF);
  }
  
  public void ZF(Zg4j paramZg4j) {
    Zm6f.ZA(paramZg4j, this.Zy, this.ZL);
  }
  
  public Zeu4<Zdx> ZF() {
    return Zdx.Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */