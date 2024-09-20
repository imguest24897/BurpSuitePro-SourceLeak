package burp;

class Zt1q {
  boolean Zr;
  
  final String Zl;
  
  Zt1q(boolean paramBoolean, String paramString) {
    this.Zr = paramBoolean;
    this.Zl = paramString;
  }
  
  Zt1q Zf() {
    return new Zt1q(this.Zr, this.Zl);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zt1q && this.Zl.equals(((Zt1q)paramObject).Zl));
  }
  
  public int hashCode() {
    return this.Zl.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */