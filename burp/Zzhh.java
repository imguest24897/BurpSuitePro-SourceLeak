package burp;

public class Zzhh {
  public final int Zw;
  
  public final int ZA;
  
  final String ZF;
  
  public final String Zx;
  
  public final String Zt;
  
  private Zzhh(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3) {
    this.Zw = paramInt1;
    this.ZA = paramInt2;
    this.ZF = paramString1;
    this.Zx = paramString2;
    this.Zt = paramString3;
  }
  
  public static Zzhh Zd(String paramString) {
    int i = paramString.lastIndexOf('/') + 1;
    String str1 = paramString.substring(i);
    int j = paramString.lastIndexOf('.');
    String[] arrayOfString = Zkti.Z_();
    j = (j != -1) ? j : paramString.length();
    int k = j;
    String str2 = paramString.substring(k);
    int m = str1.lastIndexOf('.');
    m = (m != -1) ? m : str1.length();
    String str3 = str1.substring(0, m);
    if (Zbqc.Zwu() == null)
      Zkti.ZN(new String[3]); 
    return new Zzhh(i, k, str1, str2, str3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */