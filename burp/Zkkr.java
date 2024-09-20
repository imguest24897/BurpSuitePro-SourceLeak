package burp;

import net.portswigger.Zsy;

public class Zkkr implements Zzrl {
  private final Zsy Ze;
  
  private final Zkmp ZC;
  
  private final Zzrl Zz;
  
  public Zkkr(Zsy paramZsy, Zkmp paramZkmp) {
    this.Ze = paramZsy;
    this.ZC = paramZkmp;
    String[] arrayOfString2 = { "", "\t", "\n", "\r", ":", "\000" };
    String[] arrayOfString3 = { 
        "", " ", "\t", "\n", "\r", "\f", "\b", "\001", "\002", "\003", 
        "\004", "\005", "\006", "\007", "\013", "\016", "\017", "\020", "\021", "\022", 
        "\023", "\024", "\025", "\026", "\027", "\030", "\031", "\032", "\033", "\034", 
        "\035", "\036", "\037" };
    Zzrl[] arrayOfZzrl = new Zzrl[arrayOfString2.length + arrayOfString3.length];
    String[] arrayOfString1 = Zm68.Zb();
    byte b = 0;
    while (b < arrayOfString2.length) {
      arrayOfZzrl[b] = ZU("", arrayOfString2[b]);
      b++;
      if (arrayOfString1 != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    b = 0;
    while (b < arrayOfString3.length) {
      arrayOfZzrl[arrayOfString2.length + b] = ZU(arrayOfString3[b], "");
      b++;
      if (arrayOfString1 != null)
        break; 
    } 
    this.Zz = new Zvo7(arrayOfZzrl);
  }
  
  private Zzrl ZU(String paramString1, String paramString2) {
    return new Zsok(new Zzrl[] { new Zznp(paramString1, this.ZC, paramString2), new Zsp8(this.Ze, paramString1, paramString2) });
  }
  
  public Zsov ZJ(Zlzh paramZlzh, Zgk_ paramZgk_, byte paramByte1, byte paramByte2, Zkv8 paramZkv8, byte[] paramArrayOfbyte) {
    return this.Zz.ZJ(paramZlzh, paramZgk_, paramByte1, paramByte2, paramZkv8, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */