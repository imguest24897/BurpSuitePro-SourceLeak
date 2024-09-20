package com.install4j.api.actions;

import com.install4j.api.beans.Bean;
import com.install4j.api.context.Context;
import java.io.Serializable;

public interface Action extends Bean, Serializable {
  void init(Context paramContext);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\actions\Action.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */