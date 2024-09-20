package burp;

import java.util.Iterator;
import java.util.List;

class Zr9d extends Zr9a {
  final List Zw;
  
  Zr9d(Ztub paramZtub, List paramList) {}
  
  public Zte7 ZJ(Zkcp paramZkcp) {
    ZV(paramZkcp.ZMJ());
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zz(Zrp9 paramZrp9) {
    ZV(paramZrp9.ZvU());
    ZV(paramZrp9.Zvh());
    return Zte7.CONTINUE;
  }
  
  public Zte7 ZS(Zg3y paramZg3y) {
    ZV(paramZg3y.ZXJ());
    ZV(paramZg3y.ZXB());
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zc(Zze_ paramZze_) {
    ZV(paramZze_.ZK_());
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zz(Zt38 paramZt38) {
    ZV(paramZt38.ZCM());
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zf(Zreg paramZreg) {
    paramZreg.ZmQ().ZC(this);
    Iterator<Zzi8> iterator = paramZreg.Zmq().iterator();
    String[] arrayOfString = Ztub.Zo();
    while (iterator.hasNext()) {
      Zzi8 zzi8 = iterator.next();
      ZV(zzi8);
      if (arrayOfString == null)
        break; 
    } 
    return Zte7.CONTINUE;
  }
  
  public Zte7 ZO(Zrkg paramZrkg) {
    String[] arrayOfString = Ztub.Zo();
    for (Zglw zglw : paramZrkg.Zcy()) {
      ZV(zglw.ZDa());
      if (arrayOfString == null)
        break; 
    } 
    return Zte7.CONTINUE;
  }
  
  public Zte7 Zf(Zzq1 paramZzq1) {
    ZV(paramZzq1.ZRm());
    return Zte7.CONTINUE;
  }
  
  private void ZV(Zzi8 paramZzi8) {
    if (paramZzi8 != null)
      this.Zw.add(paramZzi8); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr9d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */