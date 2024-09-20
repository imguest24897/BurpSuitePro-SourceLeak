package com.install4j.runtime.installer.helper.comm.actions;

import com.install4j.api.context.Context;
import com.install4j.runtime.installer.helper.comm.responses.Response;
import java.io.Serializable;

public abstract class CommunicationAction implements Serializable {
  public abstract Response execute(Context paramContext) throws Exception;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\actions\CommunicationAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */