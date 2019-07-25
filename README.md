# ScaleImageview
一个图片缩放控件，支持在viewpager等滑动控件中使用

文章讲解如下：[Android 多点触控与图片缩放](https://blog.csdn.net/u011418943/article/details/97174400)

# 演示效果
![image](https://github.com/LillteZheng/ScaleImageview/raw/master/gif/scale.gif)

# 使用
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
然后在你的 module 中添加：

```
compile 'com.github.LillteZheng:ScaleImageview:v1.0'
```

然后添加控件即可：
```
<com.zhengsr.mylibrary.ScaleImageView
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:layout_margin="10dp"
    app:scale_limit_board="false"
    app:scale_max_factor="5"
    app:scale_auto_time="5"
    app:scale_double_factor="2"
    android:src="@mipmap/a1"/>

```



# 自定义属性
**缩放控件 ScaleImageView**

| 名称 | 类型 |说明 |
|---|---|---|
|scale_auto_time|reference,integer|双击时，达到放大的时间|
|scale_limit_board|boolean|是否限制边界，即不能缩放到比控件小|
|scale_autofit|boolean|自动适配缩放值，有些图片是正方形，如果你的高度没设定好，建议设置为false，不能会变形|
|scale_double_factor|integer|双击时放大倍数|
|scale_max_factor|integer|可放大的最大倍数|
|scale_interrupt_parent_touch|boolean|是否截获父控件触摸事件，放大时，需要截取，不然无法移动|
