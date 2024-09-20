package burp;

public class Zgq9 implements Zmxz {
  private final Zmxz Zr;
  
  public Zgq9(Zmxz paramZmxz) {
    this.Zr = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    Zlt9 zlt91 = paramZrdb1.ZaT().Zm();
    if (zlt91 == Zlt9.MERGE_MULTIPLE_IDENTIFIERS)
      return Zl4m.Zh; 
    Zlt9 zlt92 = paramZrdb2.ZaT().Zm();
    return (zlt92 == Zlt9.MERGE_MULTIPLE_IDENTIFIERS) ? Zl4m.Zf : ((zlt91 == Zlt9.MERGE_SINGLE_IDENTIFIER) ? ((zlt92 == Zlt9.RECONSTRUCT_SINGLE || Zn(paramZrdb1, paramZrdb2)) ? Zl4m.ZX : Zl4m.Zh) : ((zlt92 == Zlt9.MERGE_SINGLE_IDENTIFIER) ? ((zlt91 == Zlt9.RECONSTRUCT_SINGLE || Zn(paramZrdb1, paramZrdb2)) ? Zl4m.ZX : Zl4m.Zf) : this.Zr.Zi(paramZrdb1, paramZrdb2, paramZz1h)));
  }
  
  private static boolean Zn(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return !paramZrdb1.ZaT().ZK().equals(paramZrdb2.ZaT().ZK());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgq9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */