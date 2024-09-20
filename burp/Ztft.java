package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Ztft {
  private final Zm7u Zl;
  
  private final Zleb Zd;
  
  Ztft(Zm7u paramZm7u) {
    this.Zl = paramZm7u;
    this.Zd = new Zleb();
  }
  
  Zm7u ZV(Zlji paramZlji) {
    try {
      if (!paramZlji.ZK)
        return this.Zl; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      byte[] arrayOfByte = paramZlji.Zx;
      int i = Zsbj.Zc(arrayOfByte);
      List<String> list = Zsbj.Zh(arrayOfByte, 0, i - 1);
      Zeug zeug = this.Zd.ZQ(list);
      return new Zx8m(this, list, zeug, i, arrayOfByte);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return this.Zl;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztft.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */