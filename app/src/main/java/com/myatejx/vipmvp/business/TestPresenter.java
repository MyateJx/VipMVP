package com.myatejx.vipmvp.business;

import android.content.Context;

import com.myatejx.architecture.business.BasePresenter;
import com.myatejx.architecture.business.bus.Result;
import com.myatejx.vipmvp.business.constant.TestResultCode;
import com.myatejx.vipmvp.repertory.DataBaseAdapter;
import com.myatejx.vipmvp.repertory.IDataBaseInterface;

import java.io.IOException;

import io.reactivex.ObservableEmitter;

/**
 * @author KunMinX
 * @date 2018/8/22
 */
public class TestPresenter extends BasePresenter implements ITestRequest {

    private IDataBaseInterface mDataBase;

    public TestPresenter(Context context, String businessType) {
        super(businessType);
        mDataBase = new DataBaseAdapter();
        mDataBase.init(context);
    }

    @Override
    public void requestEntity() {
        handleRequest(new IAsync() {
            @Override
            public Result onExecute(ObservableEmitter<Result> e) throws IOException {
                return new Result(getBusinessType(), TestResultCode.GOT_ENTITY, null);
            }
        });
    }

    @Override
    public void requestList() {
        handleRequest(new IAsync() {
            @Override
            public Result onExecute(ObservableEmitter<Result> e) throws IOException {
                return new Result(getBusinessType(), TestResultCode.GOT_LIST, null);
            }
        });
    }

    @Override
    public void requestInsert() {

    }

    @Override
    public void requestInserts() {

    }

    @Override
    public void requestUpdate() {

    }

    @Override
    public void requestUpdates() {

    }

    @Override
    public void requestDelete() {

    }

    @Override
    public void requestDeletes() {

    }
}
