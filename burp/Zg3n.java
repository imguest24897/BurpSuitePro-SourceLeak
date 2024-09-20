package burp;

class Zg3n {
  private final int ZB;
  
  private final Byte Zd;
  
  Zg3n(int paramInt, Byte paramByte) {
    this.ZB = paramInt;
    this.Zd = paramByte;
  }
  
  boolean ZQ(int paramInt, byte paramByte) {
    boolean bool = (this.Zd == null || this.Zd.byteValue() == paramByte) ? true : false;
    return ((paramInt & this.ZB) == this.ZB && bool);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */