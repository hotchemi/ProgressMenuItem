ProgressMenuItem
================

[![Build Status](https://travis-ci.org/hotchemi/ProgressMenuItem.png?branch=master)](https://travis-ci.org/hotchemi/ProgressMenuItem)
[![Android Arsenal](http://img.shields.io/badge/Android%20Arsenal-ProgressMenuItem-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/845)

Helper library about Showing and stopping a progress in the ActionBar.

![gif](http://gifzo.net/BO3wY1zTTkb.gif)

## Download
![Maven Badges](https://maven-badges.herokuapp.com/maven-central/com.github.hotchemi/ProgressMenuItem/badge.svg)

Download from maven central.

```groovy
dependencies {
  compile 'com.github.hotchemi:ProgressMenuItem:{$latest.version}'
}
```

## How to use

### Initialize

Simple in your Activity or Fragment's `onCreateOptionsMenu` method instantiate it.

Specifies a menu id to be progressed by the second argument.

```java
private ProgressMenuItemHelper progressHelper;

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.refresh_menu, menu);
    progressHelper = new ProgressMenuItemHelper(menu, R.id.action_refresh);
    // or
    progressHelper = new ProgressMenuItemHelper(menu.findItem(R.id.action_refresh));
    return true;
}
```

### Start progress

``` java
progressHelper.startProgress();
```

### Stop progress

``` java
progressHelper.stopProgress();
```

### Use large progress

```java
private ProgressMenuItemHelper progressHelper;

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.refresh_menu, menu);
    progressHelper = new ProgressMenuItemHelper(menu, R.id.action_refresh, ProgressMenuSize.LARGE);
    return true;
}
```

![gif](http://gifzo.net/BDXqbzDanWc.gif)

### Override progress

Call `setResourceId(int resId)` and set your custom layout.

``` java
progressHelper.setResourceId(R.layout.my_menu_item_progress);
```

## Sample

Please try to move the [sample](https://github.com/hotchemi/ProgressMenuItem/tree/master/sample/).

## Requirements

Supports Android 2.1 or greater.

## Contribute

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## Inspired

ProgressMenuItem is inspired by [RefreshMenuItem](https://github.com/nicolasjafelle/RefreshMenuItem).

But ProgressMenuItem has some merits:

- Supports Android 2.1 or greater.
- ProgressMenuItem's Interface is more simple.

## ChangeLog

- 2014/07/03 0.3.3 release.
- 2014/06/22 0.3.2 release.
- 2014/05/25 0.3.1 release.
- 2014/05/18 0.3.0 release.
- 2014/05/11 0.2.0 release.
- 2014/05/04 0.1.0 release.

## Used

- [Fril](https://play.google.com/store/apps/details?id=jp.co.fablic.fril)

## Licence

```
 Copyright 2014 Shintaro Katafuchi

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```
