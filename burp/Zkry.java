package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkry {
  private final AtomicBoolean Z_ = new AtomicBoolean();
  
  private final AtomicReference<Zr5b> ZD = new AtomicReference<>(Zr5b.INITIAL_STATE);
  
  boolean Zn() {
    return this.Z_.get();
  }
  
  void Zh(Zsp paramZsp) {
    try {
      if (paramZsp.Zi == Zmcm.HEADERS)
        this.ZD.set(Zr5b.WITHIN_HEADERS); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZsp.ZF((byte)4))
        try {
          if (!this.ZD.compareAndSet(Zr5b.WITHIN_HEADERS, Zr5b.WITHIN_DATA))
            throw new IllegalStateException(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZsp.ZF((byte)1))
        try {
          if (!this.Z_.compareAndSet(false, true))
            throw new IllegalStateException(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  boolean Z_() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZD.get() == Zr5b.WITHIN_DATA);
  }
  
  boolean ZY(Zmcm paramZmcm) {
    try {
      switch (Zzwd.ZN[paramZmcm.ordinal()]) {
        case 1:
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return (this.ZD.get() != Zr5b.WITHIN_HEADERS);
        case 2:
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return (this.ZD.get() == Zr5b.WITHIN_HEADERS);
        case 3:
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return (this.ZD.get() == Zr5b.WITHIN_DATA);
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          return true;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zr, paramZmcm.name());
    return false;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */