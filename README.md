ProgressMenuItem
================

Shows and stop a progress in the ActionBar.

![gif](http://gifzo.net/BO3wY1zTTkb.gif)

## Download

Download from maven central.

```groovy
  dependencies {
    compile 'com.github.hotchemi:ProgressMenuItem:{latest.version}'
  }
```

## ChangeLog

- 2014/05/04 0.1.0 release.

## How to use

ProgressMenuItem's usage is very simple.

Simple in your Activity or Fragment's `onCreateOptionsMenu` method instantiate it.

Specifies a menu id to be progressed by the second argument.

```java
private ProgressMenuItemHelper progressHelper;

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.refresh_menu, menu);
    progressHelper = new ProgressMenuItemHelper(menu, R.id.action_refresh);
    return true;
}
```

Then simple call:
``` java
progressHelper.startProgress();
```

And:
``` java
progressHelper.stopProgress();
```

## Sample

Please try to move the [sample](https://github.com/hotchemi/ProgressMenuItem/tree/master/sample/).

## Requirements

Supports Android 1.6 or greater.

## Contribute

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## Inspired

ProgressMenuItem is inspired by [RefreshMenuItem](https://github.com/nicolasjafelle/RefreshMenuItem).

But ProgressMenuItem has some merits:

- Support 1.6 or grater.
- API Interface is more simple.