package com.install4j.api.actions;

import com.install4j.api.context.UninstallerContext;
import com.install4j.api.context.UserCanceledException;

public interface UninstallAction extends Action {
  boolean uninstall(UninstallerContext paramUninstallerContext) throws UserCanceledException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\actions\UninstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */