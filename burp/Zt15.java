package burp;

public class Zt15 {
  private final String ZW;
  
  public Zt15(String paramString) {
    this.ZW = paramString;
  }
  
  public Zzyw Zt() {
    Zk87 zk87 = Zs();
    return (zk87 == Zk87.Zk) ? null : zk87.Zg;
  }
  
  private Zk87 Zs() {
    Zk87 zk871 = Ze(0, this.ZW);
    if (zk871 == Zk87.Zk)
      return zk871; 
    Zk87 zk872 = ZP(zk871.ZG, this.ZW);
    if (zk872 == Zk87.Zk)
      return zk872; 
    Zzyw zzyw = new Zzyw(zk871.Zl.intValue(), zk872.ZY.longValue());
    return new Zk87(zk872.ZG, zzyw);
  }
  
  private static Zk87 Ze(int paramInt, String paramString) {
    int i = 0;
    byte b = 0;
    int j = paramInt;
    int[] arrayOfInt = Zxco.Z_();
    while (j < paramString.length() && b <= 8) {
      paramInt++;
      char c = paramString.charAt(j);
      int k = Character.digit(c, 16);
      if (k == -1)
        return (b > 0 && c == 'y') ? new Zk87(paramInt, i) : Zk87.Zk; 
      b++;
      i = i * 16 + k;
      j++;
      if (arrayOfInt == null)
        break; 
    } 
    return Zk87.Zk;
  }
  
  private static Zk87 ZP(int paramInt, String paramString) {
    long l = 0L;
    byte b = 0;
    int i = paramInt;
    int[] arrayOfInt = Zxco.Z_();
    while (i < paramString.length() && b <= 16) {
      paramInt++;
      char c = paramString.charAt(i);
      int j = Character.digit(c, 16);
      if (j == -1)
        return (b > 0 && c == 'y') ? new Zk87(paramInt, l) : Zk87.Zk; 
      b++;
      l = l * 16L + j;
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    return Zk87.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt15.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */