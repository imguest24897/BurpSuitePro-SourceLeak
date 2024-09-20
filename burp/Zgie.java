package burp;

import java.util.UUID;
import javax.swing.SortOrder;

public class Zgie {
  public Zr8p ZH(Zvt paramZvt) throws Zzam {
    Zbqc[] arrayOfZbqc = Zs6i.Zm();
    boolean bool = paramZvt.Zf(Zsxn.COLUMN_TYPE.key, Zk8z.NATIVE.value).equals(Zk8z.NATIVE.value);
    try {
    
    } catch (Zzam zzam) {
      throw a(null);
    } 
    Zg4f zg4f = (Zg4f)(bool ? Zb2w.Zj() : Zrg.Zo(paramZvt.ZC(Zsxn.COLUMN_BAMBDA.key)));
    SortOrder sortOrder = ZD(paramZvt.Zf(Zsxn.COLUMN_SORT.key, SortOrder.UNSORTED.name()));
    try {
    
    } catch (Zzam zzam) {
      throw a(null);
    } 
    Zlcu zlcu = (sortOrder != SortOrder.UNSORTED) ? ZE(paramZvt.Zf(Zsxn.COLUMN_SORT_PRECEDENCE.key, Zlcu.PRIMARY.name())) : null;
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return zg4f.Zm(UUID.randomUUID().toString()).ZU(paramZvt.Zf(Zsxn.COLUMN_ID.key, "")).ZZ(paramZvt.Zc(Zsxn.COLUMN_VISIBLE.key, true)).Zu(paramZvt.Za(Zsxn.COLUMN_WIDTH.key, 75)).ZR(sortOrder).ZZ(zlcu).ZH(paramZvt.Zc(Zsxn.COLUMN_USER_RESIZED.key, false)).ZW();
  }
  
  private static SortOrder ZD(String paramString) {
    return SortOrder.valueOf(paramString);
  }
  
  private static Zlcu ZE(String paramString) {
    return Zlcu.valueOf(paramString);
  }
  
  private static Zzam a(Zzam paramZzam) {
    return paramZzam;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */