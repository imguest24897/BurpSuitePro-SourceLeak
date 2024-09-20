package burp;

public class Zm68 implements Zzrl {
  private final Zzrl ZF;
  
  private static String[] ZN;
  
  public Zm68(String paramString, boolean paramBoolean) {
    this.ZF = new Zsok(new Zzrl[] { new Zx4d(paramString, paramBoolean), new Zvo7(new Zzrl[] { new Ze3l(paramString, paramBoolean), new Zzvs(paramString, paramBoolean), new Zsok(new Zzrl[] { new Zrru(paramString, paramBoolean), new Zvo7(new Zzrl[] { new Ztj8(paramString, paramBoolean), new Zmy7(paramString, paramBoolean) }) }) }) });
    if (Zbqc.Zwu() == null)
      ZG(new String[2]); 
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    return this.ZF.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
  }
  
  public static void ZG(String[] paramArrayOfString) {
    ZN = paramArrayOfString;
  }
  
  public static String[] Zb() {
    return ZN;
  }
  
  static {
    if (Zb() != null)
      ZG(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm68.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */