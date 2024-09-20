package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import net.portswigger.Zli;

class Zxfa {
  public static Ztmp ZS(Zzud paramZzud, byte[] paramArrayOfbyte) {
    ArrayList<Zb6q> arrayList = new ArrayList<>(paramZzud.ZV());
    Collections.reverse(arrayList);
    return arrayList.stream().map(paramArrayOfbyte::lambda$getResponseWithReflection$0).filter(Objects::nonNull).findFirst().orElse(null);
  }
  
  private static Ztmp Zs(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = Zli.Zt(paramArrayOfbyte1, paramArrayOfbyte2, 0, paramArrayOfbyte1.length);
    return (i != -1) ? new Ztmp(new Zl1r(i, i + paramArrayOfbyte2.length), paramArrayOfbyte1) : null;
  }
  
  public static Zsqx<Zrdb> ZT(Ze3n paramZe3n, Ztmp paramZtmp, Zxs7 paramZxs7, Zk2s paramZk2s, Zs2i paramZs2i, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zrso.Za();
    Zvow zvow = paramZe3n.ZI().Zp(paramZs2i.ZE()).ZK(paramZtmp.Zg).ZK(paramZs2i.ZO()).Zf(paramZtmp.ZM);
    if (Zbqc.Zwu() == null)
      Zrso.Zq(new int[3]); 
    return Zzw6.Zt(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZxs7, paramZk2s.Zc, paramZk2s.ZD, paramZk2s.ZP, paramArrayOfbyte);
  }
  
  private static Ztmp lambda$getResponseWithReflection$0(byte[] paramArrayOfbyte, Zb6q paramZb6q) {
    return Zs(paramZb6q.Za().ZiD(), paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */