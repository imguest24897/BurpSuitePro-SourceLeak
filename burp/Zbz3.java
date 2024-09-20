package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.ImageIcon;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbz3 {
  private static final Map<Zxpj, ImageIcon> Zh = new ConcurrentHashMap<>();
  
  public static ImageIcon ZK(Zxpj paramZxpj) {
    try {
      return Zh.computeIfAbsent(paramZxpj, Zxpj::Zr);
    } catch (Exception exception) {
      Zah.ZU(exception, paramZxpj.name(), Zk_.UNEXPECTED);
      return new ImageIcon();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */