package burp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public interface Zbo9 {
  Path Zf();
  
  default void Zz() throws IOException {
    Path path = Zf();
    if (Files.exists(path, new java.nio.file.LinkOption[0])) {
      Stream<Path> stream = Files.walk(path, new java.nio.file.FileVisitOption[0]);
      try {
        stream.sorted(Comparator.reverseOrder()).forEach(Zbo9::lambda$clear$0);
        if (stream != null)
          stream.close(); 
      } catch (Throwable throwable) {
        if (stream != null)
          try {
            stream.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } 
  }
  
  private static void lambda$clear$0(Path paramPath) {
    try {
      Files.delete(paramPath);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbo9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */