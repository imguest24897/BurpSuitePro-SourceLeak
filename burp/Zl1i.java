package burp;

import java.io.IOException;

public class Zl1i {
  public static void Zg(Zmo2 paramZmo2, Zs4f paramZs4f) throws IOException {
    paramZs4f.ZL("n", paramZmo2.ZuR());
    paramZs4f.ZX("e", paramZmo2.Zu7());
    paramZs4f.Zk("u", paramZmo2.ZuY());
    String[] arrayOfString = Zlcq.ZY();
    try {
      paramZs4f.ZL("p", paramZmo2.Zun());
      paramZs4f.ZL("s", paramZmo2.Zu0());
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static Zmo2 Zm(String paramString, Zgyp paramZgyp, Zr_4 paramZr_4) throws IOException, Ze27 {
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zmo2 zmo2 = paramZr_4.<Zmo2>ZH(new Zmah());
    zmo2.ZoJ(zgyp.ZW("n"));
    zmo2.Zb(Zkk3.Za("e", zgyp, paramZr_4));
    Boolean bool = zgyp.Zq("u");
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    zmo2.Znt((bool != null) ? bool.booleanValue() : false);
    zmo2.Zos(zgyp.ZW("p"));
    zmo2.ZoL(zgyp.ZW("s"));
    zgyp.ZE();
    return zmo2;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */