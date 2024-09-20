package burp;

import java.util.List;

public class Zz3g {
  private static String[] Zi;
  
  public static Zefx Zo(Zefx paramZefx, boolean paramBoolean1, List<String> paramList, Zlit paramZlit, boolean paramBoolean2, boolean paramBoolean3, Zey9 paramZey9) {
    String[] arrayOfString = Zk();
    Zmzk zmzk = paramZefx.ZT();
    boolean bool1 = !zmzk.equals(paramZlit.Zdz()) ? true : false;
    boolean bool2 = (zmzk.ZJZ() == paramZlit.Zdr()) ? true : false;
    Zlix zlix = new Zlix(paramZefx, paramZlit, paramBoolean1, paramList, paramBoolean2, paramBoolean3, bool1, bool2, paramZey9);
    paramZefx.Zi(zlix);
    if (Zbqc.Zwu() == null)
      ZV(new String[5]); 
    return zlix.Zz();
  }
  
  public static void ZV(String[] paramArrayOfString) {
    Zi = paramArrayOfString;
  }
  
  public static String[] Zk() {
    return Zi;
  }
  
  static {
    if (Zk() != null)
      ZV(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */