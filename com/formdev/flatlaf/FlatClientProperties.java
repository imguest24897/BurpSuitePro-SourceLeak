/*      */ package com.formdev.flatlaf;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.util.Objects;
/*      */ import javax.swing.JComponent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public interface FlatClientProperties
/*      */ {
/*      */   public static final String BUTTON_TYPE = "JButton.buttonType";
/*      */   public static final String BUTTON_TYPE_SQUARE = "square";
/*      */   public static final String BUTTON_TYPE_ROUND_RECT = "roundRect";
/*      */   public static final String BUTTON_TYPE_TAB = "tab";
/*      */   public static final String BUTTON_TYPE_HELP = "help";
/*      */   public static final String BUTTON_TYPE_TOOLBAR_BUTTON = "toolBarButton";
/*      */   public static final String BUTTON_TYPE_BORDERLESS = "borderless";
/*      */   public static final String SELECTED_STATE = "JButton.selectedState";
/*      */   public static final String SELECTED_STATE_INDETERMINATE = "indeterminate";
/*      */   public static final String SQUARE_SIZE = "JButton.squareSize";
/*      */   public static final String STYLE = "FlatLaf.style";
/*      */   public static final String STYLE_CLASS = "FlatLaf.styleClass";
/*      */   public static final String MINIMUM_WIDTH = "JComponent.minimumWidth";
/*      */   public static final String MINIMUM_HEIGHT = "JComponent.minimumHeight";
/*      */   public static final String COMPONENT_ROUND_RECT = "JComponent.roundRect";
/*      */   public static final String OUTLINE = "JComponent.outline";
/*      */   public static final String OUTLINE_ERROR = "error";
/*      */   public static final String OUTLINE_WARNING = "warning";
/*      */   public static final String COMPONENT_FOCUS_OWNER = "JComponent.focusOwner";
/*      */   public static final String COMPONENT_TITLE_BAR_CAPTION = "JComponent.titleBarCaption";
/*      */   public static final String POPUP_BORDER_CORNER_RADIUS = "Popup.borderCornerRadius";
/*      */   public static final String POPUP_DROP_SHADOW_PAINTED = "Popup.dropShadowPainted";
/*      */   public static final String POPUP_FORCE_HEAVY_WEIGHT = "Popup.forceHeavyWeight";
/*      */   public static final String PROGRESS_BAR_LARGE_HEIGHT = "JProgressBar.largeHeight";
/*      */   public static final String PROGRESS_BAR_SQUARE = "JProgressBar.square";
/*      */   public static final String USE_WINDOW_DECORATIONS = "JRootPane.useWindowDecorations";
/*      */   public static final String MENU_BAR_EMBEDDED = "JRootPane.menuBarEmbedded";
/*      */   public static final String TITLE_BAR_SHOW_ICON = "JRootPane.titleBarShowIcon";
/*      */   public static final String TITLE_BAR_SHOW_TITLE = "JRootPane.titleBarShowTitle";
/*      */   public static final String TITLE_BAR_SHOW_ICONIFFY = "JRootPane.titleBarShowIconify";
/*      */   public static final String TITLE_BAR_SHOW_MAXIMIZE = "JRootPane.titleBarShowMaximize";
/*      */   public static final String TITLE_BAR_SHOW_CLOSE = "JRootPane.titleBarShowClose";
/*      */   public static final String TITLE_BAR_BACKGROUND = "JRootPane.titleBarBackground";
/*      */   public static final String TITLE_BAR_FOREGROUND = "JRootPane.titleBarForeground";
/*      */   public static final String GLASS_PANE_FULL_HEIGHT = "JRootPane.glassPaneFullHeight";
/*      */   public static final String WINDOW_STYLE = "Window.style";
/*      */   public static final String WINDOW_STYLE_SMALL = "small";
/*      */   public static final String SCROLL_BAR_SHOW_BUTTONS = "JScrollBar.showButtons";
/*      */   public static final String SCROLL_PANE_SMOOTH_SCROLLING = "JScrollPane.smoothScrolling";
/*      */   public static final String SPLIT_PANE_EXPANDABLE_SIDE = "JSplitPane.expandableSide";
/*      */   public static final String SPLIT_PANE_EXPANDABLE_SIDE_LEFT = "left";
/*      */   public static final String SPLIT_PANE_EXPANDABLE_SIDE_RIGHT = "right";
/*      */   public static final String TABBED_PANE_TAB_TYPE = "JTabbedPane.tabType";
/*      */   public static final String TABBED_PANE_TAB_TYPE_UNDERLINED = "underlined";
/*      */   public static final String TABBED_PANE_TAB_TYPE_CARD = "card";
/*      */   public static final String TABBED_PANE_SHOW_TAB_SEPARATORS = "JTabbedPane.showTabSeparators";
/*      */   public static final String TABBED_PANE_SHOW_CONTENT_SEPARATOR = "JTabbedPane.showContentSeparator";
/*      */   public static final String TABBED_PANE_HAS_FULL_BORDER = "JTabbedPane.hasFullBorder";
/*      */   public static final String TABBED_PANE_HIDE_TAB_AREA_WITH_ONE_TAB = "JTabbedPane.hideTabAreaWithOneTab";
/*      */   public static final String TABBED_PANE_MINIMUM_TAB_WIDTH = "JTabbedPane.minimumTabWidth";
/*      */   public static final String TABBED_PANE_MAXIMUM_TAB_WIDTH = "JTabbedPane.maximumTabWidth";
/*      */   public static final String TABBED_PANE_TAB_HEIGHT = "JTabbedPane.tabHeight";
/*      */   public static final String TABBED_PANE_TAB_INSETS = "JTabbedPane.tabInsets";
/*      */   public static final String TABBED_PANE_TAB_AREA_INSETS = "JTabbedPane.tabAreaInsets";
/*      */   public static final String TABBED_PANE_TAB_CLOSABLE = "JTabbedPane.tabClosable";
/*      */   public static final String TABBED_PANE_TAB_CLOSE_TOOLTIPTEXT = "JTabbedPane.tabCloseToolTipText";
/*      */   public static final String TABBED_PANE_TAB_CLOSE_CALLBACK = "JTabbedPane.tabCloseCallback";
/*      */   public static final String TABBED_PANE_TABS_POPUP_POLICY = "JTabbedPane.tabsPopupPolicy";
/*      */   public static final String TABBED_PANE_SCROLL_BUTTONS_POLICY = "JTabbedPane.scrollButtonsPolicy";
/*      */   public static final String TABBED_PANE_POLICY_NEVER = "never";
/*      */   public static final String TABBED_PANE_POLICY_AS_NEEDED = "asNeeded";
/*      */   public static final String TABBED_PANE_POLICY_AS_NEEDED_SINGLE = "asNeededSingle";
/*      */   public static final String TABBED_PANE_SCROLL_BUTTONS_PLACEMENT = "JTabbedPane.scrollButtonsPlacement";
/*      */   public static final String TABBED_PANE_PLACEMENT_BOTH = "both";
/*      */   public static final String TABBED_PANE_PLACEMENT_TRAILING = "trailing";
/*      */   public static final String TABBED_PANE_TAB_AREA_ALIGNMENT = "JTabbedPane.tabAreaAlignment";
/*      */   public static final String TABBED_PANE_TAB_ALIGNMENT = "JTabbedPane.tabAlignment";
/*      */   public static final String TABBED_PANE_ALIGN_LEADING = "leading";
/*      */   public static final String TABBED_PANE_ALIGN_TRAILING = "trailing";
/*      */   public static final String TABBED_PANE_ALIGN_CENTER = "center";
/*      */   public static final String TABBED_PANE_ALIGN_FILL = "fill";
/*      */   public static final String TABBED_PANE_TAB_WIDTH_MODE = "JTabbedPane.tabWidthMode";
/*      */   public static final String TABBED_PANE_TAB_WIDTH_MODE_PREFERRED = "preferred";
/*      */   public static final String TABBED_PANE_TAB_WIDTH_MODE_EQUAL = "equal";
/*      */   public static final String TABBED_PANE_TAB_WIDTH_MODE_COMPACT = "compact";
/*      */   public static final String TABBED_PANE_TAB_ICON_PLACEMENT = "JTabbedPane.tabIconPlacement";
/*      */   public static final String TABBED_PANE_LEADING_COMPONENT = "JTabbedPane.leadingComponent";
/*      */   public static final String TABBED_PANE_TRAILING_COMPONENT = "JTabbedPane.trailingComponent";
/*      */   public static final String SELECT_ALL_ON_FOCUS_POLICY = "JTextField.selectAllOnFocusPolicy";
/*      */   public static final String SELECT_ALL_ON_FOCUS_POLICY_NEVER = "never";
/*      */   public static final String SELECT_ALL_ON_FOCUS_POLICY_ONCE = "once";
/*      */   public static final String SELECT_ALL_ON_FOCUS_POLICY_ALWAYS = "always";
/*      */   public static final String PLACEHOLDER_TEXT = "JTextField.placeholderText";
/*      */   public static final String TEXT_FIELD_PADDING = "JTextField.padding";
/*      */   public static final String TEXT_FIELD_LEADING_ICON = "JTextField.leadingIcon";
/*      */   public static final String TEXT_FIELD_TRAILING_ICON = "JTextField.trailingIcon";
/*      */   public static final String TEXT_FIELD_LEADING_COMPONENT = "JTextField.leadingComponent";
/*      */   public static final String TEXT_FIELD_TRAILING_COMPONENT = "JTextField.trailingComponent";
/*      */   public static final String TEXT_FIELD_SHOW_CLEAR_BUTTON = "JTextField.showClearButton";
/*      */   public static final String TEXT_FIELD_CLEAR_CALLBACK = "JTextField.clearCallback";
/*      */   public static final String TAB_BUTTON_UNDERLINE_PLACEMENT = "JToggleButton.tab.underlinePlacement";
/*      */   public static final String TAB_BUTTON_UNDERLINE_HEIGHT = "JToggleButton.tab.underlineHeight";
/*      */   public static final String TAB_BUTTON_UNDERLINE_COLOR = "JToggleButton.tab.underlineColor";
/*      */   public static final String TAB_BUTTON_SELECTED_BACKGROUND = "JToggleButton.tab.selectedBackground";
/*      */   public static final String TREE_WIDE_SELECTION = "JTree.wideSelection";
/*      */   public static final String TREE_PAINT_SELECTION = "JTree.paintSelection";
/*      */   
/*      */   static boolean clientPropertyEquals(JComponent c, String key, Object value) {
/* 1200 */     return Objects.equals(c.getClientProperty(key), value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static boolean clientPropertyBoolean(JComponent c, String key, boolean defaultValue) {
/* 1208 */     Object value = c.getClientProperty(key);
/* 1209 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : defaultValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Boolean clientPropertyBooleanStrict(JComponent c, String key, Boolean defaultValue) {
/* 1217 */     return clientProperty(c, key, defaultValue, Boolean.class);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int clientPropertyInt(JComponent c, String key, int defaultValue) {
/* 1225 */     Object value = c.getClientProperty(key);
/* 1226 */     return (value instanceof Integer) ? ((Integer)value).intValue() : defaultValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Color clientPropertyColor(JComponent c, String key, Color defaultValue) {
/* 1234 */     return clientProperty(c, key, defaultValue, Color.class);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static <T> T clientProperty(JComponent c, String key, T defaultValue, Class<T> type) {
/* 1245 */     Object value = c.getClientProperty(key);
/* 1246 */     return type.isInstance(value) ? (T)value : defaultValue;
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\FlatClientProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */