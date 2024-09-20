package com.fasterxml.Zj;

class Zm {
  private static final Zp Zl = new Zp(ZQ(Zj.values()), 0, ZQ(Zd.values()), 0);
  
  private static <F extends Enum<F> & com.fasterxml.Zc.Zm> int ZQ(F[] paramArrayOfF) {
    int i = 0;
    for (F f : paramArrayOfF) {
      if (f.ZP())
        i |= f.ZV(); 
    } 
    return i;
  }
  
  public static Zp Zk() {
    return Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */