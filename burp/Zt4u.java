package burp;

import java.io.File;
import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zt4u implements Zmjm {
  private final Zrej Zt;
  
  private final Zxei Zl;
  
  private final Zzir ZE;
  
  private final Zerg ZV;
  
  private final Zt8u ZS;
  
  private final Zgbj ZM;
  
  private final Zgb6 Zy;
  
  private final Ztu3 ZN;
  
  private final Zk8l ZO;
  
  private final Zr_4 Zq;
  
  private final Zkl6 Zw;
  
  private Zxgc ZR;
  
  private Zslu ZP;
  
  private Zr1m Zv;
  
  private Zslc Zc;
  
  public Zt4u(Zrej paramZrej, Zxei paramZxei, Zzir paramZzir, Zerg paramZerg, Zt8u paramZt8u, Zgbj paramZgbj, Zgb6 paramZgb6, Ztu3 paramZtu3, Zk8l paramZk8l, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    this.Zt = paramZrej;
    this.Zl = paramZxei;
    this.ZE = paramZzir;
    this.ZV = paramZerg;
    this.ZS = paramZt8u;
    this.ZM = paramZgbj;
    this.Zy = paramZgb6;
    this.ZN = paramZtu3;
    this.ZO = paramZk8l;
    this.Zq = paramZr_4;
    this.Zw = paramZkl6;
  }
  
  void ZG(Zxgc paramZxgc, Zslu paramZslu, Zr1m paramZr1m, Zslc paramZslc) {
    this.ZR = paramZxgc;
    this.ZP = paramZslu;
    this.Zv = paramZr1m;
    this.Zc = paramZslc;
    ZI();
  }
  
  public void Zn() {
    this.Zt.ZD();
    this.ZV.Zf();
    this.ZN.ZY();
    this.Zq.close();
  }
  
  public Zl04 ZA() {
    return this.ZR.ZK1();
  }
  
  public void ZT(boolean paramBoolean) {
    this.ZM.ZK(paramBoolean);
  }
  
  public void ZI() {
    if (this.ZR != null)
      this.ZR.ZJ(Zp(), this.Zl.Ze()); 
  }
  
  public Zkl6 Ze() {
    return this.Zw;
  }
  
  public String Zp() {
    try {
      return this.ZE.Zvn();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return "";
    } 
  }
  
  public Zzir ZN() {
    return this.ZE;
  }
  
  public void Zd(String paramString) {
    Zm2.ZC(Zrrh.SUITE_PROJECTS_RENAME_PROJECT);
    this.ZE.ZSM(paramString);
    ZI();
    if (!this.Zt.ZM)
      (new Zsyo(this.ZS)).Zf(paramString, this.Zt.ZJ.getAbsolutePath()); 
  }
  
  public Zxs_ Zh(File paramFile) {
    return this.Zt.ZM ? Zxs_.Zz : new Zx4x(this.Zt.ZJ.getAbsolutePath().equals(paramFile.getAbsolutePath()), Zrgs.CURRENT_PROJECT_FILE_SELECTED_TITLE.ZN(new Object[0]), Zrgs.CURRENT_PROJECT_FILE_SELECTED.ZN(new Object[0]));
  }
  
  public void ZC(File paramFile, String paramString, Zlu6 paramZlu6) throws Zev3 {
    Zm2.ZC(Zrrh.SUITE_PROJECTS_SAVE_COPY_OF_PROJECT);
    this.Zc.Zp(paramFile, paramString, paramZlu6);
  }
  
  void ZD(Zlu6 paramZlu6) throws IOException {
    this.Zc.Zy(Zp(), paramZlu6);
  }
  
  public void ZB() {
    this.Zc.ZE();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */