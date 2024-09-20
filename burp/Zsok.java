package burp;

public class Zsok implements Zzrl {
  private final Zzrl[] Zk;
  
  public Zsok(Zzrl... paramVarArgs) {
    this.Zk = paramVarArgs;
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    Zsov zsov = null;
    Zzrl[] arrayOfZzrl = this.Zk;
    Zbqc[] arrayOfZbqc = Zvo7.Zn();
    int i = arrayOfZzrl.length;
    byte b = 0;
    while (b < i) {
      Zzrl zzrl = arrayOfZzrl[b];
      boolean bool = (zsov != null) ? zsov.ZR() : false;
      Zsov zsov1 = zzrl.ZJ(paramZlzh.Zz(bool), paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
      if (zsov1 == null)
        break; 
      zsov = zsov1;
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return zsov;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsok.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */