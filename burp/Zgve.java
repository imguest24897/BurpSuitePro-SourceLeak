package burp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zgve implements Zez {
  public void Zy(Ze9k paramZe9k) {
    Zm2.Zo(Zze0.INTRUDER_PAYLOADS_RUNTIME_FILE);
    if (paramZe9k instanceof Z_e) {
      Z_e z_e = (Z_e)paramZe9k;
      Path path = Path.of(z_e.ZIf(), new String[0]);
      try {
        Zm2.Zi(Zv8r.INTRUDER_RUNTIME_FILE_SIZE_BYTES, Files.size(path));
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.UNEXPECTED);
        Zm2.Zi(Zv8r.INTRUDER_RUNTIME_FILE_SIZE_BYTES, -1L);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgve.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */