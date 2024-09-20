package burp;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Zm4w {
  final List<InetAddress> ZV;
  
  final int ZQ;
  
  final int ZE;
  
  final String ZS;
  
  private Zm4w(List<InetAddress> paramList, int paramInt1, int paramInt2) {
    this.ZV = new ArrayList<>(paramList);
    this.ZQ = paramInt1;
    this.ZE = paramInt2;
    this.ZS = "";
    Collections.shuffle(this.ZV);
  }
  
  public Zm4w(String paramString, int paramInt) {
    this.ZV = Collections.emptyList();
    this.ZQ = paramInt;
    this.ZE = 5;
    this.ZS = paramString;
  }
  
  public boolean ZA() {
    return !this.ZS.isEmpty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */