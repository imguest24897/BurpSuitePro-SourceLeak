package burp;

public class Zrgg {
  private int Zq = -1;
  
  public int Zn() {
    return this.Zq;
  }
  
  public void ZO(int paramInt) {
    this.Zq = paramInt;
  }
  
  public void ZW(int paramInt1, int paramInt2) {
    if (paramInt1 <= this.Zq) {
      int i = paramInt2 + 1 - paramInt1;
      this.Zq += i;
    } 
  }
  
  public void ZA(int paramInt1, int paramInt2) {
    boolean bool = Zm99.ZM();
    if (paramInt1 <= this.Zq) {
      if (paramInt2 >= this.Zq) {
        this.Zq = -1;
        if (!bool) {
          int j = paramInt2 + 1 - paramInt1;
          this.Zq -= j;
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    int i = paramInt2 + 1 - paramInt1;
    this.Zq -= i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */