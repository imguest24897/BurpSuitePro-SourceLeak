package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.HashMap;
import java.util.Map;

public abstract class Zc<M extends Zpk<M>> extends Zt<M> {
  private Map<String, Object> extensions;
  
  private static Zbqc[] ZB;
  
  @Zyi
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  @Zv8
  public void setExtension(String paramString, Object paramObject) {
    if (this.extensions == null)
      this.extensions = new HashMap<>(); 
    this.extensions.put(paramString, paramObject);
  }
  
  public static void Zx(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZL() {
    return ZB;
  }
  
  static {
    if (ZL() != null)
      Zx(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */