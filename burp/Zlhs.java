package burp;

class Zlhs implements Zgw4 {
  public boolean Zt(Zgkc paramZgkc1, Zgkc paramZgkc2) {
    boolean bool1 = (paramZgkc1.Zub() == null) ? false : paramZgkc1.Zub().Zsy();
    boolean bool2 = (paramZgkc2.Zub() == null) ? false : paramZgkc2.Zub().Zsy();
    return (paramZgkc1.getClass().equals(paramZgkc2.getClass()) && bool1 == bool2);
  }
  
  public boolean Zx(Zgkc paramZgkc) {
    return paramZgkc instanceof Zkcp;
  }
  
  public boolean ZY(Zgkc paramZgkc) {
    return paramZgkc instanceof Zzq1;
  }
  
  public boolean Zv(Zgkc paramZgkc) {
    return paramZgkc instanceof Zrkg;
  }
  
  public boolean Zq(Zgkc paramZgkc) {
    return (paramZgkc instanceof Zg3y && paramZgkc.Zub().Zsy() == 32);
  }
  
  public boolean Zw(Zgkc paramZgkc) {
    return (paramZgkc instanceof Zg3y && paramZgkc.Zub().Zsy() == 64);
  }
  
  public boolean ZF(Zgkc paramZgkc) {
    return (paramZgkc instanceof Zg3y && (ZX(paramZgkc) || ZN(paramZgkc)));
  }
  
  public boolean ZX(Zgkc paramZgkc) {
    return (paramZgkc.Zub().Zsy() == 128);
  }
  
  public boolean ZN(Zgkc paramZgkc) {
    return (paramZgkc.Zub().Zsy() == 256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */