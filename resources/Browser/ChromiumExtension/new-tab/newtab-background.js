const NEW_TAB_URL = 'chrome://newtab';
const NEW_TAB_PAGE_URL = 'chrome://new-tab-page';

chrome.runtime.onInstalled.addListener(reason => {
  if (reason.reason === chrome.runtime.OnInstalledReason.INSTALL) {
    redirectToMarketingPageIfNecessary();
  }
});

const redirectToMarketingPageIfNecessary = () => {
    const queryOptions = { active: true, currentWindow: true };

    chrome.tabs.query(queryOptions, tabs => {
        const tab = tabs[0];

        if (isNewTab(tab) || isNewTabPage(tab)) {
            redirectToMarketingPage(tab);
        }
    });
}

const redirectToMarketingPage = tab => {
    chrome.tabs.update(tab.tabId, {url: NEW_TAB_URL});
}

const isNewTab = tab => {
    return tabPendingUrlStartsWith(tab, NEW_TAB_URL)
            || tabUrlStartsWith(tab, NEW_TAB_URL);
}

const tabPendingUrlStartsWith = (tab, url) => {
    return tab && tab.pendingUrl && tab.pendingUrl.startsWith(url);
}

const tabUrlStartsWith = (tab, url) => {
    return tab && tab.url && tab.url.startsWith(url);
}

const isNewTabPage = tab => {
    return tabPendingUrlStartsWith(tab, NEW_TAB_PAGE_URL)
            || tabUrlStartsWith(tab, NEW_TAB_PAGE_URL);
}