package burp;

import java.util.EnumSet;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmem extends Zmvg {
  public Zmem() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    StringBuilder stringBuilder = Zlyy.Zv(paramZefg);
    int i = paramZtub.Za();
    if ((i & 0x1) == 1) {
      if ((i & 0x2) != 2)
        Zuh.Zv((paramInt == 0), Zqf.Zr, paramInt); 
      String str1 = paramZtub.Zd().Zub().Zsf().Zis();
      String str2 = paramZtlj.ZJ(Ztz3.IN_BAND_ENTITY_NAME);
      stringBuilder.append(Zlyy.Zd(str2, str1));
    } 
    if ((i & 0x2) == 2) {
      String str1 = paramZtub.Zr().Zub().Zsf().Zis();
      String str2 = paramZtlj.ZJ(Ztz3.OUT_BAND_ENTITY_NAME);
      stringBuilder.append(Zlyy.Zk(paramInt, str2, str1, i));
    } 
    Ztsn.ZV(paramZtub, stringBuilder);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */