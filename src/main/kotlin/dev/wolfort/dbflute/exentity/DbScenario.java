package dev.wolfort.dbflute.exentity;

import dev.wolfort.dbflute.bsentity.DbBsScenario;

/**
 * The entity of SCENARIO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 *
 * @author DBFlute(AutoGenerator)
 */
public class DbScenario extends DbBsScenario {

    /**
     * The serial version UID for object serialization. (Default)
     */
    private static final long serialVersionUID = 1L;

    public static final String ALIAS_participateCount = "PARTICIPATE_COUNT";

    protected Long participateCount;

    public Long getParticipateCount() {
        return participateCount;
    }

    public void setPArticipateCount(Long participateCount) {
        this.participateCount = participateCount;
    }
}
