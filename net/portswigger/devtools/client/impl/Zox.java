package net.portswigger.devtools.client.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zdx;
import net.portswigger.browser.Zj1;
import net.portswigger.devtools.client.Zf;

public final class Zox implements Zxi {
  private final List<Za> Zd;
  
  private final AtomicReference<Zdx> ZA = new AtomicReference<>(Zj1.Zo());
  
  public Zox(List<Za> paramList) {
    this.Zd = Objects.<List<Za>>requireNonNull(paramList);
  }
  
  public void Zp(Zdx paramZdx) {
    this.ZA.set(Objects.<Zdx>requireNonNull(paramZdx));
  }
  
  public void ZI(Zw paramZw, Object paramObject) {
    Zdx zdx = this.ZA.get();
    Za za = Zl(paramZw);
    try {
      if (zdx != Zj1.Zo())
        try {
          if (za != null) {
            try {
              za.ZG(zdx, paramZw, paramObject);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
            } 
            return;
          } 
          return;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void Zo(Zmf paramZmf, Zf<?> paramZf) {
    Zdx zdx = this.ZA.get();
    Za za = Zl(paramZmf);
    try {
      if (zdx != Zj1.Zo())
        try {
          if (za != null) {
            try {
              za.Zc(zdx, paramZmf, paramZf);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
            } 
            return;
          } 
          return;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void Zl(Zxf paramZxf, Throwable paramThrowable) {
    Zdx zdx = this.ZA.get();
    Za za = Zl(paramZxf);
    try {
      if (zdx != Zj1.Zo())
        try {
          if (za != null) {
            try {
              za.Zm(zdx, paramZxf, paramThrowable);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
            } 
            return;
          } 
          return;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void ZP() {
    ((Zdx)this.ZA.get()).ZE();
  }
  
  private Za Zl(Zxf paramZxf) {
    Iterator<Za> iterator = this.Zd.iterator();
    int[] arrayOfInt = Zp.ZS();
    while (iterator.hasNext()) {
      Za za = iterator.next();
      if (za.Zp(paramZxf))
        return za; 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */