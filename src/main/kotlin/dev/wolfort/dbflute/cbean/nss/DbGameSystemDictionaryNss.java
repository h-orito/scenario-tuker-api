package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbGameSystemDictionaryCQ;

/**
 * The nest select set-upper of game_system_dictionary.
 * @author DBFlute(AutoGenerator)
 */
public class DbGameSystemDictionaryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbGameSystemDictionaryCQ _query;
    public DbGameSystemDictionaryNss(DbGameSystemDictionaryCQ query) { _query = query; }
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
}
