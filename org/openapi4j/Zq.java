package org.openapi4j;

public class Zq extends Zc<Zq> {
  private String email;
  
  private String name;
  
  private String url;
  
  public String getName() {
    return this.name;
  }
  
  public Zq setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public Zq setUrl(String paramString) {
    this.url = paramString;
    return this;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public Zq setEmail(String paramString) {
    this.email = paramString;
    return this;
  }
  
  public Zq copy() {
    Zq zq = new Zq();
    zq.setName(getName());
    zq.setUrl(getUrl());
    zq.setEmail(getEmail());
    zq.setExtensions(copySimpleMap(getExtensions()));
    return zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */