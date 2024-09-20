package burp;

import java.io.InputStream;
import java.net.Socket;
import java.util.List;

public class Zxfj implements Zsil {
  public static final Zxfj ZI = new Zxfj();
  
  private static String[] ZE;
  
  public Zeu6 ZC() {
    return Zeu6.ZM;
  }
  
  public Zx_o Zx() {
    return Zx_o.Zm;
  }
  
  public Zms7 Zd() {
    return Zxfj::lambda$streamingResponseBehaviour$0;
  }
  
  public Zm5u ZQ() {
    return Zm5u.ZJ;
  }
  
  public Zg4n Zb() {
    return Zg4n.CONTINUE;
  }
  
  public Zg4n ZZ() {
    return Zg4n.CONTINUE;
  }
  
  public Zg4n ZM(List<String> paramList) {
    return Zg4n.CONTINUE;
  }
  
  private static void lambda$streamingResponseBehaviour$0(Socket paramSocket, InputStream paramInputStream) {
    Zsdz.ZW(paramSocket);
  }
  
  public static void Zi(String[] paramArrayOfString) {
    ZE = paramArrayOfString;
  }
  
  public static String[] Zf() {
    return ZE;
  }
  
  static {
    if (Zf() != null)
      Zi(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */