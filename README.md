# EasyRecycler [![](https://jitpack.io/v/ahmadaghazadeh/easyRecycler.svg)](https://jitpack.io/#ahmadaghazadeh/easyRecycler)

This is a data binding easy use recycler

Please note that this library is currently supported on android API 7 and above.

Integration with existing project
---

### Setup

##### build.gradle (project)
```groovy
allprojects {
    repositories {
       
        maven {
            url 'https://jitpack.io'
        }
    }
}
```

#### build.gradle (app)
```groovy
dependencies {
     
    implementation 'com.github.ahmadaghazadeh:EasyRecycler:1.0.2'
}
```
 
 
Demo Activity:

```java

public class TextItem extends BaseRecyclerModel {
    public TextItem(String text) {
        this.text = text;
    }

    public String text;
    @Override
    public int getLayoutId() {
        return R.layout.item_text;
    }
}

```

```java

public class TextItem extends BaseRecyclerModel {
    public TextItem(String text) {
        this.text = text;
    }

    public String text;
    @Override
    public int getLayoutId() {
        return R.layout.item_text;
    }

}

```

```java

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        EasyAdapter<BaseRecyclerModel> adapter=new EasyAdapter<>();
        List<BaseRecyclerModel> lst=new LinkedList<>();
        lst.add(new ImageItem(1));
        lst.add(new TextItem("Ahmad"));
        lst.add(new ImageItem(2));
        lst.add(new TextItem("Aghazadeh"));
        adapter.init(lst);
        adapter.setEmptyItemViewModelListener(new EmptyViewModel.EmptyItemViewModelListener() {
            @Override
            public void onRetryClick() {
                Toast.makeText(MainActivity.this,"onRetryClick",Toast.LENGTH_LONG).show();
            }
        });
        mViewDataBinding.recycler.setAdapter(adapter);
    }
}

```

```xml
    <?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    
    <data>
        <variable
            name="viewModel"
            type="com.github.ahmadaghazadeh.sample.ui.main.MainViewModel" />
    
    </data>
    
    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layoutManager="android.support.v7.widget.LinearLayoutManager"
        app:data="@{viewModel.list}"/>
    
    </layout>
```
