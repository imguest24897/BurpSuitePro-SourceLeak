package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ze_9 {
  private static final List<Byte> Zc;
  
  public static void Zi(Ze8t<Byte> paramZe8t) {
    String[] arrayOfString = Zlzh.Zj();
    for (Byte byte_ : Zc) {
      paramZe8t.Zu(byte_);
      if (arrayOfString != null)
        break; 
    } 
  }
  
  static {
    ArrayList<Byte> arrayList = new ArrayList();
    for (byte b = 0; b < 26; b = (byte)(b + 1)) {
      if (b != 1)
        arrayList.add(Byte.valueOf(b)); 
    } 
    Zc = Collections.unmodifiableList(arrayList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */