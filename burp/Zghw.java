package burp;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm4;

public class Zghw {
  public static boolean ZZ(Zlit paramZlit, List<Zt8g> paramList, Set<String> paramSet, boolean paramBoolean) {
    int[] arrayOfInt = Zsw8.ZK();
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byteArrayOutputStream.write(Zkb.Zy(paramZlit.Zdz().toString()));
      byteArrayOutputStream.write(paramZlit.Zd4());
      for (Zt8g zt8g : paramList) {
        byteArrayOutputStream.write(Zkb.Zy(zt8g.Zns()));
        if (arrayOfInt == null)
          break; 
      } 
      Zm4 zm4 = new Zm4();
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      zm4.Za(arrayOfByte, 0, arrayOfByte.length);
      String str = Zkb.ZG(zm4.ZE());
      synchronized (paramSet) {
        if (paramSet.contains(str))
          return true; 
        try {
          if (paramBoolean)
            paramSet.add(str); 
        } catch (Exception exception) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */