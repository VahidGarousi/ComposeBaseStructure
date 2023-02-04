package garousi.dev.home

import dagger.hilt.android.lifecycle.HiltViewModel
import garousi.dev.design_system.BaseViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class HomeViewModel @Inject constructor(

) : BaseViewModel(), HomeContract {


    override val state: StateFlow<HomeContract.State>
        get() = TODO("Not yet implemented")

    override fun event(event: HomeContract.Event) {
        TODO("Not yet implemented")
    }

}