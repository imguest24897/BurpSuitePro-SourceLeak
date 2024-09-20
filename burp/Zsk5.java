package burp;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.zip.CRC32;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zui;

public final class Zsk5 {
  public static int Zp(int[] paramArrayOfint, int paramInt) {
    int[] arrayOfInt = Zsw8.ZK();
    byte b = 0;
    while (b < paramArrayOfint.length) {
      if (paramInt == paramArrayOfint[b])
        return b; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  public static void ZJ(long paramLong) {
    try {
      Thread.sleep(paramLong);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
  }
  
  public static void Ze(Duration paramDuration) {
    ZJ(paramDuration.toMillis());
  }
  
  public static String Zd() {
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zui.ZD(StartBurp.class).toString().getBytes(StandardCharsets.UTF_8));
    return Long.toHexString(cRC32.getValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsk5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */