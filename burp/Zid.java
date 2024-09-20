package burp;

class Zid implements Zmxz {
  private final Zmxz Zs;
  
  private Zid(Zmxz paramZmxz) {
    this.Zs = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    String str1 = paramZrdb1.ZaT().ZJ(Ztz3.HTML_ELEMENT_OFFSET);
    String str2 = paramZrdb2.ZaT().ZJ(Ztz3.HTML_ELEMENT_OFFSET);
    if (!Zsw8.Zn(str1, str2))
      return Zl4m.ZX; 
    String str3 = paramZrdb1.ZaT().ZJ(Ztz3.ACTION_URL_PATH);
    String str4 = paramZrdb2.ZaT().ZJ(Ztz3.ACTION_URL_PATH);
    return (str3 != null && str3.equals(str4)) ? Zl4m.Zh : this.Zs.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zid.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */