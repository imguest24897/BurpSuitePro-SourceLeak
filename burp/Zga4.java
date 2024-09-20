package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zga4 extends Zgaj {
  protected Zga4(Zku8 paramZku8, Zkl6 paramZkl6) throws Ztr8 {
    super(paramZku8, paramZkl6);
    Zz(Zl25.REQUEST_PARAM_VALUE);
  }
  
  public Zlbg Zw(Zlbg paramZlbg) {
    return paramZlbg;
  }
  
  public Zlbg ZZ(Zlbg paramZlbg) {
    String str = Zgaj.ZG();
    try {
      if (!this.Zl.ZIp())
        return paramZlbg; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zz1p zz1p = Zekx.Zu(null, paramZlbg.ZY(), (byte)3, this.Zh.ZB());
    List<Zt8g> list = zz1p.ZV;
    boolean bool1 = false;
    boolean bool2 = false;
    for (Zt8g zt8g : list) {
      this.Zj.reset(zt8g.Zbn());
      if (this.Zj.find()) {
        zt8g.ZxS(this.Zj.replaceAll(this.ZL));
        bool1 = true;
        if (zt8g.ZbD())
          bool2 = true; 
      } 
      if (str != null)
        break; 
    } 
    if (bool1) {
      ArrayList<Zt8g> arrayList = new ArrayList<>(list);
      arrayList.sort(Comparator.comparingInt(Zt8g::Zba));
      byte[] arrayOfByte1 = paramZlbg.ZY();
      int i = 0;
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      for (Zt8g zt8g : arrayList) {
        int j = zt8g.Zbl() - i;
        byteArrayOutputStream.write(arrayOfByte1, i, j);
        try {
          byteArrayOutputStream.write(Zkb.Zy(zt8g.Zbn()));
          i = zt8g.Zb2();
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.UNEXPECTED);
        } 
        if (str != null)
          break; 
      } 
      byteArrayOutputStream.write(arrayOfByte1, i, arrayOfByte1.length - i);
      byte[] arrayOfByte2 = byteArrayOutputStream.toByteArray();
      if (bool2)
        arrayOfByte2 = Zsbj.ZQ(arrayOfByte2); 
      paramZlbg.ZE(arrayOfByte2);
    } 
    return paramZlbg;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zga4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */