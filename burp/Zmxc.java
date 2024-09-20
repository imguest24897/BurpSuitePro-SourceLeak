package burp;

import java.util.ArrayList;
import java.util.List;

public class Zmxc {
  private final Zsov[] ZP = new Zsov[26];
  
  public boolean Zr(byte paramByte) {
    return (this.ZP[paramByte] == null);
  }
  
  public void ZK(byte paramByte, Zsov paramZsov) {
    this.ZP[paramByte] = paramZsov;
  }
  
  public void Zf(Zz4_ paramZz4_) {
    Zsov[] arrayOfZsov = this.ZP;
    int i = arrayOfZsov.length;
    String[] arrayOfString = Zlzh.Zj();
    byte b = 0;
    while (b < i) {
      Zsov zsov = arrayOfZsov[b];
      paramZz4_.Zz(zsov);
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public List<Byte> Zx() {
    ArrayList<Byte> arrayList = new ArrayList();
    Zsov[] arrayOfZsov = this.ZP;
    String[] arrayOfString = Zlzh.Zj();
    int i = arrayOfZsov.length;
    byte b = 0;
    while (b < i) {
      Zsov zsov = arrayOfZsov[b];
      if (zsov instanceof Zx_5 && ((Zx_5)zsov).ZN() == Zzu2.XSS_REFLECTED)
        arrayList.add(Byte.valueOf(((Zx_5)zsov).ZV())); 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */