package burp;

class Zpr extends Zni implements Zzp3 {
  @Zzvo(0)
  private long Zl;
  
  @Zzvo(1)
  private byte ZY;
  
  @Zzvo(2)
  private int Zd;
  
  @Zzvo(3)
  private byte ZH;
  
  @Zzvo(4)
  private String ZQ;
  
  @Zzvo(5)
  private boolean Zo;
  
  @Zzvo(6)
  private byte ZX;
  
  Zpr(long paramLong, byte paramByte1, int paramInt, byte paramByte2, String paramString, boolean paramBoolean, byte paramByte3) {
    this.Zl = paramLong;
    this.ZY = paramByte1;
    this.Zd = paramInt;
    this.ZH = paramByte2;
    this.ZQ = paramString;
    this.Zo = paramBoolean;
    Zbqc[] arrayOfZbqc = Zeqm.ZZ();
    this.ZX = paramByte3;
    if (Zbqc.Zwu() == null)
      Zeqm.ZF(new Zbqc[1]); 
  }
  
  public long Zo_() {
    return this.Zl;
  }
  
  public void Zb(long paramLong) {
    this.Zl = paramLong;
  }
  
  public byte Zoc() {
    return this.ZY;
  }
  
  public void Zm(byte paramByte) {
    this.ZY = paramByte;
  }
  
  public int ZoS() {
    return this.Zd;
  }
  
  public void ZSV(int paramInt) {
    this.Zd = paramInt;
  }
  
  public byte Zog() {
    return this.ZH;
  }
  
  public void Za(byte paramByte) {
    this.ZH = paramByte;
  }
  
  public String Zo4() {
    return this.ZQ;
  }
  
  public void ZwI(String paramString) {
    this.ZQ = paramString;
  }
  
  public boolean Zo8() {
    return this.Zo;
  }
  
  public void Zav(boolean paramBoolean) {
    this.Zo = paramBoolean;
  }
  
  public byte ZoV() {
    return this.ZX;
  }
  
  public void ZQ(byte paramByte) {
    this.ZX = paramByte;
  }
  
  public Zeu4<Zzp3> ZF() {
    return Zc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */