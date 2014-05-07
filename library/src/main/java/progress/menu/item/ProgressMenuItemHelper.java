package progress.menu.item;

import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/**
 * Shows and stop a progress in the ActionBar.
 */
public class ProgressMenuItemHelper {

    private Reference<MenuItem> menuItemReference;

    protected ProgressMenuItemHelper() {
    }

    public ProgressMenuItemHelper(Menu menu, int resId) {
        menuItemReference = new SoftReference<MenuItem>(menu.findItem(resId));
    }

    public ProgressMenuItemHelper(MenuItem menuItem) {
        menuItemReference = new SoftReference<MenuItem>(menuItem);
    }

    static boolean isNotNull(final Reference<MenuItem> menuItemReference) {
        return menuItemReference != null && menuItemReference.get() != null;
    }

    public void startProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), R.layout.menu_item_progress);
        }
    }

    public void stopProgress() {
        if (isNotNull(menuItemReference)) {
            MenuItemCompat.setActionView(menuItemReference.get(), null);
        }
    }

}