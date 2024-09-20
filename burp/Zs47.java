package burp;

import java.io.IOException;
import java.net.BindException;
import java.net.Socket;
import java.time.Duration;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zs47 implements Zenv {
  private final Consumer<Duration> ZO;
  
  private final Zenv ZA;
  
  Zs47(Consumer<Duration> paramConsumer, Zenv paramZenv) {
    this.ZO = paramConsumer;
    this.ZA = paramZenv;
  }
  
  public Socket Zc() throws IOException, Zryo, Zxt3, Zr92, Zryj {
    int i = Zloq.Zo();
    byte b = 0;
    while (true) {
      try {
        if (b < 5)
          try {
            return this.ZA.Zc();
          } catch (BindException bindException) {
            try {
              Zah.Zl(bindException, Zk_.COMMON_RUNTIME_FAILURE);
              if (b == 4)
                throw bindException; 
            } catch (BindException bindException1) {
              throw a(null);
            } 
            this.ZO.accept(Duration.ofSeconds((b + 1)));
            b++;
            if (i == 0)
              break; 
            continue;
          }  
      } catch (Zryo zryo) {
        throw a(null);
      } 
      break;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs47.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */