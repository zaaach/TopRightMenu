# TopRightMenu

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)

类似手机QQ界面右上角的弹出菜单，使用`recyclerview`和`popupwindow`封装了一下.

废话不多说，先看效果图： 

# Gif

![image](https://github.com/zaaach/TopRightMenu/raw/master/art/screen.gif)

图片中看起来比较卡顿，但真机运行是正常的.

# APK

下载[demo.apk](https://github.com/zaaach/TopRightMenu/raw/master/art/demo.apk)体验.

# Install

Gradle:

```groovy
compile 'com.zaaach:toprightmenu:1.0'
```

or Maven:

```xml
<dependency>
  <groupId>com.zaaach</groupId>
  <artifactId>toprightmenu</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```

or 下载library手动导入.

# Usage

```java
mTopRightMenu = new TopRightMenu(MainActivity.this);

//添加菜单项
List<MenuItem> menuItems = new ArrayList<>();
menuItems.add(new MenuItem(R.mipmap.multichat, "发起多人聊天"));
menuItems.add(new MenuItem(R.mipmap.addmember, "加好友"));
menuItems.add(new MenuItem(R.mipmap.qr_scan, "扫一扫"));

mTopRightMenu
        .setHeight(480)     //默认高度480
        .setWidth(320)      //默认宽度wrap_content
        .showIcon(true)     //显示菜单图标，默认为true
        .dimBackground(true)        //背景变暗，默认为true
        .needAnimationStyle(true)   //显示动画，默认为true
        .setAnimationStyle(R.style.TRM_ANIM_STYLE)
        .addMenuList(menuItems)
        .addMenuItem(new MenuItem(R.mipmap.facetoface, "面对面快传"))
        .addMenuItem(new MenuItem(R.mipmap.pay, "付款"))
        .setOnMenuItemClickListener(new TopRightMenu.OnMenuItemClickListener() {
              @Override
              public void onMenuItemClick(int position) {
                  Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
              }
        })
        .showAsDropDown(moreBtn, -225, 0);	//带偏移量
//      		.showAsDropDown(moreBtn)
```

OK, 拿去玩耍 ~

# Ad
我的[动漫礼品淘宝店]( https://shop238932691.taobao.com/) ，希望亲能收藏下(单)：

![二维码](https://img.alicdn.com/imgextra/i1/769720206/TB2AnBVar0kpuFjy0FjXXcBbVXa_!!769720206.png)