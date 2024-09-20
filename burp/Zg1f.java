package burp;

public class Zg1f implements Zmxz {
  private final Zmxz ZG;
  
  public Zg1f(Zmxz paramZmxz) {
    this.ZG = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    Zefg<Zsdr> zefg1 = paramZrdb1.Za7().Zt().ZCr();
    Zefg<Zsdr> zefg2 = paramZrdb2.Za7().Zt().ZCr();
    Zbqc[] arrayOfZbqc = Zxll.ZT();
    if (zefg1 != null && zefg2 != null && ZB(paramZrdb1) && ZB(paramZrdb2)) {
      boolean bool1 = false;
      boolean bool2 = false;
      for (Zsdr zsdr : zefg1) {
        if (!zefg2.contains(zsdr)) {
          bool1 = true;
          if (arrayOfZbqc == null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
      for (Zsdr zsdr : zefg2) {
        if (!zefg1.contains(zsdr)) {
          bool2 = true;
          if (arrayOfZbqc == null)
            continue; 
          break;
        } 
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
      if (bool2)
        return bool1 ? Zl4m.ZX : Zl4m.Zf; 
    } 
    return this.ZG.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  private boolean ZB(Zrdb paramZrdb) {
    return (paramZrdb.ZaT().Zm() != Zlt9.MERGE_MULTIPLE_IDENTIFIERS && paramZrdb.ZaT().Zm() != Zlt9.MERGE_SINGLE_IDENTIFIER);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */