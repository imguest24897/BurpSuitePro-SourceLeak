package burp;

class Ztyq {
  private final Zefg<Zmyi> ZC;
  
  private final int ZQ;
  
  private int Zr;
  
  private Zmyi Z_;
  
  private int ZM;
  
  private Zmyi Zi;
  
  Ztyq(Zefg<Zmyi> paramZefg, int paramInt) {
    this.ZC = paramZefg;
    this.ZQ = paramInt;
  }
  
  void ZI(int paramInt1, int paramInt2) {
    int i = paramInt2;
    boolean bool = Zg0b.ZC();
    while (i < paramInt1 - 1) {
      Zm(i + 1);
      Zs(i);
      this.Z_.ZX(this.Zr, this.Zi.ZN(this.ZM));
      i++;
      if (!bool)
        break; 
    } 
  }
  
  private void Zm(int paramInt) {
    boolean bool = Zg0b.Zq();
    if (this.Zi == null || this.ZM + 1 == this.ZQ) {
      int i = paramInt / this.ZQ;
      this.ZM = paramInt % this.ZQ;
      this.Zi = this.ZC.get(i);
      if (bool) {
        this.ZM++;
        return;
      } 
      return;
    } 
    this.ZM++;
  }
  
  private void Zs(int paramInt) {
    boolean bool = Zg0b.Zq();
    if (this.Z_ == null || this.Zr + 1 == this.ZQ) {
      int i = paramInt / this.ZQ;
      this.Zr = paramInt % this.ZQ;
      this.Z_ = this.ZC.get(i);
      if (bool) {
        this.Zr++;
        return;
      } 
      return;
    } 
    this.Zr++;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */