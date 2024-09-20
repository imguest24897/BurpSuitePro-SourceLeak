package burp;

import java.util.Objects;

class Zt63 {
  static final Zt63 ZI = new Zt63(-1, -1, "", null);
  
  final int ZH;
  
  final int Zd;
  
  final String ZZ;
  
  final Zbjh Za;
  
  static Zt63 ZM(int paramInt1, int paramInt2, String paramString) {
    return (paramInt2 <= paramInt1) ? ZI : new Zt63(paramInt1, paramInt2, paramString, Zbjh.REQUEST);
  }
  
  static Zt63 Zp(int paramInt1, int paramInt2, String paramString) {
    return (paramInt2 <= paramInt1) ? ZI : new Zt63(paramInt1, paramInt2, paramString, Zbjh.RESPONSE);
  }
  
  static Zt63 ZB(int paramInt1, int paramInt2, String paramString) {
    return (paramInt2 <= paramInt1) ? ZI : new Zt63(paramInt1, paramInt2, paramString, Zbjh.WEB_SOCKET);
  }
  
  private Zt63(int paramInt1, int paramInt2, String paramString, Zbjh paramZbjh) {
    this.ZH = paramInt1;
    this.Zd = paramInt2;
    this.ZZ = paramString;
    this.Za = paramZbjh;
  }
  
  boolean Zd() {
    return (this.Zd - this.ZH <= 0);
  }
  
  boolean Zl() {
    return (this.Zd - this.ZH == 1);
  }
  
  boolean Zk() {
    return (this.Zd - this.ZH > 1);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zt63 zt63 = (Zt63)paramObject;
    return (this.ZH == zt63.ZH && this.Zd == zt63.Zd && Objects.equals(this.ZZ, zt63.ZZ) && this.Za == zt63.Za);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.ZH), Integer.valueOf(this.Zd), this.ZZ, this.Za });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt63.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */