package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbScenarioDictionaryCQ;

/**
 * The nest select set-upper of scenario_dictionary.
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioDictionaryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbScenarioDictionaryCQ _query;
    public DbScenarioDictionaryNss(DbScenarioDictionaryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     */
    public void withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
    }
}
