package burp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Optional;

public class Zg63 implements Zsug {
  private final File Zf;
  
  private final boolean ZC;
  
  public Zg63(File paramFile, boolean paramBoolean) {
    this.Zf = paramFile;
    this.ZC = paramBoolean;
  }
  
  public boolean Zt() {
    return true;
  }
  
  public Optional<OutputStream> Z_() throws FileNotFoundException {
    try {
      if (this.ZC)
        try {
          if (!this.Zf.exists())
            return Optional.empty(); 
        } catch (FileNotFoundException fileNotFoundException) {
          throw a(null);
        }  
    } catch (FileNotFoundException fileNotFoundException) {
      throw a(null);
    } 
    return Optional.of(new FileOutputStream(this.Zf, true));
  }
  
  public String toString() {
    return this.Zf.getAbsolutePath();
  }
  
  private static FileNotFoundException a(FileNotFoundException paramFileNotFoundException) {
    return paramFileNotFoundException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg63.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */