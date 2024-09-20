package net.portswigger.devtools.protocol.events.storage;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAccessType;

@Zsi("net.portswigger.devtools.protocol.events.storage.InterestGroupAccessed")
public class InterestGroupAccessed implements Zl {
  @Zvd(Zp = "accessTime")
  public final Double accessTime;
  
  @Zvd(Zp = "type")
  public final InterestGroupAccessType type;
  
  @Zvd(Zp = "ownerOrigin")
  public final String ownerOrigin;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "componentSellerOrigin")
  @Zj
  public final String componentSellerOrigin;
  
  @Zvd(Zp = "bid")
  @Zj
  public final Double bid;
  
  @Zvd(Zp = "bidCurrency")
  @Zj
  public final String bidCurrency;
  
  @Zvd(Zp = "uniqueAuctionId")
  @Zj
  public final String uniqueAuctionId;
  
  @Zox
  public InterestGroupAccessed(@Zc5(Ze = "accessTime") Double paramDouble1, @Zc5(Ze = "type") InterestGroupAccessType paramInterestGroupAccessType, @Zc5(Ze = "ownerOrigin") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "componentSellerOrigin", ZS = "null") String paramString3, @Zc5(Ze = "bid", ZS = "null") Double paramDouble2, @Zc5(Ze = "bidCurrency", ZS = "null") String paramString4, @Zc5(Ze = "uniqueAuctionId", ZS = "null") String paramString5) {
    this.accessTime = paramDouble1;
    this.type = paramInterestGroupAccessType;
    this.ownerOrigin = paramString1;
    this.name = paramString2;
    this.componentSellerOrigin = paramString3;
    this.bid = paramDouble2;
    this.bidCurrency = paramString4;
    Zbqc[] arrayOfZbqc = StorageBucketDeleted.Zb();
    this.uniqueAuctionId = paramString5;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\InterestGroupAccessed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */