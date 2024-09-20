package burp;

@FunctionalInterface
public interface Zrec {
  static Zrec Zd() {
    return Zrec::lambda$identity$0;
  }
  
  Zefx Zv(Zefx paramZefx);
  
  private static Zefx lambda$identity$0(Zefx paramZefx) {
    return paramZefx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */