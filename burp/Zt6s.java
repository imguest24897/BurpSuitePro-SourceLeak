package burp;

public class Zt6s {
  private static Zbqc[] Zd;
  
  public static boolean ZT(Zsmh paramZsmh) {
    return (paramZsmh != null && (Zh(paramZsmh)).length > 20000000);
  }
  
  public static byte[] Zu(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    Zrp8 zrp8 = new Zrp8();
    paramZsmh.Zh(zrp8);
    return zrp8.Zb();
  }
  
  public static byte[] Zb(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    Zrpf zrpf = new Zrpf();
    paramZsmh.Zh(zrpf);
    return zrpf.Zb();
  }
  
  public static byte[] Zh(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return null; 
    Zk8 zk8 = new Zk8();
    paramZsmh.Zh(zk8);
    return zk8.Zi();
  }
  
  public static Zr6h ZE(Zefx paramZefx) {
    Zmux zmux = new Zmux();
    paramZefx.Zi(zmux);
    return zmux.ZK;
  }
  
  public static boolean ZX(Zsmh paramZsmh) {
    Ztlv ztlv = new Ztlv();
    paramZsmh.Zh(ztlv);
    return ztlv.ZL;
  }
  
  public static void ZZ(Zbqc[] paramArrayOfZbqc) {
    Zd = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return Zd;
  }
  
  static {
    if (Za() != null)
      ZZ(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */