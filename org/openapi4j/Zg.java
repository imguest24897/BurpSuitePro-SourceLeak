package org.openapi4j;

import java.util.HashMap;
import java.util.Map;

public class Zg extends Zc<Zg> {
  private String contentType;
  
  private Boolean explode;
  
  private Map<String, Zy> headers;
  
  private String style;
  
  public String getContentType() {
    return this.contentType;
  }
  
  public Zg setContentType(String paramString) {
    this.contentType = paramString;
    return this;
  }
  
  public Map<String, Zy> getHeaders() {
    return this.headers;
  }
  
  public Zg setHeaders(Map<String, Zy> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public boolean hasHeader(String paramString) {
    return mapHas(this.headers, paramString);
  }
  
  public Zy getHeader(String paramString) {
    return (Zy)mapGet(this.headers, paramString);
  }
  
  public Zg setHeader(String paramString, Zy paramZy) {
    if (this.headers == null)
      this.headers = new HashMap<>(); 
    this.headers.put(paramString, paramZy);
    return this;
  }
  
  public Zg removeHeader(String paramString) {
    mapRemove(this.headers, paramString);
    return this;
  }
  
  public String getStyle() {
    return this.style;
  }
  
  public void setStyle(String paramString) {
    this.style = paramString;
  }
  
  public Boolean getExplode() {
    return this.explode;
  }
  
  public boolean isExplode() {
    return Boolean.TRUE.equals(this.explode);
  }
  
  public Zg setExplode(Boolean paramBoolean) {
    this.explode = paramBoolean;
    return this;
  }
  
  public Zg copy() {
    Zg zg = new Zg();
    zg.setContentType(getContentType());
    zg.setHeaders(copyMap(getHeaders()));
    zg.setStyle(getStyle());
    zg.setExplode(getExplode());
    zg.setExtensions(copySimpleMap(getExtensions()));
    return zg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */