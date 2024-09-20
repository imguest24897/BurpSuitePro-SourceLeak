package burp;

class Ze1i {
  StringBuilder Zq = new StringBuilder();
  
  private int ZD = 0;
  
  public void ZH() {
    this.ZD += 4;
  }
  
  public void Zi() {
    this.ZD -= 4;
  }
  
  public String toString() {
    return this.Zq.toString();
  }
  
  public Ze1i ZE(char paramChar) {
    this.Zq.append(paramChar);
    return this;
  }
  
  public Ze1i Z_(String paramString) {
    this.Zq.append(paramString);
    return this;
  }
  
  public Ze1i ZR(long paramLong) {
    this.Zq.append(paramLong);
    return this;
  }
  
  public Ze1i ZT(boolean paramBoolean) {
    this.Zq.append(paramBoolean);
    return this;
  }
  
  public void Zn() {
    Z_("\n");
    byte b = 0;
    String[] arrayOfString = Zzkm.Zq();
    while (b < this.ZD) {
      this.Zq.append(' ');
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */