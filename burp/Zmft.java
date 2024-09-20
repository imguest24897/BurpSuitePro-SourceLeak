package burp;

class Zmft<T extends Zgpi> {
  private final Zefg<Zrte<T>> ZP;
  
  private final int Zj;
  
  private int ZY;
  
  private Zrte<T> Zg;
  
  private int ZS;
  
  private Zrte<T> ZW;
  
  Zmft(Zefg<Zrte<T>> paramZefg, int paramInt) {
    this.ZP = paramZefg;
    this.Zj = paramInt;
  }
  
  void Zu(int paramInt1, int paramInt2) {
    int i = paramInt2;
    String[] arrayOfString = Zx29.Ze();
    while (i < paramInt1 - 1) {
      ZC(i + 1);
      Zy(i);
      this.Zg.ZU(this.ZY, this.ZW.ZdF(this.ZS));
      i++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZC(int paramInt) {
    String[] arrayOfString = Zx29.Ze();
    if (this.ZW == null || this.ZS + 1 == this.Zj) {
      int i = paramInt / this.Zj;
      this.ZS = paramInt % this.Zj;
      this.ZW = this.ZP.get(i);
      if (arrayOfString != null) {
        this.ZS++;
        return;
      } 
      return;
    } 
    this.ZS++;
  }
  
  private void Zy(int paramInt) {
    String[] arrayOfString = Zx29.Ze();
    if (this.Zg == null || this.ZY + 1 == this.Zj) {
      int i = paramInt / this.Zj;
      this.ZY = paramInt % this.Zj;
      this.Zg = this.ZP.get(i);
      if (arrayOfString != null) {
        this.ZY++;
        return;
      } 
      return;
    } 
    this.ZY++;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */