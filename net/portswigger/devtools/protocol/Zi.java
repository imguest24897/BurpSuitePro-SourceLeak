package net.portswigger.devtools.protocol;

import net.portswigger.devtools.protocol.events.accessibility.LoadComplete;
import net.portswigger.devtools.protocol.events.accessibility.NodesUpdated;
import net.portswigger.devtools.protocol.events.animation.AnimationCanceled;
import net.portswigger.devtools.protocol.events.animation.AnimationCreated;
import net.portswigger.devtools.protocol.events.animation.AnimationStarted;
import net.portswigger.devtools.protocol.events.animation.AnimationUpdated;
import net.portswigger.devtools.protocol.events.audits.IssueAdded;
import net.portswigger.devtools.protocol.events.autofill.AddressFormFilled;
import net.portswigger.devtools.protocol.events.backgroundservice.BackgroundServiceEventReceived;
import net.portswigger.devtools.protocol.events.backgroundservice.RecordingStateChanged;
import net.portswigger.devtools.protocol.events.browser.DownloadProgress;
import net.portswigger.devtools.protocol.events.browser.DownloadProgressState;
import net.portswigger.devtools.protocol.events.browser.DownloadWillBegin;
import net.portswigger.devtools.protocol.events.cast.IssueUpdated;
import net.portswigger.devtools.protocol.events.cast.SinksUpdated;
import net.portswigger.devtools.protocol.events.console.MessageAdded;
import net.portswigger.devtools.protocol.events.css.FontsUpdated;
import net.portswigger.devtools.protocol.events.css.MediaQueryResultChanged;
import net.portswigger.devtools.protocol.events.css.StyleSheetAdded;
import net.portswigger.devtools.protocol.events.css.StyleSheetChanged;
import net.portswigger.devtools.protocol.events.css.StyleSheetRemoved;
import net.portswigger.devtools.protocol.events.database.AddDatabase;
import net.portswigger.devtools.protocol.events.debugger.BreakpointResolved;
import net.portswigger.devtools.protocol.events.debugger.Paused;
import net.portswigger.devtools.protocol.events.debugger.PausedReason;
import net.portswigger.devtools.protocol.events.debugger.Resumed;
import net.portswigger.devtools.protocol.events.debugger.ScriptFailedToParse;
import net.portswigger.devtools.protocol.events.debugger.ScriptParsed;
import net.portswigger.devtools.protocol.events.deviceaccess.DeviceRequestPrompted;
import net.portswigger.devtools.protocol.events.dom.AttributeModified;
import net.portswigger.devtools.protocol.events.dom.AttributeRemoved;
import net.portswigger.devtools.protocol.events.dom.CharacterDataModified;
import net.portswigger.devtools.protocol.events.dom.ChildNodeCountUpdated;
import net.portswigger.devtools.protocol.events.dom.ChildNodeInserted;
import net.portswigger.devtools.protocol.events.dom.ChildNodeRemoved;
import net.portswigger.devtools.protocol.events.dom.DistributedNodesUpdated;
import net.portswigger.devtools.protocol.events.dom.DocumentUpdated;
import net.portswigger.devtools.protocol.events.dom.InlineStyleInvalidated;
import net.portswigger.devtools.protocol.events.dom.PseudoElementAdded;
import net.portswigger.devtools.protocol.events.dom.PseudoElementRemoved;
import net.portswigger.devtools.protocol.events.dom.SetChildNodes;
import net.portswigger.devtools.protocol.events.dom.ShadowRootPopped;
import net.portswigger.devtools.protocol.events.dom.ShadowRootPushed;
import net.portswigger.devtools.protocol.events.dom.TopLayerElementsUpdated;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemAdded;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemRemoved;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemUpdated;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemsCleared;
import net.portswigger.devtools.protocol.events.emulation.VirtualTimeBudgetExpired;
import net.portswigger.devtools.protocol.events.fedcm.DialogClosed;
import net.portswigger.devtools.protocol.events.fedcm.DialogShown;
import net.portswigger.devtools.protocol.events.fetch.AuthRequired;
import net.portswigger.devtools.protocol.events.fetch.RequestPaused;
import net.portswigger.devtools.protocol.events.heapprofiler.AddHeapSnapshotChunk;
import net.portswigger.devtools.protocol.events.heapprofiler.HeapStatsUpdate;
import net.portswigger.devtools.protocol.events.heapprofiler.LastSeenObjectId;
import net.portswigger.devtools.protocol.events.heapprofiler.ReportHeapSnapshotProgress;
import net.portswigger.devtools.protocol.events.heapprofiler.ResetProfiles;
import net.portswigger.devtools.protocol.events.input.DragIntercepted;
import net.portswigger.devtools.protocol.events.inspector.Detached;
import net.portswigger.devtools.protocol.events.inspector.TargetCrashed;
import net.portswigger.devtools.protocol.events.inspector.TargetReloadedAfterCrash;
import net.portswigger.devtools.protocol.events.layertree.LayerPainted;
import net.portswigger.devtools.protocol.events.layertree.LayerTreeDidChange;
import net.portswigger.devtools.protocol.events.log.EntryAdded;
import net.portswigger.devtools.protocol.events.media.PlayerErrorsRaised;
import net.portswigger.devtools.protocol.events.media.PlayerEventsAdded;
import net.portswigger.devtools.protocol.events.media.PlayerMessagesLogged;
import net.portswigger.devtools.protocol.events.media.PlayerPropertiesChanged;
import net.portswigger.devtools.protocol.events.media.PlayersCreated;
import net.portswigger.devtools.protocol.events.network.DataReceived;
import net.portswigger.devtools.protocol.events.network.EventSourceMessageReceived;
import net.portswigger.devtools.protocol.events.network.LoadingFailed;
import net.portswigger.devtools.protocol.events.network.LoadingFinished;
import net.portswigger.devtools.protocol.events.network.PolicyUpdated;
import net.portswigger.devtools.protocol.events.network.ReportingApiEndpointsChangedForOrigin;
import net.portswigger.devtools.protocol.events.network.ReportingApiReportAdded;
import net.portswigger.devtools.protocol.events.network.ReportingApiReportUpdated;
import net.portswigger.devtools.protocol.events.network.RequestIntercepted;
import net.portswigger.devtools.protocol.events.network.RequestServedFromCache;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSent;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSentExtraInfo;
import net.portswigger.devtools.protocol.events.network.ResourceChangedPriority;
import net.portswigger.devtools.protocol.events.network.ResponseReceived;
import net.portswigger.devtools.protocol.events.network.ResponseReceivedEarlyHints;
import net.portswigger.devtools.protocol.events.network.ResponseReceivedExtraInfo;
import net.portswigger.devtools.protocol.events.network.SignedExchangeReceived;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseError;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleInnerResponseParsed;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataError;
import net.portswigger.devtools.protocol.events.network.SubresourceWebBundleMetadataReceived;
import net.portswigger.devtools.protocol.events.network.TrustTokenOperationDone;
import net.portswigger.devtools.protocol.events.network.TrustTokenOperationDoneStatus;
import net.portswigger.devtools.protocol.events.network.WebSocketClosed;
import net.portswigger.devtools.protocol.events.network.WebSocketCreated;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameError;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameReceived;
import net.portswigger.devtools.protocol.events.network.WebSocketFrameSent;
import net.portswigger.devtools.protocol.events.network.WebSocketHandshakeResponseReceived;
import net.portswigger.devtools.protocol.events.network.WebSocketWillSendHandshakeRequest;
import net.portswigger.devtools.protocol.events.network.WebTransportClosed;
import net.portswigger.devtools.protocol.events.network.WebTransportConnectionEstablished;
import net.portswigger.devtools.protocol.events.network.WebTransportCreated;
import net.portswigger.devtools.protocol.events.overlay.InspectModeCanceled;
import net.portswigger.devtools.protocol.events.overlay.InspectNodeRequested;
import net.portswigger.devtools.protocol.events.overlay.NodeHighlightRequested;
import net.portswigger.devtools.protocol.events.overlay.ScreenshotRequested;
import net.portswigger.devtools.protocol.events.page.BackForwardCacheNotUsed;
import net.portswigger.devtools.protocol.events.page.CompilationCacheProduced;
import net.portswigger.devtools.protocol.events.page.DocumentOpened;
import net.portswigger.devtools.protocol.events.page.DomContentEventFired;
import net.portswigger.devtools.protocol.events.page.DownloadProgress;
import net.portswigger.devtools.protocol.events.page.DownloadProgressState;
import net.portswigger.devtools.protocol.events.page.DownloadWillBegin;
import net.portswigger.devtools.protocol.events.page.FileChooserOpened;
import net.portswigger.devtools.protocol.events.page.FileChooserOpenedMode;
import net.portswigger.devtools.protocol.events.page.FrameAttached;
import net.portswigger.devtools.protocol.events.page.FrameClearedScheduledNavigation;
import net.portswigger.devtools.protocol.events.page.FrameDetached;
import net.portswigger.devtools.protocol.events.page.FrameDetachedReason;
import net.portswigger.devtools.protocol.events.page.FrameNavigated;
import net.portswigger.devtools.protocol.events.page.FrameRequestedNavigation;
import net.portswigger.devtools.protocol.events.page.FrameResized;
import net.portswigger.devtools.protocol.events.page.FrameScheduledNavigation;
import net.portswigger.devtools.protocol.events.page.FrameStartedLoading;
import net.portswigger.devtools.protocol.events.page.FrameStoppedLoading;
import net.portswigger.devtools.protocol.events.page.InterstitialHidden;
import net.portswigger.devtools.protocol.events.page.InterstitialShown;
import net.portswigger.devtools.protocol.events.page.JavascriptDialogClosed;
import net.portswigger.devtools.protocol.events.page.JavascriptDialogOpening;
import net.portswigger.devtools.protocol.events.page.LifecycleEvent;
import net.portswigger.devtools.protocol.events.page.LoadEventFired;
import net.portswigger.devtools.protocol.events.page.NavigatedWithinDocument;
import net.portswigger.devtools.protocol.events.page.ScreencastFrame;
import net.portswigger.devtools.protocol.events.page.ScreencastVisibilityChanged;
import net.portswigger.devtools.protocol.events.page.WindowOpen;
import net.portswigger.devtools.protocol.events.performance.Metrics;
import net.portswigger.devtools.protocol.events.performancetimeline.TimelineEventAdded;
import net.portswigger.devtools.protocol.events.preload.PrefetchStatusUpdated;
import net.portswigger.devtools.protocol.events.preload.PreloadEnabledStateUpdated;
import net.portswigger.devtools.protocol.events.preload.PreloadingAttemptSourcesUpdated;
import net.portswigger.devtools.protocol.events.preload.PrerenderStatusUpdated;
import net.portswigger.devtools.protocol.events.preload.RuleSetRemoved;
import net.portswigger.devtools.protocol.events.preload.RuleSetUpdated;
import net.portswigger.devtools.protocol.events.profiler.ConsoleProfileFinished;
import net.portswigger.devtools.protocol.events.profiler.ConsoleProfileStarted;
import net.portswigger.devtools.protocol.events.profiler.PreciseCoverageDeltaUpdate;
import net.portswigger.devtools.protocol.events.runtime.BindingCalled;
import net.portswigger.devtools.protocol.events.runtime.ConsoleAPICalled;
import net.portswigger.devtools.protocol.events.runtime.ConsoleAPICalledType;
import net.portswigger.devtools.protocol.events.runtime.ExceptionRevoked;
import net.portswigger.devtools.protocol.events.runtime.ExceptionThrown;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextCreated;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextDestroyed;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextsCleared;
import net.portswigger.devtools.protocol.events.runtime.InspectRequested;
import net.portswigger.devtools.protocol.events.security.CertificateError;
import net.portswigger.devtools.protocol.events.security.SecurityStateChanged;
import net.portswigger.devtools.protocol.events.security.VisibleSecurityStateChanged;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerErrorReported;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerRegistrationUpdated;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerVersionUpdated;
import net.portswigger.devtools.protocol.events.storage.AttributionReportingSourceRegistered;
import net.portswigger.devtools.protocol.events.storage.AttributionReportingTriggerRegistered;
import net.portswigger.devtools.protocol.events.storage.CacheStorageContentUpdated;
import net.portswigger.devtools.protocol.events.storage.CacheStorageListUpdated;
import net.portswigger.devtools.protocol.events.storage.IndexedDBContentUpdated;
import net.portswigger.devtools.protocol.events.storage.IndexedDBListUpdated;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAccessed;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionEventOccurred;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionNetworkRequestCreated;
import net.portswigger.devtools.protocol.events.storage.SharedStorageAccessed;
import net.portswigger.devtools.protocol.events.storage.StorageBucketCreatedOrUpdated;
import net.portswigger.devtools.protocol.events.storage.StorageBucketDeleted;
import net.portswigger.devtools.protocol.events.target.AttachedToTarget;
import net.portswigger.devtools.protocol.events.target.DetachedFromTarget;
import net.portswigger.devtools.protocol.events.target.ReceivedMessageFromTarget;
import net.portswigger.devtools.protocol.events.target.TargetCrashed;
import net.portswigger.devtools.protocol.events.target.TargetCreated;
import net.portswigger.devtools.protocol.events.target.TargetDestroyed;
import net.portswigger.devtools.protocol.events.target.TargetInfoChanged;
import net.portswigger.devtools.protocol.events.tethering.Accepted;
import net.portswigger.devtools.protocol.events.tracing.BufferUsage;
import net.portswigger.devtools.protocol.events.tracing.DataCollected;
import net.portswigger.devtools.protocol.events.tracing.TracingComplete;
import net.portswigger.devtools.protocol.events.webaudio.AudioListenerCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioListenerWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.AudioNodeCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioNodeWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.AudioParamCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioParamWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.ContextChanged;
import net.portswigger.devtools.protocol.events.webaudio.ContextCreated;
import net.portswigger.devtools.protocol.events.webaudio.ContextWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.NodeParamConnected;
import net.portswigger.devtools.protocol.events.webaudio.NodeParamDisconnected;
import net.portswigger.devtools.protocol.events.webaudio.NodesConnected;
import net.portswigger.devtools.protocol.events.webaudio.NodesDisconnected;
import net.portswigger.devtools.protocol.events.webauthn.CredentialAdded;
import net.portswigger.devtools.protocol.events.webauthn.CredentialAsserted;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;
import net.portswigger.devtools.protocol.types.accessibility.AXProperty;
import net.portswigger.devtools.protocol.types.accessibility.AXPropertyName;
import net.portswigger.devtools.protocol.types.accessibility.AXRelatedNode;
import net.portswigger.devtools.protocol.types.accessibility.AXValue;
import net.portswigger.devtools.protocol.types.accessibility.AXValueNativeSourceType;
import net.portswigger.devtools.protocol.types.accessibility.AXValueSource;
import net.portswigger.devtools.protocol.types.accessibility.AXValueSourceType;
import net.portswigger.devtools.protocol.types.accessibility.AXValueType;
import net.portswigger.devtools.protocol.types.animation.Animation;
import net.portswigger.devtools.protocol.types.animation.AnimationEffect;
import net.portswigger.devtools.protocol.types.animation.AnimationType;
import net.portswigger.devtools.protocol.types.animation.KeyframeStyle;
import net.portswigger.devtools.protocol.types.animation.KeyframesRule;
import net.portswigger.devtools.protocol.types.animation.ViewOrScrollTimeline;
import net.portswigger.devtools.protocol.types.audits.AffectedCookie;
import net.portswigger.devtools.protocol.types.audits.AffectedFrame;
import net.portswigger.devtools.protocol.types.audits.AffectedRequest;
import net.portswigger.devtools.protocol.types.audits.AttributionReportingIssueDetails;
import net.portswigger.devtools.protocol.types.audits.AttributionReportingIssueType;
import net.portswigger.devtools.protocol.types.audits.BlockedByResponseIssueDetails;
import net.portswigger.devtools.protocol.types.audits.BlockedByResponseReason;
import net.portswigger.devtools.protocol.types.audits.BounceTrackingIssueDetails;
import net.portswigger.devtools.protocol.types.audits.ClientHintIssueDetails;
import net.portswigger.devtools.protocol.types.audits.ClientHintIssueReason;
import net.portswigger.devtools.protocol.types.audits.ContentSecurityPolicyIssueDetails;
import net.portswigger.devtools.protocol.types.audits.ContentSecurityPolicyViolationType;
import net.portswigger.devtools.protocol.types.audits.CookieDeprecationMetadataIssueDetails;
import net.portswigger.devtools.protocol.types.audits.CookieExclusionReason;
import net.portswigger.devtools.protocol.types.audits.CookieIssueDetails;
import net.portswigger.devtools.protocol.types.audits.CookieOperation;
import net.portswigger.devtools.protocol.types.audits.CookieWarningReason;
import net.portswigger.devtools.protocol.types.audits.CorsIssueDetails;
import net.portswigger.devtools.protocol.types.audits.DeprecationIssueDetails;
import net.portswigger.devtools.protocol.types.audits.EncodedResponse;
import net.portswigger.devtools.protocol.types.audits.FailedRequestInfo;
import net.portswigger.devtools.protocol.types.audits.FederatedAuthRequestIssueDetails;
import net.portswigger.devtools.protocol.types.audits.FederatedAuthRequestIssueReason;
import net.portswigger.devtools.protocol.types.audits.FederatedAuthUserInfoRequestIssueDetails;
import net.portswigger.devtools.protocol.types.audits.FederatedAuthUserInfoRequestIssueReason;
import net.portswigger.devtools.protocol.types.audits.GenericIssueDetails;
import net.portswigger.devtools.protocol.types.audits.GenericIssueErrorType;
import net.portswigger.devtools.protocol.types.audits.GetEncodedResponseEncoding;
import net.portswigger.devtools.protocol.types.audits.HeavyAdIssueDetails;
import net.portswigger.devtools.protocol.types.audits.HeavyAdReason;
import net.portswigger.devtools.protocol.types.audits.HeavyAdResolutionStatus;
import net.portswigger.devtools.protocol.types.audits.InspectorIssue;
import net.portswigger.devtools.protocol.types.audits.InspectorIssueCode;
import net.portswigger.devtools.protocol.types.audits.InspectorIssueDetails;
import net.portswigger.devtools.protocol.types.audits.LowTextContrastIssueDetails;
import net.portswigger.devtools.protocol.types.audits.MixedContentIssueDetails;
import net.portswigger.devtools.protocol.types.audits.MixedContentResolutionStatus;
import net.portswigger.devtools.protocol.types.audits.MixedContentResourceType;
import net.portswigger.devtools.protocol.types.audits.NavigatorUserAgentIssueDetails;
import net.portswigger.devtools.protocol.types.audits.PropertyRuleIssueDetails;
import net.portswigger.devtools.protocol.types.audits.PropertyRuleIssueReason;
import net.portswigger.devtools.protocol.types.audits.QuirksModeIssueDetails;
import net.portswigger.devtools.protocol.types.audits.SharedArrayBufferIssueDetails;
import net.portswigger.devtools.protocol.types.audits.SharedArrayBufferIssueType;
import net.portswigger.devtools.protocol.types.audits.SharedDictionaryError;
import net.portswigger.devtools.protocol.types.audits.SharedDictionaryIssueDetails;
import net.portswigger.devtools.protocol.types.audits.SourceCodeLocation;
import net.portswigger.devtools.protocol.types.audits.StyleSheetLoadingIssueReason;
import net.portswigger.devtools.protocol.types.audits.StylesheetLoadingIssueDetails;
import net.portswigger.devtools.protocol.types.autofill.Address;
import net.portswigger.devtools.protocol.types.autofill.AddressField;
import net.portswigger.devtools.protocol.types.autofill.AddressFields;
import net.portswigger.devtools.protocol.types.autofill.AddressUI;
import net.portswigger.devtools.protocol.types.autofill.CreditCard;
import net.portswigger.devtools.protocol.types.autofill.FilledField;
import net.portswigger.devtools.protocol.types.autofill.FillingStrategy;
import net.portswigger.devtools.protocol.types.backgroundservice.BackgroundServiceEvent;
import net.portswigger.devtools.protocol.types.backgroundservice.EventMetadata;
import net.portswigger.devtools.protocol.types.backgroundservice.ServiceName;
import net.portswigger.devtools.protocol.types.browser.Bounds;
import net.portswigger.devtools.protocol.types.browser.BrowserCommandId;
import net.portswigger.devtools.protocol.types.browser.Bucket;
import net.portswigger.devtools.protocol.types.browser.Histogram;
import net.portswigger.devtools.protocol.types.browser.PermissionDescriptor;
import net.portswigger.devtools.protocol.types.browser.PermissionSetting;
import net.portswigger.devtools.protocol.types.browser.PermissionType;
import net.portswigger.devtools.protocol.types.browser.SetDownloadBehaviorBehavior;
import net.portswigger.devtools.protocol.types.browser.Version;
import net.portswigger.devtools.protocol.types.browser.WindowForTarget;
import net.portswigger.devtools.protocol.types.browser.WindowState;
import net.portswigger.devtools.protocol.types.cachestorage.Cache;
import net.portswigger.devtools.protocol.types.cachestorage.CachedResponse;
import net.portswigger.devtools.protocol.types.cachestorage.CachedResponseType;
import net.portswigger.devtools.protocol.types.cachestorage.DataEntry;
import net.portswigger.devtools.protocol.types.cachestorage.Header;
import net.portswigger.devtools.protocol.types.cachestorage.RequestEntries;
import net.portswigger.devtools.protocol.types.cast.Sink;
import net.portswigger.devtools.protocol.types.console.ConsoleMessage;
import net.portswigger.devtools.protocol.types.console.ConsoleMessageLevel;
import net.portswigger.devtools.protocol.types.console.ConsoleMessageSource;
import net.portswigger.devtools.protocol.types.css.BackgroundColors;
import net.portswigger.devtools.protocol.types.css.CSSComputedStyleProperty;
import net.portswigger.devtools.protocol.types.css.CSSContainerQuery;
import net.portswigger.devtools.protocol.types.css.CSSFontPaletteValuesRule;
import net.portswigger.devtools.protocol.types.css.CSSKeyframeRule;
import net.portswigger.devtools.protocol.types.css.CSSKeyframesRule;
import net.portswigger.devtools.protocol.types.css.CSSLayer;
import net.portswigger.devtools.protocol.types.css.CSSLayerData;
import net.portswigger.devtools.protocol.types.css.CSSMedia;
import net.portswigger.devtools.protocol.types.css.CSSMediaSource;
import net.portswigger.devtools.protocol.types.css.CSSPositionFallbackRule;
import net.portswigger.devtools.protocol.types.css.CSSPositionTryRule;
import net.portswigger.devtools.protocol.types.css.CSSProperty;
import net.portswigger.devtools.protocol.types.css.CSSPropertyRegistration;
import net.portswigger.devtools.protocol.types.css.CSSPropertyRule;
import net.portswigger.devtools.protocol.types.css.CSSRule;
import net.portswigger.devtools.protocol.types.css.CSSRuleType;
import net.portswigger.devtools.protocol.types.css.CSSScope;
import net.portswigger.devtools.protocol.types.css.CSSStyle;
import net.portswigger.devtools.protocol.types.css.CSSStyleSheetHeader;
import net.portswigger.devtools.protocol.types.css.CSSSupports;
import net.portswigger.devtools.protocol.types.css.CSSTryRule;
import net.portswigger.devtools.protocol.types.css.FontFace;
import net.portswigger.devtools.protocol.types.css.FontVariationAxis;
import net.portswigger.devtools.protocol.types.css.InheritedPseudoElementMatches;
import net.portswigger.devtools.protocol.types.css.InheritedStyleEntry;
import net.portswigger.devtools.protocol.types.css.InlineStylesForNode;
import net.portswigger.devtools.protocol.types.css.MatchedStylesForNode;
import net.portswigger.devtools.protocol.types.css.MediaQuery;
import net.portswigger.devtools.protocol.types.css.MediaQueryExpression;
import net.portswigger.devtools.protocol.types.css.PlatformFontUsage;
import net.portswigger.devtools.protocol.types.css.PseudoElementMatches;
import net.portswigger.devtools.protocol.types.css.RuleMatch;
import net.portswigger.devtools.protocol.types.css.RuleUsage;
import net.portswigger.devtools.protocol.types.css.SelectorList;
import net.portswigger.devtools.protocol.types.css.ShorthandEntry;
import net.portswigger.devtools.protocol.types.css.SourceRange;
import net.portswigger.devtools.protocol.types.css.Specificity;
import net.portswigger.devtools.protocol.types.css.StyleDeclarationEdit;
import net.portswigger.devtools.protocol.types.css.StyleSheetOrigin;
import net.portswigger.devtools.protocol.types.css.TakeCoverageDelta;
import net.portswigger.devtools.protocol.types.css.Value;
import net.portswigger.devtools.protocol.types.database.Database;
import net.portswigger.devtools.protocol.types.database.Error;
import net.portswigger.devtools.protocol.types.database.ExecuteSQL;
import net.portswigger.devtools.protocol.types.debugger.BreakLocation;
import net.portswigger.devtools.protocol.types.debugger.BreakLocationType;
import net.portswigger.devtools.protocol.types.debugger.CallFrame;
import net.portswigger.devtools.protocol.types.debugger.ContinueToLocationTargetCallFrames;
import net.portswigger.devtools.protocol.types.debugger.DebugSymbols;
import net.portswigger.devtools.protocol.types.debugger.DebugSymbolsType;
import net.portswigger.devtools.protocol.types.debugger.DisassembleWasmModule;
import net.portswigger.devtools.protocol.types.debugger.EvaluateOnCallFrame;
import net.portswigger.devtools.protocol.types.debugger.Location;
import net.portswigger.devtools.protocol.types.debugger.LocationRange;
import net.portswigger.devtools.protocol.types.debugger.RestartFrame;
import net.portswigger.devtools.protocol.types.debugger.RestartFrameMode;
import net.portswigger.devtools.protocol.types.debugger.Scope;
import net.portswigger.devtools.protocol.types.debugger.ScopeType;
import net.portswigger.devtools.protocol.types.debugger.ScriptLanguage;
import net.portswigger.devtools.protocol.types.debugger.ScriptPosition;
import net.portswigger.devtools.protocol.types.debugger.ScriptSource;
import net.portswigger.devtools.protocol.types.debugger.SearchMatch;
import net.portswigger.devtools.protocol.types.debugger.SetBreakpoint;
import net.portswigger.devtools.protocol.types.debugger.SetBreakpointByUrl;
import net.portswigger.devtools.protocol.types.debugger.SetInstrumentationBreakpointInstrumentation;
import net.portswigger.devtools.protocol.types.debugger.SetPauseOnExceptionsState;
import net.portswigger.devtools.protocol.types.debugger.SetScriptSource;
import net.portswigger.devtools.protocol.types.debugger.SetScriptSourceStatus;
import net.portswigger.devtools.protocol.types.debugger.WasmDisassemblyChunk;
import net.portswigger.devtools.protocol.types.deviceaccess.PromptDevice;
import net.portswigger.devtools.protocol.types.dom.BackendNode;
import net.portswigger.devtools.protocol.types.dom.BoxModel;
import net.portswigger.devtools.protocol.types.dom.CSSComputedStyleProperty;
import net.portswigger.devtools.protocol.types.dom.CompatibilityMode;
import net.portswigger.devtools.protocol.types.dom.EnableIncludeWhitespace;
import net.portswigger.devtools.protocol.types.dom.FrameOwner;
import net.portswigger.devtools.protocol.types.dom.GetElementByRelationRelation;
import net.portswigger.devtools.protocol.types.dom.LogicalAxes;
import net.portswigger.devtools.protocol.types.dom.Node;
import net.portswigger.devtools.protocol.types.dom.NodeForLocation;
import net.portswigger.devtools.protocol.types.dom.PerformSearch;
import net.portswigger.devtools.protocol.types.dom.PhysicalAxes;
import net.portswigger.devtools.protocol.types.dom.PseudoType;
import net.portswigger.devtools.protocol.types.dom.RGBA;
import net.portswigger.devtools.protocol.types.dom.Rect;
import net.portswigger.devtools.protocol.types.dom.ScrollOrientation;
import net.portswigger.devtools.protocol.types.dom.ShadowRootType;
import net.portswigger.devtools.protocol.types.dom.ShapeOutsideInfo;
import net.portswigger.devtools.protocol.types.domdebugger.CSPViolationType;
import net.portswigger.devtools.protocol.types.domdebugger.DOMBreakpointType;
import net.portswigger.devtools.protocol.types.domdebugger.EventListener;
import net.portswigger.devtools.protocol.types.domsnapshot.CaptureSnapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.ComputedStyle;
import net.portswigger.devtools.protocol.types.domsnapshot.DOMNode;
import net.portswigger.devtools.protocol.types.domsnapshot.DocumentSnapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.InlineTextBox;
import net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeNode;
import net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeSnapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.NameValue;
import net.portswigger.devtools.protocol.types.domsnapshot.NodeTreeSnapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.RareBooleanData;
import net.portswigger.devtools.protocol.types.domsnapshot.RareIntegerData;
import net.portswigger.devtools.protocol.types.domsnapshot.RareStringData;
import net.portswigger.devtools.protocol.types.domsnapshot.Snapshot;
import net.portswigger.devtools.protocol.types.domsnapshot.TextBoxSnapshot;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;
import net.portswigger.devtools.protocol.types.emulation.DevicePosture;
import net.portswigger.devtools.protocol.types.emulation.DevicePostureType;
import net.portswigger.devtools.protocol.types.emulation.DisabledImageType;
import net.portswigger.devtools.protocol.types.emulation.DisplayFeature;
import net.portswigger.devtools.protocol.types.emulation.DisplayFeatureOrientation;
import net.portswigger.devtools.protocol.types.emulation.MediaFeature;
import net.portswigger.devtools.protocol.types.emulation.PressureMetadata;
import net.portswigger.devtools.protocol.types.emulation.PressureSource;
import net.portswigger.devtools.protocol.types.emulation.PressureState;
import net.portswigger.devtools.protocol.types.emulation.ScreenOrientation;
import net.portswigger.devtools.protocol.types.emulation.ScreenOrientationType;
import net.portswigger.devtools.protocol.types.emulation.SensorMetadata;
import net.portswigger.devtools.protocol.types.emulation.SensorReading;
import net.portswigger.devtools.protocol.types.emulation.SensorReadingQuaternion;
import net.portswigger.devtools.protocol.types.emulation.SensorReadingSingle;
import net.portswigger.devtools.protocol.types.emulation.SensorReadingXYZ;
import net.portswigger.devtools.protocol.types.emulation.SensorType;
import net.portswigger.devtools.protocol.types.emulation.SetEmitTouchEventsForMouseConfiguration;
import net.portswigger.devtools.protocol.types.emulation.SetEmulatedVisionDeficiencyType;
import net.portswigger.devtools.protocol.types.emulation.UserAgentBrandVersion;
import net.portswigger.devtools.protocol.types.emulation.UserAgentMetadata;
import net.portswigger.devtools.protocol.types.emulation.VirtualTimePolicy;
import net.portswigger.devtools.protocol.types.fedcm.Account;
import net.portswigger.devtools.protocol.types.fedcm.AccountUrlType;
import net.portswigger.devtools.protocol.types.fedcm.DialogButton;
import net.portswigger.devtools.protocol.types.fedcm.DialogType;
import net.portswigger.devtools.protocol.types.fedcm.LoginState;
import net.portswigger.devtools.protocol.types.fetch.AuthChallenge;
import net.portswigger.devtools.protocol.types.fetch.AuthChallengeResponse;
import net.portswigger.devtools.protocol.types.fetch.AuthChallengeResponseResponse;
import net.portswigger.devtools.protocol.types.fetch.AuthChallengeSource;
import net.portswigger.devtools.protocol.types.fetch.HeaderEntry;
import net.portswigger.devtools.protocol.types.fetch.RequestPattern;
import net.portswigger.devtools.protocol.types.fetch.RequestStage;
import net.portswigger.devtools.protocol.types.fetch.ResponseBody;
import net.portswigger.devtools.protocol.types.filesystem.BucketFileSystemLocator;
import net.portswigger.devtools.protocol.types.filesystem.Directory;
import net.portswigger.devtools.protocol.types.filesystem.File;
import net.portswigger.devtools.protocol.types.headlessexperimental.BeginFrame;
import net.portswigger.devtools.protocol.types.headlessexperimental.ScreenshotParams;
import net.portswigger.devtools.protocol.types.headlessexperimental.ScreenshotParamsFormat;
import net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfile;
import net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfileNode;
import net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfileSample;
import net.portswigger.devtools.protocol.types.indexeddb.DataEntry;
import net.portswigger.devtools.protocol.types.indexeddb.DatabaseWithObjectStores;
import net.portswigger.devtools.protocol.types.indexeddb.Key;
import net.portswigger.devtools.protocol.types.indexeddb.KeyPath;
import net.portswigger.devtools.protocol.types.indexeddb.KeyPathType;
import net.portswigger.devtools.protocol.types.indexeddb.KeyRange;
import net.portswigger.devtools.protocol.types.indexeddb.KeyType;
import net.portswigger.devtools.protocol.types.indexeddb.Metadata;
import net.portswigger.devtools.protocol.types.indexeddb.ObjectStore;
import net.portswigger.devtools.protocol.types.indexeddb.ObjectStoreIndex;
import net.portswigger.devtools.protocol.types.indexeddb.RequestData;
import net.portswigger.devtools.protocol.types.input.DispatchDragEventType;
import net.portswigger.devtools.protocol.types.input.DispatchKeyEventType;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventPointerType;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventType;
import net.portswigger.devtools.protocol.types.input.DispatchTouchEventType;
import net.portswigger.devtools.protocol.types.input.DragData;
import net.portswigger.devtools.protocol.types.input.DragDataItem;
import net.portswigger.devtools.protocol.types.input.EmulateTouchFromMouseEventType;
import net.portswigger.devtools.protocol.types.input.GestureSourceType;
import net.portswigger.devtools.protocol.types.input.MouseButton;
import net.portswigger.devtools.protocol.types.input.TouchPoint;
import net.portswigger.devtools.protocol.types.io.Read;
import net.portswigger.devtools.protocol.types.layertree.CompositingReasons;
import net.portswigger.devtools.protocol.types.layertree.Layer;
import net.portswigger.devtools.protocol.types.layertree.PictureTile;
import net.portswigger.devtools.protocol.types.layertree.ScrollRect;
import net.portswigger.devtools.protocol.types.layertree.ScrollRectType;
import net.portswigger.devtools.protocol.types.layertree.StickyPositionConstraint;
import net.portswigger.devtools.protocol.types.log.LogEntry;
import net.portswigger.devtools.protocol.types.log.LogEntryCategory;
import net.portswigger.devtools.protocol.types.log.LogEntryLevel;
import net.portswigger.devtools.protocol.types.log.LogEntrySource;
import net.portswigger.devtools.protocol.types.log.ViolationSetting;
import net.portswigger.devtools.protocol.types.log.ViolationSettingName;
import net.portswigger.devtools.protocol.types.media.PlayerError;
import net.portswigger.devtools.protocol.types.media.PlayerErrorSourceLocation;
import net.portswigger.devtools.protocol.types.media.PlayerEvent;
import net.portswigger.devtools.protocol.types.media.PlayerMessage;
import net.portswigger.devtools.protocol.types.media.PlayerMessageLevel;
import net.portswigger.devtools.protocol.types.media.PlayerProperty;
import net.portswigger.devtools.protocol.types.memory.DOMCounters;
import net.portswigger.devtools.protocol.types.memory.Module;
import net.portswigger.devtools.protocol.types.memory.PressureLevel;
import net.portswigger.devtools.protocol.types.memory.SamplingProfile;
import net.portswigger.devtools.protocol.types.memory.SamplingProfileNode;
import net.portswigger.devtools.protocol.types.network.AlternateProtocolUsage;
import net.portswigger.devtools.protocol.types.network.AssociatedCookie;
import net.portswigger.devtools.protocol.types.network.AuthChallenge;
import net.portswigger.devtools.protocol.types.network.AuthChallengeResponse;
import net.portswigger.devtools.protocol.types.network.AuthChallengeResponseResponse;
import net.portswigger.devtools.protocol.types.network.AuthChallengeSource;
import net.portswigger.devtools.protocol.types.network.BlockedReason;
import net.portswigger.devtools.protocol.types.network.BlockedSetCookieWithReason;
import net.portswigger.devtools.protocol.types.network.CachedResource;
import net.portswigger.devtools.protocol.types.network.CertificateTransparencyCompliance;
import net.portswigger.devtools.protocol.types.network.ClientSecurityState;
import net.portswigger.devtools.protocol.types.network.ConnectTiming;
import net.portswigger.devtools.protocol.types.network.ConnectionType;
import net.portswigger.devtools.protocol.types.network.ContentEncoding;
import net.portswigger.devtools.protocol.types.network.ContentSecurityPolicySource;
import net.portswigger.devtools.protocol.types.network.ContentSecurityPolicyStatus;
import net.portswigger.devtools.protocol.types.network.Cookie;
import net.portswigger.devtools.protocol.types.network.CookieBlockedReason;
import net.portswigger.devtools.protocol.types.network.CookieExemptionReason;
import net.portswigger.devtools.protocol.types.network.CookieParam;
import net.portswigger.devtools.protocol.types.network.CookiePartitionKey;
import net.portswigger.devtools.protocol.types.network.CookiePriority;
import net.portswigger.devtools.protocol.types.network.CookieSameSite;
import net.portswigger.devtools.protocol.types.network.CookieSourceScheme;
import net.portswigger.devtools.protocol.types.network.CorsError;
import net.portswigger.devtools.protocol.types.network.CorsErrorStatus;
import net.portswigger.devtools.protocol.types.network.CrossOriginEmbedderPolicyStatus;
import net.portswigger.devtools.protocol.types.network.CrossOriginEmbedderPolicyValue;
import net.portswigger.devtools.protocol.types.network.CrossOriginOpenerPolicyStatus;
import net.portswigger.devtools.protocol.types.network.CrossOriginOpenerPolicyValue;
import net.portswigger.devtools.protocol.types.network.ErrorReason;
import net.portswigger.devtools.protocol.types.network.ExemptedSetCookieWithReason;
import net.portswigger.devtools.protocol.types.network.IPAddressSpace;
import net.portswigger.devtools.protocol.types.network.Initiator;
import net.portswigger.devtools.protocol.types.network.InitiatorType;
import net.portswigger.devtools.protocol.types.network.InterceptionStage;
import net.portswigger.devtools.protocol.types.network.LoadNetworkResourceOptions;
import net.portswigger.devtools.protocol.types.network.LoadNetworkResourcePageResult;
import net.portswigger.devtools.protocol.types.network.PostDataEntry;
import net.portswigger.devtools.protocol.types.network.PrivateNetworkRequestPolicy;
import net.portswigger.devtools.protocol.types.network.ReportStatus;
import net.portswigger.devtools.protocol.types.network.ReportingApiEndpoint;
import net.portswigger.devtools.protocol.types.network.ReportingApiReport;
import net.portswigger.devtools.protocol.types.network.Request;
import net.portswigger.devtools.protocol.types.network.RequestPattern;
import net.portswigger.devtools.protocol.types.network.RequestReferrerPolicy;
import net.portswigger.devtools.protocol.types.network.ResourcePriority;
import net.portswigger.devtools.protocol.types.network.ResourceTiming;
import net.portswigger.devtools.protocol.types.network.ResourceType;
import net.portswigger.devtools.protocol.types.network.Response;
import net.portswigger.devtools.protocol.types.network.ResponseBody;
import net.portswigger.devtools.protocol.types.network.ResponseBodyForInterception;
import net.portswigger.devtools.protocol.types.network.SecurityDetails;
import net.portswigger.devtools.protocol.types.network.SecurityIsolationStatus;
import net.portswigger.devtools.protocol.types.network.ServiceWorkerResponseSource;
import net.portswigger.devtools.protocol.types.network.ServiceWorkerRouterInfo;
import net.portswigger.devtools.protocol.types.network.ServiceWorkerRouterSource;
import net.portswigger.devtools.protocol.types.network.SetCookieBlockedReason;
import net.portswigger.devtools.protocol.types.network.SignedCertificateTimestamp;
import net.portswigger.devtools.protocol.types.network.SignedExchangeError;
import net.portswigger.devtools.protocol.types.network.SignedExchangeErrorField;
import net.portswigger.devtools.protocol.types.network.SignedExchangeHeader;
import net.portswigger.devtools.protocol.types.network.SignedExchangeInfo;
import net.portswigger.devtools.protocol.types.network.SignedExchangeSignature;
import net.portswigger.devtools.protocol.types.network.TrustTokenOperationType;
import net.portswigger.devtools.protocol.types.network.TrustTokenParams;
import net.portswigger.devtools.protocol.types.network.TrustTokenParamsRefreshPolicy;
import net.portswigger.devtools.protocol.types.network.WebSocketFrame;
import net.portswigger.devtools.protocol.types.network.WebSocketRequest;
import net.portswigger.devtools.protocol.types.network.WebSocketResponse;
import net.portswigger.devtools.protocol.types.overlay.BoxStyle;
import net.portswigger.devtools.protocol.types.overlay.ColorFormat;
import net.portswigger.devtools.protocol.types.overlay.ContainerQueryContainerHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.ContainerQueryHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.ContrastAlgorithm;
import net.portswigger.devtools.protocol.types.overlay.FlexContainerHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.FlexItemHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.FlexNodeHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.GridHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.GridNodeHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.HighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.HingeConfig;
import net.portswigger.devtools.protocol.types.overlay.InspectMode;
import net.portswigger.devtools.protocol.types.overlay.IsolatedElementHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.IsolationModeHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.LineStyle;
import net.portswigger.devtools.protocol.types.overlay.LineStylePattern;
import net.portswigger.devtools.protocol.types.overlay.ScrollSnapContainerHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.ScrollSnapHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.SourceOrderConfig;
import net.portswigger.devtools.protocol.types.overlay.WindowControlsOverlayConfig;
import net.portswigger.devtools.protocol.types.page.AdFrameExplanation;
import net.portswigger.devtools.protocol.types.page.AdFrameStatus;
import net.portswigger.devtools.protocol.types.page.AdFrameType;
import net.portswigger.devtools.protocol.types.page.AdScriptId;
import net.portswigger.devtools.protocol.types.page.AppId;
import net.portswigger.devtools.protocol.types.page.AppManifest;
import net.portswigger.devtools.protocol.types.page.AppManifestError;
import net.portswigger.devtools.protocol.types.page.AppManifestParsedProperties;
import net.portswigger.devtools.protocol.types.page.AutoResponseMode;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheBlockingDetails;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanation;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanationTree;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredReason;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredReasonType;
import net.portswigger.devtools.protocol.types.page.CaptureScreenshotFormat;
import net.portswigger.devtools.protocol.types.page.CaptureSnapshotFormat;
import net.portswigger.devtools.protocol.types.page.ClientNavigationDisposition;
import net.portswigger.devtools.protocol.types.page.ClientNavigationReason;
import net.portswigger.devtools.protocol.types.page.CompilationCacheParams;
import net.portswigger.devtools.protocol.types.page.CrossOriginIsolatedContextType;
import net.portswigger.devtools.protocol.types.page.DialogType;
import net.portswigger.devtools.protocol.types.page.FileFilter;
import net.portswigger.devtools.protocol.types.page.FileHandler;
import net.portswigger.devtools.protocol.types.page.FontFamilies;
import net.portswigger.devtools.protocol.types.page.FontSizes;
import net.portswigger.devtools.protocol.types.page.Frame;
import net.portswigger.devtools.protocol.types.page.FrameResource;
import net.portswigger.devtools.protocol.types.page.FrameResourceTree;
import net.portswigger.devtools.protocol.types.page.FrameTree;
import net.portswigger.devtools.protocol.types.page.GatedAPIFeatures;
import net.portswigger.devtools.protocol.types.page.ImageResource;
import net.portswigger.devtools.protocol.types.page.InstallabilityError;
import net.portswigger.devtools.protocol.types.page.InstallabilityErrorArgument;
import net.portswigger.devtools.protocol.types.page.LaunchHandler;
import net.portswigger.devtools.protocol.types.page.LayoutMetrics;
import net.portswigger.devtools.protocol.types.page.LayoutViewport;
import net.portswigger.devtools.protocol.types.page.Navigate;
import net.portswigger.devtools.protocol.types.page.NavigationEntry;
import net.portswigger.devtools.protocol.types.page.NavigationHistory;
import net.portswigger.devtools.protocol.types.page.NavigationType;
import net.portswigger.devtools.protocol.types.page.OriginTrial;
import net.portswigger.devtools.protocol.types.page.OriginTrialStatus;
import net.portswigger.devtools.protocol.types.page.OriginTrialToken;
import net.portswigger.devtools.protocol.types.page.OriginTrialTokenStatus;
import net.portswigger.devtools.protocol.types.page.OriginTrialTokenWithStatus;
import net.portswigger.devtools.protocol.types.page.OriginTrialUsageRestriction;
import net.portswigger.devtools.protocol.types.page.PermissionsPolicyBlockLocator;
import net.portswigger.devtools.protocol.types.page.PermissionsPolicyBlockReason;
import net.portswigger.devtools.protocol.types.page.PermissionsPolicyFeature;
import net.portswigger.devtools.protocol.types.page.PermissionsPolicyFeatureState;
import net.portswigger.devtools.protocol.types.page.PrintToPDF;
import net.portswigger.devtools.protocol.types.page.PrintToPDFTransferMode;
import net.portswigger.devtools.protocol.types.page.ProtocolHandler;
import net.portswigger.devtools.protocol.types.page.ReferrerPolicy;
import net.portswigger.devtools.protocol.types.page.RelatedApplication;
import net.portswigger.devtools.protocol.types.page.ResourceContent;
import net.portswigger.devtools.protocol.types.page.ScopeExtension;
import net.portswigger.devtools.protocol.types.page.ScreencastFrameMetadata;
import net.portswigger.devtools.protocol.types.page.Screenshot;
import net.portswigger.devtools.protocol.types.page.ScriptFontFamilies;
import net.portswigger.devtools.protocol.types.page.SecureContextType;
import net.portswigger.devtools.protocol.types.page.SetDownloadBehaviorBehavior;
import net.portswigger.devtools.protocol.types.page.SetWebLifecycleStateState;
import net.portswigger.devtools.protocol.types.page.ShareTarget;
import net.portswigger.devtools.protocol.types.page.Shortcut;
import net.portswigger.devtools.protocol.types.page.StartScreencastFormat;
import net.portswigger.devtools.protocol.types.page.TransitionType;
import net.portswigger.devtools.protocol.types.page.Viewport;
import net.portswigger.devtools.protocol.types.page.VisualViewport;
import net.portswigger.devtools.protocol.types.page.WebAppManifest;
import net.portswigger.devtools.protocol.types.performance.EnableTimeDomain;
import net.portswigger.devtools.protocol.types.performance.Metric;
import net.portswigger.devtools.protocol.types.performance.SetTimeDomainTimeDomain;
import net.portswigger.devtools.protocol.types.performancetimeline.LargestContentfulPaint;
import net.portswigger.devtools.protocol.types.performancetimeline.LayoutShift;
import net.portswigger.devtools.protocol.types.performancetimeline.LayoutShiftAttribution;
import net.portswigger.devtools.protocol.types.performancetimeline.TimelineEvent;
import net.portswigger.devtools.protocol.types.preload.PrefetchStatus;
import net.portswigger.devtools.protocol.types.preload.PreloadingAttemptKey;
import net.portswigger.devtools.protocol.types.preload.PreloadingAttemptSource;
import net.portswigger.devtools.protocol.types.preload.PreloadingStatus;
import net.portswigger.devtools.protocol.types.preload.PrerenderFinalStatus;
import net.portswigger.devtools.protocol.types.preload.PrerenderMismatchedHeaders;
import net.portswigger.devtools.protocol.types.preload.RuleSet;
import net.portswigger.devtools.protocol.types.preload.RuleSetErrorType;
import net.portswigger.devtools.protocol.types.preload.SpeculationAction;
import net.portswigger.devtools.protocol.types.preload.SpeculationTargetHint;
import net.portswigger.devtools.protocol.types.profiler.CoverageRange;
import net.portswigger.devtools.protocol.types.profiler.FunctionCoverage;
import net.portswigger.devtools.protocol.types.profiler.PositionTickInfo;
import net.portswigger.devtools.protocol.types.profiler.Profile;
import net.portswigger.devtools.protocol.types.profiler.ProfileNode;
import net.portswigger.devtools.protocol.types.profiler.ScriptCoverage;
import net.portswigger.devtools.protocol.types.profiler.TakePreciseCoverage;
import net.portswigger.devtools.protocol.types.pwa.DisplayMode;
import net.portswigger.devtools.protocol.types.pwa.FileHandler;
import net.portswigger.devtools.protocol.types.pwa.FileHandlerAccept;
import net.portswigger.devtools.protocol.types.pwa.OsAppState;
import net.portswigger.devtools.protocol.types.runtime.AwaitPromise;
import net.portswigger.devtools.protocol.types.runtime.CallArgument;
import net.portswigger.devtools.protocol.types.runtime.CallFrame;
import net.portswigger.devtools.protocol.types.runtime.CallFunctionOn;
import net.portswigger.devtools.protocol.types.runtime.CompileScript;
import net.portswigger.devtools.protocol.types.runtime.CustomPreview;
import net.portswigger.devtools.protocol.types.runtime.DeepSerializedValue;
import net.portswigger.devtools.protocol.types.runtime.DeepSerializedValueType;
import net.portswigger.devtools.protocol.types.runtime.EntryPreview;
import net.portswigger.devtools.protocol.types.runtime.Evaluate;
import net.portswigger.devtools.protocol.types.runtime.ExceptionDetails;
import net.portswigger.devtools.protocol.types.runtime.ExecutionContextDescription;
import net.portswigger.devtools.protocol.types.runtime.HeapUsage;
import net.portswigger.devtools.protocol.types.runtime.InternalPropertyDescriptor;
import net.portswigger.devtools.protocol.types.runtime.ObjectPreview;
import net.portswigger.devtools.protocol.types.runtime.ObjectPreviewSubtype;
import net.portswigger.devtools.protocol.types.runtime.ObjectPreviewType;
import net.portswigger.devtools.protocol.types.runtime.PrivatePropertyDescriptor;
import net.portswigger.devtools.protocol.types.runtime.Properties;
import net.portswigger.devtools.protocol.types.runtime.PropertyDescriptor;
import net.portswigger.devtools.protocol.types.runtime.PropertyPreview;
import net.portswigger.devtools.protocol.types.runtime.PropertyPreviewSubtype;
import net.portswigger.devtools.protocol.types.runtime.PropertyPreviewType;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;
import net.portswigger.devtools.protocol.types.runtime.RemoteObjectSubtype;
import net.portswigger.devtools.protocol.types.runtime.RemoteObjectType;
import net.portswigger.devtools.protocol.types.runtime.RunScript;
import net.portswigger.devtools.protocol.types.runtime.SerializationOptions;
import net.portswigger.devtools.protocol.types.runtime.SerializationOptionsSerialization;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;
import net.portswigger.devtools.protocol.types.runtime.StackTraceId;
import net.portswigger.devtools.protocol.types.schema.Domain;
import net.portswigger.devtools.protocol.types.security.CertificateErrorAction;
import net.portswigger.devtools.protocol.types.security.CertificateSecurityState;
import net.portswigger.devtools.protocol.types.security.InsecureContentStatus;
import net.portswigger.devtools.protocol.types.security.MixedContentType;
import net.portswigger.devtools.protocol.types.security.SafetyTipInfo;
import net.portswigger.devtools.protocol.types.security.SafetyTipStatus;
import net.portswigger.devtools.protocol.types.security.SecurityState;
import net.portswigger.devtools.protocol.types.security.SecurityStateExplanation;
import net.portswigger.devtools.protocol.types.security.VisibleSecurityState;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerErrorMessage;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerRegistration;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerVersion;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerVersionRunningStatus;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerVersionStatus;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDebugReportingConfig;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDebugReportingData;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableDedupKey;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableResult;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableTriggerData;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableValueDictEntry;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableValueEntry;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregationKeysEntry;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingEventLevelResult;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingEventReportWindows;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingEventTriggerData;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterConfig;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterDataEntry;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingFilterPair;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistration;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistrationResult;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistrationTimeConfig;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceType;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerDataMatching;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerRegistration;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerSpec;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAccessType;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAuctionEventType;
import net.portswigger.devtools.protocol.types.storage.InterestGroupAuctionFetchType;
import net.portswigger.devtools.protocol.types.storage.RelatedWebsiteSet;
import net.portswigger.devtools.protocol.types.storage.SharedStorageAccessParams;
import net.portswigger.devtools.protocol.types.storage.SharedStorageAccessType;
import net.portswigger.devtools.protocol.types.storage.SharedStorageEntry;
import net.portswigger.devtools.protocol.types.storage.SharedStorageMetadata;
import net.portswigger.devtools.protocol.types.storage.SharedStorageReportingMetadata;
import net.portswigger.devtools.protocol.types.storage.SharedStorageUrlWithMetadata;
import net.portswigger.devtools.protocol.types.storage.StorageBucket;
import net.portswigger.devtools.protocol.types.storage.StorageBucketInfo;
import net.portswigger.devtools.protocol.types.storage.StorageBucketsDurability;
import net.portswigger.devtools.protocol.types.storage.StorageType;
import net.portswigger.devtools.protocol.types.storage.TrustTokens;
import net.portswigger.devtools.protocol.types.storage.UsageAndQuota;
import net.portswigger.devtools.protocol.types.storage.UsageForType;
import net.portswigger.devtools.protocol.types.systeminfo.GPUDevice;
import net.portswigger.devtools.protocol.types.systeminfo.GPUInfo;
import net.portswigger.devtools.protocol.types.systeminfo.ImageDecodeAcceleratorCapability;
import net.portswigger.devtools.protocol.types.systeminfo.ImageType;
import net.portswigger.devtools.protocol.types.systeminfo.Info;
import net.portswigger.devtools.protocol.types.systeminfo.ProcessInfo;
import net.portswigger.devtools.protocol.types.systeminfo.Size;
import net.portswigger.devtools.protocol.types.systeminfo.SubsamplingFormat;
import net.portswigger.devtools.protocol.types.systeminfo.VideoDecodeAcceleratorCapability;
import net.portswigger.devtools.protocol.types.systeminfo.VideoEncodeAcceleratorCapability;
import net.portswigger.devtools.protocol.types.target.FilterEntry;
import net.portswigger.devtools.protocol.types.target.RemoteLocation;
import net.portswigger.devtools.protocol.types.target.TargetInfo;
import net.portswigger.devtools.protocol.types.tracing.MemoryDumpLevelOfDetail;
import net.portswigger.devtools.protocol.types.tracing.RequestMemoryDump;
import net.portswigger.devtools.protocol.types.tracing.StartTransferMode;
import net.portswigger.devtools.protocol.types.tracing.StreamCompression;
import net.portswigger.devtools.protocol.types.tracing.StreamFormat;
import net.portswigger.devtools.protocol.types.tracing.TraceConfig;
import net.portswigger.devtools.protocol.types.tracing.TraceConfigRecordMode;
import net.portswigger.devtools.protocol.types.tracing.TracingBackend;
import net.portswigger.devtools.protocol.types.webaudio.AudioListener;
import net.portswigger.devtools.protocol.types.webaudio.AudioNode;
import net.portswigger.devtools.protocol.types.webaudio.AudioParam;
import net.portswigger.devtools.protocol.types.webaudio.AutomationRate;
import net.portswigger.devtools.protocol.types.webaudio.BaseAudioContext;
import net.portswigger.devtools.protocol.types.webaudio.ChannelCountMode;
import net.portswigger.devtools.protocol.types.webaudio.ChannelInterpretation;
import net.portswigger.devtools.protocol.types.webaudio.ContextRealtimeData;
import net.portswigger.devtools.protocol.types.webaudio.ContextState;
import net.portswigger.devtools.protocol.types.webaudio.ContextType;
import net.portswigger.devtools.protocol.types.webauthn.AuthenticatorProtocol;
import net.portswigger.devtools.protocol.types.webauthn.AuthenticatorTransport;
import net.portswigger.devtools.protocol.types.webauthn.Credential;
import net.portswigger.devtools.protocol.types.webauthn.Ctap2Version;
import net.portswigger.devtools.protocol.types.webauthn.VirtualAuthenticatorOptions;

public class Zi {
  private static boolean ZQ;
  
  public static Class[] Zg() {
    return new Class[] { 
        ConsoleMessageSource.class, ConsoleMessageLevel.class, ConsoleMessage.class, MessageAdded.class, Location.class, ScriptPosition.class, LocationRange.class, CallFrame.class, ScopeType.class, Scope.class, 
        SearchMatch.class, BreakLocationType.class, BreakLocation.class, WasmDisassemblyChunk.class, ScriptLanguage.class, DebugSymbolsType.class, DebugSymbols.class, BreakpointResolved.class, PausedReason.class, Paused.class, 
        Resumed.class, ScriptFailedToParse.class, ScriptParsed.class, ContinueToLocationTargetCallFrames.class, EvaluateOnCallFrame.class, ScriptSource.class, DisassembleWasmModule.class, RestartFrame.class, RestartFrameMode.class, SetBreakpoint.class, 
        SetInstrumentationBreakpointInstrumentation.class, SetBreakpointByUrl.class, SetPauseOnExceptionsState.class, SetScriptSourceStatus.class, SetScriptSource.class, SamplingHeapProfileNode.class, SamplingHeapProfileSample.class, SamplingHeapProfile.class, AddHeapSnapshotChunk.class, HeapStatsUpdate.class, 
        LastSeenObjectId.class, ReportHeapSnapshotProgress.class, ResetProfiles.class, ProfileNode.class, Profile.class, PositionTickInfo.class, CoverageRange.class, FunctionCoverage.class, ScriptCoverage.class, ConsoleProfileFinished.class, 
        ConsoleProfileStarted.class, PreciseCoverageDeltaUpdate.class, TakePreciseCoverage.class, SerializationOptionsSerialization.class, SerializationOptions.class, DeepSerializedValueType.class, DeepSerializedValue.class, RemoteObjectType.class, RemoteObjectSubtype.class, RemoteObject.class, 
        CustomPreview.class, ObjectPreviewType.class, ObjectPreviewSubtype.class, ObjectPreview.class, PropertyPreviewType.class, PropertyPreviewSubtype.class, PropertyPreview.class, EntryPreview.class, PropertyDescriptor.class, InternalPropertyDescriptor.class, 
        PrivatePropertyDescriptor.class, CallArgument.class, ExecutionContextDescription.class, ExceptionDetails.class, CallFrame.class, StackTrace.class, StackTraceId.class, BindingCalled.class, ConsoleAPICalledType.class, ConsoleAPICalled.class, 
        ExceptionRevoked.class, ExceptionThrown.class, ExecutionContextCreated.class, ExecutionContextDestroyed.class, ExecutionContextsCleared.class, InspectRequested.class, AwaitPromise.class, CallFunctionOn.class, CompileScript.class, Evaluate.class, 
        HeapUsage.class, Properties.class, RunScript.class, Domain.class, AXValueType.class, AXValueSourceType.class, AXValueNativeSourceType.class, AXValueSource.class, AXRelatedNode.class, AXProperty.class, 
        AXValue.class, AXPropertyName.class, AXNode.class, LoadComplete.class, NodesUpdated.class, AnimationType.class, Animation.class, ViewOrScrollTimeline.class, AnimationEffect.class, KeyframesRule.class, 
        KeyframeStyle.class, AnimationCanceled.class, AnimationCreated.class, AnimationStarted.class, AnimationUpdated.class, AffectedCookie.class, AffectedRequest.class, AffectedFrame.class, CookieExclusionReason.class, CookieWarningReason.class, 
        CookieOperation.class, CookieIssueDetails.class, MixedContentResolutionStatus.class, MixedContentResourceType.class, MixedContentIssueDetails.class, BlockedByResponseReason.class, BlockedByResponseIssueDetails.class, HeavyAdResolutionStatus.class, HeavyAdReason.class, HeavyAdIssueDetails.class, 
        ContentSecurityPolicyViolationType.class, SourceCodeLocation.class, ContentSecurityPolicyIssueDetails.class, SharedArrayBufferIssueType.class, SharedArrayBufferIssueDetails.class, LowTextContrastIssueDetails.class, CorsIssueDetails.class, AttributionReportingIssueType.class, SharedDictionaryError.class, AttributionReportingIssueDetails.class, 
        QuirksModeIssueDetails.class, NavigatorUserAgentIssueDetails.class, SharedDictionaryIssueDetails.class, GenericIssueErrorType.class, GenericIssueDetails.class, DeprecationIssueDetails.class, BounceTrackingIssueDetails.class, CookieDeprecationMetadataIssueDetails.class, ClientHintIssueReason.class, FederatedAuthRequestIssueDetails.class, 
        FederatedAuthRequestIssueReason.class, FederatedAuthUserInfoRequestIssueDetails.class, FederatedAuthUserInfoRequestIssueReason.class, ClientHintIssueDetails.class, FailedRequestInfo.class, StyleSheetLoadingIssueReason.class, StylesheetLoadingIssueDetails.class, PropertyRuleIssueReason.class, PropertyRuleIssueDetails.class, InspectorIssueCode.class, 
        InspectorIssueDetails.class, InspectorIssue.class, IssueAdded.class, GetEncodedResponseEncoding.class, EncodedResponse.class, CreditCard.class, AddressField.class, AddressFields.class, Address.class, AddressUI.class, 
        FillingStrategy.class, FilledField.class, AddressFormFilled.class, ServiceName.class, EventMetadata.class, BackgroundServiceEvent.class, RecordingStateChanged.class, BackgroundServiceEventReceived.class, WindowState.class, Bounds.class, 
        PermissionType.class, PermissionSetting.class, PermissionDescriptor.class, BrowserCommandId.class, Bucket.class, Histogram.class, DownloadWillBegin.class, DownloadProgressState.class, DownloadProgress.class, SetDownloadBehaviorBehavior.class, 
        Version.class, WindowForTarget.class, StyleSheetOrigin.class, PseudoElementMatches.class, InheritedStyleEntry.class, InheritedPseudoElementMatches.class, RuleMatch.class, Value.class, Specificity.class, SelectorList.class, 
        CSSStyleSheetHeader.class, CSSRule.class, CSSRuleType.class, RuleUsage.class, SourceRange.class, ShorthandEntry.class, CSSComputedStyleProperty.class, CSSStyle.class, CSSProperty.class, CSSMediaSource.class, 
        CSSMedia.class, MediaQuery.class, MediaQueryExpression.class, CSSContainerQuery.class, CSSSupports.class, CSSScope.class, CSSLayer.class, CSSLayerData.class, PlatformFontUsage.class, FontVariationAxis.class, 
        FontFace.class, CSSTryRule.class, CSSPositionFallbackRule.class, CSSPositionTryRule.class, CSSKeyframesRule.class, CSSPropertyRegistration.class, CSSFontPaletteValuesRule.class, CSSPropertyRule.class, CSSKeyframeRule.class, StyleDeclarationEdit.class, 
        FontsUpdated.class, MediaQueryResultChanged.class, StyleSheetAdded.class, StyleSheetChanged.class, StyleSheetRemoved.class, BackgroundColors.class, InlineStylesForNode.class, MatchedStylesForNode.class, TakeCoverageDelta.class, CachedResponseType.class, 
        DataEntry.class, Cache.class, Header.class, CachedResponse.class, RequestEntries.class, Sink.class, SinksUpdated.class, IssueUpdated.class, BackendNode.class, PseudoType.class, 
        ShadowRootType.class, CompatibilityMode.class, PhysicalAxes.class, LogicalAxes.class, ScrollOrientation.class, Node.class, RGBA.class, BoxModel.class, ShapeOutsideInfo.class, Rect.class, 
        CSSComputedStyleProperty.class, AttributeModified.class, AttributeRemoved.class, CharacterDataModified.class, ChildNodeCountUpdated.class, ChildNodeInserted.class, ChildNodeRemoved.class, DistributedNodesUpdated.class, DocumentUpdated.class, InlineStyleInvalidated.class, 
        PseudoElementAdded.class, TopLayerElementsUpdated.class, PseudoElementRemoved.class, SetChildNodes.class, ShadowRootPopped.class, ShadowRootPushed.class, EnableIncludeWhitespace.class, NodeForLocation.class, PerformSearch.class, GetElementByRelationRelation.class, 
        FrameOwner.class, DOMBreakpointType.class, CSPViolationType.class, EventListener.class, DOMNode.class, InlineTextBox.class, LayoutTreeNode.class, ComputedStyle.class, NameValue.class, RareStringData.class, 
        RareBooleanData.class, RareIntegerData.class, DocumentSnapshot.class, NodeTreeSnapshot.class, LayoutTreeSnapshot.class, TextBoxSnapshot.class, Snapshot.class, CaptureSnapshot.class, StorageId.class, DomStorageItemAdded.class, 
        DomStorageItemRemoved.class, DomStorageItemUpdated.class, DomStorageItemsCleared.class, Database.class, Error.class, AddDatabase.class, ExecuteSQL.class, ScreenOrientationType.class, ScreenOrientation.class, DisplayFeatureOrientation.class, 
        DisplayFeature.class, DevicePostureType.class, DevicePosture.class, MediaFeature.class, VirtualTimePolicy.class, UserAgentBrandVersion.class, UserAgentMetadata.class, SensorType.class, SensorMetadata.class, SensorReadingSingle.class, 
        SensorReadingXYZ.class, SensorReadingQuaternion.class, SensorReading.class, PressureSource.class, PressureState.class, PressureMetadata.class, DisabledImageType.class, VirtualTimeBudgetExpired.class, SetEmitTouchEventsForMouseConfiguration.class, SetEmulatedVisionDeficiencyType.class, 
        ScreenshotParamsFormat.class, ScreenshotParams.class, BeginFrame.class, Read.class, File.class, Directory.class, BucketFileSystemLocator.class, DatabaseWithObjectStores.class, ObjectStore.class, ObjectStoreIndex.class, 
        KeyType.class, Key.class, KeyRange.class, DataEntry.class, KeyPathType.class, KeyPath.class, RequestData.class, Metadata.class, TouchPoint.class, GestureSourceType.class, 
        MouseButton.class, DragDataItem.class, DragData.class, DragIntercepted.class, DispatchDragEventType.class, DispatchKeyEventType.class, DispatchMouseEventType.class, DispatchMouseEventPointerType.class, DispatchTouchEventType.class, EmulateTouchFromMouseEventType.class, 
        Detached.class, TargetCrashed.class, TargetReloadedAfterCrash.class, ScrollRectType.class, ScrollRect.class, StickyPositionConstraint.class, PictureTile.class, Layer.class, LayerPainted.class, LayerTreeDidChange.class, 
        CompositingReasons.class, LogEntrySource.class, LogEntryLevel.class, LogEntryCategory.class, LogEntry.class, ViolationSettingName.class, ViolationSetting.class, EntryAdded.class, PressureLevel.class, SamplingProfileNode.class, 
        SamplingProfile.class, Module.class, DOMCounters.class, ResourceType.class, ErrorReason.class, ConnectionType.class, CookieSameSite.class, CookiePriority.class, CookieSourceScheme.class, ResourceTiming.class, 
        ResourcePriority.class, PostDataEntry.class, RequestReferrerPolicy.class, Request.class, SignedCertificateTimestamp.class, SecurityDetails.class, CertificateTransparencyCompliance.class, BlockedReason.class, CorsError.class, CorsErrorStatus.class, 
        ServiceWorkerResponseSource.class, TrustTokenParamsRefreshPolicy.class, TrustTokenParams.class, TrustTokenOperationType.class, AlternateProtocolUsage.class, ServiceWorkerRouterSource.class, ServiceWorkerRouterInfo.class, Response.class, WebSocketRequest.class, WebSocketResponse.class, 
        WebSocketFrame.class, CachedResource.class, InitiatorType.class, Initiator.class, CookiePartitionKey.class, Cookie.class, SetCookieBlockedReason.class, CookieBlockedReason.class, CookieExemptionReason.class, BlockedSetCookieWithReason.class, 
        ExemptedSetCookieWithReason.class, AssociatedCookie.class, CookieParam.class, AuthChallengeSource.class, AuthChallenge.class, AuthChallengeResponseResponse.class, AuthChallengeResponse.class, InterceptionStage.class, RequestPattern.class, SignedExchangeSignature.class, 
        SignedExchangeHeader.class, SignedExchangeErrorField.class, SignedExchangeError.class, SignedExchangeInfo.class, ContentEncoding.class, PrivateNetworkRequestPolicy.class, IPAddressSpace.class, ConnectTiming.class, ClientSecurityState.class, CrossOriginOpenerPolicyValue.class, 
        CrossOriginOpenerPolicyStatus.class, CrossOriginEmbedderPolicyValue.class, CrossOriginEmbedderPolicyStatus.class, ContentSecurityPolicySource.class, ContentSecurityPolicyStatus.class, SecurityIsolationStatus.class, ReportStatus.class, ReportingApiReport.class, ReportingApiEndpoint.class, LoadNetworkResourcePageResult.class, 
        LoadNetworkResourceOptions.class, DataReceived.class, EventSourceMessageReceived.class, LoadingFailed.class, LoadingFinished.class, RequestIntercepted.class, RequestServedFromCache.class, RequestWillBeSent.class, ResourceChangedPriority.class, SignedExchangeReceived.class, 
        ResponseReceived.class, WebSocketClosed.class, WebSocketCreated.class, WebSocketFrameError.class, WebSocketFrameReceived.class, WebSocketFrameSent.class, WebSocketHandshakeResponseReceived.class, WebSocketWillSendHandshakeRequest.class, WebTransportCreated.class, WebTransportConnectionEstablished.class, 
        WebTransportClosed.class, RequestWillBeSentExtraInfo.class, ResponseReceivedExtraInfo.class, ResponseReceivedEarlyHints.class, TrustTokenOperationDoneStatus.class, TrustTokenOperationDone.class, PolicyUpdated.class, SubresourceWebBundleMetadataReceived.class, SubresourceWebBundleMetadataError.class, SubresourceWebBundleInnerResponseParsed.class, 
        SubresourceWebBundleInnerResponseError.class, ReportingApiReportAdded.class, ReportingApiReportUpdated.class, ReportingApiEndpointsChangedForOrigin.class, ResponseBody.class, ResponseBodyForInterception.class, SourceOrderConfig.class, GridHighlightConfig.class, FlexContainerHighlightConfig.class, FlexItemHighlightConfig.class, 
        LineStylePattern.class, LineStyle.class, BoxStyle.class, ContrastAlgorithm.class, HighlightConfig.class, ColorFormat.class, GridNodeHighlightConfig.class, FlexNodeHighlightConfig.class, ScrollSnapContainerHighlightConfig.class, ScrollSnapHighlightConfig.class, 
        HingeConfig.class, WindowControlsOverlayConfig.class, ContainerQueryHighlightConfig.class, ContainerQueryContainerHighlightConfig.class, IsolatedElementHighlightConfig.class, IsolationModeHighlightConfig.class, InspectMode.class, InspectNodeRequested.class, NodeHighlightRequested.class, ScreenshotRequested.class, 
        InspectModeCanceled.class, AdFrameType.class, AdFrameExplanation.class, AdFrameStatus.class, AdScriptId.class, SecureContextType.class, CrossOriginIsolatedContextType.class, GatedAPIFeatures.class, PermissionsPolicyFeature.class, PermissionsPolicyBlockReason.class, 
        PermissionsPolicyBlockLocator.class, PermissionsPolicyFeatureState.class, OriginTrialTokenStatus.class, OriginTrialStatus.class, OriginTrialUsageRestriction.class, OriginTrialToken.class, OriginTrialTokenWithStatus.class, OriginTrial.class, Frame.class, FrameResource.class, 
        FrameResourceTree.class, FrameTree.class, TransitionType.class, NavigationEntry.class, ScreencastFrameMetadata.class, DialogType.class, AppManifestError.class, AppManifestParsedProperties.class, LayoutViewport.class, VisualViewport.class, 
        Viewport.class, FontFamilies.class, ScriptFontFamilies.class, FontSizes.class, ClientNavigationReason.class, ClientNavigationDisposition.class, InstallabilityErrorArgument.class, InstallabilityError.class, ReferrerPolicy.class, CompilationCacheParams.class, 
        FileFilter.class, FileHandler.class, ImageResource.class, LaunchHandler.class, ProtocolHandler.class, RelatedApplication.class, ScopeExtension.class, Screenshot.class, ShareTarget.class, Shortcut.class, 
        WebAppManifest.class, AutoResponseMode.class, NavigationType.class, BackForwardCacheNotRestoredReason.class, BackForwardCacheNotRestoredReasonType.class, BackForwardCacheBlockingDetails.class, BackForwardCacheNotRestoredExplanation.class, BackForwardCacheNotRestoredExplanationTree.class, DomContentEventFired.class, FileChooserOpenedMode.class, 
        FileChooserOpened.class, FrameAttached.class, FrameClearedScheduledNavigation.class, FrameDetachedReason.class, FrameDetached.class, FrameNavigated.class, DocumentOpened.class, FrameResized.class, FrameRequestedNavigation.class, FrameScheduledNavigation.class, 
        FrameStartedLoading.class, FrameStoppedLoading.class, DownloadWillBegin.class, DownloadProgressState.class, DownloadProgress.class, InterstitialHidden.class, InterstitialShown.class, JavascriptDialogClosed.class, JavascriptDialogOpening.class, LifecycleEvent.class, 
        BackForwardCacheNotUsed.class, LoadEventFired.class, NavigatedWithinDocument.class, ScreencastFrame.class, ScreencastVisibilityChanged.class, WindowOpen.class, CompilationCacheProduced.class, CaptureScreenshotFormat.class, CaptureSnapshotFormat.class, AppManifest.class, 
        AppId.class, LayoutMetrics.class, NavigationHistory.class, ResourceContent.class, Navigate.class, PrintToPDF.class, PrintToPDFTransferMode.class, SetDownloadBehaviorBehavior.class, StartScreencastFormat.class, SetWebLifecycleStateState.class, 
        Metric.class, Metrics.class, EnableTimeDomain.class, SetTimeDomainTimeDomain.class, LargestContentfulPaint.class, LayoutShiftAttribution.class, LayoutShift.class, TimelineEvent.class, TimelineEventAdded.class, MixedContentType.class, 
        SecurityState.class, CertificateSecurityState.class, SafetyTipStatus.class, SafetyTipInfo.class, VisibleSecurityState.class, SecurityStateExplanation.class, InsecureContentStatus.class, CertificateErrorAction.class, CertificateError.class, VisibleSecurityStateChanged.class, 
        SecurityStateChanged.class, ServiceWorkerRegistration.class, ServiceWorkerVersionRunningStatus.class, ServiceWorkerVersionStatus.class, ServiceWorkerVersion.class, ServiceWorkerErrorMessage.class, WorkerErrorReported.class, WorkerRegistrationUpdated.class, WorkerVersionUpdated.class, StorageType.class, 
        UsageForType.class, TrustTokens.class, InterestGroupAccessType.class, InterestGroupAuctionEventType.class, InterestGroupAuctionFetchType.class, SharedStorageAccessType.class, SharedStorageEntry.class, SharedStorageMetadata.class, SharedStorageReportingMetadata.class, SharedStorageUrlWithMetadata.class, 
        SharedStorageAccessParams.class, StorageBucketsDurability.class, StorageBucket.class, StorageBucketInfo.class, AttributionReportingSourceType.class, AttributionReportingFilterDataEntry.class, AttributionReportingFilterConfig.class, AttributionReportingFilterPair.class, AttributionReportingAggregationKeysEntry.class, AttributionReportingEventReportWindows.class, 
        AttributionReportingTriggerSpec.class, AttributionReportingTriggerDataMatching.class, AttributionReportingAggregatableDebugReportingData.class, AttributionReportingAggregatableDebugReportingConfig.class, AttributionReportingSourceRegistration.class, AttributionReportingSourceRegistrationResult.class, AttributionReportingSourceRegistrationTimeConfig.class, AttributionReportingAggregatableValueDictEntry.class, AttributionReportingAggregatableValueEntry.class, AttributionReportingEventTriggerData.class, 
        AttributionReportingAggregatableTriggerData.class, AttributionReportingAggregatableDedupKey.class, AttributionReportingTriggerRegistration.class, AttributionReportingEventLevelResult.class, AttributionReportingAggregatableResult.class, RelatedWebsiteSet.class, CacheStorageContentUpdated.class, CacheStorageListUpdated.class, IndexedDBContentUpdated.class, IndexedDBListUpdated.class, 
        InterestGroupAccessed.class, InterestGroupAuctionEventOccurred.class, InterestGroupAuctionNetworkRequestCreated.class, SharedStorageAccessed.class, StorageBucketCreatedOrUpdated.class, StorageBucketDeleted.class, AttributionReportingSourceRegistered.class, AttributionReportingTriggerRegistered.class, UsageAndQuota.class, GPUDevice.class, 
        Size.class, VideoDecodeAcceleratorCapability.class, VideoEncodeAcceleratorCapability.class, SubsamplingFormat.class, ImageType.class, ImageDecodeAcceleratorCapability.class, GPUInfo.class, ProcessInfo.class, Info.class, TargetInfo.class, 
        FilterEntry.class, RemoteLocation.class, AttachedToTarget.class, DetachedFromTarget.class, ReceivedMessageFromTarget.class, TargetCreated.class, TargetDestroyed.class, TargetCrashed.class, TargetInfoChanged.class, Accepted.class, 
        TraceConfigRecordMode.class, TraceConfig.class, StreamFormat.class, StreamCompression.class, MemoryDumpLevelOfDetail.class, TracingBackend.class, BufferUsage.class, DataCollected.class, TracingComplete.class, RequestMemoryDump.class, 
        StartTransferMode.class, RequestStage.class, RequestPattern.class, HeaderEntry.class, AuthChallengeSource.class, AuthChallenge.class, AuthChallengeResponseResponse.class, AuthChallengeResponse.class, RequestPaused.class, AuthRequired.class, 
        ResponseBody.class, ContextType.class, ContextState.class, ChannelCountMode.class, ChannelInterpretation.class, AutomationRate.class, ContextRealtimeData.class, BaseAudioContext.class, AudioListener.class, AudioNode.class, 
        AudioParam.class, ContextCreated.class, ContextWillBeDestroyed.class, ContextChanged.class, AudioListenerCreated.class, AudioListenerWillBeDestroyed.class, AudioNodeCreated.class, AudioNodeWillBeDestroyed.class, AudioParamCreated.class, AudioParamWillBeDestroyed.class, 
        NodesConnected.class, NodesDisconnected.class, NodeParamConnected.class, NodeParamDisconnected.class, AuthenticatorProtocol.class, Ctap2Version.class, AuthenticatorTransport.class, VirtualAuthenticatorOptions.class, Credential.class, CredentialAdded.class, 
        CredentialAsserted.class, PlayerMessageLevel.class, PlayerMessage.class, PlayerProperty.class, PlayerEvent.class, PlayerErrorSourceLocation.class, PlayerError.class, PlayerPropertiesChanged.class, PlayerEventsAdded.class, PlayerMessagesLogged.class, 
        PlayerErrorsRaised.class, PlayersCreated.class, PromptDevice.class, DeviceRequestPrompted.class, RuleSet.class, RuleSetErrorType.class, SpeculationAction.class, SpeculationTargetHint.class, PreloadingAttemptKey.class, PreloadingAttemptSource.class, 
        PrerenderFinalStatus.class, PreloadingStatus.class, PrefetchStatus.class, PrerenderMismatchedHeaders.class, RuleSetUpdated.class, RuleSetRemoved.class, PreloadEnabledStateUpdated.class, PrefetchStatusUpdated.class, PrerenderStatusUpdated.class, PreloadingAttemptSourcesUpdated.class, 
        LoginState.class, DialogType.class, DialogButton.class, AccountUrlType.class, Account.class, DialogShown.class, DialogClosed.class, FileHandlerAccept.class, FileHandler.class, DisplayMode.class, 
        OsAppState.class };
  }
  
  public static void Zh(boolean paramBoolean) {
    ZQ = paramBoolean;
  }
  
  public static boolean ZI() {
    return ZQ;
  }
  
  public static boolean Zl() {
    boolean bool = ZI();
    return !bool;
  }
  
  static {
    if (Zl())
      Zh(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\Zi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */