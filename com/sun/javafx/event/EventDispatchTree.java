package com.sun.javafx.event;

import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;

public interface EventDispatchTree extends EventDispatchChain {
  EventDispatchTree createTree();
  
  EventDispatchTree mergeTree(EventDispatchTree paramEventDispatchTree);
  
  EventDispatchTree append(EventDispatcher paramEventDispatcher);
  
  EventDispatchTree prepend(EventDispatcher paramEventDispatcher);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventDispatchTree.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */