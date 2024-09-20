package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Position;

public class Zeks {
  private int Zv;
  
  private Position Zf;
  
  private int Zi = -1;
  
  private int Zn;
  
  private int ZB;
  
  private String Zh;
  
  private List<Zzxu> ZK;
  
  private List<Zxtx> ZZ;
  
  public void ZB(String paramString, int paramInt1, int paramInt2) {
    if (this.ZZ == null)
      this.ZZ = new ArrayList<>(1); 
    this.ZZ.add(new Zxtx(paramString, paramInt1, paramInt2));
  }
  
  public void Zk(int paramInt1, int paramInt2) {
    if (this.ZK == null)
      this.ZK = new ArrayList<>(1); 
    this.ZK.add(new Zzxu(paramInt1, paramInt2));
  }
  
  public int Zy() {
    return (this.Zi > -1) ? this.Zi : Zq().getOffset();
  }
  
  public Position Zq() {
    return this.Zf;
  }
  
  public int Zd() {
    return this.Zv;
  }
  
  public int Z_() {
    return (this.ZZ == null) ? 0 : this.ZZ.size();
  }
  
  public int Zl() {
    return (this.ZK == null) ? 0 : this.ZK.size();
  }
  
  public Zxtx Zk(int paramInt) {
    return this.ZZ.get(paramInt);
  }
  
  public Zzxu Zj(int paramInt) {
    return this.ZK.get(paramInt);
  }
  
  public int ZD() {
    return this.ZB;
  }
  
  public int Zw() {
    return this.Zn;
  }
  
  public String ZC() {
    return this.Zh;
  }
  
  public boolean ZN() {
    return (this.ZB != this.Zn);
  }
  
  public void Zb(int paramInt1, int paramInt2) {
    this.Zn = paramInt1;
    this.ZB = paramInt2;
  }
  
  public void ZC(int paramInt, Position paramPosition) {
    this.Zv = paramInt;
    this.Zf = paramPosition;
  }
  
  public void ZL(int paramInt) {
    this.Zi = paramInt;
  }
  
  public void ZU(String paramString) {
    this.Zh = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */