package burp;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Collection;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlsf {
  private final Zmh4 Zv;
  
  public Zlsf(Zmh4 paramZmh4) {
    this.Zv = paramZmh4;
  }
  
  public void Zn(File paramFile) {
    Collection<Ztro> collection = this.Zv.ZT();
    Zp(paramFile, collection);
  }
  
  public void ZU(File paramFile) {
    Collection<Ztro> collection = this.Zv.ZK();
    Zp(paramFile, collection);
  }
  
  private static void Zp(File paramFile, Iterable<Ztro> paramIterable) {
    int[] arrayOfInt = Zmh4.Zd();
    try {
      for (Ztro ztro : paramIterable) {
        File file1 = Paths.get(paramFile.getPath(), new String[] { ztro.ZJ() }).toFile();
        File file2 = file1.getParentFile();
        try {
          if (!file2.exists())
            file2.mkdirs(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        try {
          fileOutputStream.write(ztro.ZY());
          fileOutputStream.close();
        } catch (Throwable throwable) {
          try {
            fileOutputStream.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          } 
          throw throwable;
        } 
        if (arrayOfInt == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */