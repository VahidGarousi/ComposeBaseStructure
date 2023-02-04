package garousi.dev.home

import garousi.dev.design_system.UnidirectionalViewModel

interface HomeContract :
    UnidirectionalViewModel<HomeContract.Event,  HomeContract.State> {
    data class State(val name: String = "")
    sealed interface Event : HomeContract
}