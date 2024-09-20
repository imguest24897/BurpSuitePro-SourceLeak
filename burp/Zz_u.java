package burp;

class Zz_u implements Zznt {
  private double[] ZU;
  
  private Zbcc Zh;
  
  Zz_u(boolean paramBoolean1, double[] paramArrayOfdouble, String paramString1, String paramString2, boolean paramBoolean2) {
    this(paramBoolean1, paramArrayOfdouble, paramString1, paramString2, paramBoolean2, null);
  }
  
  Zz_u(boolean paramBoolean1, double[] paramArrayOfdouble, String paramString1, String paramString2, boolean paramBoolean2, Object paramObject) {
    this.ZU = paramArrayOfdouble;
    double d = 0.0D;
    byte b = 0;
    int i = Zl4x.ZD();
    while (b < paramArrayOfdouble.length) {
      if (paramArrayOfdouble[b] > d)
        d = paramArrayOfdouble[b]; 
      b++;
      if (i == 0)
        break; 
    } 
    this.Zh = Ze7.ZU(paramBoolean1, this, 0, paramArrayOfdouble.length - 1, paramObject, paramString1, 0.0D, d, 0, paramBoolean2, 0.0D, null, paramString2);
  }
  
  Zbcc ZT() {
    return this.Zh;
  }
  
  public Zeh4 Zj(int paramInt) {
    return new Zeh4(this.ZU[paramInt], Zgpg.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */