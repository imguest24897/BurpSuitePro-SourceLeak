package burp;

import java.io.File;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

public class Zs9v {
  private static int[] Zc;
  
  public static List<String> Zo(File paramFile, Zl0 paramZl0, Zskh paramZskh) {
    try {
      return (new Zmv0(Zs6n.ZQ(paramFile, paramZl0, paramZskh))).ZJ;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return null;
    } 
  }
  
  public static void ZV(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] ZL() {
    return Zc;
  }
  
  static {
    if (ZL() == null)
      ZV(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */