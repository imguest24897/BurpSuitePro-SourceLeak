package burp;

import java.nio.ByteBuffer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkko {
  public void ZE(ByteBuffer paramByteBuffer, Zsp paramZsp, int paramInt) {
    boolean bool = Zm2.ZB();
    if (paramInt > 16777215) {
      Zuh.Zv(false, Zqf.Zr, paramInt);
      paramInt = 16777215;
    } 
    paramByteBuffer.put((byte)((paramInt & 0xFF0000) >>> 16));
    paramByteBuffer.put((byte)((paramInt & 0xFF00) >>> 8));
    paramByteBuffer.put((byte)(paramInt & 0xFF));
    paramByteBuffer.put(paramZsp.Zi.code);
    paramByteBuffer.put(paramZsp.Za());
    paramByteBuffer.putInt(Integer.MAX_VALUE & paramZsp.ZD);
    if (Zbqc.Zwu() == null)
      Zm2.Zt(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkko.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */