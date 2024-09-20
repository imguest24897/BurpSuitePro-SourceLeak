package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;

class Zrzx {
  private final List<byte[]> ZE = (List)new ArrayList<>();
  
  Zrzx(Zstu paramZstu, String... paramVarArgs) {
    String[] arrayOfString = paramVarArgs;
    int i = arrayOfString.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zg3o.ZN();
    while (b < i) {
      String str = arrayOfString[b];
      byte[] arrayOfByte = Zkb.Zy(str);
      if (Zlt_.Zf(paramZstu, arrayOfByte, false) == -1)
        this.ZE.add(arrayOfByte); 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  int[] Zs(Zzud paramZzud) {
    Zbqc[] arrayOfZbqc = Zg3o.ZN();
    for (byte[] arrayOfByte : this.ZE) {
      int i = Zlt_.Zf(paramZzud.Zl(), arrayOfByte, false);
      if (i != -1)
        return new int[] { i, i + arrayOfByte.length }; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrzx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */