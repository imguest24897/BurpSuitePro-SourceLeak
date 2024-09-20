package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.RelatedWebsiteSet")
public class RelatedWebsiteSet {
  @Zvd(Zp = "primarySites")
  public final List<String> primarySites;
  
  @Zvd(Zp = "associatedSites")
  public final List<String> associatedSites;
  
  @Zvd(Zp = "serviceSites")
  public final List<String> serviceSites;
  
  @Zox
  public RelatedWebsiteSet(@Zc5(Ze = "primarySites") List<String> paramList1, @Zc5(Ze = "associatedSites") List<String> paramList2, @Zc5(Ze = "serviceSites") List<String> paramList3) {
    this.primarySites = paramList1;
    this.associatedSites = paramList2;
    this.serviceSites = paramList3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\RelatedWebsiteSet.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */