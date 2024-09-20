package org.openapi4j;

public class Zb extends Zc<Zb> {
  private String description;
  
  private String url;
  
  public String getDescription() {
    return this.description;
  }
  
  public Zb setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public Zb setUrl(String paramString) {
    this.url = paramString;
    return this;
  }
  
  public Zb copy() {
    Zb zb = new Zb();
    zb.setDescription(getDescription());
    zb.setUrl(getUrl());
    zb.setExtensions(copySimpleMap(getExtensions()));
    return zb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */