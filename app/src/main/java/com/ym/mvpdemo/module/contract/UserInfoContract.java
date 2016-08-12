package com.ym.mvpdemo.module.contract;

import com.ym.mvpdemo.module.model.UserInfoModel;
import com.ym.mvpdemo.module.presenter.BasePresenter;

/**
 * @className: UserInfoContract
 * @classDescription: 契约类
 * @author: leibing
 * @createTime: 2016/8/11
 */
public class UserInfoContract {

    public interface View extends BaseView{
        void showLoading();//展示加载框
        void dismissLoading();//取消加载框展示
        void showUserInfo(UserInfoModel userInfoModel);//将网络请求得到的用户信息回调
        String loadUserId();//假设接口请求需要一个userId
    }

    public interface Fragment extends BaseFragment{
        void showData(); // 假定显示数据
    }

    public interface ActivityPresenter extends BasePresenter {
        void loadUserInfo();
    }

    public interface FragmentPresenter extends BasePresenter{
        void loadData();
    }

    public interface LifeCycle extends BaseLifeCycle{
        void onRestart();
    }
}
