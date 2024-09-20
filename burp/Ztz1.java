package burp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ztz1 {
  private final List<Zsel> ZW = new LinkedList<>();
  
  private Zzu2 Z_;
  
  private Zgv3 Zx = Zgv3.LATEST;
  
  private int ZJ;
  
  private byte ZV;
  
  private byte ZK;
  
  private byte ZB;
  
  public Zsvb Zc(Zzu2 paramZzu2) {
    this.Z_ = paramZzu2;
    return new Zsvb(this);
  }
  
  public Zgv3 ZZ() {
    return this.Zx;
  }
  
  public Zzu2 Zt() {
    return this.Z_;
  }
  
  public int Zz() {
    return this.ZJ;
  }
  
  public byte ZO() {
    return this.ZV;
  }
  
  public byte Zg() {
    return this.ZK;
  }
  
  public List<Zsel> ZH() {
    return this.ZW;
  }
  
  public byte Zf() {
    return this.ZB;
  }
  
  public void ZB(Zgv3 paramZgv3) {
    this.Zx = paramZgv3;
  }
  
  public void Zo(byte paramByte) {
    this.ZV = paramByte;
  }
  
  public void Zm(byte paramByte) {
    this.ZK = paramByte;
  }
  
  public void ZN(Zsel... paramVarArgs) {
    this.ZW.addAll(Arrays.asList(paramVarArgs));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */