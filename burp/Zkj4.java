package burp;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class Zkj4 {
  public static String Zy(SocketAddress paramSocketAddress) {
    return (paramSocketAddress instanceof InetSocketAddress && ((InetSocketAddress)paramSocketAddress).getAddress() != null && ((InetSocketAddress)paramSocketAddress).getAddress().toString().contains("/")) ? ((InetSocketAddress)paramSocketAddress).getAddress().toString().split("/")[1] : "";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */