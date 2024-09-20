/*     */ package com.formdev.flatlaf.extras.components;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import java.awt.Component;
/*     */ import java.awt.Insets;
/*     */ import java.util.function.BiConsumer;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTabbedPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatTabbedPane
/*     */   extends JTabbedPane
/*     */   implements FlatComponentExtension, FlatStyleableComponent
/*     */ {
/*     */   public boolean isShowTabSeparators() {
/*  40 */     return getClientPropertyBoolean("JTabbedPane.showTabSeparators", "TabbedPane.showTabSeparators");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowTabSeparators(boolean showTabSeparators) {
/*  47 */     putClientProperty("JTabbedPane.showTabSeparators", Boolean.valueOf(showTabSeparators));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShowContentSeparators() {
/*  55 */     return getClientPropertyBoolean("JTabbedPane.showContentSeparator", true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowContentSeparators(boolean showContentSeparators) {
/*  62 */     putClientPropertyBoolean("JTabbedPane.showContentSeparator", showContentSeparators, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isHasFullBorder() {
/*  70 */     return getClientPropertyBoolean("JTabbedPane.hasFullBorder", "TabbedPane.hasFullBorder");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHasFullBorder(boolean hasFullBorder) {
/*  77 */     putClientProperty("JTabbedPane.hasFullBorder", Boolean.valueOf(hasFullBorder));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isHideTabAreaWithOneTab() {
/*  85 */     return getClientPropertyBoolean("JTabbedPane.hideTabAreaWithOneTab", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHideTabAreaWithOneTab(boolean hideTabAreaWithOneTab) {
/*  92 */     putClientPropertyBoolean("JTabbedPane.hideTabAreaWithOneTab", hideTabAreaWithOneTab, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinimumTabWidth() {
/* 100 */     return getClientPropertyInt("JTabbedPane.minimumTabWidth", "TabbedPane.minimumTabWidth");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimumTabWidth(int minimumTabWidth) {
/* 107 */     putClientProperty("JTabbedPane.minimumTabWidth", (minimumTabWidth >= 0) ? Integer.valueOf(minimumTabWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinimumTabWidth(int tabIndex) {
/* 115 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 116 */     return FlatClientProperties.clientPropertyInt(c, "JTabbedPane.minimumTabWidth", 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimumTabWidth(int tabIndex, int minimumTabWidth) {
/* 123 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 124 */     c.putClientProperty("JTabbedPane.minimumTabWidth", (minimumTabWidth >= 0) ? Integer.valueOf(minimumTabWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaximumTabWidth() {
/* 132 */     return getClientPropertyInt("JTabbedPane.maximumTabWidth", "TabbedPane.maximumTabWidth");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaximumTabWidth(int maximumTabWidth) {
/* 142 */     putClientProperty("JTabbedPane.maximumTabWidth", (maximumTabWidth >= 0) ? Integer.valueOf(maximumTabWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaximumTabWidth(int tabIndex) {
/* 150 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 151 */     return FlatClientProperties.clientPropertyInt(c, "JTabbedPane.maximumTabWidth", 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaximumTabWidth(int tabIndex, int maximumTabWidth) {
/* 161 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 162 */     c.putClientProperty("JTabbedPane.maximumTabWidth", (maximumTabWidth >= 0) ? Integer.valueOf(maximumTabWidth) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTabHeight() {
/* 170 */     return getClientPropertyInt("JTabbedPane.tabHeight", "TabbedPane.tabHeight");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabHeight(int tabHeight) {
/* 179 */     putClientProperty("JTabbedPane.tabHeight", (tabHeight >= 0) ? Integer.valueOf(tabHeight) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Insets getTabInsets() {
/* 187 */     return getClientPropertyInsets("JTabbedPane.tabInsets", "TabbedPane.tabInsets");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabInsets(Insets tabInsets) {
/* 196 */     putClientProperty("JTabbedPane.tabInsets", tabInsets);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Insets getTabInsets(int tabIndex) {
/* 204 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 205 */     return (Insets)c.getClientProperty("JTabbedPane.tabInsets");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabInsets(int tabIndex, Insets tabInsets) {
/* 214 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 215 */     c.putClientProperty("JTabbedPane.tabInsets", tabInsets);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Insets getTabAreaInsets() {
/* 223 */     return getClientPropertyInsets("JTabbedPane.tabAreaInsets", "TabbedPane.tabAreaInsets");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabAreaInsets(Insets tabAreaInsets) {
/* 230 */     putClientProperty("JTabbedPane.tabAreaInsets", tabAreaInsets);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTabsClosable() {
/* 238 */     return getClientPropertyBoolean("JTabbedPane.tabClosable", false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabsClosable(boolean tabClosable) {
/* 251 */     putClientPropertyBoolean("JTabbedPane.tabClosable", tabClosable, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isTabClosable(int tabIndex) {
/* 259 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 260 */     Object value = c.getClientProperty("JTabbedPane.tabClosable");
/* 261 */     return Boolean.valueOf((value instanceof Boolean) ? ((Boolean)value).booleanValue() : isTabsClosable());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabClosable(int tabIndex, boolean tabClosable) {
/* 273 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 274 */     c.putClientProperty("JTabbedPane.tabClosable", Boolean.valueOf(tabClosable));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTabCloseToolTipText() {
/* 282 */     return (String)getClientProperty("JTabbedPane.tabCloseToolTipText");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabCloseToolTipText(String tabCloseToolTipText) {
/* 289 */     putClientProperty("JTabbedPane.tabCloseToolTipText", tabCloseToolTipText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTabCloseToolTipText(int tabIndex) {
/* 297 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 298 */     return (String)c.getClientProperty("JTabbedPane.tabCloseToolTipText");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabCloseToolTipText(int tabIndex, String tabCloseToolTipText) {
/* 305 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 306 */     c.putClientProperty("JTabbedPane.tabCloseToolTipText", tabCloseToolTipText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BiConsumer<JTabbedPane, Integer> getTabCloseCallback() {
/* 316 */     return (BiConsumer<JTabbedPane, Integer>)getClientProperty("JTabbedPane.tabCloseCallback");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabCloseCallback(BiConsumer<JTabbedPane, Integer> tabCloseCallback) {
/* 340 */     putClientProperty("JTabbedPane.tabCloseCallback", tabCloseCallback);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BiConsumer<JTabbedPane, Integer> getTabCloseCallback(int tabIndex) {
/* 350 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 351 */     return (BiConsumer<JTabbedPane, Integer>)c.getClientProperty("JTabbedPane.tabCloseCallback");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabCloseCallback(int tabIndex, BiConsumer<JTabbedPane, Integer> tabCloseCallback) {
/* 361 */     JComponent c = (JComponent)getComponentAt(tabIndex);
/* 362 */     c.putClientProperty("JTabbedPane.tabCloseCallback", tabCloseCallback);
/*     */   }
/*     */   
/*     */   public enum TabType
/*     */   {
/* 367 */     underlined, card;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TabType getTabType() {
/* 375 */     return getClientPropertyEnumString("JTabbedPane.tabType", TabType.class, "TabbedPane.tabType", TabType.underlined);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabType(TabType tabType) {
/* 385 */     putClientPropertyEnumString("JTabbedPane.tabType", tabType);
/*     */   }
/*     */   
/*     */   public enum TabsPopupPolicy
/*     */   {
/* 390 */     never, asNeeded;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TabsPopupPolicy getTabsPopupPolicy() {
/* 397 */     return getClientPropertyEnumString("JTabbedPane.tabsPopupPolicy", TabsPopupPolicy.class, "TabbedPane.tabsPopupPolicy", TabsPopupPolicy.asNeeded);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabsPopupPolicy(TabsPopupPolicy tabsPopupPolicy) {
/* 406 */     putClientPropertyEnumString("JTabbedPane.tabsPopupPolicy", tabsPopupPolicy);
/*     */   }
/*     */   
/*     */   public enum ScrollButtonsPolicy
/*     */   {
/* 411 */     never, asNeeded, asNeededSingle;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ScrollButtonsPolicy getScrollButtonsPolicy() {
/* 417 */     return getClientPropertyEnumString("JTabbedPane.scrollButtonsPolicy", ScrollButtonsPolicy.class, "TabbedPane.scrollButtonsPolicy", ScrollButtonsPolicy.asNeededSingle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScrollButtonsPolicy(ScrollButtonsPolicy scrollButtonsPolicy) {
/* 425 */     putClientPropertyEnumString("JTabbedPane.scrollButtonsPolicy", scrollButtonsPolicy);
/*     */   }
/*     */   
/*     */   public enum ScrollButtonsPlacement
/*     */   {
/* 430 */     both, trailing;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ScrollButtonsPlacement getScrollButtonsPlacement() {
/* 436 */     return getClientPropertyEnumString("JTabbedPane.scrollButtonsPlacement", ScrollButtonsPlacement.class, "TabbedPane.scrollButtonsPlacement", ScrollButtonsPlacement.both);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScrollButtonsPlacement(ScrollButtonsPlacement scrollButtonsPlacement) {
/* 444 */     putClientPropertyEnumString("JTabbedPane.scrollButtonsPlacement", scrollButtonsPlacement);
/*     */   }
/*     */   
/*     */   public enum TabAreaAlignment
/*     */   {
/* 449 */     leading, trailing, center, fill;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TabAreaAlignment getTabAreaAlignment() {
/* 455 */     return getClientPropertyEnumString("JTabbedPane.tabAreaAlignment", TabAreaAlignment.class, "TabbedPane.tabAreaAlignment", TabAreaAlignment.leading);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabAreaAlignment(TabAreaAlignment tabAreaAlignment) {
/* 463 */     putClientPropertyEnumString("JTabbedPane.tabAreaAlignment", tabAreaAlignment);
/*     */   }
/*     */   
/*     */   public enum TabAlignment
/*     */   {
/* 468 */     leading, trailing, center;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TabAlignment getTabAlignment() {
/* 474 */     return getClientPropertyEnumString("JTabbedPane.tabAlignment", TabAlignment.class, "TabbedPane.tabAlignment", TabAlignment.center);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabAlignment(TabAlignment tabAlignment) {
/* 482 */     putClientPropertyEnumString("JTabbedPane.tabAlignment", tabAlignment);
/*     */   }
/*     */   
/*     */   public enum TabWidthMode
/*     */   {
/* 487 */     preferred, equal, compact;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TabWidthMode getTabWidthMode() {
/* 493 */     return getClientPropertyEnumString("JTabbedPane.tabWidthMode", TabWidthMode.class, "TabbedPane.tabWidthMode", TabWidthMode.preferred);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabWidthMode(TabWidthMode tabWidthMode) {
/* 501 */     putClientPropertyEnumString("JTabbedPane.tabWidthMode", tabWidthMode);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTabIconPlacement() {
/* 509 */     return getClientPropertyInt("JTabbedPane.tabIconPlacement", 10);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabIconPlacement(int tabIconPlacement) {
/* 524 */     putClientProperty("JTabbedPane.tabIconPlacement", (tabIconPlacement >= 0) ? Integer.valueOf(tabIconPlacement) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Component getLeadingComponent() {
/* 532 */     return (Component)getClientProperty("JTabbedPane.leadingComponent");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLeadingComponent(Component leadingComponent) {
/* 544 */     putClientProperty("JTabbedPane.leadingComponent", leadingComponent);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Component getTrailingComponent() {
/* 552 */     return (Component)getClientProperty("JTabbedPane.trailingComponent");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrailingComponent(Component trailingComponent) {
/* 564 */     putClientProperty("JTabbedPane.trailingComponent", trailingComponent);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatTabbedPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */