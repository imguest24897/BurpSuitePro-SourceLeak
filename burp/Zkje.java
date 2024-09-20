package burp;

class Zkje implements Zmxz {
  private final Zmxz ZF;
  
  Zkje(Zmxz paramZmxz) {
    this.ZF = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    return ZN(paramZrdb1) ? Zl4m.Zh : (ZN(paramZrdb2) ? Zl4m.Zf : this.ZF.Zi(paramZrdb1, paramZrdb2, paramZz1h));
  }
  
  private boolean ZN(Zrdb paramZrdb) {
    return ((paramZrdb.Zam() & 0x1) == 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */