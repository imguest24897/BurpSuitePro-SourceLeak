package burp;

import java.util.Objects;
import net.portswigger.Zie;

public class Zbo8 {
  private long Ze = -1L;
  
  private Integer ZI;
  
  private Zkqn Zz;
  
  private Zeew ZM;
  
  private int ZF = -1;
  
  private int Zh = 1;
  
  private String ZB = "";
  
  private String ZC;
  
  private Zie Zc = Zie.UNSPECIFIED;
  
  private Zbo8 ZY(long paramLong) {
    this.Ze = paramLong;
    return this;
  }
  
  public Zbo8 Zk(Integer paramInteger) {
    this.ZI = paramInteger;
    return this;
  }
  
  public Zbo8 Zk(Zkqn paramZkqn) {
    this.Zz = paramZkqn;
    return this;
  }
  
  public Zbo8 Zb(Zeew paramZeew) {
    this.ZM = paramZeew;
    return this;
  }
  
  public Zbo8 Zg(int paramInt) {
    this.ZF = paramInt;
    return this;
  }
  
  private Zbo8 Zy(int paramInt) {
    this.Zh = paramInt;
    return this;
  }
  
  public Zbo8 Zp(String paramString) {
    this.ZB = Objects.<String>requireNonNull(paramString);
    return this;
  }
  
  public Zbo8 ZQ(String paramString) {
    this.ZC = paramString;
    return this;
  }
  
  public Zbo8 Zp(Zie paramZie) {
    this.Zc = paramZie;
    return this;
  }
  
  public Zbpn ZA() {
    if (this.Ze == -1L)
      this.Ze = System.currentTimeMillis(); 
    return new Zbpn(this.Ze, this.ZI, this.Zz, this.ZM, this.ZF, this.Zh, this.ZB, this.ZC, this.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbo8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */