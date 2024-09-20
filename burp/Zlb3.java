package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlb3 implements Zmsb {
  private final Ze3n ZD;
  
  private final Zxs7 Zj;
  
  private final Zmhe ZZ;
  
  public Zsqx<Zrdb> Zv;
  
  public Zlb3(Ze3n paramZe3n, Zxs7 paramZxs7, Zmhe paramZmhe) {
    this.ZD = paramZe3n;
    this.Zj = paramZxs7;
    this.ZZ = paramZmhe;
  }
  
  public void Zm(Zvow paramZvow, Zgk_ paramZgk_, byte[] paramArrayOfbyte, byte paramByte, Zz_p paramZz_p) {
    if (paramZgk_.Z_() == null)
      return; 
    byte[] arrayOfByte1 = Zkb.Zy((paramZgk_.Z_()).Zf);
    byte[] arrayOfByte2 = Zkb.Zy("'" + (paramZgk_.Z_()).ZB);
    List<Zvow> list1 = ZV(arrayOfByte1, paramByte, paramZz_p.ZX);
    if (list1 == null)
      return; 
    List<Zvow> list2 = ZV(arrayOfByte2, paramByte, paramZz_p.ZX);
    if (list2 == null)
      return; 
    list1.add(0, paramZvow);
    Zuh.Zb((list1.size() == 2), Zqf.Zk);
    this.Zv = Zzw6.ZC(this.ZD.Za(), this.ZD.ZN(), list1.get(0), list1.get(1), this.Zj, paramArrayOfbyte, arrayOfByte1, paramZz_p.Ze);
  }
  
  private List<Zvow> ZV(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2) {
    ArrayList<Zvow> arrayList = new ArrayList();
    Zku6 zku6 = (new Ztsh(this.ZZ, paramByte1, paramArrayOfbyte, (byte)1, (byte)2)).ZQ(Zxar.Zg(paramArrayOfbyte));
    byte[] arrayOfByte = ZJ(zku6, paramByte2);
    if (Zli.ZQ(zku6.ZY(), paramArrayOfbyte) && Zli.ZQ(arrayOfByte, paramArrayOfbyte))
      return null; 
    Zlvf zlvf = this.ZZ.ZK(Zri7.ZJ(new Zrrb(paramArrayOfbyte, paramByte1)), Zlp5.Zc().Zd(false));
    arrayList.add(this.ZD.Zt().Zp(zlvf.ZY().ZE()).ZK(zlvf.ZY().ZO()).Zo(zlvf.ZM().ZT()));
    return arrayList;
  }
  
  private byte[] ZJ(Zku6 paramZku6, byte paramByte) {
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    for (Zkv8 zkv8 : paramZku6.ZP((byte)2)) {
      if (paramByte == (zkv8.Zw()).ZX)
        return (zkv8.Zw()).Ze; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlb3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */