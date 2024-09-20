package burp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmnl implements Zqr {
  private final Zenv Zl;
  
  private final Zzen ZA;
  
  private final Zmzk Zz;
  
  private final Zthe Ze;
  
  public Zmnl(Zenv paramZenv, Zzen paramZzen, Zmzk paramZmzk, Zthe paramZthe) {
    this.Zl = paramZenv;
    this.ZA = paramZzen;
    this.Zz = paramZmzk;
    this.Ze = paramZthe;
  }
  
  public Socket ZX() throws IOException {
    try {
      return this.Zl.Zc();
    } catch (Zryf zryf) {
      Zah.Zl(zryf, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().ZS(Zt21.APPLICATION, this.Zz);
      this.Ze.ZN(zryf, zryf.Ze);
    } catch (Zry8 zry8) {
      Zah.Zl(zry8, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().ZS(Zt21.PROXY, this.Zz);
      this.Ze.ZN(zry8, zry8.Ze);
    } catch (Zry6 zry6) {
      Zah.Zl(zry6, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().ZI(Zt21.APPLICATION, this.Zz, zry6.Zs);
      this.Ze.ZN(zry6, zry6.Ze);
    } catch (Zryl zryl) {
      Zah.Zl(zryl, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().ZI(Zt21.PROXY, this.Zz, zryl.Zs);
      this.Ze.ZN(zryl, zryl.Ze);
    } catch (Zryo|Zryj zryo) {
      Zah.Zl(zryo, Zk_.UNEXPECTED);
    } catch (Ztp7 ztp7) {
      Zah.Zl(ztp7, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().Zx(Zt21.PROXY, this.Zz);
      this.Ze.ZX(ztp7);
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().Zx(Zt21.APPLICATION, this.Zz);
      this.Ze.ZX(unknownHostException);
    } catch (Zr92 zr92) {
      Zah.Zl(zr92, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().Zl(zr92.Z_, this.Zz);
      this.Ze.Zh(zr92);
    } catch (Zxt3 zxt3) {
      Zah.Zl(zxt3, Zk_.COMMON_RUNTIME_FAILURE);
      this.ZA.ZE().Ze();
      this.Ze.ZP(zxt3);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmnl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */