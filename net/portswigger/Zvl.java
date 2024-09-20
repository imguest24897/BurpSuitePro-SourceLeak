package net.portswigger;

import java.util.List;

@Zsi("SmtpCollaboratorEvent")
public class Zvl extends Zvt {
  @Zvd(Zp = "protocol")
  public final String ZT;
  
  @Zvd(Zp = "sender")
  public final String Zp;
  
  @Zvd(Zp = "recipients")
  public final List<String> Zt;
  
  @Zvd(Zp = "message")
  public final String Zw;
  
  @Zvd(Zp = "conversation")
  public final String ZN;
  
  @Zox
  public Zvl(@Zc5(Ze = "protocol") String paramString1, @Zc5(Ze = "sender") String paramString2, @Zc5(Ze = "recipients") List<String> paramList, @Zc5(Ze = "message") String paramString3, @Zc5(Ze = "conversation") String paramString4, @Zc5(Ze = "timeStamp") String paramString5, @Zc5(Ze = "timeBetweenSendingPayloadAndReceivingInteraction") long paramLong, @Zc5(Ze = "sourceIpAddress") String paramString6, @Zc5(Ze = "sourcePort", ZS = "null") Integer paramInteger, @Zc5(Ze = "type") Zrz9 paramZrz9, @Zc5(Ze = "interactionId") String paramString7, @Zc5(Ze = "description") String paramString8) {
    super(paramString5, paramLong, paramString6, paramInteger, paramZrz9, paramString7, paramString8);
    this.ZT = paramString1;
    this.Zp = paramString2;
    this.Zt = paramList;
    this.Zw = paramString3;
    this.ZN = paramString4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */