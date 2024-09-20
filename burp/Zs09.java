package burp;

import java.util.List;
import net.portswigger.Zca;
import net.portswigger.Zkq;
import net.portswigger.Zq8;
import net.portswigger.Zrzp;

public class Zs09 implements Zxek {
  private final List<Zca> Zk;
  
  public Zs09(List<Zca> paramList) {
    this.Zk = paramList;
  }
  
  public void ZA(byte[] paramArrayOfbyte) {
    this.Zk.add(new Zrzp(paramArrayOfbyte, paramArrayOfbyte.length));
  }
  
  public void ZW(byte[] paramArrayOfbyte, int paramInt) {
    this.Zk.add(new Zq8(paramArrayOfbyte, paramInt));
  }
  
  public void Zn(int paramInt) {
    this.Zk.add(new Zkq(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs09.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */