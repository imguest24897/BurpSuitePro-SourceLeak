package net.portswigger.devtools.protocol.events.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAuctionFetchType;

@Zsi("net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionNetworkRequestCreated")
public class InterestGroupAuctionNetworkRequestCreated implements Zl {
  @Zvd(Zp = "type")
  public final InterestGroupAuctionFetchType type;
  
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "auctions")
  public final List<String> auctions;
  
  @Zox
  public InterestGroupAuctionNetworkRequestCreated(@Zc5(Ze = "type") InterestGroupAuctionFetchType paramInterestGroupAuctionFetchType, @Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "auctions") List<String> paramList) {
    this.type = paramInterestGroupAuctionFetchType;
    this.requestId = paramString;
    this.auctions = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\InterestGroupAuctionNetworkRequestCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */