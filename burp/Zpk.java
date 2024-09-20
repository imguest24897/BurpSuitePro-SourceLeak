package burp;

public class Zpk extends Zni implements Zb8m {
  @Zzvo(32)
  private final Zstu ZO;
  
  @Zzvo(33)
  private final int Zt;
  
  Zpk(Zstu paramZstu, int paramInt) {
    this.ZO = paramZstu;
    this.Zt = paramInt;
  }
  
  public Zeu4<? extends Zll7> ZF() {
    return (Zeu4)Zb8m.ZA;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Zpk))
      return false; 
    Zpk zpk = (Zpk)paramObject;
    return (Zewd.ZI(this, zpk) || Zsy() == zpk.Zsy());
  }
  
  public Zstu Zsf() {
    return this.ZO;
  }
  
  public int Zsy() {
    return this.Zt;
  }
  
  public void Zi(Zb_h paramZb_h, String paramString) {
    paramZb_h.ZQ(paramString, Zsf());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */