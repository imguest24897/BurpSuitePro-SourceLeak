package burp;

class Ze0a implements Zmxz {
  private final Zmxz Zb;
  
  Ze0a(Zmxz paramZmxz) {
    this.Zb = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    String str1 = paramZrdb1.ZaT().ZJ(Ztz3.EXTENSION_NAME);
    String str2 = paramZrdb2.ZaT().ZJ(Ztz3.EXTENSION_NAME);
    return (str1 != null && str1.equals(str2)) ? Zl4m.Zh : this.Zb.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */