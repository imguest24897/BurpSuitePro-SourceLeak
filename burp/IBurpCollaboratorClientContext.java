package burp;

import java.util.List;

public interface IBurpCollaboratorClientContext {
  String generatePayload(boolean paramBoolean);
  
  List<IBurpCollaboratorInteraction> fetchAllCollaboratorInteractions();
  
  List<IBurpCollaboratorInteraction> fetchCollaboratorInteractionsFor(String paramString);
  
  List<IBurpCollaboratorInteraction> fetchAllInfiltratorInteractions();
  
  List<IBurpCollaboratorInteraction> fetchInfiltratorInteractionsFor(String paramString);
  
  String getCollaboratorServerLocation();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IBurpCollaboratorClientContext.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */