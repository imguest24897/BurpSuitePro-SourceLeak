package burp;

import java.util.Map;
import java.util.stream.Collectors;

public interface Zs_n extends Zgpi<Zs_n> {
  public static final Zeu4<Zs_n> ZR = new Zk1x();
  
  String ZJ3();
  
  int ZJU();
  
  int ZJj();
  
  Zefg<Zs5n> ZJo();
  
  default Map<String, String> ZJP() {
    return (Map<String, String>)ZJo().stream().collect(Collectors.toMap(Zs_n::lambda$attributeMap$0, Zs5n::ZQG, Zs_n::lambda$attributeMap$1));
  }
  
  Zs5n ZIm(String paramString);
  
  String ZI2(String paramString);
  
  String ZJC();
  
  private static String lambda$attributeMap$1(String paramString1, String paramString2) {
    return paramString1;
  }
  
  private static String lambda$attributeMap$0(Zs5n paramZs5n) {
    return paramZs5n.ZQd().toLowerCase();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */