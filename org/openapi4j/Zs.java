package org.openapi4j;

import burp.Zbqc;
import java.util.HashMap;
import java.util.Map;

public class Zs extends Zk<Zs> {
  private String operationId;
  
  private String operationRef;
  
  private Map<String, String> parameters;
  
  private Map<String, Zy> headers;
  
  private String description;
  
  private Zp9 server;
  
  public String getOperationId() {
    return this.operationId;
  }
  
  public Zs setOperationId(String paramString) {
    this.operationId = paramString;
    return this;
  }
  
  public String getOperationRef() {
    return this.operationRef;
  }
  
  public Zs setOperationRef(String paramString) {
    this.operationRef = paramString;
    return this;
  }
  
  public Map<String, String> getParameters() {
    return this.parameters;
  }
  
  public Zs setParameters(Map<String, String> paramMap) {
    this.parameters = paramMap;
    return this;
  }
  
  public boolean hasParameter(String paramString) {
    return mapHas(this.parameters, paramString);
  }
  
  public String getParameter(String paramString) {
    return (String)mapGet(this.parameters, paramString);
  }
  
  public Zs setParameter(String paramString1, String paramString2) {
    if (this.parameters == null)
      this.parameters = new HashMap<>(); 
    this.parameters.put(paramString1, paramString2);
    return this;
  }
  
  public Zs removeParameter(String paramString) {
    mapRemove(this.parameters, paramString);
    return this;
  }
  
  public Map<String, Zy> getHeaders() {
    return this.headers;
  }
  
  public Zs setHeaders(Map<String, Zy> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public boolean hasHeader(String paramString) {
    return mapHas(this.headers, paramString);
  }
  
  public Zy getHeader(String paramString) {
    return (Zy)mapGet(this.headers, paramString);
  }
  
  public Zs setHeader(String paramString, Zy paramZy) {
    if (this.headers == null)
      this.headers = new HashMap<>(); 
    this.headers.put(paramString, paramZy);
    return this;
  }
  
  public Zs removeHeader(String paramString) {
    mapRemove(this.headers, paramString);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zs setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Zp9 getServer() {
    return this.server;
  }
  
  public Zs setServer(Zp9 paramZp9) {
    this.server = paramZp9;
    return this;
  }
  
  public Zs copy() {
    Zs zs = new Zs();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zs.setRef(getRef());
      zs.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        zs.setOperationId(getOperationId());
        zs.setOperationRef(getOperationRef());
        zs.setParameters(copySimpleMap(getParameters()));
        zs.setHeaders(copyMap(getHeaders()));
        zs.setDescription(getDescription());
        zs.setServer((Zp9)copyField(getServer()));
        zs.setExtensions(copySimpleMap(getExtensions()));
        return zs;
      } 
      return zs;
    } 
    zs.setOperationId(getOperationId());
    zs.setOperationRef(getOperationRef());
    zs.setParameters(copySimpleMap(getParameters()));
    zs.setHeaders(copyMap(getHeaders()));
    zs.setDescription(getDescription());
    zs.setServer((Zp9)copyField(getServer()));
    zs.setExtensions(copySimpleMap(getExtensions()));
    return zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */