package burp;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;
import javax.swing.SwingWorker;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgrt extends SwingWorker<List<Zstu>, Void> {
  final File[] Zn;
  
  final Zbys ZX;
  
  Zgrt(Zbys paramZbys, File[] paramArrayOfFile) {}
  
  protected List<Zstu> ZY() {
    return Arrays.<File>stream(this.Zn).parallel().flatMap(this::lambda$doInBackground$0).toList();
  }
  
  protected void done() {
    try {
      synchronized (this.ZX.Zb) {
        this.ZX.Zd.addAll(get());
      } 
      this.ZX.Zz();
    } catch (ExecutionException executionException) {
      Zah.Zl(executionException.getCause(), Zk_.UNEXPECTED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private Stream lambda$doInBackground$0(File paramFile) {
    Objects.requireNonNull(this.ZX.Zg);
    return Zs6n.Zu(paramFile).stream().map(this.ZX.Zg::ZZ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */