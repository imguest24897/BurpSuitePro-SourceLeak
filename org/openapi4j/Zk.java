package org.openapi4j;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.HashMap;
import java.util.Map;

public abstract class Zk<M extends Zpk<M>> extends Zl<M> {
  @Zyx
  private Map<String, Object> extensions;
  
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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */