package burp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

class Zk2s {
  final byte Zc;
  
  final byte ZD;
  
  final byte[] ZP;
  
  final List<byte[]> ZA;
  
  Zk2s(String paramString1, String paramString2, byte paramByte1, byte paramByte2) {
    this(paramString1, Collections.singletonList(paramString2), paramByte1, paramByte2);
  }
  
  Zk2s(String paramString, List<String> paramList, byte paramByte1, byte paramByte2) {
    this.Zc = paramByte1;
    this.ZD = paramByte2;
    this.ZP = Zkb.Zy(paramString);
    this.ZA = (List<byte[]>)paramList.stream().map(Zkb::Zy).collect(Collectors.toList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */