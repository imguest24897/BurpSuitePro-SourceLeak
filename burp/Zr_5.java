package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Zr_5 {
  private static String[] Zc;
  
  public static Zsqx<Zrdb> Zq(Zvs paramZvs, Zmzk paramZmzk, byte paramByte, byte[] paramArrayOfbyte, List<Zvow> paramList) {
    LinkedList<Zt2w> linkedList = new LinkedList();
    Iterator<Zvow> iterator = paramList.iterator();
    String[] arrayOfString = ZK();
    while (iterator.hasNext()) {
      Zvow zvow = iterator.next();
      linkedList.add(new Zt2w(null, zvow));
      if (arrayOfString == null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return new Zx_5(paramZvs, (byte)0, 0, Collections.emptyMap(), (List)linkedList, paramByte, (byte)1, paramZmzk, paramArrayOfbyte, null);
  }
  
  public static void Zn(String[] paramArrayOfString) {
    Zc = paramArrayOfString;
  }
  
  public static String[] ZK() {
    return Zc;
  }
  
  static {
    if (ZK() == null)
      Zn(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */