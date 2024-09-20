package org.openapi4j;

public class Zpw extends Zc<Zpw> {
  private String name;
  
  private String url;
  
  public String getName() {
    return this.name;
  }
  
  public Zpw setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public Zpw setUrl(String paramString) {
    this.url = paramString;
    return this;
  }
  
  public Zpw copy() {
    Zpw zpw = new Zpw();
    zpw.setName(getName());
    zpw.setUrl(getUrl());
    zpw.setExtensions(copySimpleMap(getExtensions()));
    return zpw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */