package burp;

class Zea7 {
  static boolean Ze(Zg9m paramZg9m, Object paramObject) {
    if (!(paramObject instanceof Zg9m))
      return false; 
    Zg9m zg9m = (Zg9m)paramObject;
    return ((paramZg9m.ZlL() != null) ? !paramZg9m.ZlL().equals(zg9m.ZlL()) : (zg9m.ZlL() != null)) ? false : (((paramZg9m.ZYG() != null) ? !paramZg9m.ZYG().equals(zg9m.ZYG()) : (zg9m.ZYG() != null)) ? false : ((paramZg9m.Zl7() == zg9m.Zl7() && paramZg9m.ZoB() == zg9m.ZoB() && paramZg9m.ZYQ() == zg9m.ZYQ())));
  }
  
  static int Zg(Zg9m paramZg9m) {
    boolean bool = Zmdx.ZA();
    int i = (paramZg9m.ZlL() != null) ? paramZg9m.ZlL().hashCode() : 0;
    i = 31 * i + paramZg9m.Zl7();
    i = 31 * i + (int)(paramZg9m.ZoB() >> 32L ^ paramZg9m.ZoB());
    i = 31 * i + (int)(paramZg9m.ZYQ() >> 32L ^ paramZg9m.ZYQ());
    if (Zbqc.Zwu() == null)
      Zmdx.ZF(!bool); 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zea7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */