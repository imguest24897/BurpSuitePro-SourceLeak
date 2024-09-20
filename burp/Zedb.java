package burp;

import java.io.File;
import java.io.IOException;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zrzg;
import net.portswigger.Zze;

public class Zedb {
  private final Zl0 Zv;
  
  private final Zrzg ZN;
  
  private final Zlal ZQ;
  
  public Zedb(Zl0 paramZl0, Zrzg paramZrzg) {
    this(paramZl0, paramZrzg, Zlal.Zf);
  }
  
  public Zedb(Zl0 paramZl0, Zrzg paramZrzg, Zlal paramZlal) {
    this.Zv = paramZl0;
    this.ZN = paramZrzg;
    this.ZQ = paramZlal;
  }
  
  public File ZQ(String paramString) {
    return this.Zv.Zh(this.ZN.Zc(), paramString);
  }
  
  public Zzkm Z_(File paramFile) throws IOException, Ze0d {
    try {
      if (!paramFile.exists())
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zz0e zz0e = new Zz0e();
    zz0e.ZC(Zs6n.Zr(paramFile, this.Zv, Zae.Z_));
    Zzkm zzkm = zz0e.ZO();
    zzkm.Zg(this.ZQ);
    return zzkm;
  }
  
  public void ZJ(File paramFile, String paramString) {
    try {
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      boolean bool = !paramFile.exists() ? true : false;
      try {
        Zs6n.Zu(paramString, paramFile, this.Zv, Zae.Z_);
        if (bool)
          Zze.Zd(paramFile); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */