package burp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.portswigger.Zah;
import net.portswigger.Zco;
import net.portswigger.Zk_;

public class Zz49 implements Zm53, Ze2z {
  private static final Ztt4 ZD = Zg37.Zr();
  
  private final ReentrantLock Zx = new ReentrantLock();
  
  private final Ztg_ ZR = new Ztg_();
  
  private final Ztqx Zu = new Ztqx();
  
  private final Zso3 Zl;
  
  public Zz49() {
    boolean bool = Ztg_.Z_();
    this.Zl = new Zso3();
    if (Zbqc.Zwu() == null)
      Ztg_.ZP(!bool); 
  }
  
  public Zbum ZQ(Zco paramZco) {
    Set<Zer0> set = Z_(paramZco.Zp());
    try {
      if (set == null)
        return new Zbum(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      set = Zx(paramZco.Zp());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      ZD.ZY(exception);
    } 
    return new Zbum(set);
  }
  
  public void ZU(String paramString, Zer0 paramZer0) {
    this.Zx.lock();
    try {
      this.Zl.ZX(paramString, paramZer0);
      this.ZR.ZX(paramZer0);
      this.Zu.ZK(paramZer0);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      ZD.ZY(exception);
    } finally {
      this.Zx.unlock();
    } 
  }
  
  public Map<String, Set<Zer0>> ZZ() {
    return this.Zl.Zh();
  }
  
  public Map<Integer, Set<Zer0>> ZD() {
    return this.Zu.Zl();
  }
  
  public Ztg_ Zl() {
    return this.ZR;
  }
  
  public void ZR(Zer0 paramZer0) {
    this.Zl.ZZ(paramZer0);
    this.ZR.ZJ(paramZer0);
    this.Zu.ZX(paramZer0);
  }
  
  public void Zs(String paramString) {
    this.Zx.lock();
    boolean bool = Ztg_.ZK();
    try {
      Set<Zer0> set = this.ZR.Za(paramString);
      if (set == null)
        return; 
      for (Zer0 zer0 : set) {
        this.Zl.ZZ(zer0);
        this.Zu.ZX(zer0);
        if (bool)
          break; 
      } 
    } finally {
      this.Zx.unlock();
    } 
  }
  
  public Set<Zer0> Zx(String paramString) {
    this.Zx.lock();
    boolean bool = Ztg_.Z_();
    try {
      Set<Zer0> set = this.Zl.Zf(paramString);
      if (set == null)
        return (Set)Collections.emptySet(); 
      for (Zer0 zer0 : set) {
        this.ZR.ZJ(zer0);
        this.Zu.ZX(zer0);
        if (!bool)
          break; 
      } 
      return set;
    } finally {
      this.Zx.unlock();
    } 
  }
  
  public void ZL() {
    this.Zx.lock();
  }
  
  public void Zg() {
    this.Zx.unlock();
  }
  
  private Set<Zer0> Z_(String paramString) {
    try {
      return ZZ().get(paramString);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      ZD.ZY(exception);
      return Zg(paramString);
    } 
  }
  
  private Set<Zer0> Zg(String paramString) {
    this.Zx.lock();
    try {
      return ZZ().get(paramString);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      ZD.ZY(exception);
      return (Set)Collections.emptySet();
    } finally {
      this.Zx.unlock();
    } 
  }
  
  public void Zb(Zrol paramZrol) {
    HashSet hashSet = new HashSet(ZZ().keySet());
    boolean bool = Ztg_.Z_();
    for (String str : hashSet) {
      Set set = ZZ().get(str);
      ZL();
      try {
        Iterator<Zer0> iterator = set.iterator();
        while (iterator.hasNext()) {
          Zer0 zer0 = iterator.next();
          if (paramZrol.Zv(zer0)) {
            iterator.remove();
            ZR(zer0);
          } 
          if (!bool)
            break; 
        } 
        if (((Set)ZZ().get(str)).isEmpty())
          ZZ().remove(str); 
      } finally {
        Zg();
      } 
      if (!bool)
        break; 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz49.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */