package net.portswigger;

import burp.Zbqc;

@Zsi("CollaboratorEvent")
public class Zvt {
  @Zvd(Zp = "timeStamp")
  public final String Zv;
  
  @Zvd(Zp = "timeBetweenSendingPayloadAndReceivingInteraction")
  public final long ZQ;
  
  @Zvd(Zp = "sourceIpAddress")
  public final String ZM;
  
  @Zvd(Zp = "sourcePort")
  public final Integer ZF;
  
  @Zvd(Zp = "type")
  public final Zrz9 ZV;
  
  @Zvd(Zp = "interactionId")
  public final String ZS;
  
  @Zvd(Zp = "description")
  public final String ZH;
  
  @Zox
  public Zvt(@Zc5(Ze = "timeStamp") String paramString1, @Zc5(Ze = "timeBetweenSendingPayloadAndReceivingInteraction") long paramLong, @Zc5(Ze = "sourceIpAddress") String paramString2, @Zc5(Ze = "sourcePort", ZS = "null") Integer paramInteger, @Zc5(Ze = "type") Zrz9 paramZrz9, @Zc5(Ze = "interactionId") String paramString3, @Zc5(Ze = "description") String paramString4) {
    this.Zv = paramString1;
    this.ZQ = paramLong;
    int i = Zrmn.Zz();
    this.ZM = paramString2;
    this.ZF = paramInteger;
    this.ZV = paramZrz9;
    this.ZS = paramString3;
    this.ZH = paramString4;
    if (Zbqc.Zwu() == null)
      Zrmn.ZJ(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */