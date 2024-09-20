package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zen;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zew3 extends Zewx {
  private static final byte[] ZG = new byte[] { 10 };
  
  private final Zxgd Zv;
  
  private final boolean ZW;
  
  private final Ze3n Zk;
  
  private final String[] ZZ;
  
  public Zew3(byte[] paramArrayOfbyte, Zen paramZen, Zlp9 paramZlp9, Zxgd paramZxgd, boolean paramBoolean, Zmhr paramZmhr, Ze3n paramZe3n, String... paramVarArgs) {
    super(paramZen, paramArrayOfbyte, paramZlp9, paramZmhr, (byte)0, ZP);
    this.Zv = paramZxgd;
    this.ZW = paramBoolean;
    this.Zk = paramZe3n;
    this.ZZ = paramVarArgs;
  }
  
  private Zefx ZB() {
    return this.Zv.Zo(this.Zk.ZA());
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return Zs2i.Zl(ZB());
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    try {
      return Optional.of(paramZmhe.ZZ(Zlp5.Zc().Zw(this.Zv).Zd(false)));
    } catch (Zscd zscd) {
      Zah.Zl(zscd, Zk_.IGNORED);
      return Optional.empty();
    } 
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    LinkedList<Zl1r> linkedList = new LinkedList();
    byte[] arrayOfByte = ZB().ZD();
    if (this.ZW) {
      int i = Zli.ZR(arrayOfByte, ZG);
      try {
        if (i != -1)
          Zl8v.Zx(Zkb.Zy(ZF().toString()), arrayOfByte, 0, i, linkedList, false); 
      } catch (Zscd zscd) {
        throw a(null);
      } 
    } 
    Zl8v.ZG(arrayOfByte, Zsbj.Zc(arrayOfByte), linkedList, this.ZZ);
    return linkedList;
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zew3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */