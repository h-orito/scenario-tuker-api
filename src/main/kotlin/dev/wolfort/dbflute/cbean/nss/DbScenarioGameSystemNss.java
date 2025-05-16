package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbScenarioGameSystemCQ;

/**
 * The nest select set-upper of scenario_game_system.
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioGameSystemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbScenarioGameSystemCQ _query;
    public DbScenarioGameSystemNss(DbScenarioGameSystemCQ query) { _query = query; }
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
}
