/*     */ package com.install4j.runtime.installer.controller;
/*     */ 
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.groups.ControlFlowGroup;
/*     */ import com.install4j.runtime.beans.groups.Group;
/*     */ import com.install4j.runtime.beans.screens.FormScreen;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.config.GroupBeanConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class ScreenNavigator
/*     */ {
/*  17 */   private LinkedList<HistoryEntry> screenConfigHistory = new LinkedList<>();
/*  18 */   private LinkedList<GroupStackEntry> groupStack = new LinkedList<>();
/*     */   private ContextImpl context;
/*     */   
/*     */   public ScreenNavigator(ContextImpl context) {
/*  22 */     this.context = context;
/*  23 */     this.groupStack.add(new GroupStackEntry(null, context.getScreenConfigs(), -1));
/*     */   }
/*     */   
/*     */   public void sync(ScreenBeanConfig currentScreenConfig) {
/*  27 */     this.groupStack.clear();
/*  28 */     fillGroupStack(null, this.context.getScreenConfigs(), currentScreenConfig);
/*     */   }
/*     */   
/*     */   private boolean fillGroupStack(GroupBeanConfig parentGroupConfig, List<AbstractBeanConfig> screenConfigs, ScreenBeanConfig currentScreenConfig) {
/*  32 */     for (int i = 0; i < screenConfigs.size(); i++) {
/*  33 */       AbstractBeanConfig config = screenConfigs.get(i);
/*  34 */       if (config instanceof ScreenBeanConfig) {
/*  35 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)config;
/*     */         
/*  37 */         if (screenConfig == currentScreenConfig) {
/*  38 */           this.groupStack.add(new GroupStackEntry(parentGroupConfig, screenConfigs, i));
/*  39 */           return true;
/*     */         } 
/*     */       } else {
/*  42 */         GroupBeanConfig childGroupConfig = (GroupBeanConfig)config;
/*  43 */         if (fillGroupStack(childGroupConfig, childGroupConfig.getBeanConfigs(), currentScreenConfig)) {
/*  44 */           this.groupStack.addFirst(new GroupStackEntry(parentGroupConfig, screenConfigs, i));
/*  45 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/*  49 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ScreenBeanConfig findNextScreenConfig(ScreenBeanConfig currentScreenConfig, int number, boolean checkCondition) {
/*  54 */     if (getCurrentConfig() != currentScreenConfig) {
/*  55 */       sync(currentScreenConfig);
/*     */     }
/*     */     
/*  58 */     boolean checkLoop = (number == 1);
/*  59 */     for (int i = 0; i < number; i++) {
/*  60 */       if (!forward(checkLoop, checkCondition)) {
/*  61 */         return null;
/*     */       }
/*     */     } 
/*  64 */     return (ScreenBeanConfig)getCurrentConfig();
/*     */   }
/*     */   
/*     */   public ScreenBeanConfig findPreviousScreenConfig(ScreenBeanConfig currentScreenConfig, int number) {
/*  68 */     if (getCurrentConfig() != currentScreenConfig) {
/*  69 */       sync(currentScreenConfig);
/*     */     }
/*     */     
/*  72 */     for (int i = 0; i < number; i++) {
/*  73 */       if (!backward()) {
/*  74 */         return null;
/*     */       }
/*     */     } 
/*  77 */     return (ScreenBeanConfig)getCurrentConfig();
/*     */   }
/*     */   
/*     */   private AbstractBeanConfig getCurrentConfig() {
/*  81 */     GroupStackEntry currentStackEntry = getCurrentStackEntry();
/*  82 */     if (currentStackEntry == null) {
/*  83 */       return null;
/*     */     }
/*  85 */     return currentStackEntry.getCurrentConfig();
/*     */   }
/*     */ 
/*     */   
/*     */   public ScreenBeanConfig findPreviousScreenConfigInHistory(boolean updateGroupStack, List<AbstractBeanConfig> hiddenForPreviousActionConfigs, int number) {
/*  90 */     ScreenBeanConfig screenBeanConfig = null;
/*  91 */     for (int i = 0; i < number; i++) {
/*  92 */       screenBeanConfig = backwardInHistory(updateGroupStack, hiddenForPreviousActionConfigs);
/*  93 */       if (screenBeanConfig == null) {
/*     */         break;
/*     */       }
/*     */     } 
/*  97 */     return screenBeanConfig;
/*     */   }
/*     */   
/*     */   private ScreenBeanConfig backwardInHistory(boolean updateGroupStack, List<AbstractBeanConfig> hiddenForPreviousActionConfigs) {
/* 101 */     ScreenBeanConfig screenBeanConfig = null;
/*     */     
/* 103 */     int i = this.screenConfigHistory.size() - 1;
/*     */     
/* 105 */     if (!updateGroupStack)
/*     */     {
/* 107 */       i--;
/*     */     }
/*     */     
/* 110 */     HistoryEntry historyEntry = null;
/* 111 */     while (i >= 0) {
/* 112 */       historyEntry = this.screenConfigHistory.get(i);
/* 113 */       screenBeanConfig = historyEntry.screenConfig;
/*     */       
/* 115 */       if (updateGroupStack) {
/* 116 */         this.screenConfigHistory.remove(i);
/*     */       }
/*     */       
/* 119 */       Screen screen = screenBeanConfig.getOrInstantiateScreen(false);
/* 120 */       if (!screen.isHiddenForPrevious())
/*     */         break; 
/* 122 */       if (hiddenForPreviousActionConfigs != null) {
/* 123 */         hiddenForPreviousActionConfigs.addAll(screenBeanConfig.getActionConfigs());
/*     */       }
/* 125 */       i--;
/*     */     } 
/*     */     
/* 128 */     if (updateGroupStack && historyEntry != null) {
/* 129 */       this.groupStack = historyEntry.groupStack;
/* 130 */       ContextImpl.GroupState parentGroupState = null;
/* 131 */       for (GroupStackEntry groupStackEntry : this.groupStack) {
/* 132 */         if (groupStackEntry.groupConfig != null) {
/* 133 */           Group group = groupStackEntry.groupConfig.getOrInstantiateGroup(false);
/* 134 */           if (group instanceof ControlFlowGroup && parentGroupState != null) {
/* 135 */             ControlFlowGroup controlFlowGroup = (ControlFlowGroup)group;
/* 136 */             this.context.setLoopIndexInstallerVariable(controlFlowGroup, parentGroupState);
/*     */           } 
/*     */         } 
/* 139 */         parentGroupState = groupStackEntry.groupState;
/*     */       } 
/*     */     } 
/*     */     
/* 143 */     return screenBeanConfig;
/*     */   }
/*     */   
/*     */   private boolean forward(boolean checkLoop, boolean checkCondition) {
/* 147 */     GroupStackEntry stackEntry = getCurrentStackEntry();
/* 148 */     assert stackEntry != null;
/* 149 */     while (stackEntry.index < stackEntry.screenConfigs.size() - 1) {
/* 150 */       stackEntry.index++;
/* 151 */       AbstractBeanConfig beanConfig = stackEntry.screenConfigs.get(stackEntry.index);
/* 152 */       if (beanConfig instanceof GroupBeanConfig) {
/* 153 */         GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/* 154 */         if (!checkCondition || this.context.checkGroupCondition(groupConfig)) {
/* 155 */           this.context.initLoopIndex(groupConfig, stackEntry.groupState);
/* 156 */           return enterGroup(groupConfig, checkLoop, checkCondition);
/*     */         }  continue;
/* 158 */       }  if (beanConfig instanceof ScreenBeanConfig) {
/* 159 */         ScreenBeanConfig screenConfig = (ScreenBeanConfig)beanConfig;
/* 160 */         Screen screen = screenConfig.getOrInstantiateScreen(false);
/* 161 */         if (!checkCondition || shouldBeShown(screenConfig)) {
/* 162 */           if (!screen.isHiddenForNext()) {
/* 163 */             return true;
/*     */           }
/* 165 */           addHistory(screenConfig);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 171 */     if (this.groupStack.size() > 1) {
/* 172 */       this.groupStack.removeLast();
/* 173 */       if (checkLoop) {
/* 174 */         GroupBeanConfig groupConfig = (GroupBeanConfig)getCurrentConfig();
/* 175 */         if (groupConfig != null && this.context.isGroupLoop(groupConfig, (getCurrentStackEntry()).groupState)) {
/* 176 */           resetInitializationOfContainedFormScreens(groupConfig);
/* 177 */           return enterGroup(groupConfig, true, checkCondition);
/*     */         } 
/*     */       } 
/* 180 */       if (forward(checkLoop, checkCondition)) {
/* 181 */         return true;
/*     */       }
/*     */     } 
/* 184 */     return false;
/*     */   }
/*     */   
/*     */   public boolean shouldBeShown(ScreenBeanConfig screenConfig) {
/* 188 */     Screen screen = screenConfig.getOrInstantiateScreen(false);
/* 189 */     return (!screen.isHidden() && this.context.runBooleanScript(screenConfig.getConditionClassName(), (Bean)screen, new Object[0]));
/*     */   }
/*     */   
/*     */   private boolean backward() {
/* 193 */     GroupStackEntry stackEntry = getCurrentStackEntry();
/* 194 */     assert stackEntry != null;
/* 195 */     while (stackEntry.index > 0) {
/* 196 */       stackEntry.index--;
/* 197 */       AbstractBeanConfig beanConfig = stackEntry.screenConfigs.get(stackEntry.index);
/* 198 */       if (beanConfig instanceof GroupBeanConfig) {
/* 199 */         GroupBeanConfig groupConfig = (GroupBeanConfig)beanConfig;
/* 200 */         this.groupStack.add(new GroupStackEntry(groupConfig, groupConfig.getBeanConfigs(), groupConfig.getBeanConfigs().size()));
/* 201 */         if (backward()) {
/* 202 */           return true;
/*     */         }
/* 204 */         this.groupStack.removeLast(); continue;
/*     */       } 
/* 206 */       if (beanConfig instanceof ScreenBeanConfig) {
/* 207 */         return true;
/*     */       }
/*     */     } 
/* 210 */     return false;
/*     */   }
/*     */   
/*     */   private void resetInitializationOfContainedFormScreens(GroupBeanConfig groupBeanConfig) {
/* 214 */     if (this.context.isUnattended()) {
/*     */       return;
/*     */     }
/* 217 */     for (AbstractBeanConfig beanConfig : groupBeanConfig.getBeanConfigs()) {
/* 218 */       if (beanConfig instanceof ScreenBeanConfig) {
/* 219 */         Screen screen = ((ScreenBeanConfig)beanConfig).getOrInstantiateScreen(true);
/* 220 */         if (screen instanceof FormScreen)
/* 221 */           ((FormScreen)screen).resetFormComponents();  continue;
/*     */       } 
/* 223 */       if (beanConfig instanceof GroupBeanConfig) {
/* 224 */         resetInitializationOfContainedFormScreens((GroupBeanConfig)beanConfig);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean enterGroup(GroupBeanConfig groupConfig, boolean checkLoop, boolean checkCondition) {
/* 230 */     this.groupStack.add(new GroupStackEntry(groupConfig, groupConfig.getBeanConfigs(), -1));
/* 231 */     return forward(checkLoop, checkCondition);
/*     */   }
/*     */   
/*     */   private GroupStackEntry getCurrentStackEntry() {
/* 235 */     if (this.groupStack.isEmpty()) {
/* 236 */       return null;
/*     */     }
/* 238 */     return this.groupStack.getLast();
/*     */   }
/*     */ 
/*     */   
/*     */   public void addHistory(ScreenBeanConfig screenConfig) {
/* 243 */     LinkedList<GroupStackEntry> groupStackCopy = new LinkedList<>();
/* 244 */     for (GroupStackEntry groupStackEntry : this.groupStack) {
/* 245 */       groupStackCopy.add(groupStackEntry.copy());
/*     */     }
/* 247 */     HistoryEntry historyEntry = new HistoryEntry(screenConfig, groupStackCopy);
/* 248 */     this.screenConfigHistory.add(historyEntry);
/*     */   }
/*     */   
/*     */   public void removeLastHistoryItem() {
/* 252 */     if (!this.screenConfigHistory.isEmpty())
/* 253 */       this.screenConfigHistory.removeLast(); 
/*     */   }
/*     */   
/*     */   private static class GroupStackEntry
/*     */   {
/*     */     private GroupBeanConfig groupConfig;
/*     */     private List screenConfigs;
/*     */     private int index;
/* 261 */     private ContextImpl.GroupState groupState = new ContextImpl.GroupState();
/*     */     
/*     */     private GroupStackEntry(GroupBeanConfig groupConfig, List screenConfigs, int index) {
/* 264 */       this.groupConfig = groupConfig;
/* 265 */       this.screenConfigs = screenConfigs;
/* 266 */       this.index = index;
/*     */     }
/*     */     
/*     */     public AbstractBeanConfig getCurrentConfig() {
/* 270 */       if (this.index < 0 || this.index > this.screenConfigs.size()) {
/* 271 */         return null;
/*     */       }
/* 273 */       return this.screenConfigs.get(this.index);
/*     */     }
/*     */ 
/*     */     
/*     */     public GroupStackEntry copy() {
/* 278 */       GroupStackEntry copy = new GroupStackEntry(this.groupConfig, this.screenConfigs, this.index);
/* 279 */       copy.groupState = this.groupState.copy();
/* 280 */       return copy;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class HistoryEntry {
/*     */     private ScreenBeanConfig screenConfig;
/*     */     private LinkedList<ScreenNavigator.GroupStackEntry> groupStack;
/*     */     
/*     */     private HistoryEntry(ScreenBeanConfig screenConfig, LinkedList<ScreenNavigator.GroupStackEntry> groupStack) {
/* 289 */       this.screenConfig = screenConfig;
/* 290 */       this.groupStack = groupStack;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ScreenNavigator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */