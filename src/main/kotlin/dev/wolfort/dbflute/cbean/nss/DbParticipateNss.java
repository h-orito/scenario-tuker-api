package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbParticipateCQ;

/**
 * The nest select set-upper of participate.
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbParticipateCQ _query;
    public DbParticipateNss(DbParticipateCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     */
    public void withGameSystem() {
        _query.xdoNss(() -> _query.queryGameSystem());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     */
    public void withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my user_id, named 'user'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbUserNss withUser() {
        _query.xdoNss(() -> _query.queryUser());
        return new DbUserNss(_query.queryUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * participate_impression by participate_id, named 'participateImpressionAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbParticipateImpressionNss withParticipateImpressionAsOne() {
        _query.xdoNss(() -> _query.queryParticipateImpressionAsOne());
        return new DbParticipateImpressionNss(_query.queryParticipateImpressionAsOne());
    }
}
