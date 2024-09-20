package burp;

public class Zvo7 implements Zzrl {
  private final Zzrl[] ZZ;
  
  private static Zbqc[] ZC;
  
  public Zvo7(Zzrl... paramVarArgs) {
    this.ZZ = paramVarArgs;
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    Zzrl[] arrayOfZzrl = this.ZZ;
    int i = arrayOfZzrl.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zn();
    while (b < i) {
      Zzrl zzrl = arrayOfZzrl[b];
      Zsov zsov = zzrl.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
      if (zsov != null)
        return zsov; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  public static void Zk(Zbqc[] paramArrayOfZbqc) {
    ZC = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zn() {
    return ZC;
  }
  
  static {
    if (Zn() == null)
      Zk(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvo7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */