package burp;

import java.util.Optional;

public class Zpq extends Zni implements Zs37 {
  @Zzvo(0)
  private final int ZX;
  
  @Zzvo(2)
  private String Zx;
  
  @Zzvo(1)
  private byte ZO;
  
  @Zzvo(3)
  private Zrdb ZS;
  
  Zpq(int paramInt, String paramString, byte paramByte) {
    this.ZX = paramInt;
    String[] arrayOfString = Zg1s.Zr();
    this.Zx = paramString;
    this.ZO = paramByte;
    if (Zbqc.Zwu() == null)
      Zg1s.Zt(new String[4]); 
  }
  
  public Zeu4<? extends Zs37> ZF() {
    return Zs37.Zr;
  }
  
  public int Zvy() {
    return this.ZX;
  }
  
  public byte Zvk() {
    return this.ZO;
  }
  
  public String Zv2() {
    return this.Zx;
  }
  
  public Optional<Zrdb> ZvY() {
    return Optional.ofNullable(this.ZS);
  }
  
  public void ZW(Zrdb paramZrdb) {
    this.ZS = paramZrdb;
  }
  
  public void ZvS() {
    this.ZO = (byte)(this.ZO + 1);
  }
  
  public void ZOv(String paramString) {
    this.Zx = Zg1s.Z_(Zv2(), paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */