package burp;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz62 extends CompletableFuture<Zmle> implements Closeable {
  public void Za() {
    try {
      close();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
  
  public void close() throws IOException {
    try {
      get(5L, TimeUnit.SECONDS).ZA();
    } catch (InterruptedException|java.util.concurrent.ExecutionException|java.util.concurrent.TimeoutException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz62.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */