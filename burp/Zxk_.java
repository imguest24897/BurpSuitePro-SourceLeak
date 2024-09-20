package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

class Zxk_ extends Zxkx {
  private final List<String> Zz;
  
  private int Zy;
  
  Zxk_(List<String> paramList) {
    this.Zz = paramList;
  }
  
  protected byte[] ZP() {
    try {
      if (this.Zy < this.Zz.size()) {
        byte[] arrayOfByte = Zkb.Zy(this.Zz.get(this.Zy));
        this.Zy++;
        return arrayOfByte;
      } 
      return null;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */