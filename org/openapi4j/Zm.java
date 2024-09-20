package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import com.fasterxml.Zyx;
import java.util.HashMap;
import java.util.Map;

public class Zm extends Zl<Zm> {
  @Zyx
  private Map<String, Zi> callbackPaths;
  
  @Zyx
  private Map<String, Object> extensions;
  
  public Map<String, Zi> getCallbackPaths() {
    return this.callbackPaths;
  }
  
  public Zm setCallbackPaths(Map<String, Zi> paramMap) {
    this.callbackPaths = paramMap;
    return this;
  }
  
  public boolean hasCallbackPath(String paramString) {
    return mapHas(this.callbackPaths, paramString);
  }
  
  public Zi getCallbackPath(String paramString) {
    return (Zi)mapGet(this.callbackPaths, paramString);
  }
  
  public Zm setCallbackPath(String paramString, Zi paramZi) {
    try {
      if (this.callbackPaths == null)
        this.callbackPaths = new HashMap<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.callbackPaths.put(paramString, paramZi);
    return this;
  }
  
  public Zm removeCallbackPath(String paramString) {
    mapRemove(this.callbackPaths, paramString);
    return this;
  }
  
  public Map<String, Object> getExtensions() {
    return this.extensions;
  }
  
  public void setExtensions(Map<String, Object> paramMap) {
    this.extensions = paramMap;
  }
  
  public void setExtension(String paramString, Object paramObject) {
    try {
      if (this.extensions == null)
        this.extensions = new HashMap<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.extensions.put(paramString, paramObject);
  }
  
  @Zyi
  private Map<String, Object> any() {
    try {
      if (this.callbackPaths != null)
        try {
          if (this.extensions != null) {
            this.extensions.putAll(this.callbackPaths);
            return this.extensions;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.callbackPaths != null)
        return new HashMap<>(this.callbackPaths); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.extensions;
  }
  
  @Zv8
  private void add(String paramString, Object paramObject) {
    try {
      if (paramObject == null)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      Zi zi = (Zi)Zpl.Zo.Zb(paramObject, Zi.class);
      setCallbackPath(paramString, zi);
    } catch (IllegalArgumentException illegalArgumentException) {
      setExtension(paramString, paramObject);
    } 
  }
  
  public Zm copy() {
    Zm zm = new Zm();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    try {
      if (isRef()) {
        try {
          zm.setRef(getRef());
          zm.setCanonicalRef(getCanonicalRef());
          if (arrayOfZbqc != null) {
            zm.setCallbackPaths(copyMap(getCallbackPaths()));
            zm.setExtensions(copySimpleMap(getExtensions()));
            return zm;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return zm;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zm.setCallbackPaths(copyMap(getCallbackPaths()));
    zm.setExtensions(copySimpleMap(getExtensions()));
    return zm;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */