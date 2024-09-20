package burp;

public class Zg0m implements Zzrl {
  private final Zzrl[] Zd;
  
  public Zg0m(Zzrl... paramVarArgs) {
    this.Zd = paramVarArgs;
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    Zsov zsov = null;
    Zzrl[] arrayOfZzrl = this.Zd;
    Zbqc[] arrayOfZbqc = Zvo7.Zn();
    int i = arrayOfZzrl.length;
    byte b = 0;
    while (b < i) {
      Zzrl zzrl = arrayOfZzrl[b];
      Zsov zsov1 = zzrl.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
      if (zsov1 != null) {
        if ((zsov1.ZR() & 0x4) > 0)
          return zsov1; 
        if (zsov == null)
          zsov = zsov1; 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return zsov;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */