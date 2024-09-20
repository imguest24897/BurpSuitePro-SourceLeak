package burp;

import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zrdx implements Zmgx {
  private final Zs6l ZK;
  
  private final Zmgx[] Zz;
  
  private final Zsy ZU;
  
  private final Zspd Za;
  
  Zrdx(Zsy paramZsy, Zs6l paramZs6l, Zspd paramZspd, Zmgx... paramVarArgs) {
    this.ZU = paramZsy;
    this.ZK = paramZs6l;
    this.Za = paramZspd;
    this.Zz = paramVarArgs;
  }
  
  public void ZM(byte paramByte) {
    boolean bool = Zs6l.Zu();
    String str = this.ZU.Zi().ZG().ZK(10);
    if (ZJ(str, paramByte, Zxar.ZK(Zkb.Zy(str)))) {
      Zmgx[] arrayOfZmgx = this.Zz;
      int i = arrayOfZmgx.length;
      byte b = 0;
      while (b < i) {
        Zmgx zmgx = arrayOfZmgx[b];
        zmgx.ZM(paramByte);
        b++;
        if (!bool)
          break; 
      } 
    } 
  }
  
  private boolean ZJ(String paramString, byte paramByte, Zt9b paramZt9b) {
    Zsjk zsjk = Zsjk.ZU(Zsjk.PLAIN_REFLECTION_TYPES, paramByte);
    if (zsjk == null) {
      Zuh.Zb(false, Zqf.Zr);
      return false;
    } 
    Zku6 zku6 = this.ZK.ZO(zsjk.Z_(), Zkb.Zy(paramString)).ZQ(paramZt9b);
    this.Za.accept(zku6, zsjk);
    return zku6.Zh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */