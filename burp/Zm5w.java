package burp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import net.portswigger.Zhf;

class Zm5w implements Zrch {
  public short ZX(Zbi8 paramZbi8) {
    return (paramZbi8.Zo > 3 && paramZbi8.Zu[paramZbi8.Zv] == 31 && paramZbi8.Zu[paramZbi8.Zv + 1] == -117 && paramZbi8.Zu[paramZbi8.Zv + 2] == 8) ? 4 : 0;
  }
  
  public boolean ZN(Zbi8 paramZbi8) {
    return !(ZX(paramZbi8) != 4);
  }
  
  public void Zq(Zbi8 paramZbi8, ByteArrayOutputStream paramByteArrayOutputStream) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramZbi8.Zu, paramZbi8.Zv, paramZbi8.Zo);
    int i = Zhf.Zh(byteArrayInputStream, paramByteArrayOutputStream);
    paramZbi8.Zv += i;
    paramZbi8.Zo -= i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */