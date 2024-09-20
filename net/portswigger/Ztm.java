package net.portswigger;

import java.io.IOException;
import java.io.InputStream;

public class Ztm implements Z_1 {
  public byte[] ZI(Zc9 paramZc9, Zvw paramZvw, InputStream paramInputStream) throws Zib {
    return Z_1.Zt(paramZvw, paramInputStream, Zve.REQUEST);
  }
  
  public byte[] Zn(Zvw paramZvw, InputStream paramInputStream) throws IOException, Zib {
    return Z_1.Zt(paramZvw, paramInputStream, Zve.RESPONSE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztm.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */