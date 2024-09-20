package org.bouncycastle.asn1.x500.style;

public class X500NameTokenizer {
  private final String value;
  
  private final char separator;
  
  private int index;
  
  public X500NameTokenizer(String paramString) {
    this(paramString, ',');
  }
  
  public X500NameTokenizer(String paramString, char paramChar) {
    if (paramString == null)
      throw new NullPointerException(); 
    if (paramChar == '"' || paramChar == '\\')
      throw new IllegalArgumentException("reserved separator character"); 
    this.value = paramString;
    this.separator = paramChar;
    this.index = (paramString.length() < 1) ? 0 : -1;
  }
  
  public boolean hasMoreTokens() {
    return (this.index < this.value.length());
  }
  
  public String nextToken() {
    if (this.index >= this.value.length())
      return null; 
    boolean bool1 = false;
    boolean bool2 = false;
    int i = this.index + 1;
    while (++this.index < this.value.length()) {
      char c = this.value.charAt(this.index);
      if (bool2) {
        bool2 = false;
        continue;
      } 
      if (c == '"') {
        bool1 = !bool1 ? true : false;
        continue;
      } 
      if (bool1)
        continue; 
      if (c == '\\') {
        bool2 = true;
        continue;
      } 
      if (c == this.separator)
        return this.value.substring(i, this.index); 
    } 
    if (bool2 || bool1)
      throw new IllegalArgumentException("badly formatted directory string"); 
    return this.value.substring(i, this.index);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x500\style\X500NameTokenizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */