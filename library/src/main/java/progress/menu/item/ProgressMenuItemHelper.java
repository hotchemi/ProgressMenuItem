package progress.menu.item;

import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

import static progress.menu.item.ReferenceUtil.isNotNull;

/**
 * Shows and stop a progress in the ActionBar.
 */
public class ProgressMenuItemHelper {

    private Reference<MenuItem> menuItemReference;

    private int resourceId = R.layout.menu_item_progress;

    protected ProgressMenuItemHelper() {
    }

    public ProgressMenuItemHelper(Menu menu, int resId) {
        menuItemReference = new SoftReference<MenuItem>(menu.findItem(resId));
    }

    public ProgressMenuItemHelper(MenuItem menuItem) {
        menuItemReference = new SoftReference<MenuItem>(menuItem);
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public void startProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), resourceId);
        }
    }

    public void stopProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), null);
        }
    }

}