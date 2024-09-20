package burp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Zsyy {
  private long Zy = 128L;
  
  private long Zl = 2147483647L;
  
  private long ZB = 4096L;
  
  private Long ZW;
  
  public Zsyy Zl(int paramInt) {
    this.Zy = paramInt;
    return this;
  }
  
  public Zsyy ZE(int paramInt) {
    this.Zl = paramInt;
    return this;
  }
  
  public Zsyy ZD(int paramInt) {
    this.ZB = paramInt;
    return this;
  }
  
  public Zsh ZP() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(Zxr7.MAX_CONCURRENT_STREAMS, Long.valueOf(this.Zy));
    String[] arrayOfString = Zsp.Ze();
    linkedHashMap.put(Zxr7.ENABLE_PUSH, Long.valueOf(0L));
    linkedHashMap.put(Zxr7.INITIAL_STREAM_WINDOW_SIZE, Long.valueOf(this.Zl));
    linkedHashMap.put(Zxr7.HEADER_TABLE_SIZE, Long.valueOf(this.ZB));
    if (this.ZW != null)
      linkedHashMap.put(Zxr7.SETTING_ENABLE_CONNECT_PROTOCOL, this.ZW); 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zsh(Zz0x.Zh, (Map)linkedHashMap);
  }
  
  public static Zsyy Zr() {
    return new Zsyy();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */