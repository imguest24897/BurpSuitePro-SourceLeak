package org.openapi4j;

import com.fasterxml.Zy1;
import java.util.HashMap;
import java.util.Map;

public abstract class Ze<M extends Zpk<M>> extends Zk<M> {
  private Boolean allowReserved;
  
  @Zy1("content")
  private Map<String, Zpj> contentMediaTypes;
  
  private Boolean deprecated;
  
  private String description;
  
  private Object example;
  
  private Map<String, Zu> examples;
  
  private Boolean explode;
  
  private Boolean required;
  
  private Zf schema;
  
  private String style;
  
  public String getDescription() {
    return this.description;
  }
  
  public Ze<M> setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Boolean getRequired() {
    return this.required;
  }
  
  public boolean isRequired() {
    return Boolean.TRUE.equals(this.required);
  }
  
  public Ze<M> setRequired(Boolean paramBoolean) {
    this.required = paramBoolean;
    return this;
  }
  
  public Boolean getDeprecated() {
    return this.deprecated;
  }
  
  public boolean isDeprecated() {
    return Boolean.TRUE.equals(this.deprecated);
  }
  
  public Ze<M> setDeprecated(Boolean paramBoolean) {
    this.deprecated = paramBoolean;
    return this;
  }
  
  public String getStyle() {
    return this.style;
  }
  
  public Ze<M> setStyle(String paramString) {
    this.style = paramString;
    return this;
  }
  
  public Boolean getExplode() {
    return this.explode;
  }
  
  public boolean isExplode() {
    return Boolean.TRUE.equals(this.explode);
  }
  
  public Ze<M> setExplode(Boolean paramBoolean) {
    this.explode = paramBoolean;
    return this;
  }
  
  public Boolean getAllowReserved() {
    return this.allowReserved;
  }
  
  public boolean isAllowReserved() {
    return Boolean.TRUE.equals(this.allowReserved);
  }
  
  public Ze<M> setAllowReserved(Boolean paramBoolean) {
    this.allowReserved = paramBoolean;
    return this;
  }
  
  public Zf getSchema() {
    return this.schema;
  }
  
  public Ze<M> setSchema(Zf paramZf) {
    this.schema = paramZf;
    return this;
  }
  
  public Object getExample() {
    return this.example;
  }
  
  public Ze<M> setExample(Object paramObject) {
    this.example = paramObject;
    return this;
  }
  
  public Map<String, Zu> getExamples() {
    return this.examples;
  }
  
  public Ze<M> setExamples(Map<String, Zu> paramMap) {
    this.examples = paramMap;
    return this;
  }
  
  public boolean hasExample(String paramString) {
    return mapHas(this.examples, paramString);
  }
  
  public Zu getExample(String paramString) {
    return (Zu)mapGet(this.examples, paramString);
  }
  
  public Ze<M> setExample(String paramString, Zu paramZu) {
    if (this.examples == null)
      this.examples = new HashMap<>(); 
    this.examples.put(paramString, paramZu);
    return this;
  }
  
  public Ze<M> removeExample(String paramString) {
    mapRemove(this.examples, paramString);
    return this;
  }
  
  public Map<String, Zpj> getContentMediaTypes() {
    return this.contentMediaTypes;
  }
  
  public Ze<M> setContentMediaTypes(Map<String, Zpj> paramMap) {
    this.contentMediaTypes = paramMap;
    return this;
  }
  
  public boolean hasContentMediaType(String paramString) {
    return mapHas(this.contentMediaTypes, paramString);
  }
  
  public Zpj getContentMediaType(String paramString) {
    return (Zpj)mapGet(this.contentMediaTypes, paramString);
  }
  
  public Ze<M> setContentMediaType(String paramString, Zpj paramZpj) {
    if (this.contentMediaTypes == null)
      this.contentMediaTypes = new HashMap<>(); 
    this.contentMediaTypes.put(paramString, paramZpj);
    return this;
  }
  
  public Ze<M> removeContentMediaType(String paramString) {
    mapRemove(this.contentMediaTypes, paramString);
    return this;
  }
  
  void copy(Ze<M> paramZe) {
    paramZe.setDescription(getDescription());
    paramZe.setRequired(getRequired());
    paramZe.setDeprecated(getDeprecated());
    paramZe.setStyle(getStyle());
    paramZe.setExplode(getExplode());
    paramZe.setAllowReserved(getAllowReserved());
    paramZe.setSchema((Zf)copyField(getSchema()));
    paramZe.setExample(getExample());
    paramZe.setExamples(copyMap(getExamples()));
    paramZe.setContentMediaTypes(getContentMediaTypes());
    paramZe.setExtensions(copySimpleMap(getExtensions()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Ze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */