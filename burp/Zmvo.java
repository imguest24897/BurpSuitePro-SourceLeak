package burp;

public interface Zmvo {
  int ZEi();
  
  void ZI9(int paramInt);
  
  int ZEC();
  
  void ZIs(int paramInt);
  
  default Zv6 ZEH() {
    int i = ZEC();
    ZIs(++i);
    return new Zv6(i, Integer.toString(i));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmvo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */