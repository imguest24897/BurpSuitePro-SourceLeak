package burp;

class Zezf {
  private final String Zl;
  
  private final boolean ZP;
  
  private Zezf(String paramString, boolean paramBoolean) {
    this.Zl = paramString;
    this.ZP = paramBoolean;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zezf zezf = (Zezf)paramObject;
    return (this.ZP == zezf.ZP && this.Zl.equals(zezf.Zl));
  }
  
  public int hashCode() {
    int i = this.Zl.hashCode();
    return 31 * i + (this.ZP ? 1 : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */