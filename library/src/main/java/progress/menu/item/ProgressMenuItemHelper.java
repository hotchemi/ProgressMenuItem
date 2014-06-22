package progress.menu.item;

import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public class ProgressMenuItemHelper {

    private Reference<MenuItem> menuItemReference;

    private int resourceId = R.layout.menu_item_progress;

    protected ProgressMenuItemHelper() {
    }

    public ProgressMenuItemHelper(Menu menu, int resourceId) {
        this(menu.findItem(resourceId));
    }

    public ProgressMenuItemHelper(Menu menu, int resourceId, int progressSize) {
        this(menu.findItem(resourceId), progressSize);
    }

    public ProgressMenuItemHelper(MenuItem menuItem) {
        menuItemReference = new SoftReference<MenuItem>(menuItem);
    }

    public ProgressMenuItemHelper(MenuItem menuItem, int progressSize) {
        this(menuItem);
        if (progressSize == ProgressMenuItemSize.LARGE)
            resourceId = R.layout.menu_item_progress_large;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public void startProgress() {
        if (ReferenceHelper.isNotNull(menuItemReference))
            MenuItemCompat.setActionView(menuItemReference.get(), resourceId);
    }

    public void stopProgress() {
        if (ReferenceHelper.isNotNull(menuItemReference))
            MenuItemCompat.setActionView(menuItemReference.get(), null);
    }

}