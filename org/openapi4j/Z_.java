package org.openapi4j;

import burp.Zbqc;
import java.util.HashMap;
import java.util.Map;

public class Z_ extends Zc<Z_> {
  private Map<String, Zm> callbacks;
  
  private Map<String, Zu> examples;
  
  private Map<String, Zy> headers;
  
  private Map<String, Zs> links;
  
  private Map<String, Zo> parameters;
  
  private Map<String, Zw> requestBodies;
  
  private Map<String, Zv> responses;
  
  private Map<String, Zf> schemas;
  
  private Map<String, Zr> securitySchemes;
  
  public Map<String, Zf> getSchemas() {
    return this.schemas;
  }
  
  public Z_ setSchemas(Map<String, Zf> paramMap) {
    this.schemas = paramMap;
    return this;
  }
  
  public boolean hasSchema(String paramString) {
    return mapHas(this.schemas, paramString);
  }
  
  public Zf getSchema(String paramString) {
    return (Zf)mapGet(this.schemas, paramString);
  }
  
  public Z_ setSchema(String paramString, Zf paramZf) {
    if (this.schemas == null)
      this.schemas = new HashMap<>(); 
    this.schemas.put(paramString, paramZf);
    return this;
  }
  
  public Z_ removeSchema(String paramString) {
    mapRemove(this.schemas, paramString);
    return this;
  }
  
  public Map<String, Zv> getResponses() {
    return this.responses;
  }
  
  public Z_ setResponses(Map<String, Zv> paramMap) {
    this.responses = paramMap;
    return this;
  }
  
  public boolean hasResponse(String paramString) {
    return mapHas(this.responses, paramString);
  }
  
  public Zv getResponse(String paramString) {
    return (Zv)mapGet(this.responses, paramString);
  }
  
  public Z_ setResponse(String paramString, Zv paramZv) {
    if (this.responses == null)
      this.responses = new HashMap<>(); 
    this.responses.put(paramString, paramZv);
    return this;
  }
  
  public Z_ removeResponse(String paramString) {
    mapRemove(this.responses, paramString);
    return this;
  }
  
  public Map<String, Zo> getParameters() {
    return this.parameters;
  }
  
  public Z_ setParameters(Map<String, Zo> paramMap) {
    this.parameters = paramMap;
    return this;
  }
  
  public boolean hasParameter(String paramString) {
    return mapHas(this.parameters, paramString);
  }
  
  public Zo getParameter(String paramString) {
    return (Zo)mapGet(this.parameters, paramString);
  }
  
  public Z_ setParameter(String paramString, Zo paramZo) {
    if (this.parameters == null)
      this.parameters = new HashMap<>(); 
    this.parameters.put(paramString, paramZo);
    return this;
  }
  
  public Z_ removeParameter(String paramString) {
    mapRemove(this.parameters, paramString);
    return this;
  }
  
  public Map<String, Zu> getExamples() {
    return this.examples;
  }
  
  public Z_ setExamples(Map<String, Zu> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public boolean hasExample(String paramString) {
    return mapHas(this.examples, paramString);
  }
  
  public Zu getExample(String paramString) {
    return (Zu)mapGet(this.examples, paramString);
  }
  
  public Z_ setExample(String paramString, Zu paramZu) {
    if (this.examples == null)
      this.examples = new HashMap<>(); 
    this.examples.put(paramString, paramZu);
    return this;
  }
  
  public Z_ removeExample(String paramString) {
    mapRemove(this.examples, paramString);
    return this;
  }
  
  public Map<String, Zw> getRequestBodies() {
    return this.requestBodies;
  }
  
  public Z_ setRequestBodies(Map<String, Zw> paramMap) {
    this.requestBodies = paramMap;
    return this;
  }
  
  public boolean hasRequestBody(String paramString) {
    return mapHas(this.requestBodies, paramString);
  }
  
  public Zw getRequestBody(String paramString) {
    return (Zw)mapGet(this.requestBodies, paramString);
  }
  
  public Z_ setRequestBody(String paramString, Zw paramZw) {
    if (this.requestBodies == null)
      this.requestBodies = new HashMap<>(); 
    this.requestBodies.put(paramString, paramZw);
    return this;
  }
  
  public Z_ removeRequestBody(String paramString) {
    mapRemove(this.requestBodies, paramString);
    return this;
  }
  
  public Map<String, Zy> getHeaders() {
    return this.headers;
  }
  
  public Z_ setHeaders(Map<String, Zy> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public boolean hasHeader(String paramString) {
    return mapHas(this.headers, paramString);
  }
  
  public Zy getHeader(String paramString) {
    return (Zy)mapGet(this.headers, paramString);
  }
  
  public Z_ setHeader(String paramString, Zy paramZy) {
    if (this.headers == null)
      this.headers = new HashMap<>(); 
    this.headers.put(paramString, paramZy);
    return this;
  }
  
  public Z_ removeHeader(String paramString) {
    mapRemove(this.headers, paramString);
    return this;
  }
  
  public Map<String, Zr> getSecuritySchemes() {
    return this.securitySchemes;
  }
  
  public Z_ setSecuritySchemes(Map<String, Zr> paramMap) {
    this.securitySchemes = paramMap;
    return this;
  }
  
  public boolean hasSecurityScheme(String paramString) {
    return mapHas(this.securitySchemes, paramString);
  }
  
  public Zr getSecurityScheme(String paramString) {
    return (Zr)mapGet(this.securitySchemes, paramString);
  }
  
  public Z_ setSecurityScheme(String paramString, Zr paramZr) {
    if (this.securitySchemes == null)
      this.securitySchemes = new HashMap<>(); 
    this.securitySchemes.put(paramString, paramZr);
    return this;
  }
  
  public Z_ removeSecurityScheme(String paramString) {
    mapRemove(this.securitySchemes, paramString);
    return this;
  }
  
  public Map<String, Zs> getLinks() {
    return this.links;
  }
  
  public Z_ setLinks(Map<String, Zs> paramMap) {
    this.links = paramMap;
    return this;
  }
  
  public boolean hasLink(String paramString) {
    return mapHas(this.links, paramString);
  }
  
  public Zs getLink(String paramString) {
    return (Zs)mapGet(this.links, paramString);
  }
  
  public Z_ setLink(String paramString, Zs paramZs) {
    if (this.links == null)
      this.links = new HashMap<>(); 
    this.links.put(paramString, paramZs);
    return this;
  }
  
  public Z_ removeLink(String paramString) {
    mapRemove(this.links, paramString);
    return this;
  }
  
  public Map<String, Zm> getCallbacks() {
    return this.callbacks;
  }
  
  public Z_ setCallbacks(Map<String, Zm> paramMap) {
    this.callbacks = paramMap;
    return this;
  }
  
  public boolean hasCallback(String paramString) {
    return mapHas(this.callbacks, paramString);
  }
  
  public Zm getCallback(String paramString) {
    return (Zm)mapGet(this.callbacks, paramString);
  }
  
  public Z_ setCallback(String paramString, Zm paramZm) {
    if (this.callbacks == null)
      this.callbacks = new HashMap<>(); 
    this.callbacks.put(paramString, paramZm);
    return this;
  }
  
  public Z_ removeCallback(String paramString) {
    mapRemove(this.callbacks, paramString);
    return this;
  }
  
  public Z_ copy() {
    Z_ z_ = new Z_();
    z_.setSchemas(copyMap(getSchemas()));
    z_.setResponses(copyMap(getResponses()));
    z_.setParameters(copyMap(getParameters()));
    Zbqc[] arrayOfZbqc = Zc.ZL();
    z_.setExamples(copyMap(getExamples()));
    z_.setRequestBodies(copyMap(getRequestBodies()));
    z_.setHeaders(copyMap(getHeaders()));
    z_.setSecuritySchemes(copyMap(getSecuritySchemes()));
    z_.setLinks(copyMap(getLinks()));
    z_.setCallbacks(copyMap(getCallbacks()));
    z_.setExtensions(copySimpleMap(getExtensions()));
    if (Zbqc.Zwu() == null)
      Zc.Zx(new Zbqc[3]); 
    return z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Z_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */