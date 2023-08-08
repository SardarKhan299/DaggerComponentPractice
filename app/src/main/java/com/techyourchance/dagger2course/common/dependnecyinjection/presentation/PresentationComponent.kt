package com.techyourchance.dagger2course.common.dependnecyinjection.presentation

import com.techyourchance.dagger2course.questions.FetchQuestionDetailsUseCase
import com.techyourchance.dagger2course.questions.FetchQuestionsUseCase
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import com.techyourchance.dagger2course.screens.common.dialogs.DialogsNavigator
import com.techyourchance.dagger2course.screens.common.fragments.BaseFragment
import com.techyourchance.dagger2course.screens.common.viewsmvc.ViewMvcFactory
import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListFragment
import dagger.Component

@Component(modules = [PresentationModule::class])
interface PresentationComponent {

//
//    fun screensNavigator():ScreensNavigator
//
//    fun viewMvcFactory() : ViewMvcFactory
//
//    fun dialogsNavigator() : DialogsNavigator
//
//    fun fetchQuestionsUseCase() : FetchQuestionsUseCase
//
//    fun fetchQuestionDetailsUseCase() : FetchQuestionDetailsUseCase

    fun inject(fragment: QuestionsListFragment)
    fun injectActivity(fragment: QuestionDetailsActivity)
}