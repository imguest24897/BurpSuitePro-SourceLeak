package burp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zs7b implements Runnable {
  private final ServerSocket Zw;
  
  private final Consumer<Socket> Za;
  
  private Zs7b(ServerSocket paramServerSocket, Consumer<Socket> paramConsumer) {
    this.Za = paramConsumer;
    this.Zw = paramServerSocket;
  }
  
  public void run() {
    String str = Zm5k.Ze();
    while (true) {
      try {
        if (this.Zw.isBound() && !this.Zw.isClosed()) {
          try {
            this.Za.accept(this.Zw.accept());
          } catch (SocketException socketException) {
            Zah.Zl(socketException, Zk_.IGNORED);
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.UNEXPECTED);
            if (str != null)
              break; 
          } 
          continue;
        } 
      } catch (SocketException socketException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  private static SocketException a(SocketException paramSocketException) {
    return paramSocketException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */