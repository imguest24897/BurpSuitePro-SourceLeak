package burp;

class Zgzk {
  private final short ZO;
  
  private final short Zt;
  
  private Zgzk(short paramShort1, short paramShort2) {
    this.ZO = paramShort1;
    this.Zt = paramShort2;
  }
  
  static Zgzk ZN(short paramShort1, short paramShort2) {
    return new Zgzk(paramShort1, paramShort2);
  }
  
  private boolean ZN() {
    return (this.ZO == -1 || this.Zt == -1) ? true : ((this.ZO == this.Zt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */