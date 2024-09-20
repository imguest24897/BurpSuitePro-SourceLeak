package burp;

import java.util.ArrayList;
import net.portswigger.Z_g;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Ztj;

class Zroe {
  private final int Zc;
  
  private final Zg0s Za;
  
  private final Zzb4 ZY;
  
  private final Ztj Zf;
  
  private final Zey9 Zz;
  
  Zroe(int paramInt, Zg0s paramZg0s, Zzb4 paramZzb4, Ztj paramZtj, Zey9 paramZey9) {
    this.Zc = paramInt;
    this.Za = paramZg0s;
    this.ZY = paramZzb4;
    this.Zf = paramZtj;
    this.Zz = paramZey9;
  }
  
  Zsb_ ZC(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zx61.ZS();
    synchronized (this.Za) {
      ArrayList<Z_g> arrayList = new ArrayList();
      int i = paramInt1;
      while (i < this.Za.size() && arrayList.size() < paramInt2) {
        try {
          Zb2e zb2e = this.Za.get(i);
          try {
            if (zb2e.ZBG() == this.Zc)
              arrayList.add(Zm8g.Zm(this.Zf, this.ZY, this.Zz, i, zb2e)); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.UNEXPECTED);
        } 
        i++;
        if (arrayOfInt == null)
          break; 
      } 
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return new Zsb_(arrayList, (i < this.Za.size()));
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zroe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */