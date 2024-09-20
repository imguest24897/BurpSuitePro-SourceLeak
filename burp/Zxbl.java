package burp;

import java.util.Optional;

public class Zxbl extends Zxsr implements Zs37 {
  Zxbl(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zeu4<? extends Zs37> ZF() {
    return Zr;
  }
  
  public int Zvy() {
    return this.Za.Zx(this, Zksy.ZI);
  }
  
  public byte Zvk() {
    return this.Za.ZL(this, Zksy.ZA);
  }
  
  public String Zv2() {
    return ((Zzvg)this.Za.<Zzvg>ZJ(this, Zksy.Zr)).toString();
  }
  
  public Optional<Zrdb> ZvY() {
    return Optional.ofNullable(this.Za.<Zrdb>ZJ(this, Zksy.ZK));
  }
  
  public void ZW(Zrdb paramZrdb) {
    this.Za.Zq(this, Zksy.ZK, paramZrdb);
  }
  
  public void ZvS() {
    this.Za.Zc(this, Zksy.ZA, (byte)(Zvk() + 1));
  }
  
  public void ZOv(String paramString) {
    ((Zzvg)this.Za.<Zzvg>ZJ(this, Zksy.Zr)).Zf(Zg1s.Z_(Zv2(), paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxbl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */