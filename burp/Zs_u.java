package burp;

public class Zs_u implements Zz7s {
  private final char[] Zc;
  
  Zs_u(char[] paramArrayOfchar) {
    this.Zc = paramArrayOfchar;
  }
  
  public Zztf Zy() {
    String str1 = Zr(this.Zc);
    int j = str1.length();
    int i = Zztf.ZJ();
    int k = this.Zc.length - 1;
    while (j < k && Character.isWhitespace(this.Zc[j])) {
      j++;
      if (i != 0)
        break; 
    } 
    int m = Zf(this.Zc, j);
    while (m > j && Character.isWhitespace(this.Zc[m])) {
      m--;
      if (i != 0)
        break; 
    } 
    String str2 = new String(this.Zc, j, m - j + 1);
    if (Zbqc.Zwu() == null)
      Zztf.Zk(++i); 
    return new Zztf(str1, str2);
  }
  
  private static String Zr(char[] paramArrayOfchar) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    int i = Zztf.ZJ();
    int j = paramArrayOfchar.length - 1;
    while (b <= j) {
      char c = paramArrayOfchar[b];
      if (Character.isWhitespace(c))
        break; 
      stringBuilder.append(c);
      b++;
      if (i != 0)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private static int Zf(char[] paramArrayOfchar, int paramInt) {
    int j = paramArrayOfchar.length - 1;
    char c = paramArrayOfchar[j];
    int i = Zztf.ZJ();
    while (j > paramInt && !Character.isWhitespace(c)) {
      c = paramArrayOfchar[--j];
      if (i != 0)
        break; 
    } 
    return j;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */