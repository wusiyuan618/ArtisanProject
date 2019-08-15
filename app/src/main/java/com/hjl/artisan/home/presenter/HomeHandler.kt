package com.hjl.artisan.home.presenter

import android.os.Handler
import android.os.Message
import com.hjl.artisan.app.Contants
import com.hjl.artisan.home.bean.ActualMeasurementsReportCountBean
import com.hjl.artisan.home.bean.InspectionReportCountBean
import com.hjl.artisan.home.bean.ProgramAttendanceSummaryBean
import com.hjl.artisan.login.bean.LoginBean
import java.lang.ref.WeakReference

class HomeHandler(presenter: HomePresenter):Handler() {
    private val mPresenterReference: WeakReference<HomePresenter> = WeakReference(presenter)

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        val presenter = mPresenterReference.get()
        if (presenter != null) {
            var obj=msg.obj
            when(msg.what){
                Contants.OKHTTP_REQUEST_SUCCESS-> {
                    when(obj){
                        is ActualMeasurementsReportCountBean->{
                           var bean= obj
                            presenter.view.showView(bean)
                        }
                        is InspectionReportCountBean->{
                            var bean= obj as InspectionReportCountBean
                            presenter.view.showView(bean)
                        }
                        is ProgramAttendanceSummaryBean->{
                            var bean= obj as ProgramAttendanceSummaryBean
                            presenter.view.showView(bean)
                        }
                    }
                }
                Contants.OKHTTP_REQUEST_ERROR->{
                    presenter.view.toast(msg.obj.toString())
                }
            }
            presenter.view.hideLoading()
        }
    }
}