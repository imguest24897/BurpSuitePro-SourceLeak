package burp;

public class Zxrp {
  public static boolean Zk(Zstu paramZstu1, Zstu paramZstu2) {
    int i = paramZstu1.Zpu();
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    if (i != paramZstu2.Zpu())
      return false; 
    byte b = 0;
    while (b < i) {
      if (paramZstu1.Zp(b) != paramZstu2.Zp(b))
        return false; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return true;
  }
  
  public static int ZJ(Zstu paramZstu) {
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    if (paramZstu.Zpu() == 0)
      return 31; 
    int i = 1;
    int j = paramZstu.Zpu() - 1;
    while (j >= 0) {
      i = 31 * i + paramZstu.Zp(j);
      j--;
      if (arrayOfZbqc == null)
        break; 
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxrp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */