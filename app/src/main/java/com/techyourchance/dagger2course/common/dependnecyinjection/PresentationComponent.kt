package com.techyourchance.dagger2course.common.dependnecyinjection

import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager
import com.techyourchance.dagger2course.networking.StackoverflowApi
import com.techyourchance.dagger2course.questions.FetchQuestionDetailsUseCase
import com.techyourchance.dagger2course.questions.FetchQuestionsUseCase
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import com.techyourchance.dagger2course.screens.common.dialogs.DialogsNavigator
import com.techyourchance.dagger2course.screens.common.viewsmvc.ViewMvcFactory
import dagger.Component
import dagger.Provides

@Component(modules = [PresentationModule::class])
interface PresentationComponent {


    fun screensNavigator():ScreensNavigator

    fun viewMvcFactory() : ViewMvcFactory

    fun dialogsNavigator() : DialogsNavigator

    fun fetchQuestionsUseCase() : FetchQuestionsUseCase

    fun fetchQuestionDetailsUseCase() : FetchQuestionDetailsUseCase
}