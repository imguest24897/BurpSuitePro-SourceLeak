package net.portswigger;

@Zsi("HttpCollaboratorEvent")
public class Zv8 extends Zvt {
  @Zvd(Zp = "protocol")
  public final String Zx;
  
  @Zvd(Zp = "requestResponse")
  public final Zia ZK;
  
  @Zox
  public Zv8(@Zc5(Ze = "protocol") String paramString1, @Zc5(Ze = "requestResponse") Zia paramZia, @Zc5(Ze = "timeStamp") String paramString2, @Zc5(Ze = "timeBetweenSendingPayloadAndReceivingInteraction") long paramLong, @Zc5(Ze = "sourceIpAddress") String paramString3, @Zc5(Ze = "sourcePort", ZS = "null") Integer paramInteger, @Zc5(Ze = "type") Zrz9 paramZrz9, @Zc5(Ze = "interactionId") String paramString4, @Zc5(Ze = "description") String paramString5) {
    super(paramString2, paramLong, paramString3, paramInteger, paramZrz9, paramString4, paramString5);
    this.Zx = paramString1;
    this.ZK = paramZia;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */