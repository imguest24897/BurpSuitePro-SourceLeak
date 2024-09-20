package burp;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zzzt {
  private final Zefg<Zt6> ZX;
  
  private final Zr_4 ZR;
  
  private final Zzv6 Zt;
  
  private final Zey9 Zk;
  
  private final Map<Integer, Zxym> ZF;
  
  private Zemy Zn;
  
  private static int ZM;
  
  public Zzzt(Zefg<Zt6> paramZefg, Zsy paramZsy, Zr_4 paramZr_4, Zey9 paramZey9) {
    this.ZX = paramZefg;
    this.ZR = paramZr_4;
    this.Zt = new Zzv6(paramZsy);
    this.Zk = paramZey9;
    this.ZF = new ConcurrentHashMap<>();
    this.Zn = Zemy.ZR;
  }
  
  int ZL(Zlit paramZlit) {
    return ZR(paramZlit, null, Zxym.Ze, Zeew.PROXY, 0L);
  }
  
  public int Zd(Zlit paramZlit, byte[] paramArrayOfbyte, Zxym paramZxym, Zeew paramZeew) {
    return ZR(paramZlit, paramArrayOfbyte, paramZxym, paramZeew, System.currentTimeMillis());
  }
  
  public int ZR(Zlit paramZlit, byte[] paramArrayOfbyte, Zxym paramZxym, Zeew paramZeew, long paramLong) {
    int i = Zc();
    synchronized (this.ZX.Zz6()) {
      int j = this.ZX.size();
      try {
      
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      Zuh.Zb((j < Integer.MAX_VALUE), Zqf.Zr);
      int k = j + 1;
      try {
      
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      Zstu zstu = (paramArrayOfbyte == null) ? null : this.ZR.ZZ(paramArrayOfbyte);
      Zt6 zt6 = this.ZR.<Zt6>ZH(new Zszg(k, paramZlit, zstu, paramZeew, paramLong));
      this.ZX.add(zt6);
      this.ZF.put(Integer.valueOf(k), paramZxym);
      this.Zn.Zc(paramZlit, paramArrayOfbyte, paramZxym, paramZeew);
      Zl7g.Zh(paramZxym, paramZeew, k);
      if (i != 0)
        Zbqc.Zr(new Zbqc[2]); 
      return k;
    } 
  }
  
  public Zlit Zn(int paramInt) {
    return Zy(paramInt).Zk();
  }
  
  public Zmo7 Zy(int paramInt) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb((paramInt != 0), Zqf.Zr);
    synchronized (this.ZX.Zz6()) {
      return new Zmo7(Zo(paramInt), this.ZF.getOrDefault(Integer.valueOf(paramInt), Zxym.Ze), this.Zt);
    } 
  }
  
  public Ztl1 ZJ() {
    synchronized (this.ZX.Zz6()) {
      return new Ztl1((List<Zmo7>)this.ZX.stream().filter(Objects::nonNull).map(this::lambda$recentConnections$0).collect(Collectors.toList()));
    } 
  }
  
  public void ZQ(Zemy paramZemy) {
    this.Zn = paramZemy;
  }
  
  private Zt6 Zo(int paramInt) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb((paramInt != 0), Zqf.Zr);
    try {
      return this.ZX.get(paramInt - 1);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.RETHROWN);
      throw new Zkjp();
    } 
  }
  
  public Zefx ZT(int paramInt) {
    try {
      if (paramInt == 0)
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zmo7 zmo7 = Zy(paramInt);
    Zt6 zt6 = zmo7.Zs;
    return this.Zk.Zu(zt6.Z_C().Zdz(), zt6.Z_9());
  }
  
  private Zmo7 lambda$recentConnections$0(Zt6 paramZt6) {
    return Zy(paramZt6.Z_3());
  }
  
  public static void ZX(int paramInt) {
    ZM = paramInt;
  }
  
  public static int Zc() {
    return ZM;
  }
  
  public static int ZE() {
    int i = Zc();
    try {
      if (i == 0)
        return 56; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
  
  static {
    if (Zc() != 0)
      ZX(71); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */