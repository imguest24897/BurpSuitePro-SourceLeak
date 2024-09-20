package burp;

class Zxfd implements Zg5o {
  private int ZA;
  
  public void Zs(Zr6q paramZr6q) {
    this.ZA = (paramZr6q.ZD()).length;
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.ZA = ((Integer)paramZr6h.ZK().stream().map(Zxfd::ZA).reduce(Integer.valueOf(0), Integer::sum)).intValue() + (paramZr6h.Zw()).length;
  }
  
  private static int ZA(Ztnz paramZtnz) {
    byte b1 = (paramZtnz.Ze == null) ? 0 : paramZtnz.Ze.length;
    byte b2 = (paramZtnz.ZM == null) ? 0 : paramZtnz.ZM.length;
    return b1 + b2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */