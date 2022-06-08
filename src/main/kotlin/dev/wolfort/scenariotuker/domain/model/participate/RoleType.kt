package dev.wolfort.scenariotuker.domain.model.participate

enum class RoleType {
    GameMaster,
    Keeper,
    HandOut1,
    HandOut2,
    HandOut3,
    HandOut4,
    HandOut5,
    HandOut6,
    HandOut7,
    HandOut8,
    PlayerCharacter1,
    PlayerCharacter2,
    PlayerCharacter3,
    PlayerCharacter4,
    PlayerCharacter5,
    PlayerCharacter6,
    PlayerCharacter7,
    PlayerCharacter8,
    Audience;

    companion object {
        val murderMysteries: List<RoleType> = listOf(
            GameMaster,
            PlayerCharacter1,
            PlayerCharacter2,
            PlayerCharacter3,
            PlayerCharacter4,
            PlayerCharacter5,
            PlayerCharacter6,
            PlayerCharacter7,
            PlayerCharacter8,
            Audience
        )

        val trpgs: List<RoleType> = listOf(
            Keeper,
            HandOut1,
            HandOut2,
            HandOut3,
            HandOut4,
            HandOut5,
            HandOut6,
            HandOut7,
            HandOut8,
            Audience
        )
    }
}