package com.techyourchance.dagger2course.common.dependnecyinjection.presentation


import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListFragment
import dagger.Subcomponent

// this component is depend on Activity Component.
@PresentationScope
@Subcomponent()
interface PresentationComponent {
    fun inject(questionsListFragment: QuestionsListFragment)
    fun inject(questionDetailsActivity: QuestionDetailsActivity)
    fun inject(questionsListActivity: QuestionsListActivity)
}