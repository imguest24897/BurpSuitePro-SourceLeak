package burp;

public class Zeiw implements Zrzd {
  private final Zbf1 ZV;
  
  public Zeiw(Zbf1 paramZbf1) {
    this.ZV = paramZbf1;
  }
  
  public int Zo(Zstu paramZstu, int paramInt) {
    String[] arrayOfString = Zk9g.Zd();
    if (paramInt < paramZstu.Zpu() && paramZstu.Zp(paramInt) == 47 && paramZstu.Zp(paramInt + 1) == 42) {
      this.ZV.ZT();
      int i = paramInt + 2;
      while (i < paramZstu.Zpu() - 1 && (paramZstu.Zp(i) != 42 || paramZstu.Zp(i + 1) != 47)) {
        i++;
        if (arrayOfString != null)
          break; 
      } 
      return i + 2 - paramInt;
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeiw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */