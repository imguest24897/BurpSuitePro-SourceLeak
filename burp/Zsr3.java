package burp;

class Zsr3 extends Zsg5 {
  Zsr3(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (Zekt.ZV(paramChar)) {
      this.Zn.Z_(paramChar);
      return this.ZL.Zf;
    } 
    if (this.Zn.ZZ()) {
      this.Zn.Zm();
      return this.ZL.Zq;
    } 
    return (paramChar == '>') ? this.ZL.Zq : (Zekt.Zy(paramChar) ? this.ZL.ZW : this.ZL.Zw);
  }
  
  public boolean ZZ() {
    return true;
  }
  
  public int Zq(Character paramCharacter) {
    return -4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */