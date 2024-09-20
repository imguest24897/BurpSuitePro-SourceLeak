package burp;

import java.io.File;
import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

class Zs8i {
  private final Zl0 ZH;
  
  Zs8i(Zl0 paramZl0) {
    this.ZH = paramZl0;
  }
  
  Zgzc Zz(String paramString) {
    try {
      byte[] arrayOfByte = Zs6n.Zr(new File(paramString), this.ZH);
      return Zgzc.Zl(arrayOfByte);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return Zgzc.ZH;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */