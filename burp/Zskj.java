package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zskj {
  private final Zstu ZY;
  
  private final Zstu Zl;
  
  private final int ZM;
  
  private final int ZA;
  
  private int Zo = 0;
  
  private static final byte[] Zc = new byte[] { 118, 97, 108, 117, 101, 61, 34 };
  
  public Zskj(Zstu paramZstu1, Zstu paramZstu2, int paramInt1, int paramInt2) {
    this.ZY = paramZstu1;
    this.Zl = paramZstu2;
    this.ZM = paramInt1;
    this.ZA = paramInt2;
  }
  
  public int[] ZZ(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    String str = Zs2k.ZL();
    try {
      Zrtg zrtg = new Zrtg(this.ZY, paramInt1, paramInt2, this.Zl, paramInt3, paramInt4, null);
      zrtg.ZE(10);
      List<Ztsm> list = zrtg.ZT();
      if (list.isEmpty())
        return null; 
      for (Ztsm ztsm : list) {
        try {
          switch (ztsm.ZK) {
            case 2:
            
            case 1:
            
            case 3:
            
            default:
              Zuh.Zv(false, Zqf.Zk, ztsm.ZK);
              break;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        continue;
        if (str == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return null;
  }
  
  private boolean Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    String str = Zs2k.ZL();
    try {
      try {
        if (paramInt2 - paramInt1 < 16 || paramInt4 - paramInt3 < 16)
          return false; 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (!Zlt_.ZT(this.ZY, Zc, paramInt1))
        return false; 
      if (!Zlt_.ZT(this.Zl, Zc, paramInt3))
        return false; 
      while (this.ZY.Zp(paramInt2 - 1) == 32) {
        paramInt2--;
        if (str == null)
          break; 
      } 
      while (this.Zl.Zp(paramInt4 - 1) == 32) {
        paramInt4--;
        if (str == null)
          break; 
      } 
      try {
        if (this.ZY.Zp(paramInt2 - 1) != 34 || this.Zl.Zp(paramInt4 - 1) != 34)
          return false; 
      } catch (Exception exception) {
        throw a(null);
      } 
      return (Zza7.ZE(Zruv.ZO(this.ZY, paramInt1 + Zc.length, paramInt2 - paramInt1 - Zc.length - 1))).ZZ ? false : (!(Zza7.ZE(Zruv.ZO(this.Zl, paramInt3 + Zc.length, paramInt4 - paramInt3 - Zc.length - 1))).ZZ);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zskj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */