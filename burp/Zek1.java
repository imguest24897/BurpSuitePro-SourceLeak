package burp;

class Zek1 {
  private final StringBuilder ZC;
  
  private final Zefg<Zxtl> Zo;
  
  Zek1(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg) {
    this.ZC = paramStringBuilder;
    this.Zo = paramZefg;
  }
  
  Zr20 ZO(byte paramByte, int paramInt, Ztlj paramZtlj) {
    int i = Zgky.Zy(paramByte, paramZtlj);
    return (i > 0) ? new Zr24(this.ZC, this.Zo, paramInt, i) : new Zr2p(this.ZC, this.Zo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zek1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */