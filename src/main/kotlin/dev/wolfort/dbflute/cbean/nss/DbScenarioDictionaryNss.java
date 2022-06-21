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
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbScenarioNss withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
        return new DbScenarioNss(_query.queryScenario());
    }
}
