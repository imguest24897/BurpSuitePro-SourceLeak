package burp;

public class Zev6 {
  public static boolean ZB(Zs0m paramZs0m, Zz28 paramZz28, Zey9 paramZey9) {
    int i = Zkic.ZA();
    if (paramZs0m.ZqZ() == null || paramZs0m.Zq9() == null)
      return false; 
    if (paramZs0m.Zqd().isEmpty()) {
      Zefx zefx = paramZs0m.Zq9().ZP(paramZs0m.ZqZ(), paramZey9);
      return paramZz28.ZG(zefx.ZF());
    } 
    for (Zvo1 zvo1 : paramZs0m.Zqd()) {
      if (zvo1.Zd(paramZz28))
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zev6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */