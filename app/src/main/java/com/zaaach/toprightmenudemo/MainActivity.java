package com.zaaach.toprightmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.zaaach.toprightmenu.MenuItem;
import com.zaaach.toprightmenu.TopRightMenu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private TopRightMenu mTopRightMenu;
    private ImageView moreBtn;
    private CheckBox iconCB, dimCB, animCB;

    private boolean showIcon = true;
    private boolean dimBg = true;
    private boolean needAnim = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iconCB = (CheckBox) findViewById(R.id.cb_icon);
        dimCB = (CheckBox) findViewById(R.id.cb_bg);
        animCB = (CheckBox) findViewById(R.id.cb_anim);

        iconCB.setOnCheckedChangeListener(this);
        dimCB.setOnCheckedChangeListener(this);
        animCB.setOnCheckedChangeListener(this);

        moreBtn = (ImageView) findViewById(R.id.more);
        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTopRightMenu = new TopRightMenu(MainActivity.this);
                List<MenuItem> menuItems = new ArrayList<>();
                menuItems.add(new MenuItem(R.mipmap.multichat, "发起多人聊天"));
                menuItems.add(new MenuItem(R.mipmap.addmember, "加好友"));
                menuItems.add(new MenuItem(R.mipmap.qr_scan, "扫一扫"));
                mTopRightMenu
                        .setHeight(480)     //默认高度480
                        .setWidth(320)      //默认宽度wrap_content
                        .showIcon(showIcon)     //显示菜单图标，默认为true
                        .dimBackground(dimBg)           //背景变暗，默认为true
                        .needAnimationStyle(needAnim)   //显示动画，默认为true
                        .setAnimationStyle(R.style.TRM_ANIM_STYLE)  //默认为R.style.TRM_ANIM_STYLE
                        .addMenuList(menuItems)
                        .addMenuItem(new MenuItem(R.mipmap.facetoface, "面对面快传"))
                        .addMenuItem(new MenuItem(R.mipmap.pay, "付款"))
                        .setOnMenuItemClickListener(new TopRightMenu.OnMenuItemClickListener() {
                            @Override
                            public void onMenuItemClick(int position) {
                                Toast.makeText(MainActivity.this, "点击菜单:" + position, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .showAsDropDown(moreBtn, -225, 0);
//                        .showAsDropDown(moreBtn);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.cb_icon:
                showIcon = isChecked;
                break;
            case R.id.cb_bg:
                dimBg = isChecked;
                break;
            case R.id.cb_anim:
                needAnim = isChecked;
                break;
        }
    }
}
