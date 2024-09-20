package burp;

class Zr24 extends Zr20 {
  private final int Zq;
  
  Zr24(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, int paramInt1, int paramInt2) {
    super(paramStringBuilder, paramZefg);
    this.Zq = paramInt1 | paramInt2;
  }
  
  boolean Zw(Zgkc paramZgkc, int paramInt) {
    return ((this.Zq & paramInt) == paramInt);
  }
  
  int ZA(Zgkc paramZgkc) {
    return this.Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr24.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */