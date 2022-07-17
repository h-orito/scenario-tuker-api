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
    HandOut9,
    HandOut10,
    HandOut11,
    HandOut12,
    PlayerCharacter1,
    PlayerCharacter2,
    PlayerCharacter3,
    PlayerCharacter4,
    PlayerCharacter5,
    PlayerCharacter6,
    PlayerCharacter7,
    PlayerCharacter8,
    PlayerCharacter9,
    PlayerCharacter10,
    PlayerCharacter11,
    PlayerCharacter12,
    Audience,
    Participating,
    Participant,
    PlanningToParticipate,
    AbleToGameMaster,
    AbleToKeeper
    ;

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
            PlayerCharacter9,
            PlayerCharacter10,
            PlayerCharacter11,
            PlayerCharacter12,
            Audience,
            Participating,
            Participant,
            PlanningToParticipate,
            AbleToGameMaster
        )

        val trpgs: List<RoleType> = listOf(
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
            HandOut9,
            HandOut10,
            HandOut11,
            HandOut12,
            Audience,
            Participating,
            Participant,
            PlanningToParticipate,
            AbleToKeeper
        )
    }
}