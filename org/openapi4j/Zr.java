package org.openapi4j;

import burp.Zbqc;

public class Zr extends Zk<Zr> {
  private String type;
  
  private String description;
  
  private String name;
  
  private String in;
  
  private String scheme;
  
  private String bearerFormat;
  
  private Zpx flows;
  
  private String openIdConnectUrl;
  
  private String readableName;
  
  public String getType() {
    return this.type;
  }
  
  public Zr setType(String paramString) {
    this.type = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zr setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Zr setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getIn() {
    return this.in;
  }
  
  public Zr setIn(String paramString) {
    this.in = paramString;
    return this;
  }
  
  public String getScheme() {
    return this.scheme;
  }
  
  public Zr setScheme(String paramString) {
    this.scheme = paramString;
    return this;
  }
  
  public String getBearerFormat() {
    return this.bearerFormat;
  }
  
  public Zr setBearerFormat(String paramString) {
    this.bearerFormat = paramString;
    return this;
  }
  
  public Zpx getFlows() {
    return this.flows;
  }
  
  public Zr setFlows(Zpx paramZpx) {
    this.flows = paramZpx;
    return this;
  }
  
  public String getOpenIdConnectUrl() {
    return this.openIdConnectUrl;
  }
  
  public Zr setOpenIdConnectUrl(String paramString) {
    this.openIdConnectUrl = paramString;
    return this;
  }
  
  public String getReadableName() {
    return this.readableName;
  }
  
  public Zr setReadableName(String paramString) {
    this.readableName = paramString;
    return this;
  }
  
  public Zr copy() {
    Zr zr = new Zr();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zr.setRef(getRef());
      zr.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        zr.setType(getType());
        zr.setDescription(getDescription());
        zr.setName(getName());
        zr.setIn(getIn());
        zr.setScheme(getScheme());
        zr.setBearerFormat(getBearerFormat());
        zr.setFlows((Zpx)copyField(getFlows()));
        zr.setOpenIdConnectUrl(getOpenIdConnectUrl());
        zr.setExtensions(copySimpleMap(getExtensions()));
        zr.setReadableName(getReadableName());
        return zr;
      } 
      return zr;
    } 
    zr.setType(getType());
    zr.setDescription(getDescription());
    zr.setName(getName());
    zr.setIn(getIn());
    zr.setScheme(getScheme());
    zr.setBearerFormat(getBearerFormat());
    zr.setFlows((Zpx)copyField(getFlows()));
    zr.setOpenIdConnectUrl(getOpenIdConnectUrl());
    zr.setExtensions(copySimpleMap(getExtensions()));
    zr.setReadableName(getReadableName());
    return zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */