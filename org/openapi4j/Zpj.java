package org.openapi4j;

import com.fasterxml.Zy1;
import java.util.HashMap;
import java.util.Map;

public class Zpj extends Zc<Zpj> {
  @Zy1("encoding")
  private Map<String, Zg> encodings;
  
  private Object example;
  
  private Map<String, Zu> examples;
  
  private Zf schema;
  
  public Zf getSchema() {
    return this.schema;
  }
  
  public Zpj setSchema(Zf paramZf) {
    this.schema = paramZf;
    return this;
  }
  
  public Map<String, Zu> getExamples() {
    return this.examples;
  }
  
  public Zpj setExamples(Map<String, Zu> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public boolean hasExample(String paramString) {
    return mapHas(this.examples, paramString);
  }
  
  public Zu getExample(String paramString) {
    return (Zu)mapGet(this.examples, paramString);
  }
  
  public Zpj setExample(String paramString, Zu paramZu) {
    if (this.examples == null)
      this.examples = new HashMap<>(); 
    this.examples.put(paramString, paramZu);
    return this;
  }
  
  public Zpj removeExample(String paramString) {
    mapRemove(this.examples, paramString);
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public Zpj setExample(Object paramObject) {
    this.example = paramObject;
    return this;
  }
  
  public Map<String, Zg> getEncodings() {
    return this.encodings;
  }
  
  public Zpj setEncodings(Map<String, Zg> paramMap) {
    this.encodings = paramMap;
    return this;
  }
  
  public boolean hasEncoding(String paramString) {
    return mapHas(this.encodings, paramString);
  }
  
  public Zg getEncoding(String paramString) {
    return (Zg)mapGet(this.encodings, paramString);
  }
  
  public Zpj setEncoding(String paramString, Zg paramZg) {
    if (this.encodings == null)
      this.encodings = new HashMap<>(); 
    this.encodings.put(paramString, paramZg);
    return this;
  }
  
  public Zpj removeEncoding(String paramString) {
    mapRemove(this.encodings, paramString);
    return this;
  }
  
  public Zpj copy() {
    Zpj zpj = new Zpj();
    zpj.setSchema((Zf)copyField(getSchema()));
    zpj.setExample(getExample());
    zpj.setExamples(copyMap(getExamples()));
    zpj.setEncodings(copyMap(getEncodings()));
    zpj.setExtensions(copySimpleMap(getExtensions()));
    return zpj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */