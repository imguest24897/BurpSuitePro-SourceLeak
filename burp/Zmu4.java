package burp;

class Zmu4 {
  public static void ZT(Zskz paramZskz, Zm31[] paramArrayOfZm31, Zs7v paramZs7v) {
    int[] arrayOfInt = Zrkx.Zw();
    synchronized (paramZskz.Zz6()) {
      Zm31[] arrayOfZm31 = paramArrayOfZm31;
      int i = arrayOfZm31.length;
      byte b = 0;
      while (b < i) {
        Zm31 zm31 = arrayOfZm31[b];
        if (paramZs7v.ZQ())
          return; 
        if (zm31 != Zk35.Zq)
          zm31.ZK(paramZs7v); 
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
    if (paramZs7v.ZQ())
      return; 
    synchronized (paramZskz.Zwe().Zz6()) {
      Zk35.Zq.ZK(paramZs7v);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmu4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */