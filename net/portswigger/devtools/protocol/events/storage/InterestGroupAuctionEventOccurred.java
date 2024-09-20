package net.portswigger.devtools.protocol.events.storage;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAuctionEventType;

@Zsi("net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionEventOccurred")
public class InterestGroupAuctionEventOccurred implements Zl {
  @Zvd(Zp = "eventTime")
  public final Double eventTime;
  
  @Zvd(Zp = "type")
  public final InterestGroupAuctionEventType type;
  
  @Zvd(Zp = "uniqueAuctionId")
  public final String uniqueAuctionId;
  
  @Zvd(Zp = "parentAuctionId")
  @Zj
  public final String parentAuctionId;
  
  @Zvd(Zp = "auctionConfig")
  @Zj
  public final Map<String, Zi7> auctionConfig;
  
  @Zox
  public InterestGroupAuctionEventOccurred(@Zc5(Ze = "eventTime") Double paramDouble, @Zc5(Ze = "type") InterestGroupAuctionEventType paramInterestGroupAuctionEventType, @Zc5(Ze = "uniqueAuctionId") String paramString1, @Zc5(Ze = "parentAuctionId", ZS = "null") String paramString2, @Zc5(Ze = "auctionConfig", ZS = "null") Map<String, Zi7> paramMap) {
    this.eventTime = paramDouble;
    this.type = paramInterestGroupAuctionEventType;
    this.uniqueAuctionId = paramString1;
    this.parentAuctionId = paramString2;
    this.auctionConfig = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\InterestGroupAuctionEventOccurred.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */