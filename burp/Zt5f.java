package burp;

import java.net.UnknownHostException;
import java.util.List;

class Zt5f {
  private final Zxz1 Zb;
  
  private final Zbnt ZU;
  
  private final Zr0y ZB;
  
  private final Zm6e ZF;
  
  private final Zey9 ZZ;
  
  Zt5f(Zxz1 paramZxz1, Zs9m paramZs9m, Zbnt paramZbnt, Zkl6 paramZkl6) {
    this.Zb = paramZxz1;
    this.ZU = paramZbnt;
    this.ZB = new Zr0y(paramZs9m);
    this.ZF = paramZkl6.Zs();
    this.ZZ = paramZkl6.ZH();
  }
  
  byte Zp(Zlit paramZlit, Zstu paramZstu, Zs68 paramZs68, Zg7i paramZg7i) throws UnknownHostException {
    boolean bool = ZQ(paramZlit, paramZstu, paramZs68, paramZg7i);
    try {
      if (bool)
        return 2; 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
    
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    return Zd(paramZlit, paramZg7i) ? 1 : 2;
  }
  
  private boolean Zd(Zlit paramZlit, Zg7i paramZg7i) throws UnknownHostException {
    Zlit zlit1 = Zl26.Zp(paramZlit, 9);
    Zlit zlit2 = Zl26.Zs(paramZlit, 9);
    Zlit zlit3 = Zl26.Zr(paramZlit, 4);
    Zk1d zk1d1 = ZY(zlit1, paramZg7i);
    Zk1d zk1d2 = ZY(zlit2, paramZg7i);
    Zk1d zk1d3 = ZY(zlit3, paramZg7i);
    try {
      if (!zk1d1.ZI)
        try {
          if (!zk1d2.ZI)
            try {
              if (!zk1d3.ZI)
                return true; 
            } catch (UnknownHostException unknownHostException) {
              throw a(null);
            }  
        } catch (UnknownHostException unknownHostException) {
          throw a(null);
        }  
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    boolean bool = false;
    Zmzk zmzk = paramZlit.Zdz();
    if (zk1d1.ZI) {
      Zs6y zs6y = ZW(zk1d1.ZK, zk1d1.Z_, zk1d1.Zk);
      if (!this.ZB.Zl(zmzk, zs6y)) {
        this.ZB.ZI(zmzk, zs6y, Zl26.Zp(paramZlit, 6), Zl26.Zp(paramZlit, 12));
        bool = true;
      } 
    } 
    if (zk1d2.ZI) {
      Zs6y zs6y = ZW(zk1d2.ZK, zk1d2.Z_, zk1d2.Zk);
      if (!this.ZB.Zl(zmzk, zs6y)) {
        this.ZB.ZI(zmzk, zs6y, Zl26.Zs(paramZlit, 6), Zl26.Zs(paramZlit, 12));
        bool = true;
      } 
    } 
    if (zk1d3.ZI) {
      Zs6y zs6y = ZW(zk1d3.ZK, zk1d3.Z_, zk1d3.Zk);
      if (!this.ZB.Zl(zmzk, zs6y)) {
        this.ZB.ZI(zmzk, zs6y, Zl26.Zr(paramZlit, 3), Zl26.Zr(paramZlit, 5));
        bool = true;
      } 
    } 
    return bool;
  }
  
  private Zk1d ZY(Zlit paramZlit, Zg7i paramZg7i) throws UnknownHostException {
    byte[] arrayOfByte = this.ZF.ZO().Zf(paramZlit).Zr().ZiD();
    Zg3d zg3d = this.Zb.ZV(this.ZZ.ZY(paramZlit.Zdz(), arrayOfByte));
    try {
      if (zg3d.Ze() != null)
        try {
          if (zg3d.Ze().ZF() != 0) {
            Zstu zstu = zg3d.Ze().Za();
            Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.ZU);
            boolean bool = ZQ(paramZlit, zstu, zs68, paramZg7i);
            try {
            
            } catch (UnknownHostException unknownHostException) {
              throw a(null);
            } 
            return new Zk1d(!bool, paramZlit, zstu, zs68);
          } 
          return new Zk1d(false, paramZlit, null, null);
        } catch (UnknownHostException unknownHostException) {
          throw a(null);
        }  
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    return new Zk1d(false, paramZlit, null, null);
  }
  
  private boolean ZQ(Zlit paramZlit, Zstu paramZstu, Zs68 paramZs68, Zg7i paramZg7i) {
    return paramZg7i.ZV(ZW(paramZlit, paramZstu, paramZs68));
  }
  
  private Zs6y ZW(Zlit paramZlit, Zstu paramZstu, Zs68 paramZs68) {
    List<Zg8y> list = (new Zm4c<>(this.ZU)).Zn().Zw().ZW(Zski.Zf(paramZlit), paramZs68);
    return (new Zk1s()).Zx(paramZstu, paramZs68).Zw(list).ZF();
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */