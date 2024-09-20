package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;

public class Zrii {
  private static boolean Za;
  
  public static void ZE(Zkfd paramZkfd, Zs4f paramZs4f) throws IOException {
    paramZs4f.Zk("s", paramZkfd.ZTo());
    paramZs4f.Zb("a", paramZkfd.ZTP());
    paramZs4f.Ze("f", paramZkfd.ZTn());
    paramZs4f.Ze("l", paramZkfd.ZTd());
    paramZs4f.Ze("n", paramZkfd.ZTd());
  }
  
  public static void ZG(Zr_4 paramZr_4, Zkfd paramZkfd, Zrte<Zstu> paramZrte) {
    boolean bool = ZD();
    try {
      try {
        if (paramZrte != null) {
          try {
            paramZkfd.Zc(paramZrte.ZdF(paramZkfd.ZTP()));
            if (!bool)
              paramZkfd.Zc(paramZr_4.ZZ(Zdo.ZQ)); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      paramZkfd.Zc(paramZr_4.ZZ(Zdo.ZQ));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      paramZkfd.Zc((Zstu)null);
    } 
  }
  
  public static void ZT(Zkfd paramZkfd) {
    paramZkfd.Zi(null);
    paramZkfd.Zc(paramZkfd.ZTn());
  }
  
  public static void Zs(boolean paramBoolean) {
    Za = paramBoolean;
  }
  
  public static boolean ZA() {
    return Za;
  }
  
  public static boolean ZD() {
    boolean bool = ZA();
    return !bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZA())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrii.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */