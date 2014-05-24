package progress.menu.item;

import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

import static progress.menu.item.ReferenceUtils.isNotNull;
import static progress.menu.item.ProgressMenuItemSize.LARGE;

/**
 * Shows and stop a progress in the ActionBar.
 */
public class ProgressMenuItemHelper {

    private Reference<MenuItem> menuItemReference;

    private int resId = R.layout.menu_item_progress;

    protected ProgressMenuItemHelper() {
    }

    public ProgressMenuItemHelper(Menu menu, int resId) {
        this(menu.findItem(resId));
    }

    public ProgressMenuItemHelper(Menu menu, int resId, int progressSize) {
        this(menu.findItem(resId), progressSize);
    }

    public ProgressMenuItemHelper(MenuItem menuItem) {
        menuItemReference = new SoftReference<MenuItem>(menuItem);
    }

    public ProgressMenuItemHelper(MenuItem menuItem, int progressSize) {
        this(menuItem);
        if (progressSize == LARGE) resId = R.layout.menu_item_progress_large;
    }

    public void setResourceId(int resId) {
        this.resId = resId;
    }

    public void startProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), resId);
        }
    }

    public void stopProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), null);
        }
    }

}