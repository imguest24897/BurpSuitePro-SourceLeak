package burp;

class Zxxa {
  final String Zq;
  
  Zxxa(String paramString) {
    int i = paramString.indexOf(",");
    if (i != -1)
      paramString = paramString.substring(0, i); 
    this.Zq = paramString;
  }
  
  public String toString() {
    return this.Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxxa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */