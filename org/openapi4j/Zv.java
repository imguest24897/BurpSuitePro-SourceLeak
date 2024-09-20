package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zy1;
import java.util.HashMap;
import java.util.Map;

public class Zv extends Zk<Zv> {
  private String description;
  
  private Map<String, Zy> headers;
  
  @Zy1("content")
  private Map<String, Zpj> contentMediaTypes;
  
  private Map<String, Zs> links;
  
  public String getDescription() {
    return this.description;
  }
  
  public Zv setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Map<String, Zy> getHeaders() {
    return this.headers;
  }
  
  public Zv setHeaders(Map<String, Zy> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public boolean hasHeader(String paramString) {
    return mapHas(this.headers, paramString);
  }
  
  public Zy getHeader(String paramString) {
    return (Zy)mapGet(this.headers, paramString);
  }
  
  public Zv setHeader(String paramString, Zy paramZy) {
    if (this.headers == null)
      this.headers = new HashMap<>(); 
    this.headers.put(paramString, paramZy);
    return this;
  }
  
  public Zv removeHeader(String paramString) {
    mapRemove(this.headers, paramString);
    return this;
  }
  
  public Map<String, Zpj> getContentMediaTypes() {
    return this.contentMediaTypes;
  }
  
  public Zv setContentMediaTypes(Map<String, Zpj> paramMap) {
    this.contentMediaTypes = paramMap;
    return this;
  }
  
  public boolean hasContentMediaType(String paramString) {
    return mapHas(this.contentMediaTypes, paramString);
  }
  
  public Zpj getContentMediaType(String paramString) {
    return (Zpj)mapGet(this.contentMediaTypes, paramString);
  }
  
  public Zv setContentMediaType(String paramString, Zpj paramZpj) {
    if (this.contentMediaTypes == null)
      this.contentMediaTypes = new HashMap<>(); 
    this.contentMediaTypes.put(paramString, paramZpj);
    return this;
  }
  
  public Zv removeContentMediaType(String paramString) {
    mapRemove(this.contentMediaTypes, paramString);
    return this;
  }
  
  public Map<String, Zs> getLinks() {
    return this.links;
  }
  
  public Zv setLinks(Map<String, Zs> paramMap) {
    this.links = paramMap;
    return this;
  }
  
  public boolean hasLink(String paramString) {
    return mapHas(this.links, paramString);
  }
  
  public Zs getLink(String paramString) {
    return (Zs)mapGet(this.links, paramString);
  }
  
  public Zv setLink(String paramString, Zs paramZs) {
    if (this.links == null)
      this.links = new HashMap<>(); 
    this.links.put(paramString, paramZs);
    return this;
  }
  
  public Zv removeLink(String paramString) {
    mapRemove(this.links, paramString);
    return this;
  }
  
  public Zv copy() {
    Zv zv = new Zv();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zv.setRef(getRef());
      zv.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        zv.setDescription(getDescription());
        zv.setHeaders(copyMap(getHeaders()));
        zv.setContentMediaTypes(copyMap(getContentMediaTypes()));
        zv.setLinks(copyMap(getLinks()));
        zv.setExtensions(copySimpleMap(getExtensions()));
        return zv;
      } 
      return zv;
    } 
    zv.setDescription(getDescription());
    zv.setHeaders(copyMap(getHeaders()));
    zv.setContentMediaTypes(copyMap(getContentMediaTypes()));
    zv.setLinks(copyMap(getLinks()));
    zv.setExtensions(copySimpleMap(getExtensions()));
    return zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */