package burp;

class Zsr7 extends Zsg5 {
  Zsr7(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (this.Zn.ZZ()) {
      this.Zn.Zm();
      return this.ZL.Zq;
    } 
    switch (paramChar) {
      case '>':
        return this.ZL.Zq;
      case '?':
        return this.ZL.ZK;
    } 
    return Zekt.Zy(paramChar) ? this.ZL.Z_ : this.ZL.ZB;
  }
  
  public boolean ZZ() {
    return true;
  }
  
  public int Zq(Character paramCharacter) {
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsr7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */