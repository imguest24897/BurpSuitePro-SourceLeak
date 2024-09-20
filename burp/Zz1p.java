package burp;

import java.util.Collections;
import java.util.List;

public class Zz1p {
  private final List<String> ZZ;
  
  public final List<Integer> ZF;
  
  public final int ZP;
  
  private final int ZU;
  
  public final String Zb;
  
  public final Zlit Zo;
  
  public final boolean ZJ;
  
  public final String Zh;
  
  public final Zsba ZY;
  
  public final List<Zt8g> ZV;
  
  private static Zbqc[] Zi;
  
  private Zz1p(String paramString1, Zlit paramZlit, boolean paramBoolean, String paramString2, List<Integer> paramList, List<String> paramList1, int paramInt1, int paramInt2, Zsba paramZsba, List<Zt8g> paramList2) {
    this.Zb = paramString1;
    this.Zo = paramZlit;
    this.ZJ = paramBoolean;
    this.Zh = paramString2;
    this.ZF = (paramList == null) ? null : Collections.<Integer>unmodifiableList(paramList);
    this.ZZ = (paramList1 == null) ? null : Collections.<String>unmodifiableList(paramList1);
    this.ZP = paramInt1;
    this.ZU = paramInt2;
    this.ZV = (paramList2 == null) ? null : Collections.<Zt8g>unmodifiableList(paramList2);
    this.ZY = paramZsba;
  }
  
  public List<String> ZG() {
    return this.ZZ;
  }
  
  public int ZO() {
    return this.ZU;
  }
  
  public static void ZT(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zo() {
    return Zi;
  }
  
  static {
    if (Zo() == null)
      ZT(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */