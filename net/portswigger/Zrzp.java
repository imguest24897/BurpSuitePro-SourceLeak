package net.portswigger;

@Zsi("DataSegment")
public class Zrzp implements Zca {
  @Zvd(Zp = "data")
  public final byte[] Zl;
  
  @Zvd(Zp = "length")
  public final int Zi;
  
  @Zox
  public Zrzp(@Zc5(Ze = "data") byte[] paramArrayOfbyte, @Zc5(Ze = "length") int paramInt) {
    this.Zl = paramArrayOfbyte;
    this.Zi = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */