package dev.wolfort.scenariotuker.domain.model.scenario

data class Scenarios(
    val list: List<Scenario>,
    val allRecordCount: Int = 0,
    val allPageCount: Int = 0,
    val existPrePage: Boolean = false,
    val existNextPage: Boolean = false,
    val currentPageNum: Int = 0
) {
    companion object {
        fun ofEmpty() = Scenarios(
            list = emptyList(),
            allRecordCount = 0,
            allPageCount = 0,
            existPrePage = false,
            existNextPage = false,
            currentPageNum = 0
        )
    }

}