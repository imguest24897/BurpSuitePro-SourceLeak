package net.portswigger;

@Zsi("DnsCollaboratorEvent")
public class Zv5 extends Zvt {
  @Zvd(Zp = "queryType")
  public final int Zr;
  
  @Zvd(Zp = "domain")
  public final String ZX;
  
  @Zvd(Zp = "query")
  public final byte[] ZY;
  
  @Zox
  public Zv5(@Zc5(Ze = "queryType") int paramInt, @Zc5(Ze = "domain") String paramString1, @Zc5(Ze = "query") byte[] paramArrayOfbyte, @Zc5(Ze = "timeStamp") String paramString2, @Zc5(Ze = "timeBetweenSendingPayloadAndReceivingInteraction") long paramLong, @Zc5(Ze = "sourceIpAddress") String paramString3, @Zc5(Ze = "sourcePort", ZS = "null") Integer paramInteger, @Zc5(Ze = "type") Zrz9 paramZrz9, @Zc5(Ze = "interactionId") String paramString4, @Zc5(Ze = "description") String paramString5) {
    super(paramString2, paramLong, paramString3, paramInteger, paramZrz9, paramString4, paramString5);
    this.Zr = paramInt;
    this.ZX = paramString1;
    this.ZY = paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */