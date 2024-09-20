package burp;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze03 implements Ztbq {
  private final Map<Zmzk, Certificate> Zz = Collections.synchronizedMap(new LinkedHashMap<>());
  
  private final List<Runnable> Zl = Collections.synchronizedList(new LinkedList<>());
  
  public void Zs(Zmzk paramZmzk, Certificate[] paramArrayOfCertificate) {
    try {
      if (!(paramArrayOfCertificate instanceof java.security.cert.X509Certificate[])) {
        Zuh.ZT(false, Zqf.Zk, paramArrayOfCertificate[0].toString());
        return;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      if (this.Zz.containsKey(paramZmzk))
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    synchronized (this.Zz) {
      Objects.requireNonNull(paramArrayOfCertificate[0]);
      if (this.Zz.values().stream().anyMatch(paramArrayOfCertificate[0]::equals))
        return; 
    } 
    this.Zz.put(paramZmzk, paramArrayOfCertificate[0]);
    synchronized (this.Zl) {
      this.Zl.forEach(Ze03::lambda$addCertificate$0);
    } 
  }
  
  public void Zv(Runnable paramRunnable) {
    this.Zl.add(paramRunnable);
  }
  
  public Map<Zmzk, Certificate> Zg() {
    return Collections.unmodifiableMap(this.Zz);
  }
  
  public Map.Entry<Zmzk, Certificate> Zs(int paramInt) {
    String str = Zgkj.ZV();
    try {
      if (paramInt > this.Zz.size())
        throw new IndexOutOfBoundsException(); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    byte b = 0;
    for (Map.Entry<Zmzk, Certificate> entry : this.Zz.entrySet()) {
      try {
        if (b++ == paramInt)
          return entry; 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public void Zh() {
    this.Zz.clear();
  }
  
  private static void lambda$addCertificate$0(Runnable paramRunnable) {
    try {
      paramRunnable.run();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze03.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */