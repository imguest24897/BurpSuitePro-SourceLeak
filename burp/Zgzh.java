package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLContext;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgzh {
  private static final List<String> Zw = new ArrayList<>();
  
  private static final List<String> ZD = new ArrayList<>();
  
  private static final List<String> Z_ = new ArrayList<>();
  
  private static final List<String> ZH = new ArrayList<>();
  
  public static List<String> ZH() {
    return Collections.unmodifiableList(Z_);
  }
  
  public static List<String> Zt() {
    return Collections.unmodifiableList(ZH);
  }
  
  public static List<String> Zz() {
    return Collections.unmodifiableList(Zw);
  }
  
  static List<String> ZZ() {
    return Collections.unmodifiableList(ZD);
  }
  
  static {
    try {
      SSLContext sSLContext = SSLContext.getDefault();
      Collections.addAll(Zw, sSLContext.getSupportedSSLParameters().getProtocols());
      Collections.addAll(ZD, sSLContext.getSupportedSSLParameters().getCipherSuites());
      Collections.addAll(Z_, sSLContext.getDefaultSSLParameters().getProtocols());
      Collections.addAll(ZH, sSLContext.getDefaultSSLParameters().getCipherSuites());
      Zk7v zk7v = new Zk7v();
      Zw.sort(zk7v);
      Z_.sort(zk7v);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */